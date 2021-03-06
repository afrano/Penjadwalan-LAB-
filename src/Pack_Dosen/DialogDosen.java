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
public class DialogDosen extends javax.swing.JDialog {

    /**
     * Creates new form EditDataDosen
     */
    Connection con = Kelas_Database.Koneksi();
    String Nip, Nama, TempatTanggalLahir, JenisKelamin, Golongan, Kodedosen, Pendidikan, Email, Alamat;

    public DialogDosen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    private void CariDosen(){
         try {
            ImageIcon icon = new ImageIcon("src/Gambar/tepat.jpg");
            setIconImage(icon.getImage());
            String CariNip = (String) JOptionPane.showInputDialog(rootPane, "Masukan Nip ", "Perintah Edit", 0, icon, null, null);
            String query = "select * from dosen where NIP =?";
            PreparedStatement pst = Kelas_Database.Koneksi().prepareStatement(query);
            pst.setString(1, CariNip);
            ResultSet rset;
            rset = pst.executeQuery();
            if (rset.next()) {
                NipTextFild.setText(rset.getString(1));
                NamaDosenTextFild.setText(rset.getString(2));
                TempatTanggalTextFild.setText(rset.getString(3));
                JenisKelaminTextFild.setText(rset.getString(4));
                GolonganTextFild.setText(rset.getString(5));
                KodeDosenTextFild.setText(rset.getString(6));
                PendidikanTextFild.setText(rset.getString(7));
                EmailTextFild.setText(rset.getString(8));
                AlamatTextArea.setText(rset.getString(9));;
            } else {
                JOptionPane.showMessageDialog(null, "Data Tidak ditemukan");
                bersih();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null," Error ");
        }
    }
    public void bersih() {
        NipTextFild.setText("");
        NamaDosenTextFild.setText("");
        TempatTanggalTextFild.setText("");
        JenisKelaminTextFild.setText("");
        GolonganTextFild.setText("");
        KodeDosenTextFild.setText("");
        PendidikanTextFild.setText("");
        EmailTextFild.setText("");
        AlamatTextArea.setText("");
    }

