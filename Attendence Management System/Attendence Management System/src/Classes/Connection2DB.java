/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


/**
 *
 * @author AKHIL REJI
 */
public class Connection2DB {
    
    public static Connection setconnection()
    {
        String dbdir = "D:\\Database";
        File Database= new File(dbdir);
        if(Database.exists() )
        {
       
          
        }
        else
        {
         
         Database.mkdir();
        }
           
          
           
           String DbName = "Attendance.accdb";
           String DbPath = dbdir + "\\" + DbName;
           File f2 = new File(DbPath);
           if(f2.exists())
           {
               
               }
           else
           {
               try{
                   System.getProperty("user.dir");
                  File fsource = new File(System.getProperty("user.dir") + "\\src\\Database\\Attendance.accdb");
                Files.copy( fsource.toPath(), f2.toPath());
          
               }
               catch(IOException e){
                   e.printStackTrace();
                   //JOptionPane.showMessageDialog(null,"Database failed","Not yet verified",JOptionPane.ERROR_MESSAGE ); 
               }
          
           }
        
        
        String sql;
             
            //String path="D:\\Attendence Management System\\Attendance.accdb";
            String url="jdbc:ucanaccess://"+ DbPath;
           
        
        Connection conn=null;
        try
        {
            conn=DriverManager.getConnection( url);
            
        }
        catch(Exception e)
        {
            System.out.println(e);
            
        }
        return conn;
        
    }

    public PreparedStatement PrepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
