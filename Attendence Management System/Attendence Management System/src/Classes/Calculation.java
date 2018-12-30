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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author AKHIL REJI
 */
public class Calculation {
     
    
    //
    public void classcalc() throws SQLException
    {
      Connection2DB C=new Connection2DB();
        Connection conn=C.setconnection();
        PreparedStatement st;  
        float total=0;
        float get=0;
        float pers=1;
        String rno=null;
        {
         try {
            st = conn.prepareStatement("select * from attendance11");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance11");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
                case "111111":get=get+1;
                break;
                case "011111":get=get+1;
                break;
                case "101111":get=get+1;
                break;
                case "110111":get=get+1;
                break;
                case "111011":get=get+1;
                break;
                case "111101":get=get+1;
                break;
                case "111110":get=get+1;
                break;
                
                case "111000":get=(float) (get+0.5);//
                break;
                case "011100":get=(float) (get+0.5);//
                break;
                case "001110":get=(float) (get+0.5);//
                break;
                case "000111":get=(float) (get+0.5);//
                break;
                case "110100":get=(float) (get+0.5);//
                break;
                case "110010":get=(float) (get+0.5);//
                break;
                case "110001":get=(float) (get+0.5);//
                break;
                case "101100":get=(float) (get+0.5);//
                break;
                case "100110":get=(float) (get+0.5);//
                break;
                case "100011":get=(float) (get+0.5);//
                break;
                
                case "010110":get=(float) (get+0.5);//
                break;
                case "010011":get=(float) (get+0.5);//
                break;
                case "001011":get=(float) (get+0.5);//
                break;
                case "101010":get=(float) (get+0.5);//
                break;
                case "101001":get=(float) (get+0.5);//
                break;
                case "100101":get=(float) (get+0.5);//
                break;
                case "010101":get=(float) (get+0.5);//
                break;
                case "011010":get=(float) (get+0.5);//
                break;
                case "011001":get=(float) (get+0.5);//
                break;
                case "001101":get=(float) (get+0.5);//
                break;
                
                case "111100":get=(float) (get+0.5);//
                break;
                case "111010":get=(float) (get+0.5);//
                break;
                case "111001":get=(float) (get+0.5);//
                break;
                case "110110":get=(float) (get+0.5);//
                break;
                case "110101":get=(float) (get+0.5);//
                break;
                case "110011":get=(float) (get+0.5);//
                break;
                case "101110":get=(float) (get+0.5);//
                break;
                case "101101":get=(float) (get+0.5);//
                break;
                case "101011":get=(float) (get+0.5);//
                break;
                case "100111":get=(float) (get+0.5);//
                break;
                
                case "011110":get=(float) (get+0.5);//
                break;
                case "011101":get=(float) (get+0.5);//
                break;
                case "011011":get=(float) (get+0.5);//
                break;
                case "010111":get=(float) (get+0.5);//
                break;
                case "001111":get=(float) (get+0.5);//
                break;
                
                default:get=get+0;
                break;
                
            }
            a++;
            
                }
                if(total == 0)
                {
                    
                }
                else
                {
                pers=(get*100)/total;
                }
            String sql;
                     sql="UPDATE attendance11 SET class=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        } 
        
        {
         try {
            st = conn.prepareStatement("select * from attendance12");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance12");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
                case "111111":get=get+1;
                break;
                case "011111":get=get+1;
                break;
                case "101111":get=get+1;
                break;
                case "110111":get=get+1;
                break;
                case "111011":get=get+1;
                break;
                case "111101":get=get+1;
                break;
                case "111110":get=get+1;
                break;
                
                case "111000":get=(float) (get+0.5);//
                break;
                case "011100":get=(float) (get+0.5);//
                break;
                case "001110":get=(float) (get+0.5);//
                break;
                case "000111":get=(float) (get+0.5);//
                break;
                case "110100":get=(float) (get+0.5);//
                break;
                case "110010":get=(float) (get+0.5);//
                break;
                case "110001":get=(float) (get+0.5);//
                break;
                case "101100":get=(float) (get+0.5);//
                break;
                case "100110":get=(float) (get+0.5);//
                break;
                case "100011":get=(float) (get+0.5);//
                break;
                
                case "010110":get=(float) (get+0.5);//
                break;
                case "010011":get=(float) (get+0.5);//
                break;
                case "001011":get=(float) (get+0.5);//
                break;
                case "101010":get=(float) (get+0.5);//
                break;
                case "101001":get=(float) (get+0.5);//
                break;
                case "100101":get=(float) (get+0.5);//
                break;
                case "010101":get=(float) (get+0.5);//
                break;
                case "011010":get=(float) (get+0.5);//
                break;
                case "011001":get=(float) (get+0.5);//
                break;
                case "001101":get=(float) (get+0.5);//
                break;
                
                case "111100":get=(float) (get+0.5);//
                break;
                case "111010":get=(float) (get+0.5);//
                break;
                case "111001":get=(float) (get+0.5);//
                break;
                case "110110":get=(float) (get+0.5);//
                break;
                case "110101":get=(float) (get+0.5);//
                break;
                case "110011":get=(float) (get+0.5);//
                break;
                case "101110":get=(float) (get+0.5);//
                break;
                case "101101":get=(float) (get+0.5);//
                break;
                case "101011":get=(float) (get+0.5);//
                break;
                case "100111":get=(float) (get+0.5);//
                break;
                
                case "011110":get=(float) (get+0.5);//
                break;
                case "011101":get=(float) (get+0.5);//
                break;
                case "011011":get=(float) (get+0.5);//
                break;
                case "010111":get=(float) (get+0.5);//
                break;
                case "001111":get=(float) (get+0.5);//
                break;
                
                default:get=get+0;
                break;
                
            }
            a++;
            
                }
                if(total == 0)
                {
                    
                }
                else{
                pers=(get*100)/total;
                }
            String sql;
                     sql="UPDATE attendance12 SET class=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
     {
         try {
            st = conn.prepareStatement("select * from attendance21");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance21");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
                case "111111":get=get+1;
                break;
                case "011111":get=get+1;
                break;
                case "101111":get=get+1;
                break;
                case "110111":get=get+1;
                break;
                case "111011":get=get+1;
                break;
                case "111101":get=get+1;
                break;
                case "111110":get=get+1;
                break;
                
                case "111000":get=(float) (get+0.5);//
                break;
                case "011100":get=(float) (get+0.5);//
                break;
                case "001110":get=(float) (get+0.5);//
                break;
                case "000111":get=(float) (get+0.5);//
                break;
                case "110100":get=(float) (get+0.5);//
                break;
                case "110010":get=(float) (get+0.5);//
                break;
                case "110001":get=(float) (get+0.5);//
                break;
                case "101100":get=(float) (get+0.5);//
                break;
                case "100110":get=(float) (get+0.5);//
                break;
                case "100011":get=(float) (get+0.5);//
                break;
                
                case "010110":get=(float) (get+0.5);//
                break;
                case "010011":get=(float) (get+0.5);//
                break;
                case "001011":get=(float) (get+0.5);//
                break;
                case "101010":get=(float) (get+0.5);//
                break;
                case "101001":get=(float) (get+0.5);//
                break;
                case "100101":get=(float) (get+0.5);//
                break;
                case "010101":get=(float) (get+0.5);//
                break;
                case "011010":get=(float) (get+0.5);//
                break;
                case "011001":get=(float) (get+0.5);//
                break;
                case "001101":get=(float) (get+0.5);//
                break;
                
                case "111100":get=(float) (get+0.5);//
                break;
                case "111010":get=(float) (get+0.5);//
                break;
                case "111001":get=(float) (get+0.5);//
                break;
                case "110110":get=(float) (get+0.5);//
                break;
                case "110101":get=(float) (get+0.5);//
                break;
                case "110011":get=(float) (get+0.5);//
                break;
                case "101110":get=(float) (get+0.5);//
                break;
                case "101101":get=(float) (get+0.5);//
                break;
                case "101011":get=(float) (get+0.5);//
                break;
                case "100111":get=(float) (get+0.5);//
                break;
                
                case "011110":get=(float) (get+0.5);//
                break;
                case "011101":get=(float) (get+0.5);//
                break;
                case "011011":get=(float) (get+0.5);//
                break;
                case "010111":get=(float) (get+0.5);//
                break;
                case "001111":get=(float) (get+0.5);//
                break;
                
                default:get=get+0;
                break;
                
            }
            a++;
            
                }
                 if(total == 0)
                {
                    
                }
                else{
                pers=(get*100)/total;
                }
                
            String sql;
                     sql="UPDATE attendance21 SET class=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        } 
     
     {
         try {
            st = conn.prepareStatement("select * from attendance22");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance22");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
                case "111111":get=get+1;
                break;
                case "011111":get=get+1;
                break;
                case "101111":get=get+1;
                break;
                case "110111":get=get+1;
                break;
                case "111011":get=get+1;
                break;
                case "111101":get=get+1;
                break;
                case "111110":get=get+1;
                break;
                
                case "111000":get=(float) (get+0.5);//
                break;
                case "011100":get=(float) (get+0.5);//
                break;
                case "001110":get=(float) (get+0.5);//
                break;
                case "000111":get=(float) (get+0.5);//
                break;
                case "110100":get=(float) (get+0.5);//
                break;
                case "110010":get=(float) (get+0.5);//
                break;
                case "110001":get=(float) (get+0.5);//
                break;
                case "101100":get=(float) (get+0.5);//
                break;
                case "100110":get=(float) (get+0.5);//
                break;
                case "100011":get=(float) (get+0.5);//
                break;
                
                case "010110":get=(float) (get+0.5);//
                break;
                case "010011":get=(float) (get+0.5);//
                break;
                case "001011":get=(float) (get+0.5);//
                break;
                case "101010":get=(float) (get+0.5);//
                break;
                case "101001":get=(float) (get+0.5);//
                break;
                case "100101":get=(float) (get+0.5);//
                break;
                case "010101":get=(float) (get+0.5);//
                break;
                case "011010":get=(float) (get+0.5);//
                break;
                case "011001":get=(float) (get+0.5);//
                break;
                case "001101":get=(float) (get+0.5);//
                break;
                
                case "111100":get=(float) (get+0.5);//
                break;
                case "111010":get=(float) (get+0.5);//
                break;
                case "111001":get=(float) (get+0.5);//
                break;
                case "110110":get=(float) (get+0.5);//
                break;
                case "110101":get=(float) (get+0.5);//
                break;
                case "110011":get=(float) (get+0.5);//
                break;
                case "101110":get=(float) (get+0.5);//
                break;
                case "101101":get=(float) (get+0.5);//
                break;
                case "101011":get=(float) (get+0.5);//
                break;
                case "100111":get=(float) (get+0.5);//
                break;
                
                case "011110":get=(float) (get+0.5);//
                break;
                case "011101":get=(float) (get+0.5);//
                break;
                case "011011":get=(float) (get+0.5);//
                break;
                case "010111":get=(float) (get+0.5);//
                break;
                case "001111":get=(float) (get+0.5);//
                break;
                
                default:get=get+0;
                break;
                
            }
            a++;
            
                }
                 if(total == 0)
                {
                    
                }
                else{
                pers=(get*100)/total;
                }
                
            String sql;
                     sql="UPDATE attendance22 SET class=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        } 
     
     {
         try {
            st = conn.prepareStatement("select * from attendance31");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance31");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
                case "111111":get=get+1;
                break;
                case "011111":get=get+1;
                break;
                case "101111":get=get+1;
                break;
                case "110111":get=get+1;
                break;
                case "111011":get=get+1;
                break;
                case "111101":get=get+1;
                break;
                case "111110":get=get+1;
                break;
                
                case "111000":get=(float) (get+0.5);//
                break;
                case "011100":get=(float) (get+0.5);//
                break;
                case "001110":get=(float) (get+0.5);//
                break;
                case "000111":get=(float) (get+0.5);//
                break;
                case "110100":get=(float) (get+0.5);//
                break;
                case "110010":get=(float) (get+0.5);//
                break;
                case "110001":get=(float) (get+0.5);//
                break;
                case "101100":get=(float) (get+0.5);//
                break;
                case "100110":get=(float) (get+0.5);//
                break;
                case "100011":get=(float) (get+0.5);//
                break;
                
                case "010110":get=(float) (get+0.5);//
                break;
                case "010011":get=(float) (get+0.5);//
                break;
                case "001011":get=(float) (get+0.5);//
                break;
                case "101010":get=(float) (get+0.5);//
                break;
                case "101001":get=(float) (get+0.5);//
                break;
                case "100101":get=(float) (get+0.5);//
                break;
                case "010101":get=(float) (get+0.5);//
                break;
                case "011010":get=(float) (get+0.5);//
                break;
                case "011001":get=(float) (get+0.5);//
                break;
                case "001101":get=(float) (get+0.5);//
                break;
                
                case "111100":get=(float) (get+0.5);//
                break;
                case "111010":get=(float) (get+0.5);//
                break;
                case "111001":get=(float) (get+0.5);//
                break;
                case "110110":get=(float) (get+0.5);//
                break;
                case "110101":get=(float) (get+0.5);//
                break;
                case "110011":get=(float) (get+0.5);//
                break;
                case "101110":get=(float) (get+0.5);//
                break;
                case "101101":get=(float) (get+0.5);//
                break;
                case "101011":get=(float) (get+0.5);//
                break;
                case "100111":get=(float) (get+0.5);//
                break;
                
                case "011110":get=(float) (get+0.5);//
                break;
                case "011101":get=(float) (get+0.5);//
                break;
                case "011011":get=(float) (get+0.5);//
                break;
                case "010111":get=(float) (get+0.5);//
                break;
                case "001111":get=(float) (get+0.5);//
                break;
                
                default:get=get+0;
                break;
                
            }
            a++;
            
                }
                 if(total == 0)
                {
                    
                }
                else{
                pers=(get*100)/total;
                }
                
            String sql;
                     sql="UPDATE attendance31 SET class=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        } 
     
     {
         try {
            st = conn.prepareStatement("select * from attendance32");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance32");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
                case "111111":get=get+1;
                break;
                case "011111":get=get+1;
                break;
                case "101111":get=get+1;
                break;
                case "110111":get=get+1;
                break;
                case "111011":get=get+1;
                break;
                case "111101":get=get+1;
                break;
                case "111110":get=get+1;
                break;
                
                case "111000":get=(float) (get+0.5);//
                break;
                case "011100":get=(float) (get+0.5);//
                break;
                case "001110":get=(float) (get+0.5);//
                break;
                case "000111":get=(float) (get+0.5);//
                break;
                case "110100":get=(float) (get+0.5);//
                break;
                case "110010":get=(float) (get+0.5);//
                break;
                case "110001":get=(float) (get+0.5);//
                break;
                case "101100":get=(float) (get+0.5);//
                break;
                case "100110":get=(float) (get+0.5);//
                break;
                case "100011":get=(float) (get+0.5);//
                break;
                
                case "010110":get=(float) (get+0.5);//
                break;
                case "010011":get=(float) (get+0.5);//
                break;
                case "001011":get=(float) (get+0.5);//
                break;
                case "101010":get=(float) (get+0.5);//
                break;
                case "101001":get=(float) (get+0.5);//
                break;
                case "100101":get=(float) (get+0.5);//
                break;
                case "010101":get=(float) (get+0.5);//
                break;
                case "011010":get=(float) (get+0.5);//
                break;
                case "011001":get=(float) (get+0.5);//
                break;
                case "001101":get=(float) (get+0.5);//
                break;
                
                case "111100":get=(float) (get+0.5);//
                break;
                case "111010":get=(float) (get+0.5);//
                break;
                case "111001":get=(float) (get+0.5);//
                break;
                case "110110":get=(float) (get+0.5);//
                break;
                case "110101":get=(float) (get+0.5);//
                break;
                case "110011":get=(float) (get+0.5);//
                break;
                case "101110":get=(float) (get+0.5);//
                break;
                case "101101":get=(float) (get+0.5);//
                break;
                case "101011":get=(float) (get+0.5);//
                break;
                case "100111":get=(float) (get+0.5);//
                break;
                
                case "011110":get=(float) (get+0.5);//
                break;
                case "011101":get=(float) (get+0.5);//
                break;
                case "011011":get=(float) (get+0.5);//
                break;
                case "010111":get=(float) (get+0.5);//
                break;
                case "001111":get=(float) (get+0.5);//
                break;
                
                default:get=get+0;
                break;
                
            }
            a++;
            
                }
                  if(total == 0)
                {
                    
                }
                else{
                pers=(get*100)/total;
                }
                
            String sql;
                     sql="UPDATE attendance32 SET class=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        } 
        
        
    }
    
