/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hany;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;
import java.awt.ComponentOrientation;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author amnassar
 */
public final class item extends javax.swing.JInternalFrame {

    /**
     * Creates new form book
     */
    PreparedStatement pst ;
    ResultSet rs;
     public String y ;
     public String check;
      public String datee;
      public  Calendar cal;
      public String pphone1;
      public String pphone2;
      public String ppp2;
      public String ppp1;
      public String ttt1;
      public String ttt2;
      public String typee;
      String dayyy ;
      
      
    
   
    public item(String x ) throws ParseException {
        initComponents();
         clear();
         tablelord();
         typee=x;
          if(typee.equals("admin"))
        {
          save2.setEnabled(true);
        }
        cal = new GregorianCalendar();
               int month=cal.get(Calendar.MONTH)+1;
             int year = cal.get(Calendar.YEAR);
                 int dayy =cal.get(Calendar.DAY_OF_MONTH);
             dayyy=String.valueOf(dayy);
 if(dayy == 1 || dayy == 2 || dayy == 3 || dayy == 4
         || dayy == 5 || dayy == 6 || dayy == 7 || dayy == 8 || dayy == 9 )
 {
      dayyy=String.valueOf(dayy);
     dayyy="0"+dayyy;
 }
           date1.setText(year+"-"+month+"-"+dayyy);
           datee=date1.getText().toString();
         name.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
         code.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
       TableCellRenderer rendererFromHeader = tdetails.getTableHeader().getDefaultRenderer();
JLabel headerLabel = (JLabel) rendererFromHeader;
headerLabel.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tdetails.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
         tdetails.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
         tdetails.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
         tdetails.getColumnModel().getColumn(3).setCellRenderer( centerRenderer ); 
         tdetails.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tdetails = new javax.swing.JTable();
        name = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        code = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        cmsection = new javax.swing.JComboBox();
        cmtype = new javax.swing.JComboBox();
        save2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        serialid = new javax.swing.JLabel();
        serial = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();

        jLabel16.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/71847608-close-up-of-handshake-on-city-background-with-abstract-sunlight-partnership-concept-double-exposure.jpg"))); // NOI18N

        setMaximumSize(new java.awt.Dimension(980, 690));
        setMinimumSize(new java.awt.Dimension(980, 690));
        setPreferredSize(new java.awt.Dimension(980, 690));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel10.setMinimumSize(new java.awt.Dimension(90, 34));
        jPanel10.setPreferredSize(new java.awt.Dimension(970, 690));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel13.setText("اسم المعدة");
        jPanel10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 140, -1));

        tdetails.setBackground(new java.awt.Color(138, 203, 195));
        tdetails.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "القسم التابعة لة", "الورشة", "كود المعدة", "اسم المعدة", "رقم"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tdetails.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tdetails.setRowHeight(25);
        tdetails.setRowMargin(2);
        tdetails.setSelectionBackground(new java.awt.Color(204, 255, 255));
        tdetails.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tdetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tdetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tdetails);
        if (tdetails.getColumnModel().getColumnCount() > 0) {
            tdetails.getColumnModel().getColumn(4).setMinWidth(50);
            tdetails.getColumnModel().getColumn(4).setPreferredWidth(50);
            tdetails.getColumnModel().getColumn(4).setMaxWidth(50);
        }

        jPanel10.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 930, 270));

        name.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel10.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 280, 40));

        save.setBackground(new java.awt.Color(138, 203, 195));
        save.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save.setText("حفظ");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel10.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 180, 40));

        code.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel10.add(code, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 280, 40));

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel32.setText("الورشة");
        jPanel10.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, 90, 40));

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel33.setText("الادارة");
        jPanel10.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, 80, 40));

        cmsection.setEditable(true);
        cmsection.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cmsection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PSS", "URD", "LSD", "FSD", "TRS", "QD", "Call Centre", "ITD", "HR", "DRD", "WHD", "CD", "Slag" }));
        jPanel10.add(cmsection, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 190, 40));

        cmtype.setEditable(true);
        cmtype.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cmtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ورشة المعدات", "محطة الوقود" }));
        jPanel10.add(cmtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 190, 40));

        save2.setBackground(new java.awt.Color(138, 203, 195));
        save2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save2.setText("مسح");
        save2.setEnabled(false);
        save2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save2ActionPerformed(evt);
            }
        });
        jPanel10.add(save2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, 180, 50));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel9.setText("كود المعدة");
        jPanel10.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 120, 40));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nYwGq3.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        jPanel10.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 720));

        serialid.setText("jLabel1");
        jPanel10.add(serialid, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 650, -1, -1));

        serial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        serial.setForeground(new java.awt.Color(255, 255, 255));
        serial.setText("Serial");
        jPanel10.add(serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 160, 40));

        date1.setText("date");
        jPanel10.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
