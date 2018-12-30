package attendence.management.system;


import Classes.Connection2DB;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AKHIL REJI
 */
public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        java.sql.Connection conn=null;
    ResultSet rs=null;
    Statement st;
    getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));    
    
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextlastname = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jButtonCancel = new javax.swing.JButton();
        jButtonSubmit = new javax.swing.JButton();
        jLabelLogin1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextidno = new javax.swing.JTextField();
        jTextpassword = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextfirstname = new javax.swing.JTextField();
        jTextusername = new javax.swing.JTextField();
        jXDatePickerdate = new org.jdesktop.swingx.JXDatePicker();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();

        jTextField3.setBackground(new java.awt.Color(108, 122, 137));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(228, 241, 254));
        jTextField3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(1, 22, 39));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(234, 240, 241));
        jLabel5.setText("Password:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(234, 240, 241));
        jLabel6.setText("First Name:");

        jTextlastname.setBackground(new java.awt.Color(108, 122, 137));
        jTextlastname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextlastname.setForeground(new java.awt.Color(228, 241, 254));
        jTextlastname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextlastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextlastnameActionPerformed(evt);
            }
        });

        jPassword.setBackground(new java.awt.Color(108, 122, 137));
        jPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPassword.setForeground(new java.awt.Color(228, 241, 254));
        jPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jButtonCancel.setBackground(new java.awt.Color(242, 38, 19));
        jButtonCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonSubmit.setBackground(new java.awt.Color(34, 167, 240));
        jButtonSubmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSubmit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        jLabelLogin1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelLogin1.setForeground(new java.awt.Color(204, 204, 204));
        jLabelLogin1.setText("Already have an account ? Login");
        jLabelLogin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLogin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogin1MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(234, 240, 241));
        jLabel7.setText("Last Name:");

        jTextidno.setBackground(new java.awt.Color(108, 122, 137));
        jTextidno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextidno.setForeground(new java.awt.Color(228, 241, 254));
        jTextidno.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextidno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextidnoActionPerformed(evt);
            }
        });

        jTextpassword.setBackground(new java.awt.Color(108, 122, 137));
        jTextpassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextpassword.setForeground(new java.awt.Color(228, 241, 254));
        jTextpassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextpasswordActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(234, 240, 241));
        jLabel8.setText("Username:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(234, 240, 241));
        jLabel9.setText("Re-type password:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(234, 240, 241));
        jLabel10.setText("Date of Birth:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(234, 240, 241));
        jLabel12.setText("ID No:");

        jTextfirstname.setBackground(new java.awt.Color(108, 122, 137));
        jTextfirstname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextfirstname.setForeground(new java.awt.Color(228, 241, 254));
        jTextfirstname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextfirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextfirstnameActionPerformed(evt);
            }
        });

        jTextusername.setBackground(new java.awt.Color(108, 122, 137));
        jTextusername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextusername.setForeground(new java.awt.Color(228, 241, 254));
        jTextusername.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextusernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextidno, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                        .addComponent(jTextpassword)
                                        .addComponent(jPassword)
                                        .addComponent(jTextusername)
                                        .addComponent(jTextlastname)
                                        .addComponent(jTextfirstname))
                                    .addComponent(jXDatePickerdate, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabelLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jTextidno, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextlastname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextusername, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jXDatePickerdate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelLogin1)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 159, 28));
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Register");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 0, 90, 30);

        jLabelClose.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("x");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelClose);
        jLabelClose.setBounds(400, 0, 10, 21);

        jLabelMin.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelMin);
        jLabelMin.setBounds(380, 0, 10, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextlastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextlastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextlastnameActionPerformed

    private void jLabelLogin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogin1MouseClicked

        LoginForm lgf=new LoginForm();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);//to make center on screen
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
        

        //To exit the login form and move to register form

    }//GEN-LAST:event_jLabelLogin1MouseClicked

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed

        String pass=new String(jPassword.getPassword());
        String repass=jTextpassword.getText();
        int var=0;
        Connection2DB C=new Connection2DB();
        Connection con=C.setconnection();
        
        int a=0;
        PreparedStatement st;
        try {
            st = con.prepareStatement("select * from Login");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                a++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(a==0)
        {
            var=7;
        }
        if(pass.equals(repass))
        {try{
            String sql;
            /*Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String path="D:\\Attendence Management System\\Attendance.accdb";
            String url="jdbc:ucanaccess://"+path;
          
            Connection conn=DriverManager.getConnection(url);
          */
           
            Connection conn=C.setconnection();
                   
                                   
            sql="INSERT INTO LOGIN(ID,FIRSTNAME,LASTNAME,USERNAME,PASSWORD,DATE,verify)VALUES(?,?,?,?,?,?,?)";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setString(1, jTextidno.getText());
            pst.setString(2,jTextfirstname.getText());
            pst.setString(3,jTextlastname.getText() );
            pst.setString(4,jTextusername.getText());
            pst.setString(5,jTextpassword.getText() );
            
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String date=sdf.format(jXDatePickerdate.getDate() );
            pst.setString(6,date);
            pst.setInt(7,var);
            //pst.setDate(6,jXDatePickerdate.getDate());
            
            
            /*SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String date=sdf.format(dateofbirth.getSelectedDate() );
            pst.setString(6,date);
            
            */
                    
                              
            
            
              
            
          
           pst.executeUpdate();
                   
           JOptionPane.showMessageDialog(null, "Account created");
          
           
           
            
        }
          catch(SQLException ex)
          {
           JOptionPane.showMessageDialog(null,"Faileed to connect to DataBase");
          }
        LoginForm lgf=new LoginForm();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);//to make center on screen
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
            
        }
        else {
            JOptionPane.showMessageDialog(null,"Re-enter the same password","Password",JOptionPane.ERROR_MESSAGE );
            jPassword.setText("");
            jTextpassword.setText("");
            
            
            RegisterForm rgf=new RegisterForm();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);//to make center on screen
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
        }
        
        //Calendar dateofbirth=jdateofbirth.getSelectedDate();
        //String address =jTextaddress.getText();
        
        
       
        
                
        
        
        
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jTextidnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextidnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextidnoActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextpasswordActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        System.exit(0);
        
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jTextfirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextfirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextfirstnameActionPerformed

    private void jTextusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextusernameActionPerformed

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);//minimize
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        System.exit(0);//Exit
    }//GEN-LAST:event_jLabelCloseMouseClicked

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelLogin1;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextfirstname;
    private javax.swing.JTextField jTextidno;
    private javax.swing.JTextField jTextlastname;
    private javax.swing.JTextField jTextpassword;
    private javax.swing.JTextField jTextusername;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerdate;
    // End of variables declaration//GEN-END:variables
}
