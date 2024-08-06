package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java. awt. event.*;

public class Transaction extends JFrame implements ActionListener  {
    
    JButton deposit, withdraw, Be, transfer, cash, PC, exit;
    String PINnumber;
    
    Transaction(String PINnumber){
        this.PINnumber = PINnumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm01.jpg"));
        Image i2  = i1.getImage().getScaledInstance(800, 800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,800,800);
        add(image);
        
        JLabel text = new JLabel("Please select your Transaction ");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Railway", Font.BOLD, 20));
        text.setBounds(250, 170, 600, 20);
        image.add(text);
        
        deposit = new JButton("DEPOSIT");
        deposit.setBounds(200,290,150,35);
        deposit.setFont(new Font("Railway", Font.BOLD, 16));
        deposit.setBackground(Color.WHITE);
        deposit.setForeground(Color.black);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdraw = new JButton("WITHDRAW");
        withdraw.setBounds(200,330,150,35);
        withdraw.setFont(new Font("Railway", Font.BOLD, 16));
        withdraw.setBackground(Color.white);
        withdraw.setForeground(Color.black);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
        Be = new JButton("BALANCE ENQUIRY");
        Be.setBounds(400,330,190,35);
        Be.setFont(new Font("Railway", Font.BOLD, 16));
        Be.setBackground(Color.white);
        Be.setForeground(Color.black);
        Be.addActionListener(this);
        image.add(Be);
        
        transfer = new JButton("MINI STATEMENT");
        transfer.setBounds(400,290,200,35);
        transfer.setFont(new Font("Railway", Font.BOLD, 16));
        transfer.setBackground(Color.white);
        transfer.setForeground(Color.black);
        transfer.addActionListener(this);
        image.add(transfer);
        
        PC = new JButton("PIN CHANGE");
        PC.setBounds(300,370,190,35);
        PC.setFont(new Font("Railway", Font.BOLD, 16));
        PC.setBackground(Color.white);
        PC.setForeground(Color.black);
        PC.addActionListener(this);
        image.add(PC);
        
        exit = new JButton("EXIT");
        exit.setFont(new Font("Railway",Font.BOLD,16));
        exit.setBounds(520,410,80,35);
        exit.setForeground(Color.black);
        exit.setBackground(Color.white);
        exit.addActionListener(this);
        image.add(exit);
        
        cash = new JButton("CASH");
        cash.setBounds(370,540,150,50);
        cash.setFont(new Font("Railway", Font.BOLD, 24));
        cash.setBackground(Color. green );
        cash.setForeground(Color.white);
        cash.addActionListener(this);
        image.add(cash);
        
        setSize(800,800);
        setUndecorated(true);
        setLocation(300,0);      
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){               
        if(ae.getSource() == exit){
            System.exit(0);                    
        }
        else if(ae.getSource() == deposit){
           setVisible(false);
            new Deposite(PINnumber).setVisible(true);           
        }else if(ae.getSource() == withdraw){
           setVisible(false);
            new Withdraw(PINnumber).setVisible(true);           
        }else if(ae.getSource() == PC){
            setVisible(false);
            new Pinchange(PINnumber).setVisible(true);
        }else if(ae.getSource() == Be){
            setVisible(false);
            new BalanceEnquiry(PINnumber).setVisible(true);
        }else if(ae.getSource() == transfer){
            setVisible(false);
            new MiniStatement(PINnumber).setVisible(true);
        }else if(ae.getSource() == transfer){
            setVisible(false);
            new MiniStatement(PINnumber).setVisible(true);
        }
                
    }

public static void main(String args[]){

    new Transaction("");

    }
}
