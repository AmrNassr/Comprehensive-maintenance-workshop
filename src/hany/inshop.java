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
public final class inshop extends javax.swing.JInternalFrame {

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
      String dayyy ;
      
      public  String usernamee=null;
     public  String typee=null;
     public  String oldneww=null;
     public  String sectionn=null;
      
      
    
   
    public inshop(String type,String username , String oldnew , String section) throws ParseException {
        initComponents();
          clear();
          typee=type;
        usernamee=username;
        oldneww=oldnew;
        sectionn=section;
         
         
         
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
         tablelord();
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
        tablelord();
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
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tdetails = new javax.swing.JTable();
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

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel20.setText("طلبات الاصلاح داخل الورشة");
        jPanel10.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 440, 60));

        tdetails.setBackground(new java.awt.Color(138, 203, 195));
        tdetails.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "المستلم", "نوع الامر", "التاريخ", "القسم", "نوع المعدة", "كود المعدة", "اسم المعدة", "الرقم التسلسلي", "id"
            }
        ));
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
            tdetails.getColumnModel().getColumn(4).setMinWidth(60);
            tdetails.getColumnModel().getColumn(4).setPreferredWidth(60);
            tdetails.getColumnModel().getColumn(4).setMaxWidth(60);
            tdetails.getColumnModel().getColumn(7).setMinWidth(100);
            tdetails.getColumnModel().getColumn(7).setPreferredWidth(100);
            tdetails.getColumnModel().getColumn(7).setMaxWidth(100);
            tdetails.getColumnModel().getColumn(8).setMinWidth(1);
            tdetails.getColumnModel().getColumn(8).setPreferredWidth(1);
            tdetails.getColumnModel().getColumn(8).setMaxWidth(1);
        }

        jPanel10.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 940, 410));

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

    private void tdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdetailsMouseClicked
        DefaultTableModel tmodel =(DefaultTableModel)tdetails.getModel();
        //bid,name, price, publisher, book_type, b_code, date, category
        int selectrowindex=tdetails.getSelectedRow();
        serialid.setText(tmodel.getValueAt(selectrowindex, 7).toString());
        
    }//GEN-LAST:event_tdetailsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel serial;
    private javax.swing.JLabel serialid;
    private javax.swing.JTable tdetails;
    // End of variables declaration//GEN-END:variables
public void clear()
{

}
public void tablelord()
{
    if(typee.equals("admin"))
    {
        try {
           String sqll = "SELECT * FROM karem.repaireorder  where statuss = 'underconstruction'  order by id";
              pst=(PreparedStatement) DBConnect.appcon.prepareStatement(sqll);
            rs=pst.executeQuery();
            DefaultTableModel model =(DefaultTableModel)tdetails.getModel(); 
                model.setRowCount(0);
              int k = 0;
                while (rs.next())
                {
                    Object row[] = {
                        rs.getString("worker"),
                        rs.getString("kind"),
                        rs.getString("datee"),
                        rs.getString("section"),
                        rs.getString("typee"),
                        rs.getString("codee"),
                        rs.getString("eqname"),
                        rs.getString("seriall"),
                        rs.getString("id"),
                     };
                    model.addRow(row);
                    k++;
                }
                for(int i = k ;i<20;i++)
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
        else
    {
    try {
           String sqll = "SELECT * FROM karem.repaireorder  where statuss = 'underconstruction' and username = '"+usernamee+"' order by id";
              pst=(PreparedStatement) DBConnect.appcon.prepareStatement(sqll);
            rs=pst.executeQuery();
            DefaultTableModel model =(DefaultTableModel)tdetails.getModel(); 
                model.setRowCount(0);
              int k = 0;
                while (rs.next())
                {
                    Object row[] = {
                        rs.getString("worker"),
                        rs.getString("kind"),
                        rs.getString("datee"),
                        rs.getString("section"),
                        rs.getString("typee"),
                        rs.getString("codee"),
                        rs.getString("eqname"),
                        rs.getString("seriall"),
                        rs.getString("id"),
                     };
                    model.addRow(row);
                    k++;
                }
                for(int i = k ;i<20;i++)
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
        
}