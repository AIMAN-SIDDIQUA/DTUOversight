package university.management.system;

import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            //c =DriverManager.getConnection("jdbc:mysql:///ums","root","");    
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ums" ,"root","");
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
