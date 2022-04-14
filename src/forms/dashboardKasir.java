/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import login.loginForm;

/**
 *
 * @author lanz1
 */
public class dashboardKasir extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    
    Color defaultColor, clickedColor;
     Color penDefault, penEnter, penClick, fontColorClicked,fontColorDefault;
    
    public dashboardKasir() {
        initComponents();
        
        defaultColor = new Color(19,47,37);
        clickedColor = new Color(52,132,103);
      
        penDefault = new Color(255,255,255);
        fontColorDefault = new Color(52,132,103);
        penEnter = new Color(52,132,103);
        fontColorClicked = new Color(255,255,255);
        penClick = new Color(52, 132, 103);
        
        jPanelLogout.setBackground(penDefault);
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
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        detailMenu = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        menuTransaksi = new javax.swing.JPanel();
        label_1 = new javax.swing.JLabel();
        menuDashboard = new javax.swing.JPanel();
        label_2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        label_3 = new javax.swing.JLabel();
        jPanelLogout = new javax.swing.JPanel();
        textLogout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(940, 601));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(733, 579));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 690, 560));

        jPanel3.setBackground(new java.awt.Color(52, 132, 103));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-close_window.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, -1, -1));

        detailMenu.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        detailMenu.setForeground(new java.awt.Color(255, 255, 255));
        detailMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dashboard.png"))); // NOI18N
        detailMenu.setText("Home");
        jPanel3.add(detailMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 40));

        jPanel2.setBackground(new java.awt.Color(19, 47, 37));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuTransaksi.setBackground(new java.awt.Color(19, 47, 37));
        menuTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTransaksiMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuTransaksiMousePressed(evt);
            }
        });

        label_1.setBackground(new java.awt.Color(13, 36, 51));
        label_1.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        label_1.setForeground(new java.awt.Color(255, 255, 255));
        label_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transaksi.png"))); // NOI18N
        label_1.setText("Transaksi Penjualan");

        javax.swing.GroupLayout menuTransaksiLayout = new javax.swing.GroupLayout(menuTransaksi);
        menuTransaksi.setLayout(menuTransaksiLayout);
        menuTransaksiLayout.setHorizontalGroup(
            menuTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuTransaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        menuTransaksiLayout.setVerticalGroup(
            menuTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.add(menuTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 250, 60));

        menuDashboard.setBackground(new java.awt.Color(19, 47, 37));
        menuDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDashboardMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuDashboardMousePressed(evt);
            }
        });

        label_2.setBackground(new java.awt.Color(13, 36, 51));
        label_2.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        label_2.setForeground(new java.awt.Color(255, 255, 255));
        label_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dashboardmenu.png"))); // NOI18N
        label_2.setText("Dashboard");

        javax.swing.GroupLayout menuDashboardLayout = new javax.swing.GroupLayout(menuDashboard);
        menuDashboard.setLayout(menuDashboardLayout);
        menuDashboardLayout.setHorizontalGroup(
            menuDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        menuDashboardLayout.setVerticalGroup(
            menuDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.add(menuDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 250, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        label_3.setBackground(new java.awt.Color(13, 36, 51));
        label_3.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        label_3.setForeground(new java.awt.Color(255, 255, 255));
        label_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_3.setText("Rizky Nurfauzi");
        jPanel2.add(label_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 90, 230, 30));

        jPanelLogout.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelLogoutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelLogoutMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelLogoutMouseReleased(evt);
            }
        });

        textLogout.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        textLogout.setForeground(new java.awt.Color(52, 132, 103));
        textLogout.setText("Logout");

        javax.swing.GroupLayout jPanelLogoutLayout = new javax.swing.GroupLayout(jPanelLogout);
        jPanelLogout.setLayout(jPanelLogoutLayout);
        jPanelLogoutLayout.setHorizontalGroup(
            jPanelLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogoutLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(textLogout)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanelLogoutLayout.setVerticalGroup(
            jPanelLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanelLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 230, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 250, 560));

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

        setSize(new java.awt.Dimension(940, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void menuTransaksiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTransaksiMousePressed
        // TODO add your handling code here:

        menuTransaksi.setBackground(clickedColor);

        menuDashboard.setBackground(defaultColor);
        detailMenu.setText("Transaksi Penjualan");
    }//GEN-LAST:event_menuTransaksiMousePressed

    private void menuDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDashboardMouseClicked
        // TODO add your handling code here:
        DashboardPegawaiFrame frame = new DashboardPegawaiFrame();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(frame).setVisible(true);
    }//GEN-LAST:event_menuDashboardMouseClicked

    private void menuDashboardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDashboardMousePressed
        // TODO add your handling code here:
        menuDashboard.setBackground(clickedColor);
        menuTransaksi.setBackground(defaultColor);
        detailMenu.setText("Dashboard");
    }//GEN-LAST:event_menuDashboardMousePressed

    private void jPanelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLogoutMouseClicked
        // TODO add your handling code here:

        loginForm login = new loginForm();
        ImageIcon icon = new ImageIcon("src/images/logout.png");
        int pilih = JOptionPane.showConfirmDialog(null, "Yakin ingin keluar?" ,"Logout",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
        if (pilih == JOptionPane.OK_OPTION){
            login.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.getRootFrame();
        }
    }//GEN-LAST:event_jPanelLogoutMouseClicked

    private void jPanelLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLogoutMouseEntered
        // TODO add your handling code here:

        jPanelLogout.setBackground(penEnter);
        textLogout.setForeground(penDefault);
    }//GEN-LAST:event_jPanelLogoutMouseEntered

    private void jPanelLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLogoutMouseExited
        // TODO add your handling code here:
        jPanelLogout.setBackground(penDefault);
        textLogout.setForeground(fontColorDefault);
    }//GEN-LAST:event_jPanelLogoutMouseExited

    private void jPanelLogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLogoutMousePressed
        // TODO add your handling code here:
        jPanelLogout.setBackground(penDefault);
        textLogout.setForeground(clickedColor);
    }//GEN-LAST:event_jPanelLogoutMousePressed

    private void jPanelLogoutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLogoutMouseReleased

        jPanelLogout.setBackground(penEnter);
        textLogout.setForeground(penDefault);
    }//GEN-LAST:event_jPanelLogoutMouseReleased

    private void menuTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTransaksiMouseClicked
//     TransaksiPenjualan frame = new TransaksiPenjualan();
//     jDesktopPane1.removeAll();
//     jDesktopPane1.add(frame).setVisible(true);
TransaksiBarang frame = new TransaksiBarang();
jDesktopPane1.removeAll();
jDesktopPane1.add(frame).setVisible(true);
//JOptionPane.showMessageDialog(null,"Dalam tahap pengembangan","Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuTransaksiMouseClicked

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
            java.util.logging.Logger.getLogger(dashboardKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboardKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboardKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboardKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboardKasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel detailMenu;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelLogout;
    private javax.swing.JLabel label_1;
    private javax.swing.JLabel label_2;
    private javax.swing.JLabel label_3;
    private javax.swing.JPanel menuDashboard;
    private javax.swing.JPanel menuTransaksi;
    private javax.swing.JLabel textLogout;
    // End of variables declaration//GEN-END:variables
}
