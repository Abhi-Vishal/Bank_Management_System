package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Deposite extends JFrame implements ActionListener{
    
    JTextField textField;
    JButton deposite, back;
    String PINnumber;
    
    Deposite(String PINnumber){
        this.PINnumber = PINnumber;
    
    setLayout(null);
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm01.jpg"));
        Image i2  = i1.getImage().getScaledInstance(800, 800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,800,800);
        add(image);
        
        JLabel text = new JLabel ("Enter the amount you want to Deposite");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,18));
        text.setBounds(220,180,400,20);
        image.add(text);
        
        textField = new JTextField();
        textField.setFont(new Font("Railway", Font.BOLD, 16));
        textField.setBounds(220, 220, 350, 40);
        textField.setBackground(Color.BLACK);
        textField.setForeground(Color.WHITE);
        image.add(textField);
        
        deposite = new JButton("DEPOSITE");
        deposite.setBounds(520,370,110,30);
        deposite.setFont(new Font("Railway", Font.BOLD, 14));
        deposite.setBackground(Color.white);
        deposite.setForeground(Color.black);
        deposite.addActionListener(this);
        image.add(deposite);
        
        back = new JButton("BACK");
        back.setBounds(520,410,110,30);
        back.setFont(new Font("Railway", Font.BOLD, 14));
        back.setBackground(Color.white);
        back.setForeground(Color.black);
        back.addActionListener(this);
        image.add(back);
        
        setSize(800,800);
        setLocation(300,0);      
        setVisible(true);             
        }
    
    public void actionPerformed (ActionEvent ae){
        if(ae.getSource() == deposite){
            
            String amount = textField.getText();
            Date date = new Date();
                if(amount.equals("")){
                    JOptionPane.showMessageDialog(null,"Plesae Enter a amount want you deposit");
                }
                else {
                    
                    try{
                 Connect a = new Connect();
                 String query = "insert into bank values('"+PINnumber+"', '"+date+"', 'deposite', '"+amount+"')";
                 a.s.executeUpdate(query);
                 JOptionPane.showMessageDialog(null,"Deposite has been successfully performed");
                 setVisible(false);
                 new Transaction(PINnumber).setVisible(true);
                    }
                    catch(Exception a ){
                        System.out.print(a);
                    }
                
                }
        
        }
        else if(ae.getSource() == back){
            setVisible(false);
                new Transaction(PINnumber).setVisible(true);
          } 
    }
        
        public static void main (String args[]){
        new Deposite("");
        
        }
}
