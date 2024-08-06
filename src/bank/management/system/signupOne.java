package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;

public class signupOne extends JFrame implements ActionListener {
    
    long random;
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, StateTextField, PincodeTextField, mobileNoTextField;
    JButton next;
    JRadioButton male, female, other, married, unmarried, Other;
    JDateChooser datechooser;
    
    
    signupOne(){
        
        setLayout(null);
        
        Random ran = new Random();
       long random = Math.abs(ran.nextLong() % 9000L + 1000L);
        
        JLabel formNo = new JLabel("APPLICATION FORM NO. " + random);
        getContentPane().setBackground(Color.WHITE);
        formNo.setFont(new Font("Railway", Font.BOLD, 30));
        formNo.setBounds(160, 20, 600, 40);
        add(formNo);
        
        JLabel personalDetails = new JLabel("1). Personal Details");
        personalDetails.setFont(new Font("Railway", Font.BOLD, 22));
        personalDetails.setBounds(280, 70, 600, 40);
        add(personalDetails);
        
        JLabel name = new JLabel("Name");
        name.setFont(new Font("Railway", Font.BOLD, 16));
        name.setBounds(120, 160, 300, 40);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Railway", Font.BOLD, 14));
        nameTextField.setBounds(250, 160, 350, 30);
        add(nameTextField);
        
        
        JLabel fname = new JLabel("Father Name");
        fname.setFont(new Font("Railway", Font.BOLD, 16));
        fname.setBounds(120, 200, 300, 40);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Railway", Font.BOLD, 14));
        fnameTextField.setBounds(250, 200, 350, 30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date of Birth");
        dob.setFont(new Font("Railway", Font.BOLD, 16));
        dob.setBounds(120, 240, 300, 40);
        add(dob);
        
        datechooser = new JDateChooser();
        datechooser.setBounds(250,240,200,30);
        add(datechooser);
                   
        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Railway", Font.BOLD, 16));
        gender.setBounds(120,280, 300, 40);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(250,280,80,30);
        male.setBackground(Color.WHITE);
        male.setForeground(Color.BLACK);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(370,280,80,30);
        female.setBackground(Color.WHITE);
        female.setForeground(Color.BLACK);
        add(female);
        
        other = new JRadioButton("Others");
        other.setBounds(500,280,80,30);
        other.setBackground(Color.WHITE);
        other.setForeground(Color.BLACK);
        add(other);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other);
        
                        
        JLabel email = new JLabel("e-mail");
        email.setFont(new Font("Railway", Font.BOLD, 16));
        email.setBounds(120,320, 300, 40);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Railway", Font.BOLD, 14));
        emailTextField.setBounds(250, 320, 350, 30);
        add(emailTextField);
        
        JLabel maritalStatus = new JLabel("Marital Status");
        maritalStatus.setFont(new Font("Railway", Font.BOLD, 16));
        maritalStatus.setBounds(120,360, 300, 40);
        add(maritalStatus);
        
        
        married = new JRadioButton("Married");
        married.setBounds(250,360,100,30);
        married.setBackground(Color.WHITE);
        married.setForeground(Color.BLACK);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(370,360,100,30);
        unmarried.setBackground(Color.WHITE);
        unmarried.setForeground(Color.BLACK);
        add(unmarried);
        
        Other = new JRadioButton("Other");
        Other.setBounds(500,360,80,30);
        Other.setBackground(Color.WHITE);
        Other.setForeground(Color.BLACK);
        add(Other);
        
        ButtonGroup maritalStatusgroup = new ButtonGroup();
        maritalStatusgroup.add(married);
        maritalStatusgroup.add(unmarried);
        maritalStatusgroup.add(Other);
        
              
        JLabel address = new JLabel("Address");
        address.setFont(new Font("Railway", Font.BOLD, 16));
        address.setBounds(120,400, 300, 40);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Railway", Font.BOLD, 14));
        addressTextField.setBounds(250, 400, 350, 30);
        add(addressTextField);
        
        JLabel city = new JLabel("City");
        city.setFont(new Font("Railway", Font.BOLD, 16));
        city.setBounds(120,450, 300, 40);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Railway", Font.BOLD, 14));
        cityTextField.setBounds(250, 450, 350, 30);
        add(cityTextField);
        
        JLabel State = new JLabel("State");
        State.setFont(new Font("Railway", Font.BOLD, 16));
        State.setBounds(120,500, 300, 40);
        add(State);
        
        StateTextField = new JTextField();
        StateTextField.setFont(new Font("Railway", Font.BOLD, 14));
        StateTextField.setBounds(250, 500, 350, 30);
        add(StateTextField);
        
        JLabel Pincode = new JLabel("Pincode");
        Pincode.setFont(new Font("Railway", Font.BOLD, 16));
        Pincode.setBounds(120,550, 300, 40);
        add(Pincode);
        
        PincodeTextField = new JTextField();
        PincodeTextField.setFont(new Font("Railway", Font.BOLD, 14));
        PincodeTextField.setBounds(250, 550, 350, 30);
        add(PincodeTextField);
        
        JLabel mobileNo = new JLabel("Mobile No");
        mobileNo.setFont(new Font("Railway", Font.BOLD, 16));
        mobileNo.setBounds(120,600, 300, 40);
        add(mobileNo);
        
        mobileNoTextField = new JTextField();
        mobileNoTextField.setFont(new Font("Railway", Font.BOLD, 14));
        mobileNoTextField.setBounds(250, 600, 350, 30);
        add(mobileNoTextField);
        
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
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }else if(female.isSelected()){
            gender = "Female";
        }else if(other.isSelected()){
            gender = "Other";
        }
        
        String email = emailTextField.getText();
        
        String maritalStatus = null;
        if(married.isSelected()){
              maritalStatus = "Married";
        }else if(unmarried.isSelected()){
              maritalStatus = "Unmarried";
        }else if(Other.isSelected()){
              maritalStatus = "Other";
        }
              
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String State = StateTextField.getText();
        String Pincode = PincodeTextField.getText();
        String mobileNo = mobileNoTextField.getText();
        
        try{
           if(name.equals("")){
               JOptionPane.showMessageDialog(null,"Name is Required!");
           }
           else if(fname.equals("")){
               JOptionPane.showMessageDialog(null,"Father name is Required!");
           }
           else if(dob.equals("")){
               JOptionPane.showMessageDialog(null,"Date of Birth is Required!");
           }
           else if(email.equals("")){
               JOptionPane.showMessageDialog(null,"E-mail is Required!");
           }
           else if(gender.equals("")){
               JOptionPane.showMessageDialog(null,"Gender is empty!");
           }
           else if(maritalStatus.equals("")){
               JOptionPane.showMessageDialog(null,"Marital Status is empty!");
           }
           else if(address.equals("")){
               JOptionPane.showMessageDialog(null,"Address is Required.");
           }
           else if(mobileNo.equals("")){
               JOptionPane.showMessageDialog(null,"Mobile Number is Required!");
           }
           else{
               Connect a = new Connect();
               String query = "insert into signup values('"+formNo+"', '"+name+"', '"+fname+"', '"+dob+"', '"+email+"', '"+gender+"', '"+maritalStatus+"', '"+address+"', '"+city+"', '"+State+"', '"+Pincode+"', '"+mobileNo+"')";
               a.s.executeUpdate(query);
               
               setVisible(false);
                new signupTwo(formNo).setVisible (true);
               }
           
        }catch(Exception a){
            System.out.print(a);
        }
    }
        
      
     public static void main(String args[]){
        new signupOne();
    }
    
}
