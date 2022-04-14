/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfTable;
import com.lowagie.text.pdf.PdfWriter;
import database.koneksi;
import java.awt.Color;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class FrameControlBarang extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrameControlBarang
     */
    public FrameControlBarang() {
        initComponents();
        show_barang_inJtable();
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
    
    public ArrayList<controlBarang> getBarangList(){
    
        ArrayList<controlBarang> jenisList = new ArrayList<controlBarang>();
        String query = "SELECT barang.kode_barang, barang.nama_barang, barang.stok_minimal, barang.tanggal, barang.harga_jual, barang.harga_beli, satuan.satuan FROM barang\n" +
"JOIN satuan ON barang.id_satuan = satuan.id_satuan";
        
        Statement st;
        ResultSet rs;
        
      try{
          st = con.createStatement();
          rs = st.executeQuery(query);
          
          controlBarang Barang;
          
          while(rs.next()){
              Barang = new controlBarang(rs.getInt("kode_barang"),rs.getString("nama_barang"), rs.getString("satuan"), rs.getInt("stok_minimal"),rs.getDate("tanggal"), rs.getDouble("harga_beli"), rs.getDouble("harga_jual"));
              
              jenisList.add(Barang);
              
          }
      }catch(Exception e){
       
       e.printStackTrace();
      }
    return jenisList;
    }
    
     public void show_barang_inJtable(){
        ArrayList<controlBarang> list = getBarangList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object[] row = new Object[8];
        int angka = 1;
        for(int i=0; i < list.size(); i++){
        row[0] = angka++;
        row[1] = list.get(i).getKodeBarang();
        row[2] = list.get(i).getNamaBarang();
        row[3] = list.get(i).getSatuan();
        row[4] = list.get(i).getstokMinimal();
        row[5] = list.get(i).getTanggal();
        row[6] = list.get(i).getHargaBeli();
        row[7] = list.get(i).getHargaJual();
        
        model.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jPanel1.setPreferredSize(new java.awt.Dimension(733, 579));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Kode", "Nama Barang", "Jenis", "Total Stok", "Tanggal", "Harga Beli", "Harga Jual"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 670, 430));

        jLabel2.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DATA BARANG");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 670, 30));

        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pdf.png"))); // NOI18N
        jButton1.setText("EXPORT PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 140, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
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

//        tfKode.setEditable(false);
//
//        //menampilkan data yang di klik pada table ke dalam form
//
//        int i = jTable1.getSelectedRow();
//
//        TableModel model = jTable1.getModel();
//
//        tfKode.setText(model.getValueAt(i, 0).toString());
//        tfNamaBarang.setText(model.getValueAt(i, 1).toString());
//        cbJenis.getModel().setSelectedItem(model.getValueAt(i, 2).toString());
//        tfStokMinimal.setText(model.getValueAt(i, 3).toString());
//        tfHargaBeli.setText(model.getValueAt(i, 4).toString());
//        tfHargaJual.setText(model.getValueAt(i, 5).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String path = "";
        
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(this);
        
        if(x==JFileChooser.APPROVE_OPTION){
        path=j.getSelectedFile().getPath();
        }
        
        Document doc = new Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"laporan_barang.pdf"));
            
            doc.open();
            PdfPTable tbl = new PdfPTable(8);
            //TABLE HEADER
            tbl.addCell("NO");
            tbl.addCell("KODE");
            tbl.addCell("NAMA BARANG");
            tbl.addCell("JENIS");
            tbl.addCell("TOTAL STOK");
            tbl.addCell("TANGGAL");
            tbl.addCell("HARGA BELI");
            tbl.addCell("HARGA JUAL");
            
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                String NO = jTable1.getValueAt(i,0).toString();
                String KODE = jTable1.getValueAt(i,1).toString();
                String NAMA_BARANG = jTable1.getValueAt(i,2).toString();
                String JENIS = jTable1.getValueAt(i,3).toString();
                String TOTAL_STOK = jTable1.getValueAt(i,4).toString();
                String TANGGAL = jTable1.getValueAt(i,5).toString();
                String HARGA_BELI = jTable1.getValueAt(i,6).toString();
                String HARGA_JUAL = jTable1.getValueAt(i,7).toString();
                
                tbl.addCell(NO);
                tbl.addCell(KODE);
                tbl.addCell(NAMA_BARANG);
                tbl.addCell(JENIS);
                tbl.addCell(TOTAL_STOK);
                tbl.addCell(TANGGAL);
                tbl.addCell(HARGA_BELI);
                tbl.addCell(HARGA_JUAL);
            }
            doc.add(tbl);
            
            JOptionPane.showMessageDialog(null, "Download PDF Complete!");
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrameControlBarang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(FrameControlBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        doc.close();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
