/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendence.management.system;

import Classes.Connection2DB;
import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author AKHIL REJI
 */
public class AboutForm extends javax.swing.JFrame implements WindowListener{

    /**
     * Creates new form AboutForm
     */
     private JFrame frame;
    public AboutForm() {
        this.setLocationRelativeTo(null);
        addWindowListener(this);
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        y1 = new javax.swing.JRadioButton();
        n1 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        y2 = new javax.swing.JRadioButton();
        n2 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        y3 = new javax.swing.JRadioButton();
        n3 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        y4 = new javax.swing.JRadioButton();
        n4 = new javax.swing.JRadioButton();
        jButtonLogin = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(1, 22, 39));

        jPanel3.setBackground(new java.awt.Color(153, 0, 0));

        jLabel3.setBackground(new java.awt.Color(153, 153, 0));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Software Reset");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        Panel.setBackground(new java.awt.Color(85, 130, 139));

        jLabel4.setBackground(new java.awt.Color(153, 153, 0));
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Complete Software Reset and clear all the data stored?");

        y1.setBackground(new java.awt.Color(85, 130, 139));
        y1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        y1.setText("Yes");
        y1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y1ActionPerformed(evt);
            }
        });

        n1.setBackground(new java.awt.Color(85, 130, 139));
        n1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        n1.setText("No");
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(153, 153, 0));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Clear Student data ?");

        y2.setBackground(new java.awt.Color(85, 130, 139));
        y2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        y2.setText("Yes");
        y2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y2ActionPerformed(evt);
            }
        });

        n2.setBackground(new java.awt.Color(85, 130, 139));
        n2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        n2.setText("No");
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(153, 153, 0));
        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Clear Subject data ?");

        y3.setBackground(new java.awt.Color(85, 130, 139));
        y3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        y3.setText("Yes");
        y3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y3ActionPerformed(evt);
            }
        });

        n3.setBackground(new java.awt.Color(85, 130, 139));
        n3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        n3.setText("No");
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(153, 153, 0));
        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Clear Attendance Database ?");

        y4.setBackground(new java.awt.Color(85, 130, 139));
        y4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        y4.setText("Yes");
        y4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y4ActionPerformed(evt);
            }
        });

        n4.setBackground(new java.awt.Color(85, 130, 139));
        n4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        n4.setText("No");
        n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });

        jButtonLogin.setBackground(new java.awt.Color(34, 167, 240));
        jButtonLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin.setText("Confirm");
        jButtonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLoginMouseClicked(evt);
            }
        });
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jButtonCancel.setBackground(new java.awt.Color(242, 38, 19));
        jButtonCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancel.setText("Cancel");
        jButtonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addGap(59, 59, 59)
                                    .addComponent(y3)
                                    .addGap(62, 62, 62)
                                    .addComponent(n3)))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(y2)
                                        .addGap(62, 62, 62)
                                        .addComponent(n2))
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(y1)
                                        .addGap(62, 62, 62)
                                        .addComponent(n1))))
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addGap(59, 59, 59)
                                    .addComponent(y4)
                                    .addGap(62, 62, 62)
                                    .addComponent(n4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 398, Short.MAX_VALUE)
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButtonLogin)
                        .addGap(122, 122, 122))))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(y1)
                    .addComponent(n1)
                    .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(y2)
                    .addComponent(n2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(y3)
                    .addComponent(n3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(y4)
                    .addComponent(n4))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 159, 28));
        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administrative Control Panel");

        jLabelClose.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("x");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelMin.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        System.exit(0);//Exit

    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);//minimize

    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jPanel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel2AncestorAdded
        // TODO add your handling code he
    }//GEN-LAST:event_jPanel2AncestorAdded

    private void jButtonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelMouseClicked
        DashboardForm info=new DashboardForm();
        info.setVisible(true);
        info.pack();
        info.setLocationRelativeTo(null);//to make center on screen
        info.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelMouseClicked

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        

    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void y1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y1ActionPerformed
        n1.setSelected(false);
        y2.setEnabled(false);
        n2.setEnabled(false);
        y3.setEnabled(false);
        n3.setEnabled(false);
        y4.setEnabled(false);
        n4.setEnabled(false);
        
    }//GEN-LAST:event_y1ActionPerformed

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
    y1.setSelected(false);
     y2.setEnabled(true);
        n2.setEnabled(true);
        y3.setEnabled(true);
        n3.setEnabled(true);
        y4.setEnabled(true);
        n4.setEnabled(true);
    }//GEN-LAST:event_n1ActionPerformed

    private void y2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y2ActionPerformed
    n2.setSelected(false);
    }//GEN-LAST:event_y2ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
       y2.setSelected(false);
    }//GEN-LAST:event_n2ActionPerformed

    private void y3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y3ActionPerformed
         n3.setSelected(false);
    }//GEN-LAST:event_y3ActionPerformed

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ActionPerformed
        y3.setSelected(false);
    }//GEN-LAST:event_n3ActionPerformed

    private void y4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y4ActionPerformed
        n4.setSelected(false);
    }//GEN-LAST:event_y4ActionPerformed

    private void n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4ActionPerformed
        y4.setSelected(false);
    }//GEN-LAST:event_n4ActionPerformed

    private void jButtonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLoginMouseClicked
         Connection2DB C=new Connection2DB();
        Connection conn=C.setconnection();
        if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
     if(y1.isSelected())
     {
                    
          
        
        String sql;
        
         
         
        
            PreparedStatement pst;
        try {
            sql="DELETE FROM LOGIN ";
            pst = conn.prepareStatement(sql);
                              
            pst.executeUpdate();
            sql="DELETE FROM STUDENT ";
            pst = conn.prepareStatement(sql);
                              
            pst.executeUpdate();
            sql="DELETE FROM SUBJECT ";
            pst = conn.prepareStatement(sql);
                              
            pst.executeUpdate();
            sql="DELETE FROM DAYTODATES1 ";
            pst = conn.prepareStatement(sql);
                              
            pst.executeUpdate();
            sql="DELETE FROM DAYTODATES2 ";
            pst = conn.prepareStatement(sql);
                              
            pst.executeUpdate();
            
            sql="DELETE FROM ATTENDANCE11 ";
            pst = conn.prepareStatement(sql);
                              
            pst.executeUpdate();
            sql="DELETE FROM ATTENDANCE12 ";
            pst = conn.prepareStatement(sql);
                              
            pst.executeUpdate();
            sql="DELETE FROM ATTENDANCE21 ";
            pst = conn.prepareStatement(sql);
                              
            pst.executeUpdate();
            sql="DELETE FROM ATTENDANCE22 ";
            pst = conn.prepareStatement(sql);
                              
            pst.executeUpdate();
            sql="DELETE FROM ATTENDANCE31 ";
            pst = conn.prepareStatement(sql);
                              
            pst.executeUpdate();
            sql="DELETE FROM ATTENDANCE32 ";
            pst = conn.prepareStatement(sql);
                              
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(ConfirmationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
           
             
             LoginForm abtf=new LoginForm();
        abtf.setVisible(true);
        abtf.pack();
        abtf.setLocationRelativeTo(null);//to make center on screen
        abtf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
     }
     if(y2.isSelected())
     {
       
                    
          
        
        String sql;
        
         
         
         
            PreparedStatement pst;
        try {
            sql="DELETE FROM STUDENT";
            pst = conn.prepareStatement(sql);
            
                      
            
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConfirmationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
           
             
             StudentForm abtf=new StudentForm();
        abtf.setVisible(true);
        abtf.pack();
        abtf.setLocationRelativeTo(null);//to make center on screen
        abtf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
       
     }
     if(y3.isSelected())
     {
       
                    
          
        
        String sql;
        
         
         
         
            PreparedStatement pst;
        try {
            sql="DELETE FROM SUBJECT ";
            pst = conn.prepareStatement(sql);
            
                      
            
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConfirmationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
           
             
             SubjectForm abtf=new SubjectForm();
        abtf.setVisible(true);
        abtf.pack();
        abtf.setLocationRelativeTo(null);//to make center on screen
        abtf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
       
     }
     if(y4.isSelected())
     {
         
                    
          
        
        String sql;
        
         
         
         
            PreparedStatement pst;
        try {
            
            sql="DELETE FROM DAYTODATES1 ";
            pst = conn.prepareStatement(sql);
                              
            pst.executeUpdate();
            sql="DELETE FROM DAYTODATES2 ";
            pst = conn.prepareStatement(sql);
                              
            pst.executeUpdate();
            
            sql="DELETE FROM ATTENDANCE11 ";
            pst = conn.prepareStatement(sql);
                              
            pst.executeUpdate();
            sql="DELETE FROM ATTENDANCE12 ";
            pst = conn.prepareStatement(sql);
                              
            pst.executeUpdate();
            sql="DELETE FROM ATTENDANCE21 ";
            pst = conn.prepareStatement(sql);
                              
            pst.executeUpdate();
            sql="DELETE FROM ATTENDANCE22 ";
            pst = conn.prepareStatement(sql);
                              
            pst.executeUpdate();
            sql="DELETE FROM ATTENDANCE31 ";
            pst = conn.prepareStatement(sql);
                              
            pst.executeUpdate();
            sql="DELETE FROM ATTENDANCE32 ";
            pst = conn.prepareStatement(sql);
                              
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConfirmationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
           
             
             DashboardForm abtf=new DashboardForm();
        abtf.setVisible(true);
        abtf.pack();
        abtf.setLocationRelativeTo(null);//to make center on screen
        abtf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
       
     }
     
    } else {AboutForm abtf=new AboutForm();
        abtf.setVisible(true);
        abtf.pack();
        abtf.setLocationRelativeTo(null);//to make center on screen
        abtf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }
    }//GEN-LAST:event_jButtonLoginMouseClicked

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
            java.util.logging.Logger.getLogger(AboutForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutForm().setVisible(true);
            }
        });
    } 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton n1;
    private javax.swing.JRadioButton n2;
    private javax.swing.JRadioButton n3;
    private javax.swing.JRadioButton n4;
    private javax.swing.JRadioButton y1;
    private javax.swing.JRadioButton y2;
    private javax.swing.JRadioButton y3;
    private javax.swing.JRadioButton y4;
    // End of variables declaration//GEN-END:variables

    @Override
    public void windowOpened(WindowEvent e) {
        this.setLocationRelativeTo(null);
        Connection2DB C=new Connection2DB();
            Connection conn=C.setconnection();
            PreparedStatement st;
            int var=0;
         try {
             st = conn.prepareStatement("select * from Login");
              ResultSet rs = st.executeQuery();
              while(rs.next())
              {
                 var=rs.getInt("Verify");
                 if(var<=4)
                 {
                    this.setLocationRelativeTo(null);
                    ConfirmationForm cff=new ConfirmationForm();
                    cff.setVisible(true);
                    cff.pack();
                    cff.setLocationRelativeTo(null);//to make center on screen
                    cff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 }
                 
              }
         } catch (SQLException ex) {
             Logger.getLogger(AboutForm.class.getName()).log(Level.SEVERE, null, ex);
         }
           
        
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosed(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
