/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hany;
import java.awt.ComponentOrientation;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author amnassar
 */
public class MainPage1 extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    LoginForm1 l ;
    public  String LL=null;
    PreparedStatement pst ;
    ResultSet rs; 
    public String y; 
    public  String nameee=null;
     public  String typee=null;
     public  String oldneww=null;
     public  String sectionn=null;
     private ImageIcon icon;
    public MainPage1(String type,String username , String oldnew , String section) throws IOException {
        initComponents();
         icon = new ImageIcon(getClass().getResource("/Image/mechanic.png"));
        this.setIconImage(icon.getImage());
        typee=type;
        nameee=username;
        oldneww=oldnew;
        sectionn=section;
        if(typee.equals("admin"))
        {
          repaire.setEnabled(true);
          work.setEnabled(true);
        }
        if(typee.equals("creator"))
        {
          repaire.setEnabled(true);
          work.setEnabled(false);
        }
        if(typee.equals("receiver"))
        {
          repaire.setEnabled(false);
          work.setEnabled(true);
        }
       
  }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        repaire = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        work = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(17, 39, 37));
        setMinimumSize(new java.awt.Dimension(1200, 740));

        jPanel1.setBackground(new java.awt.Color(17, 39, 37));
        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 740));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 740));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 740));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        repaire.setBackground(new java.awt.Color(204, 255, 255));
        repaire.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        repaire.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/attend00.png"))); // NOI18N
        repaire.setText("اوامر اصلاح");
        repaire.setEnabled(false);
        repaire.setPreferredSize(new java.awt.Dimension(169, 89));
        repaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repaireActionPerformed(evt);
            }
        });
        jPanel1.add(repaire, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 300, 150));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-google-blog-search-64.png"))); // NOI18N
        jButton1.setText("تسجيل الخروج");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 220, 100));

        work.setBackground(new java.awt.Color(204, 255, 255));
        work.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        work.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Print_1.png"))); // NOI18N
        work.setText("اوامر العمل");
        work.setEnabled(false);
        work.setPreferredSize(new java.awt.Dimension(169, 89));
        work.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workActionPerformed(evt);
            }
        });
        jPanel1.add(work, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 300, 150));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/IMG-20210624-WA0011.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(1180, 710));
        jLabel2.setMinimumSize(new java.awt.Dimension(1180, 710));
        jLabel2.setPreferredSize(new java.awt.Dimension(1200, 740));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 740));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void repaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repaireActionPerformed
        
        try {
            new Home(typee,nameee,oldneww,sectionn).setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(MainPage1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(MainPage1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_repaireActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

         LoginForm1 l = new LoginForm1();
             l.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void workActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workActionPerformed
         try {
            new Home2(typee,nameee,oldneww,sectionn).setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(MainPage1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(MainPage1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_workActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton repaire;
    public javax.swing.JButton work;
    // End of variables declaration//GEN-END:variables



}
