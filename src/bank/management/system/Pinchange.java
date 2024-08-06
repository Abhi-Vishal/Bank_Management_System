package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Pinchange extends JFrame implements ActionListener {
    
    String PINnumber;
    JPasswordField newpinField,repinField ;
    JButton change, back;
    JLabel text,repin, newpin;   
    
    Pinchange(String PINnumber){
        this.PINnumber = PINnumber;
        
        setLayout(null);
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm01.jpg"));
        Image i2  = i1.getImage().getScaledInstance(800, 800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,800,800);
        add(image);
        
        text = new JLabel ("CHANGE YOUR PIN");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,20));
        text.setBounds(300,150,400,40);
        image.add(text);
               
        
        newpin = new JLabel ("ENTER YOUR NEW PIN");
        newpin.setForeground(Color.WHITE);
        newpin.setFont(new Font("System",Font.BOLD,18));
        newpin.setBounds(220,210,400,20);
        image.add(newpin);
        
        newpinField = new JPasswordField();
        newpinField.setFont(new Font("Railway", Font.BOLD, 14));
        newpinField.setBounds(220, 240, 300, 30);
        newpinField.setBackground(Color.BLACK);
        newpinField.setForeground(Color.WHITE);
        image.add(newpinField);
        
        
        repin = new JLabel ("RE-ENTER YOUR PIN");
        repin.setForeground(Color.WHITE);
        repin.setFont(new Font("System",Font.BOLD,18));
        repin.setBounds(220,290,400,20);
        image.add(repin);
        
        repinField = new JPasswordField();
        repinField.setFont(new Font("Railway", Font.BOLD, 14));
        repinField.setBounds(220, 320, 300, 30);
        repinField.setBackground(Color.BLACK);
        repinField.setForeground(Color.WHITE);
        image.add(repinField);
        
        change = new JButton("CHANGE");
        change.setBounds(510,370,120,30);
        change.setFont(new Font("Railway", Font.BOLD, 14));
        change.setBackground(Color.white);
        change.setForeground(Color.black);
        change.addActionListener(this);
        image.add(change);
        
        back = new JButton("BACK");
        back.setBounds(510,410,120,30);
        back.setFont(new Font("Railway", Font.BOLD, 14));
        back.setBackground(Color.white);
        back.setForeground(Color.black);
        back.addActionListener(this);
        image.add(back);
        
        
        
        setSize(800,800);
        setLocation(300,0);
        setVisible(true);       
           
      }
    
    public void actionPerformed(ActionEvent ae){
        
     if(ae.getSource() == change){    
         try{
         String npin = newpin.getText();
         String rpin = repin.getText();
         
         if(!npin.equals(rpin)){
             JOptionPane.showMessageDialog(null," Enter PIN is not match");
             return;
        }
         if(npin.equals("")){
             JOptionPane.showMessageDialog(null," Please Enter your new  pin");
             return;
         }
         if(rpin.equals("")){
             JOptionPane.showMessageDialog(null," Re-Enter your new  pin");
             return;
         }
         
         Connect a = new Connect();
         String query1 = "update bank set pin= '"+rpin+"' where pin= '"+PINnumber+"'";
         String query2 = "update login set pin= '"+rpin+"'where pin= '"+PINnumber+"'";
         String query3 = "update signupthree set pin= '"+rpin+"'where pin= '"+PINnumber+"'";
          a.s.executeUpdate(query1);
          a.s.executeUpdate(query2);
          a.s.executeUpdate(query3);
          
          JOptionPane.showMessageDialog(null," PIN changed Successfully");
          
          setVisible(false);
          new Transaction(rpin).setVisible(true);
     
     }catch(Exception a){
         System.out.println(a);
     }
     
     }else{        
        setVisible(false);
        new Transaction(PINnumber).setVisible(true);        
        
     }
    
    }

public static void main (String args[]){
    
new Pinchange("");

 }
}


