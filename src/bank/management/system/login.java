package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class login extends JFrame implements ActionListener{
    
    JButton Login, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    
    login(){
        setTitle("JANSUVIDHA ATM");
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo2.png.png"));
        Image i2  = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(140,30,100,100);
        add(label);
        
        JLabel text = new JLabel("Welcome to JANSUVIDHA ATM");
        text.setFont(new Font("Osward",Font.BOLD,20));
        text.setBounds(55,120,400,50 );
        text.setForeground(Color.BLACK);
        add(text);
        
        JLabel card = new JLabel("CARD NO:");
        card.setFont(new Font("Railway",Font.BOLD,20));
        card.setBounds(40,250,200,30 );
        card.setForeground(Color.BLACK);
        add(card);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(150,250,200,30);
        
        add(cardTextField);
        
        JLabel pin = new JLabel("PIN NO:");
        pin.setFont(new Font("Railway",Font.BOLD,20));
        pin.setBounds(40,300,200,30 );
        pin.setForeground(Color.BLACK);
        add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(150,300,200,30);
        add(pinTextField);
        
        Login = new JButton("SIGN IN");
        Login.setBounds(150,350,80,30);
        Login.setBackground(Color.red);
        Login.setForeground(Color.WHITE);
        Login.addActionListener(this);
        add(Login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(270,350,80,30);
        clear.setBackground(Color.red);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(150,390,200,30);
        signup.setBackground(Color.red);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
      
        
        
        getContentPane().setBackground(Color.WHITE);
    setSize(400,600);
    setLocation(400,100);
    setVisible(true);
    }
    
    public void actionPerformed (ActionEvent ae){
        if(ae.getSource() == clear){
          cardTextField.setText("");
          pinTextField.setText("");
        }
        else if(ae.getSource() == Login){
            Connect a = new Connect();
            String cardnumber = cardTextField.getText();
            String PINnumber = pinTextField.getText();
            String query = "select * from login where cardnumber = '"+cardnumber+"'and PINnumber = '"+PINnumber+"'";
             try{
                 ResultSet rs = a.s.executeQuery(query);
                 if(rs.next()){
                     setVisible(false);
                     new Transaction(PINnumber).setVisible(true);                     
                 }else{
                     JOptionPane.showMessageDialog(null,"Incorrect cardnumber and pinnumber!");                 
                 }
                 
                            
        }catch (Exception s){
            System.out.print(s);
        }
                }
        else if(ae.getSource() == signup){
            setVisible(false);
            new signupOne().setVisible (true);
        } 
    }

        
    public static void main(String args[]){
     new login();
    } 
}
    

