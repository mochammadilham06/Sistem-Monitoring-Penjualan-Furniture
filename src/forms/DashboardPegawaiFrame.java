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


public class DashboardPegawaiFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form DashboardPegawaiFrame
     */
    public DashboardPegawaiFrame() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }
koneksi k = new koneksi();
Connection con = k.connection;
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        greetings1 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        title3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        title5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        title6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(690, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 54, -1, -1));

        greetings1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        getContentPane().add(greetings1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 370, 30));

        title1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        title1.setText("Meet your Team");
        getContentPane().add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 150, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        title3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        title3.setText("Rizky Nurfauzi");
        jPanel2.add(title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 100));

        jButton3.setBackground(new java.awt.Color(51, 255, 51));
        jButton3.setText("Kasir");
        jButton3.setBorderPainted(false);
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 90, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 410, 100));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        title5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        title5.setText("M Ilham Maulana");
        jPanel3.add(title5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 100));

        jButton4.setBackground(new java.awt.Color(51, 255, 51));
        jButton4.setText("Owner");
        jButton4.setBorderPainted(false);
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 90, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 410, 100));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        title6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        title6.setText("Alvio Irawan");
        jPanel4.add(title6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 100));

        jButton5.setBackground(new java.awt.Color(51, 255, 51));
        jButton5.setText("Gudang");
        jButton5.setBorderPainted(false);
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 90, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 410, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel greetings1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title5;
    private javax.swing.JLabel title6;
    // End of variables declaration//GEN-END:variables
}
