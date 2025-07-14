package NotesApp1;

import javax.swing.*;
import java.awt.*;   //abstract window toolkit
import java.awt.event.*; //for action of btns  //pckg for ActionListener 
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JButton reset, submit, close; //declared globally to be used in other functions
    JTextField ibusername;
    
    JPasswordField ibpassword;

    public Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel lblusername = new JLabel("Username");//to write on frame
        lblusername.setBounds(20, 20, 100, 20);//set label position(left,right,length,breadth)
        add(lblusername); //to show label on frame

        JLabel lblpassword = new JLabel("Password");//to wite on frame
        lblpassword.setBounds(20, 60, 100, 20);//set label position(left,right,length,breadth)
        add(lblpassword); //to show label on frame

        ibusername = new JTextField();//Class having "J" infront means from swing package
        ibusername.setBounds(130, 20, 200, 20);
        add(ibusername);

        ibpassword = new JPasswordField();//For password specific
        ibpassword.setBounds(130, 60, 200, 20);
        add(ibpassword);

        reset = new JButton("Reset");//to make btns
        reset.setBounds(40, 120, 120, 20);
        add(reset);
        reset.addActionListener(this);  //What action would be performed to trigger action "this" is current class reference

        submit = new JButton("Submit");
        submit.setBounds(180, 120, 120, 20);
        add(submit);
        submit.addActionListener(this);

        close = new JButton("Close");
        close.setBounds(110, 150, 120, 20);
        add(close);
        close.addActionListener(this);

        setSize(400, 250); //used to set frame size(length,breadth)
        setLocation(600, 250); //set default location of frame from center screen 
        setVisible(true);  //can see the frames now by default invisible

    }

    public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == submit) {
        String username = ibusername.getText();
        String password = ibpassword.getText();

        try {
            Conn c = new Conn();
            String query = "select * from login where username = '" + username + "' and password = '" + password + "'";
            ResultSet rs = c.s.executeQuery(query);

            if (rs.next()) {
                // If login is successful, open the NotesApp
                new NotesApp().setVisible(true);
                setVisible(false); // Close the login window
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

    public static void main(String[] args) {
        new Login();
    }
}