    public void subjectcal()
    {
        Connection2DB C=new Connection2DB();
        Connection conn=C.setconnection();
        PreparedStatement st;  
        float total=0;
        float get=0;
        float pers=1;
        String rno=null;
        {
            
        {
         try {
            st = conn.prepareStatement("select * from attendance11");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance11");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
                case "111111":get=get+1;//
                break;
                
                case "111110":get=get+1;
                break;
                case "111101":get=get+1;
                break;
                case "111100":get=get+1;
                break;
                case "111011":get=get+1;
                break;
                case "111010":get=get+1;
                break;
                
                case "111001":get=get+1;//
                break;
                case "111000":get=get+1;
                break;
                case "110111":get=get+1;
                break;
                case "110110":get=get+1;
                break;
                case "110101":get=get+1;
                break;
                case "110100":get=get+1;
                break;
                case "110011":get=get+1;
                break;
                case "110010":get=get+1;
                break;
                case "110001":get=get+1;
                break;
                case "110000":get=get+1;
                break;
                
                case "101111":get=get+1;
                break;
                case "101110":get=get+1;
                break;
                case "101101":get=get+1;
                break;
                case "101100":get=get+1;
                break;
                case "101011":get=get+1;
                break;
                case "101010":get=get+1;
                break;
                case "101001":get=get+1;
                break;
                case "100111":get=get+1;
                break;
                case "100110":get=get+1;
                break;
                case "100101":get=get+1;
                break;
                
                case "100100":get=get+1;
                break;
                case "100011":get=get+1;
                break;
                case "100010":get=get+1;
                break;
                case "100001":get=get+1;
                break;
                case "100000":get=get+1;
                break;
                
                
                
                
                
                default:get=get+0;
                break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance11 SET subject1=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance11");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance11");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111110":get=get+1;
               break;
               case "111101":get=get+1;
               break;
               case "111100":get=get+1;
               break;
               
               case "111011":get=get+1;
               break;
               case "111010":get=get+1;
               break;
               case "111001":get=get+1;
               break;
               case "111000":get=get+1;
               break;
               case "110111":get=get+1;
               break;
               case "110110":get=get+1;
               break;
               case "110101":get=get+1;
               break;
               case "110100":get=get+1;
               break;
               case "110011":get=get+1;
               break;
               case "110010":get=get+1;
               break;
               case "110001":get=get+1;
               break;
               case "110000":get=get+1;
               break;
               
               
               case "011111":get=get+1;
               break;
               case "011110":get=get+1;
               break;
               case "011101":get=get+1;
               break;
               case "011100":get=get+1;
               break;
               
               case "011011":get=get+1;
               break;
               case "011010":get=get+1;
               break;
               case "011001":get=get+1;
               break;
               case "011000":get=get+1;
               break;
               case "010111":get=get+1;
               break;
               case "010110":get=get+1;
               break;
               case "010101":get=get+1;
               break;
               case "010100":get=get+1;
               break;
               case "010011":get=get+1;
               break;
               case "010010":get=get+1;
               break;
               case "010001":get=get+1;
               break;
               case "010000":get=get+1;
               break;
                                                                                                                                                  
                       
               
                           
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance11 SET subject2=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance11");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance11");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111110":get=get+1;
               break;
               case "111101":get=get+1;
               break;
               case "111100":get=get+1;
               break;
               case "111011":get=get+1;
               break;
               
               case "111010":get=get+1;
               break;
               case "111001":get=get+1;
               break;
               case "111000":get=get+1;
               break;
               case "101111":get=get+1;
               break;
               case "101110":get=get+1;
               break;
               case "101101":get=get+1;
               break;
               case "101100":get=get+1;
               break;
               case "101011":get=get+1;
               break;
               case "101010":get=get+1;
               break;
               case "101001":get=get+1;
               break;
               
               case "101000":get=get+1;
               break;
               
               case "011111":get=get+1;
               break;
               case "011110":get=get+1;
               break;
               case "011101":get=get+1;
               break;
               case "011100":get=get+1;
               break;
               case "011011":get=get+1;
               break;
               
               case "011010":get=get+1;
               break;
               case "011001":get=get+1;
               break;
               case "011000":get=get+1;
               break;
               case "001111":get=get+1;
               break;
               case "001110":get=get+1;
               break;
               case "001101":get=get+1;
               break;
               case "001100":get=get+1;
               break;
               case "001011":get=get+1;
               break;
               case "001010":get=get+1;
               break;
               case "001001":get=get+1;
               break;
               
               case "001000":get=get+1;
               break;
               
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance11 SET subject3=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance11");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance11");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111110":get=get+1;
               break;
               case "111101":get=get+1;
               break;
               case "111100":get=get+1;
               break;
               case "110111":get=get+1;
               break;
               
               case "110110":get=get+1;
               break;
               case "110101":get=get+1;
               break;
               case "110100":get=get+1;
               break;
               case "101111":get=get+1;
               break;
               case "101110":get=get+1;
               break;
               case "101101":get=get+1;
               break;
               case "101100":get=get+1;
               break;
               case "100111":get=get+1;
               break;
               case "100110":get=get+1;
               break;
               case "100101":get=get+1;
               break;
               
               case "100100":get=get+1;
               break;
               
               
               case "011111":get=get+1;
               break;
               case "011110":get=get+1;
               break;
               case "011101":get=get+1;
               break;
               case "011100":get=get+1;
               break;
               case "010111":get=get+1;
               break;
               
               case "010110":get=get+1;
               break;
               case "010101":get=get+1;
               break;
               case "010100":get=get+1;
               break;
               case "001111":get=get+1;
               break;
               case "001110":get=get+1;
               break;
               case "001101":get=get+1;
               break;
               case "001100":get=get+1;
               break;
               case "000111":get=get+1;
               break;
               case "000110":get=get+1;
               break;
               case "000101":get=get+1;
               break;
               
               case "000100":get=get+1;
               break;
               
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance11 SET subject4=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance11");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance11");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111110":get=get+1;
               break;
               case "110111":get=get+1;
               break;
               case "110110":get=get+1;
               break;
               case "111011":get=get+1;
               break;
               
