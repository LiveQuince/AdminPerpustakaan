/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.adminperpus;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class KembalikanBuku extends javax.swing.JFrame {  
    /**
     * Creates new form KembalikanBuku
     */
    public KembalikanBuku() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Kembalikan = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("LIST BUKU");

        Kembalikan.setBackground(new java.awt.Color(0, 204, 204));
        Kembalikan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Kembalikan.setText("KEMBALIKAN");
        Kembalikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembalikanActionPerformed(evt);
            }
        });

        Keluar.setBackground(new java.awt.Color(0, 204, 204));
        Keluar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Keluar.setText("KEMBALI");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("MUNCULKAN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("MUNCULKAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 389, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(Keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Kembalikan)
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jComboBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Kembalikan)
                    .addComponent(Keluar))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KembalikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembalikanActionPerformed
        try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/perpustakaantercinta?useSSL=false", "root", "");

    // Get the selected book title from jComboBox3
    String selectedJudulBuku = jComboBox3.getSelectedItem().toString();

    // Retrieve "id_buku" for the selected book title
    String selectIdBukuSql = "SELECT id_buku FROM buku WHERE judul_buku = ?";
    PreparedStatement selectIdBukuStatement = con.prepareStatement(selectIdBukuSql);
    selectIdBukuStatement.setString(1, selectedJudulBuku);
    ResultSet idBukuResultSet = selectIdBukuStatement.executeQuery();

    if (idBukuResultSet.next()) {
        // Get "id_buku" from the result set
        int selectedIdBuku = idBukuResultSet.getInt("id_buku");

        // Retrieve "tanggal_kembali" from peminjaman for the selected book
        String selectTanggalKembaliSql = "SELECT tanggal_kembali FROM peminjaman WHERE id_buku = ?";
        PreparedStatement selectTanggalKembaliStatement = con.prepareStatement(selectTanggalKembaliSql);
        selectTanggalKembaliStatement.setInt(1, selectedIdBuku);
        ResultSet tanggalKembaliResultSet = selectTanggalKembaliStatement.executeQuery();

        if (tanggalKembaliResultSet.next()) {
            // Get "tanggal_kembali" from the result set
            LocalDate tanggalKembali = tanggalKembaliResultSet.getDate("tanggal_kembali").toLocalDate();

            // Get the current date
            LocalDate currentDate = LocalDate.now();

            // Calculate the difference in days
            long daysDifference = tanggalKembali.until(currentDate).getDays();

            // Calculate the fine (assuming 3000 dollars per day)
            long fineAmount = daysDifference * 3000;

            // Show a dialog with the fine amount if it's greater than 0
            if (fineAmount > 0) {
                String message = "Denda yang harus dibayar adalah: Rp." + fineAmount;
                JOptionPane.showMessageDialog(this, message, "Denda Telat", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Show a dialog if no fine is applicable
                JOptionPane.showMessageDialog(this, "Tidak ada denda", "Denda Telat", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            // Handle the case where "tanggal_kembali" is not found
            JOptionPane.showMessageDialog(this, "Tanggal Kembali not found", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Close resources
        tanggalKembaliResultSet.close();
        selectTanggalKembaliStatement.close();
    } else {
        // Handle the case where "id_buku" is not found
        JOptionPane.showMessageDialog(this, "ID Buku not found", "Error", JOptionPane.ERROR_MESSAGE);
    }

    idBukuResultSet.close();
    selectIdBukuStatement.close();
    con.close();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_KembalikanActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
    HalamanAwal awal = new HalamanAwal();
    awal.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_KeluarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String selectedNamaAnggota = jComboBox2.getSelectedItem().toString();
        jComboBox3.removeAllItems();
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/perpustakaantercinta?useSSL=false", "root", "");
        String getIdAnggotaSql = "SELECT id_anggota FROM anggota WHERE nama_anggota = ?";
        PreparedStatement getIdAnggotaStatement = con.prepareStatement(getIdAnggotaSql);
        getIdAnggotaStatement.setString(1, selectedNamaAnggota);
        ResultSet idAnggotaResultSet = getIdAnggotaStatement.executeQuery();

        if (idAnggotaResultSet.next()) {
            int idAnggota = idAnggotaResultSet.getInt("id_anggota");

            String selectIdBukuSql = "SELECT id_buku FROM peminjaman WHERE id_anggota = ?";
            PreparedStatement selectIdBukuStatement = con.prepareStatement(selectIdBukuSql);
            selectIdBukuStatement.setInt(1, idAnggota);
            ResultSet idBukuResultSet = selectIdBukuStatement.executeQuery();

            while (idBukuResultSet.next()) {
                int idBuku = idBukuResultSet.getInt("id_buku");

                // Select judul_buku from buku based on the id_buku from peminjaman
                String selectJudulBukuSql = "SELECT judul_buku FROM buku WHERE id_buku = ?";
                PreparedStatement selectJudulBukuStatement = con.prepareStatement(selectJudulBukuSql);
                selectJudulBukuStatement.setInt(1, idBuku);
                ResultSet judulBukuResultSet = selectJudulBukuStatement.executeQuery();

                while (judulBukuResultSet.next()) {
                    String judulBuku = judulBukuResultSet.getString("judul_buku");
                    jComboBox3.addItem(judulBuku);
                }

                selectJudulBukuStatement.close();
            }

            idBukuResultSet.close();
            selectIdBukuStatement.close();
        }

        idAnggotaResultSet.close();
        getIdAnggotaStatement.close();
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/perpustakaantercinta?useSSL=false","root","");
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("select nama_anggota from anggota");
        while(rs.next()){
            String nama = rs.getString("nama_anggota");
            jComboBox2.addItem(nama);
        }
        con.close();
    }catch(Exception e){
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(KembalikanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KembalikanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KembalikanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KembalikanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KembalikanBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Keluar;
    private javax.swing.JButton Kembalikan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
