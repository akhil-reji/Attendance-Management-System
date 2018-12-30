
package Classes;
import attendence.management.system.SubjectForm;
import Classes.Connection2DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class viewrecord {
    
Connection2DB C=new Connection2DB();
String s1="a";
        String s2="a";
        String s3="b";
        String s4="c";
        String s5="d";
        String s6="e";

public void tab1(JTable table) throws SQLException
{
    try{
        Connection conn=C.setconnection();
        PreparedStatement st;    
        
        
        st = conn.prepareStatement("select id,roll_no,name,class,subject1,subject2,subject3,subject4,subject5,subject6 from attendance11 ");
        
    
    ResultSet rs = st.executeQuery();
    
     table.setModel(DbUtils.resultSetToTableModel(rs));//used to convert resultset into table model
      
    
    }
    catch(SQLException e){
        System.out.println(e);
    }
}
    public void tab2(JTable table) throws SQLException
{
    try{
        Connection conn=C.setconnection();
        PreparedStatement st;    
        
        
        st = conn.prepareStatement("select id,roll_no,name,class,subject1,subject2,subject3,subject4,subject5,subject6 from attendance12 ");
        
    
    ResultSet rs = st.executeQuery();
    
    
     table.setModel(DbUtils.resultSetToTableModel(rs));//used to convert resultset into table model
      
    
    }
    catch(SQLException e){
        System.out.println(e);
    }
}
    public void tab3(JTable table) throws SQLException
{
    try{
        Connection conn=C.setconnection();
        PreparedStatement st;    
        
        
        st = conn.prepareStatement("select id,roll_no,name,class,subject1,subject2,subject3,subject4,subject5,subject6 from attendance21 ");
        
    
    ResultSet rs = st.executeQuery();
    
    
     table.setModel(DbUtils.resultSetToTableModel(rs));//used to convert resultset into table model
      
    
    }
    catch(SQLException e){
        System.out.println(e);
    }
}
    public void tab4(JTable table) throws SQLException
{
    try{
        Connection conn=C.setconnection();
        PreparedStatement st;    
        
        
        st = conn.prepareStatement("select id,roll_no,name,class,subject1,subject2,subject3,subject4,subject5,subject6 from attendance22 ");
        
    
    ResultSet rs = st.executeQuery();
    
    
     table.setModel(DbUtils.resultSetToTableModel(rs));//used to convert resultset into table model
      
    
    }
    catch(SQLException e){
        System.out.println(e);
    }
}
    public void tab5(JTable table) throws SQLException
{
    try{
        Connection conn=C.setconnection();
        PreparedStatement st;    
        
        
        st = conn.prepareStatement("select id,roll_no,name,class,subject1,subject2,subject3,subject4,subject5,subject6 from attendance31 ");
        
    
    ResultSet rs = st.executeQuery();
    
    
     table.setModel(DbUtils.resultSetToTableModel(rs));//used to convert resultset into table model
      
    
    }
    catch(SQLException e){
        System.out.println(e);
    }
}
    public void tab6(JTable table) throws SQLException
{
    try{
        Connection conn=C.setconnection();
        PreparedStatement st;    
        
        
        st = conn.prepareStatement("select id,roll_no,name,class,subject1,subject2,subject3,subject4,subject5,subject6 from attendance32 ");
        
    
    ResultSet rs = st.executeQuery();
    
    
     table.setModel(DbUtils.resultSetToTableModel(rs));//used to convert resultset into table model
      
    
    }
    catch(SQLException e){
        System.out.println(e);
    }
}
public void view1(JTable table) throws SQLException
{
    try{
        Connection conn=C.setconnection();
        PreparedStatement st;    
        
        
        st = conn.prepareStatement("select * from subject where year = ? and  semester= ?  ");
        st.setString(1, "1st year");  
        st.setString(2, "1st semester"); 
    
    ResultSet rs = st.executeQuery();
    
        table.setModel(DbUtils.resultSetToTableModel(rs));//used to convert resultset into table model
      
    
    }
    catch(SQLException e){
        System.out.println(e);
    }
    
}
public void view2(JTable table) throws SQLException
{
    try{
        Connection conn=C.setconnection();
        PreparedStatement st;    
        st = conn.prepareStatement("select * from subject where year = ? and  semester= ?  ");
        st.setString(1, "1st year");  
        st.setString(2, "2nd semester"); 
    
    ResultSet rs = st.executeQuery();
     table.setModel(DbUtils.resultSetToTableModel(rs));//used to convert resultset into table model
      
    }
    catch(SQLException e){
        System.out.println(e);
    }
}

public void view3(JTable table) throws SQLException
{
    try{
        Connection conn=C.setconnection();
        PreparedStatement st;    
        st = conn.prepareStatement("select * from subject where year = ? and  semester= ?  ");
        st.setString(1, "2nd year");  
        st.setString(2, "1st semester"); 
    
    ResultSet rs = st.executeQuery();
     table.setModel(DbUtils.resultSetToTableModel(rs));//used to convert resultset into table model
      
    }
    catch(SQLException e){
        System.out.println(e);
    }
}

public void view4(JTable table) throws SQLException
{
    try{
        Connection conn=C.setconnection();
        PreparedStatement st;    
        st = conn.prepareStatement("select * from subject where year = ? and  semester= ?  ");
        st.setString(1, "2nd year");  
        st.setString(2, "2nd semester"); 
    
    ResultSet rs = st.executeQuery();
     table.setModel(DbUtils.resultSetToTableModel(rs));//used to convert resultset into table model
      
    }
    catch(SQLException e){
        System.out.println(e);
    }
    
}
public void view5(JTable table) throws SQLException
{
    try{
        Connection conn=C.setconnection();
        PreparedStatement st;    
        st = conn.prepareStatement("select * from subject where year = ? and  semester= ?  ");
        st.setString(1, "3ed year");  
        st.setString(2, "1st semester"); 
    
    ResultSet rs = st.executeQuery();
     table.setModel(DbUtils.resultSetToTableModel(rs));//used to convert resultset into table model
      
    }
    catch(SQLException e){
        System.out.println(e);
    }
    
}
public void view6(JTable table) throws SQLException
{
    try{
        Connection conn=C.setconnection();
        PreparedStatement st;    
        st = conn.prepareStatement("select * from subject where year = ? and  semester= ?  ");
        st.setString(1, "3ed year");  
        st.setString(2, "2nd semester"); 
    
    ResultSet rs = st.executeQuery();
     table.setModel(DbUtils.resultSetToTableModel(rs));//used to convert resultset into table model
      
    }
    catch(SQLException e){
        System.out.println(e);
    }
    
}
public void views1(JTable table) throws SQLException
{
    try{
        Connection conn=C.setconnection();
        PreparedStatement st;    
        
        
        st = conn.prepareStatement("select * from student where year = ? and  semester= ?  ");
        st.setString(1, "1st year");  
        st.setString(2, "1st semester"); 
    
    ResultSet rs = st.executeQuery();
    
    
     table.setModel(DbUtils.resultSetToTableModel(rs));//used to convert resultset into table model
      
    
    }
    catch(SQLException e){
        System.out.println(e);
    }
    
}

public void views2(JTable table) throws SQLException
{
    try{
        Connection conn=C.setconnection();
        PreparedStatement st;    
        
        
        st = conn.prepareStatement("select * from student where year = ? and  semester= ?  ");
        st.setString(1, "1st year");  
        st.setString(2, "2nd semester"); 
    
    ResultSet rs = st.executeQuery();
    
    
     table.setModel(DbUtils.resultSetToTableModel(rs));//used to convert resultset into table model
      
    
    }
    catch(SQLException e){
        System.out.println(e);
    }
    
}
public void views3(JTable table) throws SQLException
{
    try{
        Connection conn=C.setconnection();
        PreparedStatement st;    
        
        
        st = conn.prepareStatement("select * from student where year = ? and  semester= ?  ");
        st.setString(1, "2nd year");  
        st.setString(2, "1st semester"); 
    
    ResultSet rs = st.executeQuery();
    
    
     table.setModel(DbUtils.resultSetToTableModel(rs));//used to convert resultset into table model
      
    
    }
    catch(SQLException e){
        System.out.println(e);
    }
    
}
public void views4(JTable table) throws SQLException
{
    try{
        Connection conn=C.setconnection();
        PreparedStatement st;    
        
        
        st = conn.prepareStatement("select * from student where year = ? and  semester= ?  ");
        st.setString(1, "2nd year");  
        st.setString(2, "2nd semester"); 
    
    ResultSet rs = st.executeQuery();
    
    
     table.setModel(DbUtils.resultSetToTableModel(rs));//used to convert resultset into table model
      
    
    }
    catch(SQLException e){
        System.out.println(e);
    }
    
}
public void views5(JTable table) throws SQLException
{
    try{
        Connection conn=C.setconnection();
        PreparedStatement st;    
        
        
        st = conn.prepareStatement("select * from student where year = ? and  semester= ?  ");
        st.setString(1, "3ed year");  
        st.setString(2, "1st semester"); 
    
    ResultSet rs = st.executeQuery();
    
    
     table.setModel(DbUtils.resultSetToTableModel(rs));//used to convert resultset into table model
      
    
    }
    catch(SQLException e){
        System.out.println(e);
    }
    
}
public void views6(JTable table) throws SQLException
{
    try{
        Connection conn=C.setconnection();
        PreparedStatement st;    
        
        
        st = conn.prepareStatement("select * from student where year = ? and  semester= ?  ");
        st.setString(1, "3ed year");  
        st.setString(2, "2nd semester"); 
    
    ResultSet rs = st.executeQuery();
    
    
     table.setModel(DbUtils.resultSetToTableModel(rs));//used to convert resultset into table model
      
    
    }
    catch(SQLException e){
        System.out.println(e);
    }
    
}
}