               case "111010":get=get+1;
               break;
               case "110011":get=get+1;
               break;
               case "110010":get=get+1;
               break;
               case "101111":get=get+1;
               break;
               case "101110":get=get+1;
               break;
               case "100111":get=get+1;
               break;
               case "100110":get=get+1;
               break;
               case "101011":get=get+1;
               break;
               case "101010":get=get+1;
               break;
               case "100011":get=get+1;
               break;
               
               case "100010":get=get+1;
               break;
               
               
               case "011111":get=get+1;
               break;
               case "011110":get=get+1;
               break;
               case "010111":get=get+1;
               break;
               case "010110":get=get+1;
               break;
               case "011011":get=get+1;
               break;
               
               case "011010":get=get+1;
               break;
               case "010011":get=get+1;
               break;
               case "010010":get=get+1;
               break;
               case "001111":get=get+1;
               break;
               case "001110":get=get+1;
               break;
               case "000111":get=get+1;
               break;
               case "000110":get=get+1;
               break;
               case "001011":get=get+1;
               break;
               case "001010":get=get+1;
               break;
               case "000011":get=get+1;
               break;
               
               case "000010":get=get+1;
               break;
               
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance11 SET subject5=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance11");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance11");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111101":get=get+1;
               break;
               case "111011":get=get+1;
               break;
               case "111001":get=get+1;
               break;
               case "110111":get=get+1;
               break;
               
               case "110101":get=get+1;
               break;
               case "110011":get=get+1;
               break;
               case "110001":get=get+1;
               break;
               case "101111":get=get+1;
               break;
               case "101101":get=get+1;
               break;
               case "101011":get=get+1;
               break;
               case "101001":get=get+1;
               break;
               case "100111":get=get+1;
               break;
               case "100101":get=get+1;
               break;
               case "100011":get=get+1;
               break;
               
               case "100001":get=get+1;
               break;
               
               case "011111":get=get+1;
               break;
               case "011101":get=get+1;
               break;
               case "011011":get=get+1;
               break;
               case "011001":get=get+1;
               break;
               case "010111":get=get+1;
               break;
               
               case "010101":get=get+1;
               break;
               case "010011":get=get+1;
               break;
               case "010001":get=get+1;
               break;
               case "001111":get=get+1;
               break;
               case "001101":get=get+1;
               break;
               case "001011":get=get+1;
               break;
               case "001001":get=get+1;
               break;
               case "000111":get=get+1;
               break;
               case "000101":get=get+1;
               break;
               case "000011":get=get+1;
               break;
               
               case "000001":get=get+1;
               break;
               
               
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance11 SET subject6=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
       
        }
        
        {
            {
         try {
            st = conn.prepareStatement("select * from attendance12");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance12");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
                case "111111":get=get+1;//
                break;
                
                case "111110":get=get+1;
                break;
                case "111101":get=get+1;
                break;
                case "111100":get=get+1;
                break;
                case "111011":get=get+1;
                break;
                case "111010":get=get+1;
                break;
                
                case "111001":get=get+1;//
                break;
                case "111000":get=get+1;
                break;
                case "110111":get=get+1;
                break;
                case "110110":get=get+1;
                break;
                case "110101":get=get+1;
                break;
                case "110100":get=get+1;
                break;
                case "110011":get=get+1;
                break;
                case "110010":get=get+1;
                break;
                case "110001":get=get+1;
                break;
                case "110000":get=get+1;
                break;
                
                case "101111":get=get+1;
                break;
                case "101110":get=get+1;
                break;
                case "101101":get=get+1;
                break;
                case "101100":get=get+1;
                break;
                case "101011":get=get+1;
                break;
                case "101010":get=get+1;
                break;
                case "101001":get=get+1;
                break;
                case "100111":get=get+1;
                break;
                case "100110":get=get+1;
                break;
                case "100101":get=get+1;
                break;
                
                case "100100":get=get+1;
                break;
                case "100011":get=get+1;
                break;
                case "100010":get=get+1;
                break;
                case "100001":get=get+1;
                break;
                case "100000":get=get+1;
                break;
                
                
                
                
                
                default:get=get+0;
                break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance12 SET subject1=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance12");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance12");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111110":get=get+1;
               break;
               case "111101":get=get+1;
               break;
               case "111100":get=get+1;
               break;
               
               case "111011":get=get+1;
               break;
               case "111010":get=get+1;
               break;
               case "111001":get=get+1;
               break;
               case "111000":get=get+1;
               break;
               case "110111":get=get+1;
               break;
               case "110110":get=get+1;
               break;
               case "110101":get=get+1;
               break;
               case "110100":get=get+1;
               break;
               case "110011":get=get+1;
               break;
               case "110010":get=get+1;
               break;
               case "110001":get=get+1;
               break;
               case "110000":get=get+1;
               break;
               
               
               case "011111":get=get+1;
               break;
               case "011110":get=get+1;
               break;
               case "011101":get=get+1;
               break;
               case "011100":get=get+1;
               break;
               
               case "011011":get=get+1;
               break;
               case "011010":get=get+1;
               break;
               case "011001":get=get+1;
               break;
               case "011000":get=get+1;
               break;
               case "010111":get=get+1;
               break;
               case "010110":get=get+1;
               break;
               case "010101":get=get+1;
               break;
               case "010100":get=get+1;
               break;
               case "010011":get=get+1;
               break;
               case "010010":get=get+1;
               break;
               case "010001":get=get+1;
               break;
               case "010000":get=get+1;
               break;
                                                                                                                                                  
                       
               
                           
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance12 SET subject2=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance12");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance12");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111110":get=get+1;
               break;
               case "111101":get=get+1;
               break;
               case "111100":get=get+1;
               break;
               case "111011":get=get+1;
               break;
               
               case "111010":get=get+1;
               break;
               case "111001":get=get+1;
               break;
               case "111000":get=get+1;
               break;
               case "101111":get=get+1;
               break;
               case "101110":get=get+1;
               break;
               case "101101":get=get+1;
               break;
               case "101100":get=get+1;
               break;
               case "101011":get=get+1;
               break;
               case "101010":get=get+1;
               break;
               case "101001":get=get+1;
               break;
               
               case "101000":get=get+1;
               break;
               
               case "011111":get=get+1;
               break;
               case "011110":get=get+1;
               break;
               case "011101":get=get+1;
               break;
               case "011100":get=get+1;
               break;
               case "011011":get=get+1;
               break;
               
               case "011010":get=get+1;
               break;
               case "011001":get=get+1;
               break;
               case "011000":get=get+1;
               break;
               case "001111":get=get+1;
               break;
               case "001110":get=get+1;
               break;
               case "001101":get=get+1;
               break;
               case "001100":get=get+1;
               break;
               case "001011":get=get+1;
               break;
               case "001010":get=get+1;
               break;
               case "001001":get=get+1;
               break;
               
               case "001000":get=get+1;
               break;
               
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance12 SET subject3=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance12");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance12");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111110":get=get+1;
               break;
               case "111101":get=get+1;
               break;
               case "111100":get=get+1;
               break;
               case "110111":get=get+1;
               break;
               
               case "110110":get=get+1;
               break;
               case "110101":get=get+1;
               break;
               case "110100":get=get+1;
               break;
               case "101111":get=get+1;
               break;
               case "101110":get=get+1;
               break;
               case "101101":get=get+1;
               break;
               case "101100":get=get+1;
               break;
               case "100111":get=get+1;
               break;
               case "100110":get=get+1;
               break;
               case "100101":get=get+1;
               break;
               
               case "100100":get=get+1;
               break;
               
               
               case "011111":get=get+1;
               break;
               case "011110":get=get+1;
               break;
               case "011101":get=get+1;
               break;
               case "011100":get=get+1;
               break;
               case "010111":get=get+1;
               break;
               
               case "010110":get=get+1;
               break;
               case "010101":get=get+1;
               break;
               case "010100":get=get+1;
               break;
               case "001111":get=get+1;
               break;
               case "001110":get=get+1;
               break;
               case "001101":get=get+1;
               break;
               case "001100":get=get+1;
               break;
               case "000111":get=get+1;
               break;
               case "000110":get=get+1;
               break;
               case "000101":get=get+1;
               break;
               
               case "000100":get=get+1;
               break;
               
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance12 SET subject4=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance12");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance12");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111110":get=get+1;
               break;
               case "110111":get=get+1;
               break;
               case "110110":get=get+1;
               break;
               case "111011":get=get+1;
               break;
               
               case "111010":get=get+1;
               break;
               case "110011":get=get+1;
               break;
               case "110010":get=get+1;
               break;
               case "101111":get=get+1;
               break;
               case "101110":get=get+1;
               break;
               case "100111":get=get+1;
               break;
               case "100110":get=get+1;
               break;
               case "101011":get=get+1;
               break;
               case "101010":get=get+1;
               break;
               case "100011":get=get+1;
               break;
               
               case "100010":get=get+1;
               break;
               
               
               case "011111":get=get+1;
               break;
               case "011110":get=get+1;
               break;
               case "010111":get=get+1;
               break;
               case "010110":get=get+1;
               break;
               case "011011":get=get+1;
               break;
               
               case "011010":get=get+1;
               break;
               case "010011":get=get+1;
               break;
               case "010010":get=get+1;
               break;
               case "001111":get=get+1;
               break;
               case "001110":get=get+1;
               break;
               case "000111":get=get+1;
               break;
               case "000110":get=get+1;
               break;
               case "001011":get=get+1;
               break;
               case "001010":get=get+1;
               break;
               case "000011":get=get+1;
               break;
               
               case "000010":get=get+1;
               break;
               
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance12 SET subject5=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance12");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance12");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111101":get=get+1;
               break;
               case "111011":get=get+1;
               break;
               case "111001":get=get+1;
               break;
               case "110111":get=get+1;
               break;
               
               case "110101":get=get+1;
               break;
               case "110011":get=get+1;
               break;
               case "110001":get=get+1;
               break;
               case "101111":get=get+1;
               break;
               case "101101":get=get+1;
               break;
               case "101011":get=get+1;
               break;
               case "101001":get=get+1;
               break;
               case "100111":get=get+1;
               break;
               case "100101":get=get+1;
               break;
               case "100011":get=get+1;
               break;
               
               case "100001":get=get+1;
               break;
               
               case "011111":get=get+1;
               break;
               case "011101":get=get+1;
               break;
               case "011011":get=get+1;
               break;
               case "011001":get=get+1;
               break;
               case "010111":get=get+1;
               break;
               
               case "010101":get=get+1;
               break;
               case "010011":get=get+1;
               break;
               case "010001":get=get+1;
               break;
               case "001111":get=get+1;
               break;
               case "001101":get=get+1;
               break;
               case "001011":get=get+1;
               break;
               case "001001":get=get+1;
               break;
               case "000111":get=get+1;
               break;
               case "000101":get=get+1;
               break;
               case "000011":get=get+1;
               break;
               
               case "000001":get=get+1;
               break;
               
               
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance12 SET subject6=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
         
        }
        
        {
            {
         try {
            st = conn.prepareStatement("select * from attendance21");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance21");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
                case "111111":get=get+1;//
                break;
                
                case "111110":get=get+1;
                break;
                case "111101":get=get+1;
                break;
                case "111100":get=get+1;
                break;
                case "111011":get=get+1;
                break;
                case "111010":get=get+1;
                break;
                
                case "111001":get=get+1;//
                break;
                case "111000":get=get+1;
                break;
                case "110111":get=get+1;
                break;
                case "110110":get=get+1;
                break;
                case "110101":get=get+1;
                break;
                case "110100":get=get+1;
                break;
                case "110011":get=get+1;
                break;
                case "110010":get=get+1;
                break;
                case "110001":get=get+1;
                break;
                case "110000":get=get+1;
                break;
                
                case "101111":get=get+1;
                break;
                case "101110":get=get+1;
                break;
                case "101101":get=get+1;
                break;
                case "101100":get=get+1;
                break;
                case "101011":get=get+1;
                break;
                case "101010":get=get+1;
                break;
                case "101001":get=get+1;
                break;
                case "100111":get=get+1;
                break;
                case "100110":get=get+1;
                break;
                case "100101":get=get+1;
                break;
                
                case "100100":get=get+1;
                break;
                case "100011":get=get+1;
                break;
                case "100010":get=get+1;
                break;
                case "100001":get=get+1;
                break;
                case "100000":get=get+1;
                break;
                
                
                
                
                
                default:get=get+0;
                break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance21 SET subject1=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance21");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance21");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111110":get=get+1;
               break;
               case "111101":get=get+1;
               break;
               case "111100":get=get+1;
               break;
               
               case "111011":get=get+1;
               break;
               case "111010":get=get+1;
               break;
               case "111001":get=get+1;
               break;
               case "111000":get=get+1;
               break;
               case "110111":get=get+1;
               break;
               case "110110":get=get+1;
               break;
               case "110101":get=get+1;
               break;
               case "110100":get=get+1;
               break;
               case "110011":get=get+1;
               break;
               case "110010":get=get+1;
               break;
               case "110001":get=get+1;
               break;
               case "110000":get=get+1;
               break;
               
               
               case "011111":get=get+1;
               break;
               case "011110":get=get+1;
               break;
               case "011101":get=get+1;
               break;
               case "011100":get=get+1;
               break;
               
               case "011011":get=get+1;
               break;
               case "011010":get=get+1;
               break;
               case "011001":get=get+1;
               break;
               case "011000":get=get+1;
               break;
               case "010111":get=get+1;
               break;
               case "010110":get=get+1;
               break;
               case "010101":get=get+1;
               break;
               case "010100":get=get+1;
               break;
               case "010011":get=get+1;
               break;
               case "010010":get=get+1;
               break;
               case "010001":get=get+1;
               break;
               case "010000":get=get+1;
               break;
                                                                                                                                                  
                       
               
                           
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance21 SET subject2=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance21");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance21");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111110":get=get+1;
               break;
               case "111101":get=get+1;
               break;
               case "111100":get=get+1;
               break;
               case "111011":get=get+1;
               break;
               
               case "111010":get=get+1;
               break;
               case "111001":get=get+1;
               break;
               case "111000":get=get+1;
               break;
               case "101111":get=get+1;
               break;
               case "101110":get=get+1;
               break;
               case "101101":get=get+1;
               break;
               case "101100":get=get+1;
               break;
               case "101011":get=get+1;
               break;
               case "101010":get=get+1;
               break;
               case "101001":get=get+1;
               break;
               
               case "101000":get=get+1;
               break;
               
               case "011111":get=get+1;
               break;
               case "011110":get=get+1;
               break;
               case "011101":get=get+1;
               break;
               case "011100":get=get+1;
               break;
               case "011011":get=get+1;
               break;
               
               case "011010":get=get+1;
               break;
               case "011001":get=get+1;
               break;
               case "011000":get=get+1;
               break;
               case "001111":get=get+1;
               break;
               case "001110":get=get+1;
               break;
               case "001101":get=get+1;
               break;
               case "001100":get=get+1;
               break;
               case "001011":get=get+1;
               break;
               case "001010":get=get+1;
               break;
               case "001001":get=get+1;
               break;
               
               case "001000":get=get+1;
               break;
               
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance21 SET subject3=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance21");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance21");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111110":get=get+1;
               break;
               case "111101":get=get+1;
               break;
               case "111100":get=get+1;
               break;
               case "110111":get=get+1;
               break;
               
               case "110110":get=get+1;
               break;
               case "110101":get=get+1;
               break;
               case "110100":get=get+1;
               break;
               case "101111":get=get+1;
               break;
               case "101110":get=get+1;
               break;
               case "101101":get=get+1;
               break;
               case "101100":get=get+1;
               break;
               case "100111":get=get+1;
               break;
               case "100110":get=get+1;
               break;
               case "100101":get=get+1;
               break;
               
               case "100100":get=get+1;
               break;
               
               
               case "011111":get=get+1;
               break;
               case "011110":get=get+1;
               break;
               case "011101":get=get+1;
               break;
               case "011100":get=get+1;
               break;
               case "010111":get=get+1;
               break;
               
               case "010110":get=get+1;
               break;
               case "010101":get=get+1;
               break;
               case "010100":get=get+1;
               break;
               case "001111":get=get+1;
               break;
               case "001110":get=get+1;
               break;
               case "001101":get=get+1;
               break;
               case "001100":get=get+1;
               break;
               case "000111":get=get+1;
               break;
               case "000110":get=get+1;
               break;
               case "000101":get=get+1;
               break;
               
               case "000100":get=get+1;
               break;
               
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance21 SET subject4=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance21");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance21");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111110":get=get+1;
               break;
               case "110111":get=get+1;
               break;
               case "110110":get=get+1;
               break;
               case "111011":get=get+1;
               break;
               
               case "111010":get=get+1;
               break;
               case "110011":get=get+1;
               break;
               case "110010":get=get+1;
               break;
               case "101111":get=get+1;
               break;
               case "101110":get=get+1;
               break;
               case "100111":get=get+1;
               break;
               case "100110":get=get+1;
               break;
               case "101011":get=get+1;
               break;
               case "101010":get=get+1;
               break;
               case "100011":get=get+1;
               break;
               
               case "100010":get=get+1;
               break;
               
               
               case "011111":get=get+1;
               break;
               case "011110":get=get+1;
               break;
               case "010111":get=get+1;
               break;
               case "010110":get=get+1;
               break;
               case "011011":get=get+1;
               break;
               
               case "011010":get=get+1;
               break;
               case "010011":get=get+1;
               break;
               case "010010":get=get+1;
               break;
               case "001111":get=get+1;
               break;
               case "001110":get=get+1;
               break;
               case "000111":get=get+1;
               break;
               case "000110":get=get+1;
               break;
               case "001011":get=get+1;
               break;
               case "001010":get=get+1;
               break;
               case "000011":get=get+1;
               break;
               
               case "000010":get=get+1;
               break;
               
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance21 SET subject5=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance21");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance21");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111101":get=get+1;
               break;
               case "111011":get=get+1;
               break;
               case "111001":get=get+1;
               break;
               case "110111":get=get+1;
               break;
               
               case "110101":get=get+1;
               break;
               case "110011":get=get+1;
               break;
               case "110001":get=get+1;
               break;
               case "101111":get=get+1;
               break;
               case "101101":get=get+1;
               break;
               case "101011":get=get+1;
               break;
               case "101001":get=get+1;
               break;
               case "100111":get=get+1;
               break;
               case "100101":get=get+1;
               break;
               case "100011":get=get+1;
               break;
               
               case "100001":get=get+1;
               break;
               
               case "011111":get=get+1;
               break;
               case "011101":get=get+1;
               break;
               case "011011":get=get+1;
               break;
               case "011001":get=get+1;
               break;
               case "010111":get=get+1;
               break;
               
               case "010101":get=get+1;
               break;
               case "010011":get=get+1;
               break;
               case "010001":get=get+1;
               break;
               case "001111":get=get+1;
               break;
               case "001101":get=get+1;
               break;
               case "001011":get=get+1;
               break;
               case "001001":get=get+1;
               break;
               case "000111":get=get+1;
               break;
               case "000101":get=get+1;
               break;
               case "000011":get=get+1;
               break;
               
               case "000001":get=get+1;
               break;
               
               
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance21 SET subject6=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
         
        }
        
        
        {
            {
         try {
            st = conn.prepareStatement("select * from attendance22");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance22");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
                case "111111":get=get+1;//
                break;
                
                case "111110":get=get+1;
                break;
                case "111101":get=get+1;
                break;
                case "111100":get=get+1;
                break;
                case "111011":get=get+1;
                break;
                case "111010":get=get+1;
                break;
                
                case "111001":get=get+1;//
                break;
                case "111000":get=get+1;
                break;
                case "110111":get=get+1;
                break;
                case "110110":get=get+1;
                break;
                case "110101":get=get+1;
                break;
                case "110100":get=get+1;
                break;
                case "110011":get=get+1;
                break;
                case "110010":get=get+1;
                break;
                case "110001":get=get+1;
                break;
                case "110000":get=get+1;
                break;
                
                case "101111":get=get+1;
                break;
                case "101110":get=get+1;
                break;
                case "101101":get=get+1;
                break;
                case "101100":get=get+1;
                break;
                case "101011":get=get+1;
                break;
                case "101010":get=get+1;
                break;
                case "101001":get=get+1;
                break;
                case "100111":get=get+1;
                break;
                case "100110":get=get+1;
                break;
                case "100101":get=get+1;
                break;
                
                case "100100":get=get+1;
                break;
                case "100011":get=get+1;
                break;
                case "100010":get=get+1;
                break;
                case "100001":get=get+1;
                break;
                case "100000":get=get+1;
                break;
                
                
                
                
                
                default:get=get+0;
                break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance22 SET subject1=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance22");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance22");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111110":get=get+1;
               break;
               case "111101":get=get+1;
               break;
               case "111100":get=get+1;
               break;
               
               case "111011":get=get+1;
               break;
               case "111010":get=get+1;
               break;
               case "111001":get=get+1;
               break;
               case "111000":get=get+1;
               break;
               case "110111":get=get+1;
               break;
               case "110110":get=get+1;
               break;
               case "110101":get=get+1;
               break;
               case "110100":get=get+1;
               break;
               case "110011":get=get+1;
               break;
               case "110010":get=get+1;
               break;
               case "110001":get=get+1;
               break;
               case "110000":get=get+1;
               break;
               
               
               case "011111":get=get+1;
               break;
               case "011110":get=get+1;
               break;
               case "011101":get=get+1;
               break;
               case "011100":get=get+1;
               break;
               
               case "011011":get=get+1;
               break;
               case "011010":get=get+1;
               break;
               case "011001":get=get+1;
               break;
               case "011000":get=get+1;
               break;
               case "010111":get=get+1;
               break;
               case "010110":get=get+1;
               break;
               case "010101":get=get+1;
               break;
               case "010100":get=get+1;
               break;
               case "010011":get=get+1;
               break;
               case "010010":get=get+1;
               break;
               case "010001":get=get+1;
               break;
               case "010000":get=get+1;
               break;
                                                                                                                                                  
                       
               
                           
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance22 SET subject2=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance22");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance22");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111110":get=get+1;
               break;
               case "111101":get=get+1;
               break;
               case "111100":get=get+1;
               break;
               case "111011":get=get+1;
               break;
               
               case "111010":get=get+1;
               break;
               case "111001":get=get+1;
               break;
               case "111000":get=get+1;
               break;
               case "101111":get=get+1;
               break;
               case "101110":get=get+1;
               break;
               case "101101":get=get+1;
               break;
               case "101100":get=get+1;
               break;
               case "101011":get=get+1;
               break;
               case "101010":get=get+1;
               break;
               case "101001":get=get+1;
               break;
               
               case "101000":get=get+1;
               break;
               
               case "011111":get=get+1;
               break;
               case "011110":get=get+1;
               break;
               case "011101":get=get+1;
               break;
               case "011100":get=get+1;
               break;
               case "011011":get=get+1;
               break;
               
               case "011010":get=get+1;
               break;
               case "011001":get=get+1;
               break;
               case "011000":get=get+1;
               break;
               case "001111":get=get+1;
               break;
               case "001110":get=get+1;
               break;
               case "001101":get=get+1;
               break;
               case "001100":get=get+1;
               break;
               case "001011":get=get+1;
               break;
               case "001010":get=get+1;
               break;
               case "001001":get=get+1;
               break;
               
               case "001000":get=get+1;
               break;
               
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance22 SET subject3=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance22");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance22");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111110":get=get+1;
               break;
               case "111101":get=get+1;
               break;
               case "111100":get=get+1;
               break;
               case "110111":get=get+1;
               break;
               
               case "110110":get=get+1;
               break;
               case "110101":get=get+1;
               break;
               case "110100":get=get+1;
               break;
               case "101111":get=get+1;
               break;
               case "101110":get=get+1;
               break;
               case "101101":get=get+1;
               break;
               case "101100":get=get+1;
               break;
               case "100111":get=get+1;
               break;
               case "100110":get=get+1;
               break;
               case "100101":get=get+1;
               break;
               
               case "100100":get=get+1;
               break;
               
               
               case "011111":get=get+1;
               break;
               case "011110":get=get+1;
               break;
               case "011101":get=get+1;
               break;
               case "011100":get=get+1;
               break;
               case "010111":get=get+1;
               break;
               
               case "010110":get=get+1;
               break;
               case "010101":get=get+1;
               break;
               case "010100":get=get+1;
               break;
               case "001111":get=get+1;
               break;
               case "001110":get=get+1;
               break;
               case "001101":get=get+1;
               break;
               case "001100":get=get+1;
               break;
               case "000111":get=get+1;
               break;
               case "000110":get=get+1;
               break;
               case "000101":get=get+1;
               break;
               
               case "000100":get=get+1;
               break;
               
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance22 SET subject4=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance22");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance22");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111110":get=get+1;
               break;
               case "110111":get=get+1;
               break;
               case "110110":get=get+1;
               break;
               case "111011":get=get+1;
               break;
               
               case "111010":get=get+1;
               break;
               case "110011":get=get+1;
               break;
               case "110010":get=get+1;
               break;
               case "101111":get=get+1;
               break;
               case "101110":get=get+1;
               break;
               case "100111":get=get+1;
               break;
               case "100110":get=get+1;
               break;
               case "101011":get=get+1;
               break;
               case "101010":get=get+1;
               break;
               case "100011":get=get+1;
               break;
               
               case "100010":get=get+1;
               break;
               
               
               case "011111":get=get+1;
               break;
               case "011110":get=get+1;
               break;
               case "010111":get=get+1;
               break;
               case "010110":get=get+1;
               break;
               case "011011":get=get+1;
               break;
               
               case "011010":get=get+1;
               break;
               case "010011":get=get+1;
               break;
               case "010010":get=get+1;
               break;
               case "001111":get=get+1;
               break;
               case "001110":get=get+1;
               break;
               case "000111":get=get+1;
               break;
               case "000110":get=get+1;
               break;
               case "001011":get=get+1;
               break;
               case "001010":get=get+1;
               break;
               case "000011":get=get+1;
               break;
               
               case "000010":get=get+1;
               break;
               
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance22 SET subject5=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance22");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance22");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111101":get=get+1;
               break;
               case "111011":get=get+1;
               break;
               case "111001":get=get+1;
               break;
               case "110111":get=get+1;
               break;
               
               case "110101":get=get+1;
               break;
               case "110011":get=get+1;
               break;
               case "110001":get=get+1;
               break;
               case "101111":get=get+1;
               break;
               case "101101":get=get+1;
               break;
               case "101011":get=get+1;
               break;
               case "101001":get=get+1;
               break;
               case "100111":get=get+1;
               break;
               case "100101":get=get+1;
               break;
               case "100011":get=get+1;
               break;
               
               case "100001":get=get+1;
               break;
               
               case "011111":get=get+1;
               break;
               case "011101":get=get+1;
               break;
               case "011011":get=get+1;
               break;
               case "011001":get=get+1;
               break;
               case "010111":get=get+1;
               break;
               
               case "010101":get=get+1;
               break;
               case "010011":get=get+1;
               break;
               case "010001":get=get+1;
               break;
               case "001111":get=get+1;
               break;
               case "001101":get=get+1;
               break;
               case "001011":get=get+1;
               break;
               case "001001":get=get+1;
               break;
               case "000111":get=get+1;
               break;
               case "000101":get=get+1;
               break;
               case "000011":get=get+1;
               break;
               
               case "000001":get=get+1;
               break;
               
               
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance22 SET subject6=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
         
        }
        
        {
            {
         try {
            st = conn.prepareStatement("select * from attendance31");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance31");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
                case "111111":get=get+1;//
                break;
                
                case "111110":get=get+1;
                break;
                case "111101":get=get+1;
                break;
                case "111100":get=get+1;
                break;
                case "111011":get=get+1;
                break;
                case "111010":get=get+1;
                break;
                
                case "111001":get=get+1;//
                break;
                case "111000":get=get+1;
                break;
                case "110111":get=get+1;
                break;
                case "110110":get=get+1;
                break;
                case "110101":get=get+1;
                break;
                case "110100":get=get+1;
                break;
                case "110011":get=get+1;
                break;
                case "110010":get=get+1;
                break;
                case "110001":get=get+1;
                break;
                case "110000":get=get+1;
                break;
                
                case "101111":get=get+1;
                break;
                case "101110":get=get+1;
                break;
                case "101101":get=get+1;
                break;
                case "101100":get=get+1;
                break;
                case "101011":get=get+1;
                break;
                case "101010":get=get+1;
                break;
                case "101001":get=get+1;
                break;
                case "100111":get=get+1;
                break;
                case "100110":get=get+1;
                break;
                case "100101":get=get+1;
                break;
                
                case "100100":get=get+1;
                break;
                case "100011":get=get+1;
                break;
                case "100010":get=get+1;
                break;
                case "100001":get=get+1;
                break;
                case "100000":get=get+1;
                break;
                
                
                
                
                
                default:get=get+0;
                break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance31 SET subject1=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance31");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance31");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111110":get=get+1;
               break;
               case "111101":get=get+1;
               break;
               case "111100":get=get+1;
               break;
               
               case "111011":get=get+1;
               break;
               case "111010":get=get+1;
               break;
               case "111001":get=get+1;
               break;
               case "111000":get=get+1;
               break;
               case "110111":get=get+1;
               break;
               case "110110":get=get+1;
               break;
               case "110101":get=get+1;
               break;
               case "110100":get=get+1;
               break;
               case "110011":get=get+1;
               break;
               case "110010":get=get+1;
               break;
               case "110001":get=get+1;
               break;
               case "110000":get=get+1;
               break;
               
               
               case "011111":get=get+1;
               break;
               case "011110":get=get+1;
               break;
               case "011101":get=get+1;
               break;
               case "011100":get=get+1;
               break;
               
               case "011011":get=get+1;
               break;
               case "011010":get=get+1;
               break;
               case "011001":get=get+1;
               break;
               case "011000":get=get+1;
               break;
               case "010111":get=get+1;
               break;
               case "010110":get=get+1;
               break;
               case "010101":get=get+1;
               break;
               case "010100":get=get+1;
               break;
               case "010011":get=get+1;
               break;
               case "010010":get=get+1;
               break;
               case "010001":get=get+1;
               break;
               case "010000":get=get+1;
               break;
                                                                                                                                                  
                       
               
                           
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance31 SET subject2=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance31");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance31");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111110":get=get+1;
               break;
               case "111101":get=get+1;
               break;
               case "111100":get=get+1;
               break;
               case "111011":get=get+1;
               break;
               
               case "111010":get=get+1;
               break;
               case "111001":get=get+1;
               break;
               case "111000":get=get+1;
               break;
               case "101111":get=get+1;
               break;
               case "101110":get=get+1;
               break;
               case "101101":get=get+1;
               break;
               case "101100":get=get+1;
               break;
               case "101011":get=get+1;
               break;
               case "101010":get=get+1;
               break;
               case "101001":get=get+1;
               break;
               
               case "101000":get=get+1;
               break;
               
               case "011111":get=get+1;
               break;
               case "011110":get=get+1;
               break;
               case "011101":get=get+1;
               break;
               case "011100":get=get+1;
               break;
               case "011011":get=get+1;
               break;
               
               case "011010":get=get+1;
               break;
               case "011001":get=get+1;
               break;
               case "011000":get=get+1;
               break;
               case "001111":get=get+1;
               break;
               case "001110":get=get+1;
               break;
               case "001101":get=get+1;
               break;
               case "001100":get=get+1;
               break;
               case "001011":get=get+1;
               break;
               case "001010":get=get+1;
               break;
               case "001001":get=get+1;
               break;
               
               case "001000":get=get+1;
               break;
               
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance31 SET subject3=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance31");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance31");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111110":get=get+1;
               break;
               case "111101":get=get+1;
               break;
               case "111100":get=get+1;
               break;
               case "110111":get=get+1;
               break;
               
               case "110110":get=get+1;
               break;
               case "110101":get=get+1;
               break;
               case "110100":get=get+1;
               break;
               case "101111":get=get+1;
               break;
               case "101110":get=get+1;
               break;
               case "101101":get=get+1;
               break;
               case "101100":get=get+1;
               break;
               case "100111":get=get+1;
               break;
               case "100110":get=get+1;
               break;
               case "100101":get=get+1;
               break;
               
               case "100100":get=get+1;
               break;
               
               
               case "011111":get=get+1;
               break;
               case "011110":get=get+1;
               break;
               case "011101":get=get+1;
               break;
               case "011100":get=get+1;
               break;
               case "010111":get=get+1;
               break;
               
               case "010110":get=get+1;
               break;
               case "010101":get=get+1;
               break;
               case "010100":get=get+1;
               break;
               case "001111":get=get+1;
               break;
               case "001110":get=get+1;
               break;
               case "001101":get=get+1;
               break;
               case "001100":get=get+1;
               break;
               case "000111":get=get+1;
               break;
               case "000110":get=get+1;
               break;
               case "000101":get=get+1;
               break;
               
               case "000100":get=get+1;
               break;
               
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance31 SET subject4=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance31");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance31");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111110":get=get+1;
               break;
               case "110111":get=get+1;
               break;
               case "110110":get=get+1;
               break;
               case "111011":get=get+1;
               break;
               
               case "111010":get=get+1;
               break;
               case "110011":get=get+1;
               break;
               case "110010":get=get+1;
               break;
               case "101111":get=get+1;
               break;
               case "101110":get=get+1;
               break;
               case "100111":get=get+1;
               break;
               case "100110":get=get+1;
               break;
               case "101011":get=get+1;
               break;
               case "101010":get=get+1;
               break;
               case "100011":get=get+1;
               break;
               
               case "100010":get=get+1;
               break;
               
               
               case "011111":get=get+1;
               break;
               case "011110":get=get+1;
               break;
               case "010111":get=get+1;
               break;
               case "010110":get=get+1;
               break;
               case "011011":get=get+1;
               break;
               
               case "011010":get=get+1;
               break;
               case "010011":get=get+1;
               break;
               case "010010":get=get+1;
               break;
               case "001111":get=get+1;
               break;
               case "001110":get=get+1;
               break;
               case "000111":get=get+1;
               break;
               case "000110":get=get+1;
               break;
               case "001011":get=get+1;
               break;
               case "001010":get=get+1;
               break;
               case "000011":get=get+1;
               break;
               
               case "000010":get=get+1;
               break;
               
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance31 SET subject5=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance31");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance31");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111101":get=get+1;
               break;
               case "111011":get=get+1;
               break;
               case "111001":get=get+1;
               break;
               case "110111":get=get+1;
               break;
               
               case "110101":get=get+1;
               break;
               case "110011":get=get+1;
               break;
               case "110001":get=get+1;
               break;
               case "101111":get=get+1;
               break;
               case "101101":get=get+1;
               break;
               case "101011":get=get+1;
               break;
               case "101001":get=get+1;
               break;
               case "100111":get=get+1;
               break;
               case "100101":get=get+1;
               break;
               case "100011":get=get+1;
               break;
               
               case "100001":get=get+1;
               break;
               
               case "011111":get=get+1;
               break;
               case "011101":get=get+1;
               break;
               case "011011":get=get+1;
               break;
               case "011001":get=get+1;
               break;
               case "010111":get=get+1;
               break;
               
               case "010101":get=get+1;
               break;
               case "010011":get=get+1;
               break;
               case "010001":get=get+1;
               break;
               case "001111":get=get+1;
               break;
               case "001101":get=get+1;
               break;
               case "001011":get=get+1;
               break;
               case "001001":get=get+1;
               break;
               case "000111":get=get+1;
               break;
               case "000101":get=get+1;
               break;
               case "000011":get=get+1;
               break;
               
               case "000001":get=get+1;
               break;
               
               
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance31 SET subject6=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
         
        }
        
        {
            {
         try {
            st = conn.prepareStatement("select * from attendance32");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance32");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
                case "111111":get=get+1;//
                break;
                
                case "111110":get=get+1;
                break;
                case "111101":get=get+1;
                break;
                case "111100":get=get+1;
                break;
                case "111011":get=get+1;
                break;
                case "111010":get=get+1;
                break;
                
                case "111001":get=get+1;//
                break;
                case "111000":get=get+1;
                break;
                case "110111":get=get+1;
                break;
                case "110110":get=get+1;
                break;
                case "110101":get=get+1;
                break;
                case "110100":get=get+1;
                break;
                case "110011":get=get+1;
                break;
                case "110010":get=get+1;
                break;
                case "110001":get=get+1;
                break;
                case "110000":get=get+1;
                break;
                
                case "101111":get=get+1;
                break;
                case "101110":get=get+1;
                break;
                case "101101":get=get+1;
                break;
                case "101100":get=get+1;
                break;
                case "101011":get=get+1;
                break;
                case "101010":get=get+1;
                break;
                case "101001":get=get+1;
                break;
                case "100111":get=get+1;
                break;
                case "100110":get=get+1;
                break;
                case "100101":get=get+1;
                break;
                
                case "100100":get=get+1;
                break;
                case "100011":get=get+1;
                break;
                case "100010":get=get+1;
                break;
                case "100001":get=get+1;
                break;
                case "100000":get=get+1;
                break;
                
                
                
                
                
                default:get=get+0;
                break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance32 SET subject1=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance32");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance32");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111110":get=get+1;
               break;
               case "111101":get=get+1;
               break;
               case "111100":get=get+1;
               break;
               
               case "111011":get=get+1;
               break;
               case "111010":get=get+1;
               break;
               case "111001":get=get+1;
               break;
               case "111000":get=get+1;
               break;
               case "110111":get=get+1;
               break;
               case "110110":get=get+1;
               break;
               case "110101":get=get+1;
               break;
               case "110100":get=get+1;
               break;
               case "110011":get=get+1;
               break;
               case "110010":get=get+1;
               break;
               case "110001":get=get+1;
               break;
               case "110000":get=get+1;
               break;
               
               
               case "011111":get=get+1;
               break;
               case "011110":get=get+1;
               break;
               case "011101":get=get+1;
               break;
               case "011100":get=get+1;
               break;
               
               case "011011":get=get+1;
               break;
               case "011010":get=get+1;
               break;
               case "011001":get=get+1;
               break;
               case "011000":get=get+1;
               break;
               case "010111":get=get+1;
               break;
               case "010110":get=get+1;
               break;
               case "010101":get=get+1;
               break;
               case "010100":get=get+1;
               break;
               case "010011":get=get+1;
               break;
               case "010010":get=get+1;
               break;
               case "010001":get=get+1;
               break;
               case "010000":get=get+1;
               break;
                                                                                                                                                  
                       
               
                           
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance32 SET subject2=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance32");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance32");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111110":get=get+1;
               break;
               case "111101":get=get+1;
               break;
               case "111100":get=get+1;
               break;
               case "111011":get=get+1;
               break;
               
               case "111010":get=get+1;
               break;
               case "111001":get=get+1;
               break;
               case "111000":get=get+1;
               break;
               case "101111":get=get+1;
               break;
               case "101110":get=get+1;
               break;
               case "101101":get=get+1;
               break;
               case "101100":get=get+1;
               break;
               case "101011":get=get+1;
               break;
               case "101010":get=get+1;
               break;
               case "101001":get=get+1;
               break;
               
               case "101000":get=get+1;
               break;
               
               case "011111":get=get+1;
               break;
               case "011110":get=get+1;
               break;
               case "011101":get=get+1;
               break;
               case "011100":get=get+1;
               break;
               case "011011":get=get+1;
               break;
               
               case "011010":get=get+1;
               break;
               case "011001":get=get+1;
               break;
               case "011000":get=get+1;
               break;
               case "001111":get=get+1;
               break;
               case "001110":get=get+1;
               break;
               case "001101":get=get+1;
               break;
               case "001100":get=get+1;
               break;
               case "001011":get=get+1;
               break;
               case "001010":get=get+1;
               break;
               case "001001":get=get+1;
               break;
               
               case "001000":get=get+1;
               break;
               
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance32 SET subject3=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance32");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance32");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111110":get=get+1;
               break;
               case "111101":get=get+1;
               break;
               case "111100":get=get+1;
               break;
               case "110111":get=get+1;
               break;
               
               case "110110":get=get+1;
               break;
               case "110101":get=get+1;
               break;
               case "110100":get=get+1;
               break;
               case "101111":get=get+1;
               break;
               case "101110":get=get+1;
               break;
               case "101101":get=get+1;
               break;
               case "101100":get=get+1;
               break;
               case "100111":get=get+1;
               break;
               case "100110":get=get+1;
               break;
               case "100101":get=get+1;
               break;
               
               case "100100":get=get+1;
               break;
               
               
               case "011111":get=get+1;
               break;
               case "011110":get=get+1;
               break;
               case "011101":get=get+1;
               break;
               case "011100":get=get+1;
               break;
               case "010111":get=get+1;
               break;
               
               case "010110":get=get+1;
               break;
               case "010101":get=get+1;
               break;
               case "010100":get=get+1;
               break;
               case "001111":get=get+1;
               break;
               case "001110":get=get+1;
               break;
               case "001101":get=get+1;
               break;
               case "001100":get=get+1;
               break;
               case "000111":get=get+1;
               break;
               case "000110":get=get+1;
               break;
               case "000101":get=get+1;
               break;
               
               case "000100":get=get+1;
               break;
               
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance32 SET subject4=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance32");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance32");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111110":get=get+1;
               break;
               case "110111":get=get+1;
               break;
               case "110110":get=get+1;
               break;
               case "111011":get=get+1;
               break;
               
               case "111010":get=get+1;
               break;
               case "110011":get=get+1;
               break;
               case "110010":get=get+1;
               break;
               case "101111":get=get+1;
               break;
               case "101110":get=get+1;
               break;
               case "100111":get=get+1;
               break;
               case "100110":get=get+1;
               break;
               case "101011":get=get+1;
               break;
               case "101010":get=get+1;
               break;
               case "100011":get=get+1;
               break;
               
               case "100010":get=get+1;
               break;
               
               
               case "011111":get=get+1;
               break;
               case "011110":get=get+1;
               break;
               case "010111":get=get+1;
               break;
               case "010110":get=get+1;
               break;
               case "011011":get=get+1;
               break;
               
               case "011010":get=get+1;
               break;
               case "010011":get=get+1;
               break;
               case "010010":get=get+1;
               break;
               case "001111":get=get+1;
               break;
               case "001110":get=get+1;
               break;
               case "000111":get=get+1;
               break;
               case "000110":get=get+1;
               break;
               case "001011":get=get+1;
               break;
               case "001010":get=get+1;
               break;
               case "000011":get=get+1;
               break;
               
               case "000010":get=get+1;
               break;
               
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance32 SET subject5=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        {
         try {
            st = conn.prepareStatement("select * from attendance32");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
            total=rs.getInt("flag");
            break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            st = conn.prepareStatement("select * from attendance32");
            ResultSet rst = st.executeQuery();
            
            while(rst.next())
            {   int a=1;
                get=0;
                rno=rst.getString("roll_no");
                
                while(a<=total)
                {
                    
            switch(rst.getString("Day"+a))
            {
               case "111111":get=get+1;
               break;
               case "111101":get=get+1;
               break;
               case "111011":get=get+1;
               break;
               case "111001":get=get+1;
               break;
               case "110111":get=get+1;
               break;
               
               case "110101":get=get+1;
               break;
               case "110011":get=get+1;
               break;
               case "110001":get=get+1;
               break;
               case "101111":get=get+1;
               break;
               case "101101":get=get+1;
               break;
               case "101011":get=get+1;
               break;
               case "101001":get=get+1;
               break;
               case "100111":get=get+1;
               break;
               case "100101":get=get+1;
               break;
               case "100011":get=get+1;
               break;
               
               case "100001":get=get+1;
               break;
               
               case "011111":get=get+1;
               break;
               case "011101":get=get+1;
               break;
               case "011011":get=get+1;
               break;
               case "011001":get=get+1;
               break;
               case "010111":get=get+1;
               break;
               
               case "010101":get=get+1;
               break;
               case "010011":get=get+1;
               break;
               case "010001":get=get+1;
               break;
               case "001111":get=get+1;
               break;
               case "001101":get=get+1;
               break;
               case "001011":get=get+1;
               break;
               case "001001":get=get+1;
               break;
               case "000111":get=get+1;
               break;
               case "000101":get=get+1;
               break;
               case "000011":get=get+1;
               break;
               
               case "000001":get=get+1;
               break;
               
               
               default:get=get+0;
               break;
                
            }
            a++;
            
                }
                pers=(get*82)/total;
                
            String sql;
                     sql="UPDATE attendance32 SET subject6=? WHERE roll_no=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, (int) pers);
            pst.setString(2,rno);
           
            pst.executeUpdate();    
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
         
        }
        
        
         
        
        
    }
     public void studentcalc()
    {
         
    }
}  


