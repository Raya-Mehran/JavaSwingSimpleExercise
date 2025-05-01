import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class E1 extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    private int clickCount = 0;

    public E1() {
        button = new JButton("Click Me");
        button.setPreferredSize(new Dimension(200, 50));
        label = new JLabel("Clicks: 0", SwingConstants.CENTER);

        button.addActionListener(this);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setTitle("Click Counter");
        this.setSize(400, 400);
        this.getContentPane().setBackground(new Color(255, 182, 193));
        this.add(button, BorderLayout.SOUTH);
        this.add(label, BorderLayout.CENTER);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            clickCount++;
            label.setText("Clicks: " + clickCount);
        }
    }
    public static void main(String[] args) {
        new E1();
    }
}
