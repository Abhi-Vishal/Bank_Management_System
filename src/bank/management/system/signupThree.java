package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;


public class signupThree extends JFrame implements ActionListener {
    
    long rand;
    JButton submit, cancel;
    JRadioButton saving, fixedAcc, current, remain;
    JCheckBox atm, ib, mobileBan, mobileSMS, checkbook, estatement, decleration;
    String formNo;
       
    
    signupThree(String formNo){
         this.formNo = formNo;
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
                              
        JLabel personalDetails = new JLabel("3). Account Details");
        personalDetails.setFont(new Font("Railway", Font.BOLD, 30));
        personalDetails.setBounds(280, 70, 600, 40);
        add(personalDetails);
        
        JLabel account = new JLabel("Account Type");
        account.setFont(new Font("Railway", Font.BOLD, 18));
        account.setBounds(120, 160, 300, 40);
        add(account);
        
        saving = new JRadioButton("Saving Account");
        saving.setBounds(120,200,120,30);
        saving.setBackground(Color.WHITE);
        saving.setForeground(Color.BLACK);
        add(saving);
        
        fixedAcc = new JRadioButton("Fixed Deposite Account");
        fixedAcc.setBounds(320,200,200,30);
        fixedAcc.setBackground(Color.WHITE);
        fixedAcc.setForeground(Color.BLACK);
        add(fixedAcc);
        
        current = new JRadioButton("Current Account");
        current.setBounds(120,250,120,30);
        current.setBackground(Color.WHITE);
        current.setForeground(Color.BLACK);
        add(current);
        
        remain = new JRadioButton("Recurring Deposite Account");
        remain.setBounds(320,250,120,30);
        remain.setBackground(Color.WHITE);
        remain.setForeground(Color.BLACK);
        add(remain);
               
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(saving);
        gendergroup.add(fixedAcc);
        gendergroup.add(current);
        gendergroup.add(remain);
        
        
        
        
        JLabel cardNum = new JLabel("Card Number");
        cardNum.setFont(new Font("Railway", Font.BOLD, 18));
        cardNum.setBounds(120, 290, 300, 40);
        add(cardNum);
        
        JLabel Num = new JLabel("Your 16 Digit Card Number");
        Num.setFont(new Font("Railway", Font.BOLD, 8));
        Num.setBounds(120, 310, 300, 40);
        add(Num);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-3278");
        number.setFont(new Font("Railway", Font.BOLD, 16));
        number.setBounds(320,290, 300, 40);
        add(number);
        
        
        
        JLabel pin = new JLabel("PIN");
        pin.setFont(new Font("Railway", Font.BOLD, 18));
        pin.setBounds(120, 350, 300, 40);
        add(pin);
        
        JLabel Num2 = new JLabel("Your 4 Digit PIN Number");
        Num2.setFont(new Font("Railway", Font.BOLD, 8));
        Num2.setBounds(120, 370, 300, 40);
        add(Num2);
                     
        JLabel p1 = new JLabel("XXXX");
        p1.setFont(new Font("Railway", Font.BOLD, 16));
        p1.setBounds(320,350, 300, 40);
        add(p1);
        
        JLabel service = new JLabel("Services Required");
        service.setFont(new Font("Railway", Font.BOLD, 18));
        service.setBounds(120,420, 300, 40);
        add(service);
        
        
        atm = new JCheckBox("ATM Card");
        atm.setBounds(120,460,100,30);
        atm.setBackground(Color.WHITE);
        atm.setForeground(Color.BLACK);
        add(atm);
        
        ib = new JCheckBox("Internet banking");
        ib.setBounds(320,460,120,30);
        ib.setBackground(Color.WHITE);
        ib.setForeground(Color.BLACK);
        add(ib);
        
        mobileBan = new JCheckBox("Mobile Banking");
        mobileBan.setBounds(120,505,120,30);
        mobileBan.setBackground(Color.WHITE);
        mobileBan.setForeground(Color.BLACK);
        add(mobileBan);
        
        mobileSMS = new JCheckBox("Mobile & SMS Alert");
        mobileSMS.setBounds(320,505,200,30);
        mobileSMS.setBackground(Color.WHITE);
        mobileSMS.setForeground(Color.BLACK);
        add(mobileSMS);
        
        checkbook = new JCheckBox("Check Book");
        checkbook.setBounds(120,550,200,30);
        checkbook.setBackground(Color.WHITE);
        checkbook.setForeground(Color.BLACK);
        add(checkbook);
        
        estatement = new JCheckBox("E-Statement");
        estatement.setBounds(320,550,200,30);
        estatement.setBackground(Color.WHITE);
        estatement.setForeground(Color.BLACK);
        add(estatement);
                        
        decleration = new JCheckBox("I heardly decleared that given all information ae correct and significent for use.");
        decleration.setBounds(150,600,600,30);
        decleration.setBackground(Color.WHITE);
        decleration.setForeground(Color.BLACK);
        add(decleration);
                                     
        submit = new JButton("Submit");
        submit.setFont(new Font("Railway",Font.BOLD,14));
        submit.setBounds(200,650,120,30);
        submit.setForeground(Color.WHITE);
        submit.setBackground(Color.BLACK);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Railway",Font.BOLD,14));
        cancel.setBounds(400,650,120,30);
        cancel.setForeground(Color.WHITE);
        cancel.setBackground(Color.BLACK);
        cancel.addActionListener(this);
        add(cancel);
        
        setSize(800,850);
        setLocation(350,10);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String account = null;
        if(saving.isSelected()){
            account = "Saving Account";
        }else if(fixedAcc.isSelected()){
            account = "Fixed Account";
        }else if(current.isSelected()){
            account = "Current Account";
        }else if(remain.isSelected()){
            account = "Recurring Deposite Account";
        }
                  
                
        Random rand = new Random();
        String cardNum = "" + Math.abs((rand.nextLong() % 90000000L) + 8112532100000000L);
        
        String pin = "" + Math.abs((rand.nextLong() % 9000L) + 1000L);
        
        String service = "";
        if(atm.isSelected()){
              service = service + "ATM Card";
        }else if(ib.isSelected()){
              service = service + "Internet Banking";
        }else if(mobileBan.isSelected()){
              service = service + "Mobile Baning";
        }else if(mobileSMS.isSelected()){
              service = service + "Mobile & SMS Alert";
        }else if(checkbook.isSelected()){
              service = service + "Check Book";
        }else if(estatement.isSelected()){
              service = service + "E- Statement";
        }
        
        
        try{
            
            if(ae.getSource() == submit){
                
           if(account.equals("")){
               JOptionPane.showMessageDialog(null,"Account type is Required!");
           }               
           else {
               Connect a = new Connect();
               String query1 = "insert into signupThree values('"+formNo+"', '"+account+"', '"+cardNum+"', '"+pin+"', '"+service+"')";
               String query2 = "insert into login values('"+formNo+"','"+cardNum+"', '"+pin+"')";
               a.s.executeUpdate(query1);
               a.s.executeUpdate(query2);
               
               JOptionPane.showMessageDialog(null, "Card Number: " + cardNum + " \n pin: " + pin );      
               
               setVisible(false);
                 new Deposite(pin).setVisible(true);
        }
            }else if (ae.getSource() == cancel) {
        setVisible(false);
        new login().setVisible(true);
    
    }
            }catch(Exception a){
            System.out.print(a);
            }
       
        
    }
                  
     public static void main(String args[]){
        new signupThree("");
    }
    
}
