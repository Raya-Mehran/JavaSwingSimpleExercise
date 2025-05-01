import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class E2 extends JFrame implements ActionListener {
    private JButton button;
    private JLabel label;
    private JTextField textField;

    public E2() {
        button = new JButton("Greet");
        button.setPreferredSize(new Dimension(100, 20));
        button.addActionListener(this);

        label = new JLabel("Enter your name and press Greet", SwingConstants.CENTER);
        textField = new JTextField(20);

        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(textField);
        inputPanel.add(button);

        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.add(label, BorderLayout.SOUTH);
        mainPanel.add(inputPanel, BorderLayout.CENTER);

        this.setTitle("Greeting Form");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);
        this.add(mainPanel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = textField.getText().trim();
        if (name.isEmpty()) {
            label.setText("Please enter a name.");
        } else {
            label.setText("Hello, " + name + "!");
        }
    }

    public static void main(String[] args) {
        new E2();
    }
}
