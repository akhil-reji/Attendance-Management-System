/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendence.management.system;

import Classes.Connection2DB;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author AKHIL REJI
 */
public class StudentAddForm extends javax.swing.JFrame {
    private JFrame frame;
    /**
     * Creates new form StudentAddForm
     */
    public StudentAddForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 3, 3, Color.BLACK));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonCancel = new javax.swing.JButton();
        jButtonupdate = new javax.swing.JButton();
        jLabelLogin1 = new javax.swing.JLabel();
        jTextidno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextrollno = new javax.swing.JTextField();
        jXDatePickerdate = new org.jdesktop.swingx.JXDatePicker();
        jTextcontactno = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextname = new javax.swing.JTextField();
        jComboBoxsex = new javax.swing.JComboBox<>();
        jButtonadd = new javax.swing.JButton();
        jComboBoxsem = new javax.swing.JComboBox<>();
        jComboBoxyear = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student");

        jLabelClose.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("x");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelMin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(1, 22, 39));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(234, 240, 241));
        jLabel5.setText("Semester:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(234, 240, 241));
        jLabel6.setText("Name:");

        jButtonCancel.setBackground(new java.awt.Color(242, 38, 19));
        jButtonCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonupdate.setBackground(new java.awt.Color(34, 167, 240));
        jButtonupdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonupdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonupdate.setText("Update");
        jButtonupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonupdateActionPerformed(evt);
            }
        });

        jLabelLogin1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelLogin1.setForeground(new java.awt.Color(204, 204, 204));
        jLabelLogin1.setText("Want to go back to student form?");
        jLabelLogin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLogin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogin1MouseClicked(evt);
            }
        });

        jTextidno.setBackground(new java.awt.Color(108, 122, 137));
        jTextidno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextidno.setForeground(new java.awt.Color(228, 241, 254));
        jTextidno.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextidno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextidnoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(234, 240, 241));
        jLabel8.setText("Roll No:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(234, 240, 241));
        jLabel9.setText("Sex:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(234, 240, 241));
        jLabel10.setText("Date of Birth:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(234, 240, 241));
        jLabel12.setText("ID No:");

        jTextrollno.setBackground(new java.awt.Color(108, 122, 137));
        jTextrollno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextrollno.setForeground(new java.awt.Color(228, 241, 254));
        jTextrollno.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextrollno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextrollnoActionPerformed(evt);
            }
        });

        jTextcontactno.setBackground(new java.awt.Color(108, 122, 137));
        jTextcontactno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextcontactno.setForeground(new java.awt.Color(228, 241, 254));
        jTextcontactno.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextcontactno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextcontactnoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(234, 240, 241));
        jLabel11.setText("Contact no:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(234, 240, 241));
        jLabel13.setText("Year:");

        jTextname.setBackground(new java.awt.Color(108, 122, 137));
        jTextname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextname.setForeground(new java.awt.Color(228, 241, 254));
        jTextname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextnameActionPerformed(evt);
            }
        });

        jComboBoxsex.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBoxsex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female", "wont need to disclose" }));

        jButtonadd.setBackground(new java.awt.Color(34, 167, 240));
        jButtonadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonadd.setForeground(new java.awt.Color(255, 255, 255));
        jButtonadd.setText("Add");
        jButtonadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonaddMouseClicked(evt);
            }
        });
        jButtonadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaddActionPerformed(evt);
            }
        });

        jComboBoxsem.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBoxsem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st semester", "2nd semester" }));

        jComboBoxyear.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBoxyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st year", "2nd  year", "3ed year" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabelLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(jLabel6)
                            .addComponent(jLabel13)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jButtonupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                        .addComponent(jButtonadd, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextrollno)
                                    .addComponent(jTextidno)
                                    .addComponent(jTextname)
                                    .addComponent(jTextcontactno)
                                    .addComponent(jXDatePickerdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxsex, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBoxsem, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxyear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextidno, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextrollno, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxyear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxsem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxsex, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXDatePickerdate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextcontactno, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonadd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelLogin1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        this.dispose();
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);//minimize
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jButtonaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonaddActionPerformed

    private void jTextnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextnameActionPerformed

    private void jTextcontactnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextcontactnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextcontactnoActionPerformed

    private void jTextrollnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextrollnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextrollnoActionPerformed

    private void jTextidnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextidnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextidnoActionPerformed

    private void jLabelLogin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogin1MouseClicked

        StudentForm stf=new StudentForm();
        stf.setVisible(true);
        stf.pack();
        stf.setLocationRelativeTo(null);//to make center on screen
        stf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

        //To exit the login form and move to register form
    }//GEN-LAST:event_jLabelLogin1MouseClicked

    private void jButtonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonupdateActionPerformed
         Connection2DB C=new Connection2DB();
        Connection conn=C.setconnection();
        Statement st=null;
        String id=jTextidno.getText();
        String roll=jTextrollno.getText();
        String name=jTextname.getText();
        String year=(String) jComboBoxyear.getSelectedItem();
        String sem=(String) jComboBoxsem.getSelectedItem();
        String sex=(String) jComboBoxsex.getSelectedItem();

       
        String cont=jTextcontactno.getText();
        int log=0;
        int logs=0;
        
        try {
            st =(Statement)conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(SubjectForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
           
        ResultSet rs=null;
        try {
            rs=st.executeQuery("SELECT * FROM STUDENT");
        } catch (SQLException ex) {
            Logger.getLogger(SubjectForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while(rs.next())
            {   
                if ( rs.getString("id").equals(id) && rs.getString("roll_no").equals(roll))
                
                {
                    logs=1;
                    break;
                    
                }
                else
                {
                    
                 
                 log=1;   
                }
                
            }
            if (logs==1)
            {
                log=0;
                String sql;
                     sql="UPDATE STUDENT SET NAME=?,YEAR=?,SEMESTER=?,SEX=?,DATE_OF_BIRTH=?,CONTACT=? WHERE ID=? AND ROLL_NO=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setString(1,name);
            pst.setString(2,year );
            pst.setString(3,sem);
            pst.setString(4,sex);
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String date=sdf.format(jXDatePickerdate.getDate() );
            pst.setString(5,date);
            pst.setString(6,cont);
            
            pst.setString(7, id);
            pst.setString(8, roll);
            
            
            pst.executeUpdate();
            
            String sqlst;
            String xyz=null;
            if(year.equals("1st year"))
            {
                if(sem.equals("1st semester"))
                {
                    xyz="11";
                }
                else
                {
                    xyz="12";
                }
            }
            if(year.equals("2nd year"))
            {
                if(sem.equals("1st semester"))
                {
                    xyz="21";
                }
                else
                {
                    xyz="22";
                }
            }
            if(year.equals("3ed year"))
            {
                if(sem.equals("1st semester"))
                {
                    xyz="31";
                }
                else
                {
                    xyz="32";
                }
            }
          
             sqlst="update attendance"+xyz+" set name=? where roll_no=?"; 
             PreparedStatement pstst=conn.prepareStatement(sqlst);
             pstst.setString(1, name);
             pstst.setString(2, roll);
             pstst.execute();
            
            JOptionPane.showMessageDialog(null,"Student updated","Successfull",JOptionPane.INFORMATION_MESSAGE );
            
             
                
                
            }
            if (log==1)
            {  
                JOptionPane.showMessageDialog(null,"Student doesn't exist","Can not update",JOptionPane.ERROR_MESSAGE );
            }
                
                
                
                
                
                
                
                
                
                
                } catch (SQLException ex) {
            Logger.getLogger(SubjectForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButtonupdateActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
         StudentForm stf=new StudentForm();
        stf.setVisible(true);
        stf.pack();
        stf.setLocationRelativeTo(null);//to make center on screen
        stf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonaddMouseClicked

                Connection2DB C=new Connection2DB();
        Connection conn=C.setconnection();
        Statement st=null;
        String id=jTextidno.getText();
        String roll=jTextrollno.getText();
        String name=jTextname.getText();
        String year=(String) jComboBoxyear.getSelectedItem();
        String sem=(String) jComboBoxsem.getSelectedItem();
        String sex=(String) jComboBoxsex.getSelectedItem();

       
        String cont=jTextcontactno.getText();
        int log=0;
        int logs=0;
        
        
        try {
            st =(Statement)conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(SubjectForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
           
        ResultSet rs=null;
        try {
            rs=st.executeQuery("SELECT * FROM STUDENT");
        } catch (SQLException ex) {
            Logger.getLogger(SubjectForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while(rs.next())
            { 
                if ( rs.getString(1).equals(id) || rs.getString(6).equals(roll))
                
                {
                
                    logs=1;
                    break;
                    
                }
                else
                {
                    
                    
                 
                 log=1;   
                }
                
            }
            if (logs==1)
            {
                log=0;
                JOptionPane.showMessageDialog(null,"Student Already Exist","Can not add",JOptionPane.INFORMATION_MESSAGE );
                
            }
            
            
            {String sql;
           
                     sql="INSERT INTO STUDENT(ID,ROLL_NO,NAME,YEAR,SEMESTER,SEX,DATE_OF_BIRTH,CONTACT)VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setString(1, id);
            pst.setString(2, roll);
            pst.setString(3,name);
            pst.setString(4,year );
            pst.setString(5,sem);
            pst.setString(6,sex);
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String date=sdf.format(jXDatePickerdate.getDate() );
            pst.setString(7,date);
            
            
            pst.setString(8,cont);
            pst.execute();
            String sqlst;
            String xyz=null;
            if(year.equals("1st year"))
            {
                if(sem.equals("1st semester"))
                {
                    xyz="11";
                }
                else
                {
                    xyz="12";
                }
            }
            if(year.equals("2nd year"))
            {
                if(sem.equals("1st semester"))
                {
                    xyz="21";
                }
                else
                {
                    xyz="22";
                }
            }
            if(year.equals("3ed year"))
            {
                if(sem.equals("1st semester"))
                {
                    xyz="31";
                }
                else
                {
                    xyz="32";
                }
            }
            
             sqlst="insert into attendance"+xyz+" (roll_no,name)values(?,?)"; 
             PreparedStatement pstst=conn.prepareStatement(sqlst);
             pstst.setString(1, roll);
             pstst.setString(2, name);
             pstst.execute();
            
           
            jTextidno.setText("");
            jTextrollno.setText("");
            jTextname.setText("");
            //jComboBoxsex.removeAllItems();
            //jComboBoxsem.removeAllItems();
            
            jTextcontactno.setText("");
            
            JOptionPane.showMessageDialog(null,"Student added","Successfull",JOptionPane.INFORMATION_MESSAGE );
            
            
                
            }
                
                
                
                
                
                
                
                
                
                
                } catch (SQLException ex) {
            Logger.getLogger(SubjectForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
        
        
        
        
       
        
        
    }//GEN-LAST:event_jButtonaddMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentAddForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentAddForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentAddForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentAddForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentAddForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonadd;
    private javax.swing.JButton jButtonupdate;
    private javax.swing.JComboBox<String> jComboBoxsem;
    private javax.swing.JComboBox<String> jComboBoxsex;
    private javax.swing.JComboBox<String> jComboBoxyear;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelLogin1;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextcontactno;
    private javax.swing.JTextField jTextidno;
    private javax.swing.JTextField jTextname;
    private javax.swing.JTextField jTextrollno;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerdate;
    // End of variables declaration//GEN-END:variables
}
