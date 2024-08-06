package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.sql.*;


public class MiniStatement extends JFrame{
        
    MiniStatement(String PINnumber){
        setLayout(null);
        setTitle("Mini Statement");
        
        JLabel mini = new JLabel();
        mini.setBounds(50,110,400,20);
        add(mini);        
        
        JLabel bank = new JLabel("STATE BANK OF INDIA");
        bank.setFont(new Font("Railway", Font.BOLD, 16));
        bank.setBounds(120,20,200,50);
        add(bank);
                
        JLabel card = new JLabel("Card Number : ");
        card.setBounds(50,90,400,25);
        add(card);
        
        try{
           Connect a = new Connect();
           ResultSet rs = a.s.executeQuery(" select * from login where PINnumber = '" + PINnumber +"'"); //'4774'
           while(rs.next()){
                card.setText( "Card Number : " + rs.getString ("cardnumber").substring(0,4) + "-XXX-XXXX-XXXXX");
            }            
          }
        catch (Exception e){
         System.out.println(e);
        }
        
        try{
            Connect a = new Connect();
            ResultSet rs = a.s.executeQuery(" select * from bank where PINnumber = '" + PINnumber +"'");
            while(rs.next()){
                mini.setText( mini.getText() + "<html>" + rs.getString ("date") +"&nbsp;&nbsp;&nbsp;&nbsp;"+ rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;"+ rs.getString("Amount"));
            }            
          }            
           catch (Exception e){
            System.out.println(e);
        }
               
        
     setSize(400,500);
     setLocation(30,20);
     getContentPane().setBackground(Color.WHITE);
     setVisible(true);
     
    }
    
    
    public static void main(String[] args){
    new MiniStatement("");
    }
}
    