if(!serialid.getText().trim().isEmpty())
{
    try {
        String sql1 = "UPDATE karem.item SET type='"+cmtype.getSelectedItem().toString()+"',section='"+cmsection.getSelectedItem().toString()+"' WHERE  id = '"+serialid.getText()+"'";
        pst=(PreparedStatement) DBConnect.appcon.prepareStatement(sql1);
        pst.executeUpdate();
        tablelord();
        clear();
    } catch (SQLException ex) {
        Logger.getLogger(item.class.getName()).log(Level.SEVERE, null, ex);
    }
}
else
{
              String namee = name.getText();
               String codee = code.getText();
               String typee = cmtype.getSelectedItem().toString();
               String sectionn = cmsection.getSelectedItem().toString();
             if( !name.getText().trim().isEmpty()|| !code.getText().trim().isEmpty())
               {
                    int dialogButton = JOptionPane.YES_NO_OPTION;
                    int dialogResult = JOptionPane.showConfirmDialog(this, "هل تريد حفظ العمليه", "تاكيد العمليه", dialogButton);
                     
                    if(dialogResult == 0) {
                    try {
               
               String type = cmtype.getSelectedItem().toString();
               
               String sqll = "INSERT INTO karem.item (name,code,type,section) VALUES"
                       + " ('"+namee+"','"+codee+"','"+typee+"','"+sectionn+"')";
               pst = (PreparedStatement)DBConnect.appcon.prepareStatement(sqll);
               pst.execute();
               clear();
                tablelord();
                clear();
               JOptionPane.showMessageDialog(null, "تم اضافة المعدة");
           } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, ex);
           }
               }
                    else
         {
             JOptionPane.showMessageDialog(null, "تم الغاء العملية");
         }
               }
         else
         {
             JOptionPane.showMessageDialog(null, "ادخل الاسم");
         }
       
         
         
          

}       
                

    }//GEN-LAST:event_saveActionPerformed

    private void tdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdetailsMouseClicked
        DefaultTableModel tmodel =(DefaultTableModel)tdetails.getModel();
        //bid,name, price, publisher, book_type, b_code, date, category
        int selectrowindex=tdetails.getSelectedRow();
        serialid.setText(tmodel.getValueAt(selectrowindex, 4).toString());
        cmtype.setSelectedItem(tmodel.getValueAt(selectrowindex, 1).toString());
        cmsection.setSelectedItem(tmodel.getValueAt(selectrowindex, 0).toString());
        name.setText(tmodel.getValueAt(selectrowindex, 3).toString());
        code.setText(tmodel.getValueAt(selectrowindex, 2).toString());
        
    }//GEN-LAST:event_tdetailsMouseClicked

    private void save2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save2ActionPerformed
       if(!serialid.getText().trim().isEmpty())
       {
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "هل تريد حفظ العملية", "رسالة تاكيد ؟ ", dialogButton);
        if(dialogResult == 0) {
            try {
                String sql = " DELETE FROM karem.item WHERE id='"+serialid.getText()+"' ";
                pst=(PreparedStatement) DBConnect.appcon.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this, "تم مسح ألمعدة بنجاح");
                tablelord();
                clear();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"الغاء");
        }
       }
       else
       {
        JOptionPane.showMessageDialog(null,"من فضلك اختر المعدة");   
       }
    }//GEN-LAST:event_save2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmsection;
    private javax.swing.JComboBox cmtype;
    private javax.swing.JTextField code;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JButton save;
    private javax.swing.JButton save2;
    private javax.swing.JLabel serial;
    private javax.swing.JLabel serialid;
    private javax.swing.JTable tdetails;
    // End of variables declaration//GEN-END:variables
public void clear()
{
    name.setText(""); 
    serialid.setText(""); 
 code.setText("");
 cmtype.setSelectedIndex(0);
 cmsection.setSelectedIndex(0);
}
public void tablelord()
{
    try {
           String sqll = "SELECT * FROM karem.item";
              pst=(PreparedStatement) DBConnect.appcon.prepareStatement(sqll);
            rs=pst.executeQuery();
            DefaultTableModel model =(DefaultTableModel)tdetails.getModel(); 
                model.setRowCount(0);
              int k = 0;
                while (rs.next())
                {
                    Object row[] = {
                        rs.getString("section"),
                        rs.getString("type"),
                        rs.getString("code"),
                        rs.getString("name"),
                        rs.getString("id"),
                     };
                    model.addRow(row);
                    k++;
                }
                for(int i = k ;i<11;i++)
                {
                 Object rowData[] = {
                       "",
                     "",
                     "",
                     "",
                     "",
                     "",
                     "",
                     "",
                     "",
                     "",
                     "",
                     "",
                       };
                model.addRow(rowData);
                } 
        }
        catch (SQLException ex) {
            
        }
}
        
}
