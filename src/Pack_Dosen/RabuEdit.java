/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack_Dosen;
import Packages_Log_Database.Kelas_Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NANO
 */
public class RabuEdit extends javax.swing.JDialog {

    /**
     * Creates new form SeninEdit
     */
    Connection con = Kelas_Database.Koneksi();

    public RabuEdit(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ImageIcon icon = new ImageIcon("src/Gambar/Logo USD.png");
        setIconImage(icon.getImage());
    }
    public void bersi() {
        PilihJam.setText("");
        Basdat_Atextfild.setText("");
        BasDat_Btextfild.setText("");
        BasDat_Ctextfild.setText("");
        Jarkom_Atextfild.setText("");
        Jarkom_Btextfild.setText("");
        Jarkom_Ctextfild.setText("");
    }

    private void tampilJadwalRabu() {
        DefaultTableModel tabelnya = new DefaultTableModel();
        tabelnya.addColumn("JAM");
        tabelnya.addColumn("Lab BasDat A");
        tabelnya.addColumn("Lab BasDat B");
        tabelnya.addColumn("Lab BasDat C");
        tabelnya.addColumn("Lab JarKom A");
        tabelnya.addColumn("Lab JarKom B");
        tabelnya.addColumn("Lab JarKom C");
        try {
            String query = "select * from rabu";
            PreparedStatement pst = Kelas_Database.Koneksi().prepareStatement(query);
            ResultSet rset;
            rset = pst.executeQuery();
            while (rset.next()) {
                tabelnya.addRow(new Object[]{
                    rset.getString(1),
                    rset.getString(2),
                    rset.getString(3),
                    rset.getString(4),
                    rset.getString(5),
                    rset.getString(6),
                    rset.getString(7),});
            }
            TabelJadwal.setModel(tabelnya);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ada kesalahan !");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelJadwal = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        Basdat_Atextfild = new javax.swing.JTextField();
        BasDat_Btextfild = new javax.swing.JTextField();
        BasDat_Ctextfild = new javax.swing.JTextField();
        Jarkom_Atextfild = new javax.swing.JTextField();
        Jarkom_Btextfild = new javax.swing.JTextField();
        Jarkom_Ctextfild = new javax.swing.JTextField();
        SimpanButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        TampilkanButton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        HapusButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        LihatButton = new javax.swing.JButton();
        PilihJam = new javax.swing.JTextField();
        BackButton = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jTextField1.setText("jTextField1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/UNIVSADARD COM.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pilih Jam");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Lab Basis Data A");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lab Basis Data B");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Lab Basis Data C");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Lab Jaringan Komputer C");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Lab Jaringan Komputer B");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Lab Jaringan Komputer A");

        TabelJadwal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));
        TabelJadwal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TabelJadwal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "JAM", "LAB BasDat A", "LAB BasDat B", "LAB BasDat C", "LAB JarKom A", "LAB JarKom B", "LAB JarKom C"
            }
        ));
        jScrollPane1.setViewportView(TabelJadwal);

        jLabel18.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Edit Pengguna Laboratorium Hari Rabu");

        SimpanButton.setText("Simpan");
        SimpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Batal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        TampilkanButton.setText("Show All");
        TampilkanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TampilkanButtonActionPerformed(evt);
            }
        });

        jButton5.setText("Tambahkan Jam");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        HapusButton.setText("Hapus Jam");
        HapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusButtonActionPerformed(evt);
            }
        });

        EditButton.setText("Edit");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        LihatButton.setText("Lihat");
        LihatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LihatButtonActionPerformed(evt);
            }
        });

        PilihJam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PilihJamActionPerformed(evt);
            }
        });

        BackButton.setBackground(new java.awt.Color(51, 0, 0));
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/back,,.png"))); // NOI18N
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BasDat_Btextfild, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BasDat_Ctextfild, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(SimpanButton)
                                        .addGap(36, 36, 36)
                                        .addComponent(jButton2)
                                        .addGap(37, 37, 37)
                                        .addComponent(jButton3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(PilihJam, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(LihatButton))
                                                .addComponent(Basdat_Atextfild, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(Jarkom_Btextfild, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Jarkom_Atextfild, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Jarkom_Ctextfild, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(39, 39, 39)
                                        .addComponent(jButton5)
                                        .addGap(31, 31, 31)
                                        .addComponent(EditButton)
                                        .addGap(36, 36, 36)
                                        .addComponent(HapusButton))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addComponent(jLabel18)))
                        .addGap(88, 88, 88)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TampilkanButton)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5)
                            .addComponent(HapusButton)
                            .addComponent(EditButton)
                            .addComponent(LihatButton)
                            .addComponent(PilihJam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Basdat_Atextfild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BasDat_Btextfild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BasDat_Ctextfild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jarkom_Atextfild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jarkom_Btextfild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jarkom_Ctextfild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SimpanButton)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TampilkanButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        FileMenu.setText("File");
        jMenuBar2.add(FileMenu);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        try {
            ImageIcon icon = new ImageIcon("src/Gambar/Logo USD.png");
            setIconImage(icon.getImage());
            String jam = (String) JOptionPane.showInputDialog(rootPane, "Masukan jam yang akan di edit", "Perintah Edit", 0, icon, null, null);
            String query = "select * from RABU where JAM =?";
            PreparedStatement pst = Kelas_Database.Koneksi().prepareStatement(query);
            pst.setString(1, jam);
            ResultSet rset;
            rset = pst.executeQuery();
            if (rset.next()) {
                PilihJam.setText(rset.getString(1));
                Basdat_Atextfild.setText(rset.getString(2));
                BasDat_Btextfild.setText(rset.getString(3));
                BasDat_Ctextfild.setText(rset.getString(4));
                Jarkom_Atextfild.setText(rset.getString(5));
                Jarkom_Btextfild.setText(rset.getString(6));
                Jarkom_Ctextfild.setText(rset.getString(7));
            } else {
                JOptionPane.showMessageDialog(null, "Data Tidak ditemukan");
            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_EditButtonActionPerformed

    private void TampilkanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TampilkanButtonActionPerformed
        tampilJadwalRabu();
    }//GEN-LAST:event_TampilkanButtonActionPerformed

    private void LihatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LihatButtonActionPerformed
        try {
            String query = "select * from RABU where JAM =?";
            PreparedStatement pst = Kelas_Database.Koneksi().prepareStatement(query);
            pst.setString(1, PilihJam.getText());
            ResultSet rset;
            rset = pst.executeQuery();
            if (rset.next()) {
                Basdat_Atextfild.setText(rset.getString(2));
                BasDat_Btextfild.setText(rset.getString(3));
                BasDat_Ctextfild.setText(rset.getString(4));
                Jarkom_Atextfild.setText(rset.getString(5));
                Jarkom_Btextfild.setText(rset.getString(6));
                Jarkom_Ctextfild.setText(rset.getString(7));
            } else {
                JOptionPane.showMessageDialog(null, "Data Tidak ditemukan");
            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_LihatButtonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            String jam, basdat_A, basdat_B, basdat_C, Jarkom_A, Jarkom_B, Jarkom_C;
            jam = PilihJam.getText();
            basdat_A = Basdat_Atextfild.getText();
            basdat_B = BasDat_Btextfild.getText();
            basdat_C = BasDat_Ctextfild.getText();
            Jarkom_A = Jarkom_Atextfild.getText();
            Jarkom_B = Jarkom_Btextfild.getText();
            Jarkom_C = Jarkom_Ctextfild.getText();
            String query = "INSERT into RABU values ('" + jam + "','" + basdat_A + "','" + basdat_B + "','"
                    + basdat_C + "','" + Jarkom_A + "','" + Jarkom_B + "','" + Jarkom_C + "')";
            Statement statement = con.createStatement();
            statement.executeQuery(query);
            JOptionPane.showMessageDialog(null, " Data Tersimpan");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void HapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusButtonActionPerformed
        Kelas_Database.Koneksi();
        try {
            String CariJAM = JOptionPane.showInputDialog("Masukan Jam tambahan yang akan dihapus");
            Statement statement = con.createStatement();
            String query = "delete from rabu where jam ='" + CariJAM + "'";
            statement.executeUpdate(query);
            statement.close();
            JOptionPane.showMessageDialog(null, " Berhasil Dihapus");
            bersi();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_HapusButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        bersi();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        bersi();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void SimpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanButtonActionPerformed
        try {
            String query = "UPDATE RABU set BASDAT_A='" + Basdat_Atextfild.getText() + "',BASDAT_B='"
                    + BasDat_Btextfild.getText() + "',BASDAT_C='" + BasDat_Ctextfild.getText() + "',JARKOM_A='"
                    + Jarkom_Atextfild.getText() + "',JARKOM_B='" + Jarkom_Btextfild.getText() + "',JARKOM_C='"
                    + Jarkom_Ctextfild.getText() + "' WHERE JAM='" + PilihJam.getText() + "'";
            Statement statement = con.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "data berhasil diubah");
            bersi();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal mengubah ");
        }
    }//GEN-LAST:event_SimpanButtonActionPerformed

    private void PilihJamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PilihJamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PilihJamActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SeninEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeninEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeninEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeninEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SeninEdit dialog = new SeninEdit(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField BasDat_Btextfild;
    private javax.swing.JTextField BasDat_Ctextfild;
    private javax.swing.JTextField Basdat_Atextfild;
    private javax.swing.JButton EditButton;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JButton HapusButton;
    private javax.swing.JTextField Jarkom_Atextfild;
    private javax.swing.JTextField Jarkom_Btextfild;
    private javax.swing.JTextField Jarkom_Ctextfild;
    private javax.swing.JButton LihatButton;
    private javax.swing.JTextField PilihJam;
    private javax.swing.JButton SimpanButton;
    private javax.swing.JTable TabelJadwal;
    private javax.swing.JButton TampilkanButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
