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
public class KelolaPengguna extends javax.swing.JInternalFrame {

    /**
     * Creates new form KelolaPengguna
     */
    public KelolaPengguna() {
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
    
    public ArrayList<pengguna> getPenggunaList(){
    
        ArrayList<pengguna> penggunaList = new ArrayList<pengguna>();
        String query = "SELECT * FROM `pengguna` WHERE id=id";
        
        Statement st;
        ResultSet rs;
        
      try{
          st = con.createStatement();
          rs = st.executeQuery(query);
          
          pengguna Pengguna;
          
          while(rs.next()){
              Pengguna = new pengguna(rs.getString("nama_lengkap"),rs.getString("alamat"), rs.getString("no_telp"));
              penggunaList.add(Pengguna);
              
          }
      }catch(Exception e){
       
       e.printStackTrace();
      }
    return penggunaList;
    }
    
    public void show_jenis_inJtable(){
        ArrayList<pengguna> list = getPenggunaList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object[] row = new Object[4];
        int angka = 1;
        for(int i=0; i < list.size(); i++){
        row[0] = angka++;
//        row[1] = list.get(i).getKode();
        row[1] = list.get(i).getNama();
        row[2] = list.get(i).getAlamat();
        row[3] = list.get(i).getNomor();
        
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        tfNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfAlamat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfNomorTelepon1 = new javax.swing.JTextField();

        jPanel1.setPreferredSize(new java.awt.Dimension(690, 560));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Kelola Pengguna");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 670, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama Lengkap", "Alamat", "Nomor"
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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 630, 310));

        jLabel3.setFont(new java.awt.Font(".SF NS Text", 0, 16)); // NOI18N
        jLabel3.setText("No");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 40));

        tfNo.setFont(new java.awt.Font(".SF NS Text", 0, 16)); // NOI18N
        jPanel1.add(tfNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 190, 40));

        jLabel5.setFont(new java.awt.Font(".SF NS Text", 0, 16)); // NOI18N
        jLabel5.setText("Nama");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, 40));

        tfNama.setFont(new java.awt.Font(".SF NS Text", 0, 16)); // NOI18N
        jPanel1.add(tfNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 190, 40));

        jLabel6.setFont(new java.awt.Font(".SF NS Text", 0, 16)); // NOI18N
        jLabel6.setText("Alamat");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 60, 40));

        tfAlamat.setFont(new java.awt.Font(".SF NS Text", 0, 16)); // NOI18N
        jPanel1.add(tfAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 190, 40));

        jLabel7.setFont(new java.awt.Font(".SF NS Text", 0, 16)); // NOI18N
        jLabel7.setText("Nomor Telepon");
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 110, 40));

        tfNomorTelepon1.setFont(new java.awt.Font(".SF NS Text", 0, 16)); // NOI18N
        jPanel1.add(tfNomorTelepon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 190, 40));

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
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        tfNo.setText(model.getValueAt(i, 0).toString());
        tfNama.setText(model.getValueAt(i, 1).toString());
        tfAlamat.setText(model.getValueAt(i,2).toString());
        tfNomorTelepon1.setText(model.getValueAt(i,3).toString());

    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfAlamat;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNo;
    private javax.swing.JTextField tfNomorTelepon1;
    // End of variables declaration//GEN-END:variables
}
