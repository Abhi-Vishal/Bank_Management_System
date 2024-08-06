package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class BalanceEnquiry extends JFrame implements ActionListener {

String PINnumber;
JButton back, withdraw;

BalanceEnquiry(String PINnumber){
    this.PINnumber = PINnumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm01.jpg"));
        Image i2  = i1.getImage().getScaledInstance(800, 800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,800,800);
        add(image);
        
        back = new JButton("BACK");
        back.setBounds(510,410,120,30);
        back.setFont(new Font("Railway", Font.BOLD, 14));
        back.setBackground(Color.white);
        back.setForeground(Color.black);
        back.addActionListener(this);
        image.add(back);
        
        Connect a = new Connect();
         int balance = 0;
        try{
            ResultSet rs = a.s.executeQuery("select * from bank where pin = '"+PINnumber+"'");
            while(rs.next()){
                if(rs.getString("type").equals("Deposite")){
                    balance += Integer.parseInt(rs.getString("amount"));
                    }
                else{
                    balance -= Integer.parseInt(rs.getString("amount"));                
                }            
            }            
        }catch(Exception e){
            System.out.println(e);
        }        
        
        JLabel message = new JLabel ("Your Current Account Balance is in Rs: " + balance);
        message.setForeground(Color.WHITE);
        message.setBounds(170,170,300,100);
        image.add(message);
        
        setSize(800,800);
        setUndecorated(true);
        setLocation(300,0);      
        setVisible(true);
}
public void actionPerformed(ActionEvent ae){
    setVisible(false);
    new Transaction(PINnumber).setVisible(true);
    

    
this.PINnumber = PINnumber;


}




public static void main(String args[]){

new BalanceEnquiry("");
}
}