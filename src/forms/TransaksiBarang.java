/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import database.koneksi;
import java.awt.event.KeyEvent;
import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import javax.swing.event.DocumentEvent;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
    import java.sql.DriverManager;
     import java.sql.Connection;
     import java.sql.Statement;
     import java.sql.ResultSet;
     import java.sql.PreparedStatement;

import javax.swing.ImageIcon;

/**
 *
 * @author Ilham Maulana
 */
public class TransaksiBarang extends javax.swing.JInternalFrame {

    /**
     * Creates new form TransaksiBarang
     */
    public TransaksiBarang() {
        initComponents();
        noFaktureGenerate();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        tfTotalPembelian.setEditable(false);
        tfNomorNota.setEditable(false);
        tfKembalian.setEditable(false);
    }

    koneksi k = new koneksi();
    Connection con = k.connection;
    
    PreparedStatement ps = null;
    ResultSet rs = null;
    Object set;
   
    
    
    private void noFaktureGenerate(){
  Statement st;
  ResultSet rs;
   
    try{
    String query="select * from penjualan_header order by nomor_nota desc";
    st = con.createStatement();
    rs = st.executeQuery(query); 
    
    if(rs.next()){
        
    String nofak = rs.getString("nomor_nota").substring(1);
    String AN = "" + (Integer.parseInt(nofak) + 1);
    String Nol = "";
    if(AN.length()==1)
                {Nol = "000";}
                else if(AN.length()==2)
                {Nol = "00";}
                else if(AN.length()==3)
                {Nol = "0";}
                else if(AN.length()==4)
                {Nol = "";}
    tfNomorNota.setText("F" + Nol + AN);
        
    }else {
               tfNomorNota.setText("F0001");
            }
        }catch(Exception ex){
        ex.printStackTrace();
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListBarang = new javax.swing.JTable();
        tfNomorNota = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfTotalPembelian = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfKode = new javax.swing.JTextField();
        tfKembalian = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfBayar = new javax.swing.JTextField();
        tfSubTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfHarga = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfQty = new javax.swing.JSpinner();
        tfNamaBarang = new javax.swing.JTextField();
        btnCetak = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        jLabel1.setText("Total Pembelian (Rp)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, -1, -1));

        jLabel2.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        jLabel2.setText("Nama Barang");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        jLabel3.setText("Sub Total");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 70, -1));

        btnTambah.setFont(new java.awt.Font(".SF NS Text", 0, 12)); // NOI18N
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.setToolTipText("");
        btnTambah.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        jPanel1.add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 120, 50));

        btnBatal.setFont(new java.awt.Font(".SF NS Text", 0, 12)); // NOI18N
        btnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-reset.png"))); // NOI18N
        btnBatal.setText("Refresh");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        jPanel1.add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 120, 50));

        btnHapus.setFont(new java.awt.Font(".SF NS Text", 0, 12)); // NOI18N
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 120, 50));

        tblListBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Barang", "Harga", "Qty", "Sub Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblListBarang);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 380, 180));

        tfNomorNota.setBackground(new java.awt.Color(52, 132, 103));
        tfNomorNota.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        tfNomorNota.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tfNomorNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 130, 28));

        jLabel4.setFont(new java.awt.Font(".SF NS Text", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TRANSAKSI PENJUALAN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 670, 30));

        tfTotalPembelian.setBackground(new java.awt.Color(240, 240, 240));
        tfTotalPembelian.setFont(new java.awt.Font(".SF NS Text", 1, 36)); // NOI18N
        tfTotalPembelian.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfTotalPembelian.setText("0");
        jPanel1.add(tfTotalPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 240, 100));

        jLabel5.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        jLabel5.setText("Kembali");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, -1, 30));

        tfKode.setBackground(new java.awt.Color(52, 132, 103));
        tfKode.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        tfKode.setForeground(new java.awt.Color(255, 255, 255));
        tfKode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfKodeKeyPressed(evt);
            }
        });
        jPanel1.add(tfKode, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 170, 30));

        tfKembalian.setBackground(new java.awt.Color(240, 240, 240));
        tfKembalian.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        tfKembalian.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(tfKembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 100, 30));

        jLabel6.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        jLabel6.setText("Quantity");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 70, -1));

        tfBayar.setBackground(new java.awt.Color(240, 240, 240));
        tfBayar.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        tfBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBayarActionPerformed(evt);
            }
        });
        tfBayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfBayarKeyPressed(evt);
            }
        });
        jPanel1.add(tfBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 100, 30));

        tfSubTotal.setEditable(false);
        tfSubTotal.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        jPanel1.add(tfSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 240, 30));

        jLabel7.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        jLabel7.setText("Kode Barang");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 30));

        jLabel8.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        jLabel8.setText("Uang Bayar");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 439, -1, 30));

        tfHarga.setEditable(false);
        tfHarga.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        tfHarga.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(tfHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 150, 30));

        jLabel9.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        jLabel9.setText("Harga");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        tfQty.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tfQtyStateChanged(evt);
            }
        });
        jPanel1.add(tfQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 70, 30));

        tfNamaBarang.setBackground(new java.awt.Color(240, 240, 240));
        tfNamaBarang.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        jPanel1.add(tfNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 240, 30));

        btnCetak.setBackground(new java.awt.Color(52, 132, 103));
        btnCetak.setFont(new java.awt.Font(".SF NS Text", 0, 18)); // NOI18N
        btnCetak.setForeground(new java.awt.Color(255, 255, 255));
        btnCetak.setText("Cetak Faktur");
        btnCetak.setBorderPainted(false);
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });
        jPanel1.add(btnCetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 360, 50));

        jLabel10.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        jLabel10.setText("Nomor Faktur");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        if(tfKode.getText().trim().equals("") ){
            JOptionPane.showMessageDialog(this, "Tidak Dapat Ditambahkan, Silahkan Masukan Kode Barang","Pesan Error",
                JOptionPane.ERROR_MESSAGE);
        }else{
            DefaultTableModel model = new DefaultTableModel();

            model = (DefaultTableModel)tblListBarang.getModel();

            model.addRow(new Object[]{

                //tfKode.getText(),
                tfNamaBarang.getText(),
                tfHarga.getText(),
                tfQty.getValue().toString(),
                tfSubTotal.getText(),

            });

            int total=0;
            for(int i=0; i<tblListBarang.getRowCount(); i++){

                total = total + Integer.parseInt(tblListBarang.getValueAt(i, 3).toString());

            }

            tfTotalPembelian.setText(Integer.toString(total));

            tfKode.setText("");
            tfNamaBarang.setText("");
            tfHarga.setText("");
            tfSubTotal.setText("");
            tfKode.requestFocus();
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        //Kembalian();
        DefaultTableModel model = (DefaultTableModel)tblListBarang.getModel();
        model.setRowCount(0);

        tfTotalPembelian.setText("0");

    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblListBarang.getModel();

        if(tblListBarang.getSelectedRow() == -1){
            if(tblListBarang.getSelectedRow() == 0){
                JOptionPane.showMessageDialog(this, "List Barang Kosong Tidak Dapat Dihapus","Pesan Error",
                    JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Silahkan Pilih Barang Yang Akan Dihapus","Pesan Error",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            //hapus data pada list barang
            model.removeRow(tblListBarang.getSelectedRow());

            //ubah total pembelian
            int total=0;
            for(int i=0; i<tblListBarang.getRowCount(); i++){

                total = total + Integer.parseInt(tblListBarang.getValueAt(i, 3).toString());

            }

            tfTotalPembelian.setText(Integer.toString(total));

        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tfKodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfKodeKeyPressed
        // TODO add your handling code here:

        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            String kodeBarang = tfKode.getText();

            try {

                String sql = "SELECT  * FROM barang WHERE kode_barang = ?";

                ps = con.prepareStatement(sql);
                ps.setString(1, kodeBarang);

                rs = ps.executeQuery();

                if(rs.next() == false){
                    JOptionPane.showMessageDialog(this, "Barang Tidak Tersedia");
                }else{
                    String namaBarang = rs.getString("nama_barang");
                    String harga = rs.getString("harga_jual");

                    tfNamaBarang.setText(namaBarang);
                    tfHarga.setText(harga);

                }

            }  catch (SQLException ex) {
                Logger.getLogger(TransaksiBarang.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_tfKodeKeyPressed
 public void Kembalian(){

        int total = Integer.parseInt(tfTotalPembelian.getText().toString());
        int bayar = Integer.parseInt(tfBayar.getText());
        int kembalian = bayar - total;
        
        tfKembalian.setText(String.valueOf(kembalian));
    
    }
    private void tfBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBayarActionPerformed
        // TODO add your handling code here:
        Kembalian();
    }//GEN-LAST:event_tfBayarActionPerformed

    private void tfBayarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBayarKeyPressed
        //        Kembalian();
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

          int bayar = Integer.parseInt(tfBayar.getText());
          int total = Integer.parseInt(tfTotalPembelian.getText());

            try {
               if(bayar<total){ 
               JOptionPane.showMessageDialog(null, "Uang bayar kurang", "Information", JOptionPane.ERROR_MESSAGE);
               tfBayar.setText("");
               tfKembalian.setText("");
               
               }
            }  catch (Exception ex) {
                Logger.getLogger(TransaksiBarang.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_tfBayarKeyPressed

   
    private void tfQtyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tfQtyStateChanged
        
        int qty = Integer.parseInt(tfQty.getValue().toString());
        int harga = Integer.parseInt(tfHarga.getText());
        try{
            if(qty>=0){
            int subTotal = qty * harga;

        tfSubTotal.setText(String.valueOf(subTotal));
            }else{            
//            JOptionPane.showMessageDialog(null, "Tidak dapat melakukan Input Transaksi", "Information",JOptionPane.ERROR_MESSAGE);
           tfQty.setValue(0);
            }
        }catch(Exception ex){
        ex.printStackTrace();
        }
        
    }//GEN-LAST:event_tfQtyStateChanged
public void simpanTransaksi(String query)
    {
        Statement st;
         ImageIcon iconSucceed = new ImageIcon("src/images/checked.png");
         ImageIcon iconFailed = new ImageIcon("src/images/remove.png");
        
        try{
           st = con.createStatement();
           
           if(st.executeUpdate(query) == 1){
                                   
                int jawab;

                jawab = JOptionPane.showOptionDialog(null, "Cetak Faktur Transaksi?", "", 
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

                if(jawab == JOptionPane.YES_OPTION){
                     JOptionPane.showMessageDialog(null, "Cetak Faktur Berhasil ", "Information", JOptionPane.INFORMATION_MESSAGE, iconSucceed);
                    
                }               
           }
           else{
               JOptionPane.showMessageDialog(null, "Transaksi tidak dapat disimpan");           
           }
                 
       }catch(Exception e){
           e.printStackTrace();
       }        
    }    
    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
      

        String tanggal = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
        //System.out.println(tanggal);
        int id = Integer.parseInt(tfKode.getText());
        int value = (Integer)tfQty.getValue();
        String nomorNota = tfNomorNota.getText();
        double grandTotal = Double.parseDouble(tfTotalPembelian.getText());
        double bayar = Double.parseDouble(tfBayar.getText());
        String jenisBayar = "Cash";
        int id_pengguna=1;

        String query = "INSERT INTO `penjualan_header`(`nomor_nota`, `id_barang`, `tanggal`, `qty`, `grand_total`, `bayar`, `jenis_pembayaran`, `id_pengguna`) "
                + "VALUES ('"+nomorNota+"','"+id+"','"+tanggal+"','"+value+"','"+grandTotal+"','"+bayar+"','"+jenisBayar+"','"+id_pengguna+"')";
        simpanTransaksi(query);
    }//GEN-LAST:event_btnCetakActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListBarang;
    private javax.swing.JTextField tfBayar;
    private javax.swing.JTextField tfHarga;
    private javax.swing.JTextField tfKembalian;
    private javax.swing.JTextField tfKode;
    private javax.swing.JTextField tfNamaBarang;
    private javax.swing.JTextField tfNomorNota;
    private javax.swing.JSpinner tfQty;
    private javax.swing.JTextField tfSubTotal;
    private javax.swing.JTextField tfTotalPembelian;
    // End of variables declaration//GEN-END:variables
}
