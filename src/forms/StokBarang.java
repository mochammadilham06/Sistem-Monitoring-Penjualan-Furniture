/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import database.koneksi;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Ilham Maulana
 */
public class StokBarang extends javax.swing.JInternalFrame {

    /**
     * Creates new form StokBarang
     */
    public StokBarang() {
        initComponents();
        updateCombo();
        show_ketStock_inJtable();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD,12 ));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(32,136,203));
        jTable1.getTableHeader().setForeground(new Color(255,255,255));
        jTable1.setRowHeight(25);
    }

     koneksi k = new koneksi();
    Connection con = k.connection;
     
    public ArrayList<stock> getStockList()
    {
       ArrayList<stock> stockList = new ArrayList<stock>();
       
       String query = "SELECT stok_masuk.jumlah, stok_masuk.tanggal_tambah, barang.nama_barang, barang.stok_minimal, pengguna.nama_lengkap FROM stok_masuk\n" +
"JOIN barang ON stok_masuk.id_barang= barang.kode_barang\n" +
"JOIN pengguna ON stok_masuk.id_pengguna = pengguna.id";
       
       Statement st;
       ResultSet rs;
       
       try{
           st = con.createStatement();
           rs = st.executeQuery(query);
           
           stock Stock;           
           while(rs.next()){
               
               Stock = new stock(rs.getString("nama_barang"),
                       rs.getInt("jumlah"), 
                       rs.getDate("tanggal_tambah"),
                       rs.getInt("stok_minimal"),
                       rs.getString("nama_lengkap"));
               stockList.add(Stock);
           }        
       }catch(Exception e){
           e.printStackTrace();
       }       
       return stockList;
    }
    
    
    
    public void show_ketStock_inJtable(){
        
        ArrayList<stock> list = getStockList();
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        Object[] row = new Object[6];
        int angka =1;
        for(int i=0; i < list.size(); i++){
            row[0] = angka++;
            row[1] = list.get(i).getNamaBarang();
            //row[2] = list.get(i).getTanggal();
            row[2] = list.get(i).getJumlah();
             row[3] = list.get(i).getTanggal();
             row[4] = list.get(i).getStokMinimal();
            //row[4] = list.get(i).getIdPengguna();
            //row[1] = list.get(i).getNamaBarang();
           
          
           row[5] = list.get(i).getNamaLengkap();
            model.addRow(row);
        }       
    }
    
    
    private void updateCombo(){
    String query = "SELECT * FROM barang";
    PreparedStatement ps;
    ResultSet rs;
    try{
    ps = con.prepareStatement(query);
    rs= ps.executeQuery();
    while(rs.next()){
    cbCodeBarang.addItem(rs.getString("kode_barang") + "-" + rs.getString("nama_barang"));
//    cbCodeBarang.addItem(rs.getString("kode_barang"));
    }
    
    }catch(Exception ex){
    JOptionPane.showMessageDialog(null, "Data Kosong", "Information", JOptionPane.ERROR_MESSAGE);
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
             show_ketStock_inJtable();
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
        jLabel3 = new javax.swing.JLabel();
        tfJumlah = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        cbCodeBarang = new javax.swing.JComboBox<>();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font(".SF NS Text", 0, 16)); // NOI18N
        jLabel3.setText("Kode Barang");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 110, 40));

        tfJumlah.setFont(new java.awt.Font(".SF NS Text", 0, 16)); // NOI18N
        jPanel1.add(tfJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 190, 40));

        jLabel5.setFont(new java.awt.Font(".SF NS Text", 0, 16)); // NOI18N
        jLabel5.setText("Jumlah");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama Barang", "Stok Masuk", "Tanggal", "Jumlah Total Stok", "Petugas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 650, 410));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
        jButton1.setText("Tambah Stok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 210, 40));

        cbCodeBarang.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        cbCodeBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        jPanel1.add(cbCodeBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 190, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
//        tfKodeJennus.setEditable(false);
//        int i = jTable1.getSelectedRow();
//        TableModel model = jTable1.getModel();
//        tfNo.setText(model.getValueAt(i, 0).toString());
//        tfJenis.setText(model.getValueAt(i, 1).toString());
//        tfKodeJennus.setText(model.getValueAt(i,2).toString());
//        tfKeterangan.setText(model.getValueAt(i,3).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String[]a = cbCodeBarang.getSelectedItem().toString().split("-");
//       String b = tfJenis.getText();
      
//       
//    String query = "SELECT * FROM `barang` WHERE `kode_barang`="+a[0];
//    PreparedStatement ps;
//    ResultSet rs;
//    try{
//    ps = con.prepareStatement(query);
//    rs= ps.executeQuery();
//    if(rs.next()){
//        JOptionPane.showMessageDialog(null,query);
//    }
//    
//    }catch(Exception ex){
//    JOptionPane.showMessageDialog(null, "Data Kosong", "Information", JOptionPane.ERROR_MESSAGE);
//    }
       //String id = cbCodeBarang.getSelectedItem().toString();
        String query = "INSERT INTO `stok_masuk`(`id_barang`,`jumlah`) "
                  + "VALUES ('"+a[0]+"','"+tfJumlah.getText()+"')";
          ExecuteSQLQuery(query,"Inserted");
       
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbCodeBarang;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfJumlah;
    // End of variables declaration//GEN-END:variables
}
