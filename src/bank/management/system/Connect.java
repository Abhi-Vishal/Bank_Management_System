package bank.management.system;
import java.sql.*;

public class Connect {
    Connection a;
    Statement s;
    public Connect(){
    
    try {
           
    a = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","987654");
    s = a.createStatement();
    } 
    catch(Exception a){
       System.out.print(a);
    }
}
    
}
