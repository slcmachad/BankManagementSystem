package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login, signUp, clear;
    JTextField cardText;
    JPasswordField pinText;
    
    Login(){
        
        setTitle("AUTOMATED TELLER MACHINE");
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);
        
        JLabel cardn = new JLabel("Card N.:");
        cardn.setFont(new Font("Raleway", Font.BOLD, 28));
        cardn.setBounds(120, 150, 150, 30);
        add(cardn);
        
        cardText = new JTextField();
        cardText.setBounds(300, 150, 230, 30);
        cardText.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardText);
        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120, 220, 250, 30);
        add(pin);
        
        pinText = new JPasswordField();
        pinText.setBounds(300, 220, 230, 30);
        pinText.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinText);
        
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signUp = new JButton("SIGN UP");
        signUp.setBounds(300, 350, 230, 30);
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(Color.WHITE);
        signUp.addActionListener(this);
        add(signUp);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800, 500);
        setVisible(true);
        setLocation(350, 200);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == clear){
            cardText.setText("");
            pinText.setText("");
        }else if(e.getSource() == login){
            
        }else if(e.getSource() == signUp){
            
        }
    }

    
    public static void main(String[] args){
        
        new Login();
    }
}
