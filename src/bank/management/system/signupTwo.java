package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;

public class signupTwo extends JFrame implements ActionListener {
    
    long random;
    JTextField panTextField, aadharTextField;
    JButton next;
    JRadioButton  yes,no,Yes,No;
    JComboBox religion, catagory, income, education, occupation;
    String formNo;
    
    
    signupTwo(String formNo){
        this.formNo = formNo;
        setLayout(null);
         
        setTitle("Application form page for new Applicant : Page-2");
                
        JLabel addDetails = new JLabel("2). Addtional Details");
        addDetails.setFont(new Font("Railway", Font.BOLD, 25));
        addDetails.setBounds(280, 70, 600, 40);
        add(addDetails);
                
        JLabel Religion = new JLabel("Religion");
        Religion.setFont(new Font("Railway", Font.BOLD, 16));
        Religion.setBounds(120, 160, 300, 40);
        add(Religion);
        
        String valReligion[] = {"Hindu","Muslim","Sikh","Cristian","Other"};
        religion = new JComboBox(valReligion);      
        religion.setBounds(300, 160, 350, 30);
        add(religion);
        
        
        JLabel Catagory = new JLabel("Catagory(Caste)");
        Catagory.setFont(new Font("Railway", Font.BOLD, 16));
        Catagory.setBounds(120, 200, 300, 40);
        add(Catagory);
        
        String valCast[] = {"General","OBC","SC","ST", "Scheduled Caste","Other"};
        catagory = new JComboBox(valCast);      
        catagory.setBounds(300, 204, 350, 30);
        add(catagory);
        
        JLabel Income = new JLabel("Income");
        Income.setFont(new Font("Railway", Font.BOLD, 16));
        Income.setBounds(120, 240, 300, 40);
        add(Income);
        
        
        String valIncome[] = {"under 25K","25k - 50k","50k - 1L","1L - 1.5L", "1.5L - 2.5L","2.5L above"};
        income = new JComboBox(valIncome);      
        income.setBounds(300,245,350,30);
        add(income);
                   
        JLabel edu = new JLabel("Educational ");
        edu.setFont(new Font("Railway", Font.BOLD, 16));
        edu.setBounds(120,280, 300, 40);
        add(edu);
        
        String valEducation[] = {"Pre-Matric","Post-Matric","Under Graduation","Post Graduation", "P.h.D","null"};
        education = new JComboBox(valEducation);      
        education.setBounds(300,295,350,30);
        add(education);
                                
        JLabel Quali = new JLabel("Qualification");
        Quali.setFont(new Font("Railway", Font.BOLD, 16));
        Quali.setBounds(120,300, 300, 40);
        add(Quali);
                        
        JLabel Occupation = new JLabel("Occupation");
        Occupation.setFont(new Font("Railway", Font.BOLD, 16));
        Occupation.setBounds(120,340, 300, 40);
        add(Occupation);
        
        String valOccupation[] = {"Bussinesman","Farmer","Student","Driver","Shopkeeper","Housewife","Civil Services","null"};
        occupation = new JComboBox(valOccupation);      
        occupation.setBounds(300,340,350,30);
        add(occupation);
                
        JLabel Pan = new JLabel("PAN Number");
        Pan.setFont(new Font("Railway", Font.BOLD, 16));
        Pan.setBounds(120,400, 300, 40);
        add(Pan);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Railway", Font.BOLD, 14));
        panTextField.setBounds(300, 400, 350, 30);
        add(panTextField);
        
        JLabel aadhar = new JLabel("Aadhar Number");
        aadhar.setFont(new Font("Railway", Font.BOLD, 16));
        aadhar.setBounds(120,450, 300, 40);
        add(aadhar);
        
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Railway", Font.BOLD, 14));
        aadharTextField.setBounds(300, 450, 350, 30);
        add(aadharTextField);
        
        JLabel Scitizen = new JLabel("Senior citizen");
        Scitizen.setFont(new Font("Railway", Font.BOLD, 16));
        Scitizen.setBounds(120,500, 300, 40);
        add(Scitizen);
        
        yes = new JRadioButton("YES");
        yes.setBounds(300,500,100,30);
        yes.setBackground(Color.WHITE);
        yes.setForeground(Color.BLACK);
        add(yes);
        
        no = new JRadioButton("NO");
        no.setBounds(500,500,100,30);
        no.setBackground(Color.WHITE);
        no.setForeground(Color.BLACK);
        add(no);
                
        ButtonGroup Scitizengroup = new ButtonGroup();
        Scitizengroup.add(yes);
        Scitizengroup.add(no);
               
        JLabel Exaccount = new JLabel("Existing Account");
        Exaccount.setFont(new Font("Railway", Font.BOLD, 16));
        Exaccount.setBounds(120,550, 300, 40);
        add(Exaccount);
                
        Yes = new JRadioButton("YES");
        Yes.setBounds(300, 550, 100, 30);
        Yes.setBackground(Color.WHITE);
        Yes.setForeground(Color.BLACK);
        add(Yes);
        
        No = new JRadioButton("NO");
        No.setBounds(500, 550, 100, 30);
        No.setBackground(Color.WHITE);
        No.setForeground(Color.BLACK);
        add(No);
                
        ButtonGroup Exaccountgroup = new ButtonGroup();
        Exaccountgroup.add(Yes);
        Exaccountgroup.add(No);
               
        
        next = new JButton("Next");
        next.setFont(new Font("Railway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.setForeground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.addActionListener(this);
        add(next);
        
        setSize(800,850);
        setLocation(350,10);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        String formNo = "" + random;
        String sreligion = (String)religion.getSelectedItem();
        String scatagory = (String)catagory.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
                
        String seducation = (String)education.getSelectedItem();
        String Scitizen = null;
        if(yes.isSelected()){
            Scitizen = "YES";
        }else if(no.isSelected()){
            Scitizen = "NO";
                }
        
        String Exaccount = null;
        if(Yes.isSelected()){
              Exaccount = "YES";
        }else if(No.isSelected()){
              Exaccount = "NO";
        }
              
        String soccupation = (String)occupation.getSelectedItem();
        String aadhar = panTextField.getText();
        String Pan = aadharTextField.getText();
                
        try{
           if(religion.equals("")){
               JOptionPane.showMessageDialog(null,"Religion is Required!");
           }
           else if(catagory.equals("")){
               JOptionPane.showMessageDialog(null,"Catagory is Required!");
           }
           else if(income.equals("")){
               JOptionPane.showMessageDialog(null,"Income is Required!");
           }
           else if(education.equals("")){
               JOptionPane.showMessageDialog(null,"Education Qul. is Required!");
           }
           else if(occupation.equals("")){
               JOptionPane.showMessageDialog(null,"Occupation is empty!");
           }
           else if(Pan.equals("")){
               JOptionPane.showMessageDialog(null,"PAN is Required!");
           }
           else if(aadhar.equals("")){
               JOptionPane.showMessageDialog(null,"Aadhar no. is Required.");
           }
           else if(Scitizen.equals("")){
               JOptionPane.showMessageDialog(null,"citizen info. is Required!");
           }
           else if(Exaccount.equals("")){
               JOptionPane.showMessageDialog(null,"Account info. is Required!");
           }
           else{
               Connect a = new Connect();
               String query = "insert into signupTwo values('"+formNo+"', '"+sreligion+"', '"+scatagory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+Pan+"','"+aadhar+"','"+Scitizen+"', '"+Exaccount+"')";
               a.s.executeUpdate(query);
               
               setVisible(false);
                new signupThree(formNo).setVisible (true);
               
                }
           
        }catch(Exception a){
            System.out.print(a);
        }
    }
        
      
     public static void main(String args[]){
        new signupTwo("");
    }
    
}