    private void tampilData() {
        DefaultTableModel tabelnya = new DefaultTableModel();
        tabelnya.addColumn("Kode");
        tabelnya.addColumn("Nama");
        tabelnya.addColumn("Mata Kuliah");
        tabelnya.addColumn("Nomor Telepon");
        tabelnya.addColumn("Jenis Mata Kuliah");

        try {
            String query = "select * from dosen";
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
                    rset.getString(6)});
            }
            TabelDosen.setModel(tabelnya);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ada kesalahan !");
        }
    }
    public void SimpanEditDataDosen(){
        try {
            String query = "UPDATE dosen set nama='" + NamaDosenTextFild.getText() + "',TempatTanggalLahir='"
                    + TempatTanggalTextFild.getText() + "',JenisKelamin='" + JenisKelaminTextFild.getText() + "',Golongan='"
                    + GolonganTextFild.getText() + "',Kodedosen='" + KodeDosenTextFild.getText() + "',Pendidikan='"
                    + PendidikanTextFild.getText() + "',Email='" + EmailTextFild.getText() + "',Alamat='" + AlamatTextArea.getText()
                    + "' WHERE Nip='" + NipTextFild.getText() + "'";
            Statement statement = con.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "data berhasil diubah");
            tampilData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e);
        }
    }
    public void DataEdit(){
        try {
            ImageIcon icon = new ImageIcon("src/Gambar/tepat.jpg");
            setIconImage(icon.getImage());
            String jam = (String) JOptionPane.showInputDialog(rootPane, "Masukan Nip yang akan di edit", "Perintah Edit", 0, icon, null, null);
            String query = "select * from dosen where Nip =?";
            PreparedStatement pst = Kelas_Database.Koneksi().prepareStatement(query);
            pst.setString(1, jam);
            ResultSet rset;
            rset = pst.executeQuery();
            if (rset.next()) {
                NipTextFild.setText(rset.getString(1));
                NamaDosenTextFild.setText(rset.getString(2));
                TempatTanggalTextFild.setText(rset.getString(3));
                JenisKelaminTextFild.setText(rset.getString(4));
                GolonganTextFild.setText(rset.getString(5));
                KodeDosenTextFild.setText(rset.getString(6));
                PendidikanTextFild.setText(rset.getString(7));
                EmailTextFild.setText(rset.getString(8));
                AlamatTextArea.setText(rset.getString(9));;
            } else {
                JOptionPane.showMessageDialog(null, "Data Tidak ditemukan");
            }

        } catch (Exception e) {

        }
    }
    public void tambahkandatabaru(){
        try {
            Nip = NipTextFild.getText();
            Nama = NamaDosenTextFild.getText();
            TempatTanggalLahir = TempatTanggalTextFild.getText();
            JenisKelamin = JenisKelaminTextFild.getText();
            Golongan = GolonganTextFild.getText();
            Kodedosen = KodeDosenTextFild.getText();
            Pendidikan = PendidikanTextFild.getText();
            Email = EmailTextFild.getText();
            Alamat = AlamatTextArea.getText();
            if (Nip.equals("") || Nama.equals("") || TempatTanggalLahir.equals("") || JenisKelamin.equals("")
                    || Golongan.equals("") || Kodedosen.equals("")
                    || Pendidikan.equals("") || Email.equals("") || Alamat.equals("")) {
                JOptionPane.showMessageDialog(null, "Tidak Boleh Kosong");
            } else {
                String query = "INSERT into dosen  values ('" + Nip + "','" + Nama + "','" + TempatTanggalLahir + "','"
                        + JenisKelamin + "','" + Golongan + "','" + Kodedosen +  "','" + Pendidikan + "','" + Email + "','" + Alamat + "')";
                Statement statement = con.createStatement();
                statement.executeQuery(query);
                JOptionPane.showMessageDialog(null, " Data Tersimpan");
                bersih();
                tampilData();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    public void hapusdata(){
        Kelas_Database.Koneksi();
        try {
            String Carikode = JOptionPane.showInputDialog("Masukan Kode Dosen yang akan dihapus");
            Statement statement = con.createStatement();
            String query = "delete from dosen where nip='" + Carikode + "'";
            statement.executeUpdate(query);
            statement.close();
            JOptionPane.showMessageDialog(null, " Data Berhasil Dihapus");
            tampilData();
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CariButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        TambahkanButton = new javax.swing.JButton();
        SimpanEditanButton = new javax.swing.JButton();
        HapusButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AlamatTextArea = new javax.swing.JTextArea();
        EmailTextFild = new javax.swing.JTextField();
        PendidikanTextFild = new javax.swing.JTextField();
        KodeDosenTextFild = new javax.swing.JTextField();
        GolonganTextFild = new javax.swing.JTextField();
        JenisKelaminTextFild = new javax.swing.JTextField();
        TempatTanggalTextFild = new javax.swing.JTextField();
        NamaDosenTextFild = new javax.swing.JTextField();
        NipTextFild = new javax.swing.JTextField();
        KodeDosenLabel = new javax.swing.JLabel();
        NamaDosenLabel = new javax.swing.JLabel();
        MataKuliahLabel = new javax.swing.JLabel();
        NoTeleponLabel = new javax.swing.JLabel();
        JenisMataKuliahLabel = new javax.swing.JLabel();
        JenisMataKuliahLabel2 = new javax.swing.JLabel();
        JenisMataKuliahLabel1 = new javax.swing.JLabel();
        AlamatLabel = new javax.swing.JLabel();
        AlamatLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelDosen = new javax.swing.JTable();
        Tampilkan = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        HomeButton = new javax.swing.JButton();
        CariButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        HomeItem = new javax.swing.JMenuItem();
        ExitItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        EditDosenItem = new javax.swing.JMenuItem();
        TambahItem = new javax.swing.JMenuItem();
        HapusItem = new javax.swing.JMenuItem();

        CariButton.setBackground(new java.awt.Color(51, 0, 0));
        CariButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/LihatDosen.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));

        TambahkanButton.setText("Tambahkan");
        TambahkanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahkanButtonActionPerformed(evt);
            }
        });

        SimpanEditanButton.setText("Simpan");
        SimpanEditanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanEditanButtonActionPerformed(evt);
            }
        });

        HapusButton.setText("Hapus");
        HapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusButtonActionPerformed(evt);
            }
        });

        AlamatTextArea.setColumns(20);
        AlamatTextArea.setRows(5);
        jScrollPane1.setViewportView(AlamatTextArea);

        KodeDosenLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        KodeDosenLabel.setForeground(new java.awt.Color(255, 255, 255));
        KodeDosenLabel.setText("NIP");

        NamaDosenLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NamaDosenLabel.setForeground(new java.awt.Color(255, 255, 255));
        NamaDosenLabel.setText("Nama     ");

        MataKuliahLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MataKuliahLabel.setForeground(new java.awt.Color(255, 255, 255));
        MataKuliahLabel.setText("Tempat Tanggal Lahir");

        NoTeleponLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NoTeleponLabel.setForeground(new java.awt.Color(255, 255, 255));
        NoTeleponLabel.setText("Jenis Kelamin");

        JenisMataKuliahLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JenisMataKuliahLabel.setForeground(new java.awt.Color(255, 255, 255));
        JenisMataKuliahLabel.setText("Golongan");

        JenisMataKuliahLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JenisMataKuliahLabel2.setForeground(new java.awt.Color(255, 255, 255));
        JenisMataKuliahLabel2.setText("Kode Dosen");

        JenisMataKuliahLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JenisMataKuliahLabel1.setForeground(new java.awt.Color(255, 255, 255));
        JenisMataKuliahLabel1.setText("Pendidikan");

        AlamatLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AlamatLabel.setForeground(new java.awt.Color(255, 255, 255));
        AlamatLabel.setText("E-mail");

        AlamatLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AlamatLabel1.setForeground(new java.awt.Color(255, 255, 255));
        AlamatLabel1.setText("Alamat");

        TabelDosen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIP", "Nama", "Tempat Tanggal Lahir", "Jenis Kelamin", "Golongan", "Kode Dosen", "Pendidikan", "E-Mail", "Alamat"
            }
        ));
        TabelDosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelDosenMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelDosen);

        Tampilkan.setText("Tampilkan Semua");
        Tampilkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TampilkanActionPerformed(evt);
            }
        });

        EditButton.setText("Edit");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA DOSEN");

        HomeButton.setBackground(new java.awt.Color(102, 0, 0));
        HomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/HALAMAN.jpg"))); // NOI18N
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        CariButton1.setBackground(new java.awt.Color(51, 0, 0));
        CariButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/LihatDosen.jpg"))); // NOI18N
        CariButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CariButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Tampilkan)
                                .addGap(250, 250, 250)
                                .addComponent(CancelButton)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AlamatLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(KodeDosenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NoTeleponLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JenisMataKuliahLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NamaDosenLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AlamatLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(JenisMataKuliahLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MataKuliahLabel)
                                    .addComponent(JenisMataKuliahLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SimpanEditanButton)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(NipTextFild)
                                    .addGap(145, 145, 145))
                                .addComponent(NamaDosenTextFild)
                                .addComponent(TempatTanggalTextFild)
                                .addComponent(JenisKelaminTextFild)
                                .addComponent(GolonganTextFild)
                                .addComponent(KodeDosenTextFild)
                                .addComponent(PendidikanTextFild)
                                .addComponent(EmailTextFild))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TambahkanButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EditButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HapusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HomeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CariButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(89, 89, 89))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CariButton1)
                        .addGap(52, 52, 52)
                        .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(KodeDosenLabel)
                                .addGap(18, 18, 18)
                                .addComponent(NamaDosenLabel)
                                .addGap(18, 18, 18)
                                .addComponent(MataKuliahLabel)
                                .addGap(18, 18, 18)
                                .addComponent(NoTeleponLabel)
                                .addGap(18, 18, 18)
                                .addComponent(JenisMataKuliahLabel)
                                .addGap(18, 18, 18)
                                .addComponent(JenisMataKuliahLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JenisMataKuliahLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(AlamatLabel)
                                .addGap(18, 18, 18)
                                .addComponent(AlamatLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NipTextFild, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TambahkanButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NamaDosenTextFild, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EditButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TempatTanggalTextFild, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HapusButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JenisKelaminTextFild, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(GolonganTextFild, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(KodeDosenTextFild, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PendidikanTextFild, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EmailTextFild, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tampilkan)
                        .addComponent(CancelButton))
                    .addComponent(SimpanEditanButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        jMenu1.setText("File");

        HomeItem.setText("Home");
        HomeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeItemActionPerformed(evt);
            }
        });
        jMenu1.add(HomeItem);

        ExitItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        ExitItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/ExitMenu.jpg"))); // NOI18N
        ExitItem1.setText("Exit");
        ExitItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(ExitItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        EditDosenItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/edo.png"))); // NOI18N
        EditDosenItem.setText("Edit Data Dosen");
        EditDosenItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditDosenItemActionPerformed(evt);
            }
        });
        jMenu2.add(EditDosenItem);

        TambahItem.setText("Tambah Dosen");
        TambahItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahItemActionPerformed(evt);
            }
        });
        jMenu2.add(TambahItem);

        HapusItem.setText("Hapus Dosen");
        HapusItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusItemActionPerformed(evt);
            }
        });
        jMenu2.add(HapusItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusButtonActionPerformed
        hapusdata();
    }//GEN-LAST:event_HapusButtonActionPerformed

    private void SimpanEditanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanEditanButtonActionPerformed
        SimpanEditDataDosen();
    }//GEN-LAST:event_SimpanEditanButtonActionPerformed

    private void TambahkanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahkanButtonActionPerformed
        tambahkandatabaru();
    }//GEN-LAST:event_TambahkanButtonActionPerformed

    private void TabelDosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelDosenMouseClicked
        NipTextFild.setText(TabelDosen.getValueAt(TabelDosen.getSelectedRow(), 1).toString());
        NamaDosenTextFild.setText(TabelDosen.getValueAt(TabelDosen.getSelectedRow(), 2).toString());
        TempatTanggalTextFild.setText(TabelDosen.getValueAt(TabelDosen.getSelectedRow(), 3).toString());
        JenisKelaminTextFild.setText(TabelDosen.getValueAt(TabelDosen.getSelectedRow(), 4).toString());
        GolonganTextFild.setText(TabelDosen.getValueAt(TabelDosen.getSelectedRow(), 5).toString());
        KodeDosenTextFild.setText(TabelDosen.getValueAt(TabelDosen.getSelectedRow(), 6).toString());
        PendidikanTextFild.setText(TabelDosen.getValueAt(TabelDosen.getSelectedRow(), 7).toString());
        EmailTextFild.setText(TabelDosen.getValueAt(TabelDosen.getSelectedRow(), 8).toString());
        AlamatTextArea.setText(TabelDosen.getValueAt(TabelDosen.getSelectedRow(), 9).toString());
    }//GEN-LAST:event_TabelDosenMouseClicked

    private void TampilkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TampilkanActionPerformed
        tampilData();
    }//GEN-LAST:event_TampilkanActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        DataEdit();
    }//GEN-LAST:event_EditButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Batal");
        bersih();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void EditDosenItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditDosenItemActionPerformed
        EditButtonActionPerformed(evt);
    }//GEN-LAST:event_EditDosenItemActionPerformed

    private void ExitItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitItem1ActionPerformed
        int keluar = JOptionPane.showConfirmDialog(null, "Apakah anda akan keluar dari aplikasi ?", "Konfirmasi",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (keluar == JOptionPane.NO_OPTION) {
        } else if (keluar == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitItem1ActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        int keluar = JOptionPane.showConfirmDialog(null, "Kembali ke halaman Utama ?", "Konfirmasi",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (keluar == JOptionPane.NO_OPTION) {
        } else if (keluar == JOptionPane.YES_OPTION) {
            dispose();
        }

    }//GEN-LAST:event_HomeButtonActionPerformed

    private void HomeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeItemActionPerformed
        HomeButtonActionPerformed(evt);
    }//GEN-LAST:event_HomeItemActionPerformed

    private void HapusItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusItemActionPerformed
        HapusButtonActionPerformed(evt);
    }//GEN-LAST:event_HapusItemActionPerformed

    private void TambahItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahItemActionPerformed
        TambahkanButtonActionPerformed(evt);
    }//GEN-LAST:event_TambahItemActionPerformed

    private void CariButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CariButton1ActionPerformed
        CariDosen();
    }//GEN-LAST:event_CariButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DialogDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogDosen dialog = new DialogDosen(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel AlamatLabel;
    private javax.swing.JLabel AlamatLabel1;
    private javax.swing.JTextArea AlamatTextArea;
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton CariButton;
    private javax.swing.JButton CariButton1;
    private javax.swing.JButton EditButton;
    private javax.swing.JMenuItem EditDosenItem;
    private javax.swing.JTextField EmailTextFild;
    private javax.swing.JMenuItem ExitItem1;
    private javax.swing.JTextField GolonganTextFild;
    private javax.swing.JButton HapusButton;
    private javax.swing.JMenuItem HapusItem;
    private javax.swing.JButton HomeButton;
    private javax.swing.JMenuItem HomeItem;
    private javax.swing.JTextField JenisKelaminTextFild;
    private javax.swing.JLabel JenisMataKuliahLabel;
    private javax.swing.JLabel JenisMataKuliahLabel1;
    private javax.swing.JLabel JenisMataKuliahLabel2;
    private javax.swing.JLabel KodeDosenLabel;
    private javax.swing.JTextField KodeDosenTextFild;
    private javax.swing.JLabel MataKuliahLabel;
    private javax.swing.JLabel NamaDosenLabel;
    private javax.swing.JTextField NamaDosenTextFild;
    private javax.swing.JTextField NipTextFild;
    private javax.swing.JLabel NoTeleponLabel;
    private javax.swing.JTextField PendidikanTextFild;
    private javax.swing.JButton SimpanEditanButton;
    private javax.swing.JTable TabelDosen;
    private javax.swing.JMenuItem TambahItem;
    private javax.swing.JButton TambahkanButton;
    private javax.swing.JButton Tampilkan;
    private javax.swing.JTextField TempatTanggalTextFild;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
