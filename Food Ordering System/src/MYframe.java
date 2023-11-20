import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.EventListener;

public class MYframe extends JFrame {
    Container c;
    JLabel label1, label2,message;
    JTextField userfield;
    JPasswordField passwordField;

    JButton btn1,adminbtn,userbtn;

    MYframe() {
        setTitle("login Form");
        setSize(400, 300);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(null);


adminbtn = new JButton("Admin");
adminbtn.setBounds(50,20,80,20);
adminbtn.setForeground(Color.green);
adminbtn.addActionListener( e -> adminLogin(e));
c.add(adminbtn);

        userbtn = new JButton("User");
        userbtn.setBounds(180,20,80,20);
        userbtn.setForeground(Color.green);
        userbtn.addActionListener(e -> userLogin(e));
        c.add(userbtn);
        setVisible(true);

    }

    public void actionperformed(ActionEvent e) {
        String pass = "12345678";
        if (passwordField.getText().equals(pass)) {

            System.out.println("username: " + userfield.getText());
            System.out.println("password: " + passwordField.getText());
            JOptionPane.showMessageDialog(null, "Successful login  " + userfield.getText(), "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("wrong password!!");
            JOptionPane.showMessageDialog(null, "  Admin login Failed " + userfield.getText(), "Failed", JOptionPane.INFORMATION_MESSAGE);

        }
    }
    public void adminLogin(ActionEvent e){
        label1 = new JLabel("User name:");
        label1.setBounds(50, 70, 100, 18);
        label2 = new JLabel("Password:");
        label2.setBounds(50, 100, 100, 18);
        c.add(label1);
        c.add(label2);
        userfield = new JTextField();
        userfield.setBounds(150, 70, 100, 18);
        passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 100, 18);
        c.add(userfield);
        c.add(passwordField);
        btn1 = new JButton("Login");
        btn1.setBounds(120, 140, 90, 20);
        c.add(btn1);
        btn1.addActionListener(a -> actionperformed(e));
    }


    public void userverify(ActionEvent a) {
        String pass = "user123";
        if (passwordField.getText().equals(pass)) {

            System.out.println("username: " + userfield.getText());
            System.out.println("password: " + passwordField.getText());
            JOptionPane.showMessageDialog(null, "Successful login  " + userfield.getText(), "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("wrong password!!");
            JOptionPane.showMessageDialog(null, "  user login Failed " + userfield.getText(), "Failed", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    public void userLogin(ActionEvent e){
        label1 = new JLabel("User name:");
        label1.setBounds(50, 70, 100, 18);
        label2 = new JLabel("Password:");
        label2.setBounds(50, 100, 100, 18);
        c.add(label1);
        c.add(label2);
        userfield = new JTextField();
        userfield.setBounds(150, 70, 100, 18);
        passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 100, 18);
        c.add(userfield);
        c.add(passwordField);
        btn1 = new JButton("Login");
        btn1.setBounds(120, 140, 90, 20);
        c.add(btn1);
        btn1.addActionListener(a -> userverify(a));
    }

}