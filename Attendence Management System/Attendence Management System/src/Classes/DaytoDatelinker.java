/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import attendence.management.system.DashboardForm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

/**
 * set as
 * @author AKHIL REJI
 */
public class DaytoDatelinker {
       
public void sem1() throws SQLException
{
    Connection2DB C=new Connection2DB();
    Connection conn=C.setconnection();
    int b=0;
    int a=1;
    String s=null;
    
    java.util.Date date=null;
    date =new java.util.Date();  
    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");//Pick the Current System Date
    String dates=sdf.format(date); 
    
    
    PreparedStatement st=null;
    ResultSet rs=null;
        try {
            
            int mk=1;
            {
                YearMonth mon=YearMonth.now();
                DateTimeFormatter monthYearFormatter = DateTimeFormatter.ofPattern("MM");
      
                switch (mon.format(monthYearFormatter))
                        {
                    case "01":
                    case "02":    
                    case "03":
                    case "12": 
                    case "11":mk=2;
                        break;
                    case "06": 
                    case "08":    
                    case "09":
                    case "10": 
                    case "07":mk=1;  
                    break;
                        
                        }
            }
            if(mk==1)
            {
            st=conn.prepareStatement("select * from DaytoDates1");
            rs=st.executeQuery();//collect the table in rs
            }
            else if(mk==2){
                st=conn.prepareStatement("select * from DaytoDates2");
            rs=st.executeQuery();//collect the table in rs
            }
             
         if(!rs.next())
         {
             a=1;
            b=rs.getRow();
          if(mk==1)
     {
    if(a==1)
    {       
        if (JOptionPane.showConfirmDialog(null, "Do you want to set this as working day?", "Working Day",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        b++;
            String sql;
            sql="insert into daytodates1(day,date) values(?,?)";
            PreparedStatement pst=conn.prepareStatement(sql);
            
            pst.setInt(1, b);
            pst.setString(2,dates);
            pst.executeUpdate();  
             JOptionPane.showMessageDialog(null,"Done","Set as working day in first semester",JOptionPane.INFORMATION_MESSAGE ); 
        }
    }
     }
     else  if(mk==2)
    {
       if(a==1)
    {       
        if (JOptionPane.showConfirmDialog(null, "Do you want to set this as working day?", "Working Day",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        b++;
            String sql;
            sql="insert into daytodates2(day,date) values(?,?)";
            PreparedStatement pst=conn.prepareStatement(sql);
            
            pst.setInt(1, b);
            pst.setString(2,dates);
            pst.executeUpdate();  
             JOptionPane.showMessageDialog(null,"Done","Set as working day in second semester",JOptionPane.INFORMATION_MESSAGE ); 
        }
    } 
    }  
         }
        
         else{
             
         
        
            while(rs.next())
    {   s=null;
        s=rs.getString("Date");
        a=0;
       
        if(s.equals(dates))
        {
            
            break;
        }
        else
        {
             
            
            
            a=1;
            b=rs.getRow();
            
        }
        
    }
     if(mk==1)
     {
    if(a==1)
    {       
        if (JOptionPane.showConfirmDialog(null, "Do you want to set this as working day?", "Working Day",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        b++;
            String sql;
            sql="insert into daytodates1(day,date) values(?,?)";
            PreparedStatement pst=conn.prepareStatement(sql);
            
            pst.setInt(1, b);
            pst.setString(2,dates);
            pst.executeUpdate();  
             JOptionPane.showMessageDialog(null,"Done","Set as working day in first semester",JOptionPane.INFORMATION_MESSAGE ); 
        }
    }
     }
     else  if(mk==2)
    {
       if(a==1)
    {       
        if (JOptionPane.showConfirmDialog(null, "Do you want to set this as working day?", "Working Day",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        b++;
            String sql;
            sql="insert into daytodates2(day,date) values(?,?)";
            PreparedStatement pst=conn.prepareStatement(sql);
            
            pst.setInt(1, b);
            pst.setString(2,dates);
            pst.executeUpdate();  
             JOptionPane.showMessageDialog(null,"Done","Set as working day in second semester",JOptionPane.INFORMATION_MESSAGE ); 
        }
    } 
    }
         }   
            
        } catch (SQLException ex) {
            
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
              
}   

public void sem2() throws SQLException
{
 
    Connection2DB C=new Connection2DB();
    Connection conn=C.setconnection();
    int b=0;
    int a=1;
    String s=null;
    
    java.util.Date date=null;
    date =new java.util.Date();  
    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");//Pick the Current System Date
    String dates=sdf.format(date); 
    
    
    PreparedStatement st=null;
    ResultSet rs=null;
        try {
            
            st=conn.prepareStatement("select * from DaytoDates2");
            rs=st.executeQuery();//collect the table in rs
        
            while(rs.next())
    {   s=null;
        s=rs.getString("Date");
        a=0;
       
        if(s.equals(dates))
        {
            
            break;
        }
        else
        {
             
            
            
            a=1;
            b=rs.getRow();
            
        }
    }
            
           
    if(a==1)
    {       b++;
            String sql;
            sql="insert into daytodates2(day,date) values(?,?)";
            PreparedStatement pst=conn.prepareStatement(sql);
            
            pst.setInt(1, b);
            pst.setString(2,dates);
            pst.executeUpdate();  
             JOptionPane.showMessageDialog(null,"Done","Set as working day",JOptionPane.ERROR_MESSAGE ); 
    }    
    else
    {
      //JOptionPane.showMessageDialog(null,"Can not add","Already exist",JOptionPane.ERROR_MESSAGE );   
    }
        
           
        } catch (SQLException ex) {
            
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
      
    
}  
}