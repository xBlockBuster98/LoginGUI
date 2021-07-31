package me.BlockProductions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    private static JFrame frame = new JFrame();
    private static JPanel panel = new JPanel();
    private static JLabel userLabel = new JLabel("User");
    private static JLabel passLabel = new JLabel("Password");
    private static JLabel success = new JLabel("");
    private static JTextField textField = new JTextField(20);
    private static JPasswordField passField = new JPasswordField("");
    private static JButton button = new JButton("Login");

    public static void main(String[] args) {

        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);


        userLabel.setBounds(10, 20, 80, 25);
        passLabel.setBounds(10, 50, 80, 25);
        passField.setBounds(100, 50, 165, 25);
        button.setBounds(10, 80, 80, 25);
        success.setBounds(10, 110, 300, 25);
        textField.setBounds(100, 20, 165, 25);

        button.addActionListener(new Main());

        panel.setLayout(null);
        panel.add(userLabel);
        panel.add(textField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(button);
        panel.add(success);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = textField.getText();
        String pass = passField.getText();

        if (user.equals("Alex") && pass.equals("Fluffy")) {
            success.setText("Login successful!");
        }

    }
}
