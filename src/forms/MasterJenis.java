/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import database.koneksi;
import java.awt.Color;
import java.awt.Font;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author lanz1
 */
public class MasterJenis extends javax.swing.JInternalFrame {

    /**
     * Creates new form MasterBarang
     */
    public MasterJenis() {
        initComponents();
        show_jenis_inJtable();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD,12 ));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(32,136,203));
        jTable1.getTableHeader().setForeground(new Color(255,255,255));
        jTable1.setRowHeight(25);
        tfNo.setEditable(false);
    }

    koneksi k = new koneksi();
    Connection con = k.connection;
    
    public ArrayList<jenis> getJenisList(){
    
        ArrayList<jenis> jenisList = new ArrayList<jenis>();
        String query = "SELECT * FROM satuan WHERE dihapus='tidak'";
        
        Statement st;
        ResultSet rs;
        
      try{
          st = con.createStatement();
          rs = st.executeQuery(query);
          
          jenis Jenis;
          
          while(rs.next()){
              Jenis = new jenis(rs.getString("satuan"),rs.getString("keterangan"), rs.getInt("kode_satuan"));
              jenisList.add(Jenis);
              
          }
      }catch(Exception e){
       
       e.printStackTrace();
      }
    return jenisList;
    }
    
    public void show_jenis_inJtable(){
        ArrayList<jenis> list = getJenisList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object[] row = new Object[4];
        int angka = 1;
        for(int i=0; i < list.size(); i++){
        row[0] = angka++;
        row[1] = list.get(i).getKodeSatuan();
        row[2] = list.get(i).getSatuan();
        row[3] = list.get(i).getKeterangan();
        
        model.addRow(row);
        }
    }
    
    
    public void ExecuteSQLQuery(String query, String message){
    
        Statement st;
        
        try{
        st = con.createStatement();
        ImageIcon iconSucceed = new ImageIcon("src/images/checked.png");
        ImageIcon iconFailed = new ImageIcon("src/images/remove.png");
         if(st.executeUpdate(query) == 1){
             //refresh table data
             DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
             model.setRowCount(0);
             show_jenis_inJtable();
             
             JOptionPane.showMessageDialog(null, "Data " +message+" Succesfully", "Information", JOptionPane.INFORMATION_MESSAGE, iconSucceed);
             
        }else{
             JOptionPane.showMessageDialog(null, "Data Not " +message, "Information", JOptionPane.INFORMATION_MESSAGE, iconFailed);
         }
        }catch(Exception e){
        e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        tfNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfJenis = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfKodeJenis = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfKeterangan = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setPreferredSize(new java.awt.Dimension(690, 560));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Kelola Jenis Barang");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 670, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-reset.png"))); // NOI18N
        jButton1.setText("Cencel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 110, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
        jButton2.setText("Tambah");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 110, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 110, 40));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jButton4.setText("Hapus");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 110, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Kode Jenis", "Jenis", "Keterangan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jTable1.setShowGrid(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 630, 210));

        jLabel3.setFont(new java.awt.Font(".SF NS Text", 0, 16)); // NOI18N
        jLabel3.setText("No");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 40));

        tfNo.setFont(new java.awt.Font(".SF NS Text", 0, 16)); // NOI18N
        jPanel1.add(tfNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 190, 40));

        jLabel5.setFont(new java.awt.Font(".SF NS Text", 0, 16)); // NOI18N
        jLabel5.setText("Jenis");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, 40));

        tfJenis.setFont(new java.awt.Font(".SF NS Text", 0, 16)); // NOI18N
        jPanel1.add(tfJenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 190, 40));

        jLabel4.setFont(new java.awt.Font(".SF NS Text", 0, 16)); // NOI18N
        jLabel4.setText("Kode Jenis");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 100, 40));

        tfKodeJenis.setFont(new java.awt.Font(".SF NS Text", 0, 16)); // NOI18N
        jPanel1.add(tfKodeJenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 190, 40));

        tfKeterangan.setColumns(20);
        tfKeterangan.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        tfKeterangan.setRows(5);
        jScrollPane1.setViewportView(tfKeterangan);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 270, 100));

        jLabel1.setFont(new java.awt.Font(".SF NS Text", 0, 16)); // NOI18N
        jLabel1.setText("Keterangan");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 110, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         tfKodeJenis.setEditable(false);
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        tfNo.setText(model.getValueAt(i, 0).toString());
        tfJenis.setText(model.getValueAt(i, 2).toString());
        tfKodeJenis.setText(model.getValueAt(i,1).toString());
        tfKeterangan.setText(model.getValueAt(i,3).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String kode = tfKodeJenis.getText();
        
        if(kode == null){
         JOptionPane.showMessageDialog(this, "Data Kosong ! Silahkan isi terlebih dahulu","Pesan Error",
         JOptionPane.ERROR_MESSAGE);
        }else{
         String query = "INSERT INTO `satuan`(`kode_satuan`,`satuan`, `keterangan`,`dihapus`) "
                  + "VALUES ('"+tfKodeJenis.getText()+"','"+tfJenis.getText()+"','"+tfKeterangan.getText()+"','tidak')";
          ExecuteSQLQuery(query,"Inserted");
        tfNo.setText("");
        tfKodeJenis.setText("");
        tfKeterangan.setText("");
        tfJenis.setText("");
        tfKodeJenis.setEditable(true);
}        
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(jTable1.getSelectedRow()>-1){
        String query ="UPDATE `satuan` SET `satuan`='"+tfJenis.getText()+"',`keterangan`='"+tfKeterangan.getText()+"' WHERE `kode_satuan`="+tfKodeJenis.getText();
        ExecuteSQLQuery(query,"Updated");
       tfNo.setText("");
        tfJenis.setText("");
        tfKeterangan.setText("");
        tfKodeJenis.setText("");
        tfKodeJenis.setEditable(true);
        }else{
         JOptionPane.showMessageDialog(this, "Silahkan Pilih Barang Yang Akan di Ubah","Pesan Error",
         JOptionPane.ERROR_MESSAGE);
        }
         
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        if(jTable1.getSelectedRow()>0){
        int pilih = JOptionPane.showConfirmDialog(null, "Yakin ingin dihapus?", "Confirm",  JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(pilih == JOptionPane.OK_OPTION){
        String query = "DELETE FROM `satuan` WHERE `kode_satuan` ="+tfKodeJenis.getText();
          ExecuteSQLQuery(query,"Deleted");
          
          
        tfNo.setText("");
        tfJenis.setText("");
        tfKeterangan.setText("");
        tfKodeJenis.setText("");
        tfKodeJenis.setEditable(true);
        }   
        }else{
                JOptionPane.showMessageDialog(this, "Silahkan Pilih Barang Yang Akan Dihapus","Pesan Error",
                    JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       tfNo.setText("");
        tfJenis.setText("");
        tfKeterangan.setText("");
        tfKodeJenis.setText("");
        tfKodeJenis.setEditable(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfJenis;
    private javax.swing.JTextArea tfKeterangan;
    private javax.swing.JTextField tfKodeJenis;
    private javax.swing.JTextField tfNo;
    // End of variables declaration//GEN-END:variables
}
