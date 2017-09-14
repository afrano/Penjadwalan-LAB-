/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack_Laboratorium;


import Pack_Dosen.JumatEdit;
import Pack_Dosen.KamisEdit;
import Pack_Dosen.RabuEdit;
import Pack_Dosen.SabtuEdit;
import Pack_Dosen.SelasaEdit;
import Pack_Dosen.SeninEdit;
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
public class DialogJadwal extends javax.swing.JDialog {

    /**
     * Creates new form DialogJadwal
     */
    private Connection con = Kelas_Database.Koneksi();

    public DialogJadwal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public void tampilJadwalSenin() {
        DefaultTableModel tabelnya = new DefaultTableModel();
        tabelnya.addColumn("JAM");
        tabelnya.addColumn("Lab BasDat A");
        tabelnya.addColumn("Lab BasDat B");
        tabelnya.addColumn("Lab BasDat C");
        tabelnya.addColumn("Lab JarKom A");
        tabelnya.addColumn("Lab JarKom B");
        tabelnya.addColumn("Lab JarKom C");
        try {
            String query = "select * from senin";
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
                    rset.getString(6)
                });
            }
            TabelJadwal.setModel(tabelnya);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ada kesalahan !");
        }
    }
    public void tampilJadwalSelasa() {
        DefaultTableModel tabelnya = new DefaultTableModel();
        tabelnya.addColumn("JAM");
        tabelnya.addColumn("Lab BasDat A");
        tabelnya.addColumn("Lab BasDat B");
        tabelnya.addColumn("Lab BasDat C");
        tabelnya.addColumn("Lab JarKom A");
        tabelnya.addColumn("Lab JarKom B");
        tabelnya.addColumn("Lab JarKom C");
        try {
            String query = "select * from selasa";
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
                    rset.getString(6),});
            }
            TabelJadwal.setModel(tabelnya);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ada kesalahan !");
        }
    }

    public void tampilJadwalRabu() {
        DefaultTableModel tabelnya = new DefaultTableModel();
        tabelnya.addColumn("JAM");
        tabelnya.addColumn("Lab BasDat A");
        tabelnya.addColumn("Lab BasDat B");
        tabelnya.addColumn("Lab BasDat C");
        tabelnya.addColumn("Lab JarKom A");
        tabelnya.addColumn("Lab JarKom B");
        tabelnya.addColumn("Lab JarKom C");
        try {
            String query = "select * from senin";
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
                    rset.getString(6),});
            }
            TabelJadwal.setModel(tabelnya);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ada kesalahan !");
        }
    }

    public void tampilJadwalKamis() {
        DefaultTableModel tabelnya = new DefaultTableModel();
        tabelnya.addColumn("JAM");
        tabelnya.addColumn("Lab BasDat A");
        tabelnya.addColumn("Lab BasDat B");
        tabelnya.addColumn("Lab BasDat C");
        tabelnya.addColumn("Lab JarKom A");
        tabelnya.addColumn("Lab JarKom B");
        tabelnya.addColumn("Lab JarKom C");
        try {
            String query = "select * from kamis";
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
                    rset.getString(6),});
            }
            TabelJadwal.setModel(tabelnya);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ada kesalahan !");
        }
    }

    public void tampilJadwalJumat() {
        DefaultTableModel tabelnya = new DefaultTableModel();
        tabelnya.addColumn("JAM");
        tabelnya.addColumn("Lab BasDat A");
        tabelnya.addColumn("Lab BasDat B");
        tabelnya.addColumn("Lab BasDat C");
        tabelnya.addColumn("Lab JarKom A");
        tabelnya.addColumn("Lab JarKom B");
        tabelnya.addColumn("Lab JarKom C");
        try {
            String query = "select * from jumat";
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
                    rset.getString(6),});
            }
            TabelJadwal.setModel(tabelnya);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ada kesalahan !");
        }
    }

    private void tampilJadwalSabtu() {
        DefaultTableModel tabelnya = new DefaultTableModel();
        tabelnya.addColumn("JAM");
        tabelnya.addColumn("Lab BasDat A");
        tabelnya.addColumn("Lab BasDat B");
        tabelnya.addColumn("Lab BasDat C");
        tabelnya.addColumn("Lab JarKom A");
        tabelnya.addColumn("Lab JarKom B");
        tabelnya.addColumn("Lab JarKom C");
        try {
            String query = "select * from sabtu";
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
                    rset.getString(6),});
            }
            TabelJadwal.setModel(tabelnya);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ada kesalahan !");
        }
    }
    private void CariDosen(){
        Kelas_Database.Koneksi();
        try {
            ImageIcon icon = new ImageIcon("src/Gambar/CariDos.png");
            setIconImage(icon.getImage());
            String Carikode = (String) JOptionPane.showInputDialog(rootPane, "Masukan Kode Dosen", "perintah", 2, icon, null, null);
            Statement statement = con.createStatement();
            String query = "Select * from dosen where Kodedosen='" + Carikode + "'";
            PreparedStatement pst = Kelas_Database.Koneksi().prepareStatement(query);
            ResultSet rset;
            rset = pst.executeQuery();
            statement.close();
            if (rset.next()) {
                JOptionPane.showMessageDialog(null, "Nama Dosen " + rset.getString(2));
            } else {
                JOptionPane.showMessageDialog(null, "Data Tidak ditemukan");
            }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TampilkanSeninButton = new javax.swing.JButton();
        TampilkanSelasaButton = new javax.swing.JButton();
        RabuButton = new javax.swing.JButton();
        KamisButton = new javax.swing.JButton();
        JumatButton = new javax.swing.JButton();
        sabtuButton = new javax.swing.JButton();
        MingguButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelJadwal = new javax.swing.JTable();
        HomeButton = new javax.swing.JButton();
        KeluarButton = new javax.swing.JButton();
        CaridosenButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        ItemHari = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        ExitItem = new javax.swing.JMenuItem();
        EditMenu = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        EditSenin = new javax.swing.JMenuItem();
        EditSelasa = new javax.swing.JMenuItem();
        EditRabu = new javax.swing.JMenuItem();
        EditKamis = new javax.swing.JMenuItem();
        EditJumat = new javax.swing.JMenuItem();
        EditSabtu = new javax.swing.JMenuItem();
        EditMinggu = new javax.swing.JMenuItem();
        ViewMenu = new javax.swing.JMenu();
        CariDosenItem = new javax.swing.JMenuItem();
        SeninItem = new javax.swing.JMenuItem();
        SelasaItem = new javax.swing.JMenuItem();
        RabuItem = new javax.swing.JMenuItem();
        KamisItem = new javax.swing.JMenuItem();
        JumatItem = new javax.swing.JMenuItem();
        SabtuItem = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));

        jLabel1.setFont(new java.awt.Font("Charlemagne Std", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/UNIVSADARD COM.jpg"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Calisto MT", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("  Jadwal Pengguna Laboratorium");

        jLabel2.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Silahkan klik tombol hari untuk melihat jadwal");

        TampilkanSeninButton.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        TampilkanSeninButton.setText("Senin");
        TampilkanSeninButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TampilkanSeninButtonActionPerformed(evt);
            }
        });

        TampilkanSelasaButton.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        TampilkanSelasaButton.setText("Selasa");
        TampilkanSelasaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TampilkanSelasaButtonActionPerformed(evt);
            }
        });

        RabuButton.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        RabuButton.setText("Rabu");
        RabuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RabuButtonActionPerformed(evt);
            }
        });

        KamisButton.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        KamisButton.setText("Kamis");
        KamisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KamisButtonActionPerformed(evt);
            }
        });

        JumatButton.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        JumatButton.setText("Jumat");
        JumatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumatButtonActionPerformed(evt);
            }
        });

        sabtuButton.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        sabtuButton.setText("Sabtu");
        sabtuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sabtuButtonActionPerformed(evt);
            }
        });

        MingguButton.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        MingguButton.setText("Minggu");
        MingguButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MingguButtonActionPerformed(evt);
            }
        });

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

        HomeButton.setBackground(new java.awt.Color(102, 0, 0));
        HomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/HALAMAN.jpg"))); // NOI18N
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        KeluarButton.setBackground(new java.awt.Color(102, 0, 0));
        KeluarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/exi.jpg"))); // NOI18N
        KeluarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarButtonActionPerformed(evt);
            }
        });

        CaridosenButton.setBackground(new java.awt.Color(51, 0, 0));
        CaridosenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/cari.jpg"))); // NOI18N
        CaridosenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaridosenButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TampilkanSeninButton)
                        .addGap(39, 39, 39)
                        .addComponent(TampilkanSelasaButton)
                        .addGap(48, 48, 48)
                        .addComponent(RabuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(KamisButton)
                        .addGap(37, 37, 37)
                        .addComponent(JumatButton)
                        .addGap(36, 36, 36)
                        .addComponent(sabtuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(MingguButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(CaridosenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215)
                .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(KeluarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(226, 226, 226))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TampilkanSeninButton)
                            .addComponent(TampilkanSelasaButton)
                            .addComponent(RabuButton)
                            .addComponent(KamisButton)
                            .addComponent(JumatButton)
                            .addComponent(sabtuButton)
                            .addComponent(MingguButton))
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CaridosenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(KeluarButton)
                        .addGap(69, 69, 69))))
        );

        ItemHari.setText("File");

        jMenuItem1.setText("Home");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        ItemHari.add(jMenuItem1);

        ExitItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        ExitItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/ExitMenu.jpg"))); // NOI18N
        ExitItem.setText("Exit");
        ExitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitItemActionPerformed(evt);
            }
        });
        ItemHari.add(ExitItem);

        jMenuBar1.add(ItemHari);

        EditMenu.setText("Edit");

        jMenu2.setText("Pilih hari");

        EditSenin.setText("Senin");
        EditSenin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditSeninActionPerformed(evt);
            }
        });
        jMenu2.add(EditSenin);

        EditSelasa.setText("Selasa");
        EditSelasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditSelasaActionPerformed(evt);
            }
        });
        jMenu2.add(EditSelasa);

        EditRabu.setText("Rabu");
        EditRabu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditRabuActionPerformed(evt);
            }
        });
        jMenu2.add(EditRabu);

        EditKamis.setText("Kamis");
        EditKamis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditKamisActionPerformed(evt);
            }
        });
        jMenu2.add(EditKamis);

        EditJumat.setText("Jumat");
        EditJumat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditJumatActionPerformed(evt);
            }
        });
        jMenu2.add(EditJumat);

        EditSabtu.setText("Sabtu");
        EditSabtu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditSabtuActionPerformed(evt);
            }
        });
        jMenu2.add(EditSabtu);

        EditMinggu.setForeground(new java.awt.Color(153, 0, 0));
        EditMinggu.setText("Minggu");
        EditMinggu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditMingguActionPerformed(evt);
            }
        });
        jMenu2.add(EditMinggu);

        EditMenu.add(jMenu2);

        jMenuBar1.add(EditMenu);

        ViewMenu.setText("View");

        CariDosenItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        CariDosenItem.setText("Cari Dosen");
        CariDosenItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CariDosenItemActionPerformed(evt);
            }
        });
        ViewMenu.add(CariDosenItem);

        SeninItem.setText("Senin");
        SeninItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeninItemActionPerformed(evt);
            }
        });
        ViewMenu.add(SeninItem);

        SelasaItem.setText("Selasa");
        SelasaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelasaItemActionPerformed(evt);
            }
        });
        ViewMenu.add(SelasaItem);

        RabuItem.setText("Rabu");
        RabuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RabuItemActionPerformed(evt);
            }
        });
        ViewMenu.add(RabuItem);

        KamisItem.setText("Kamis");
        KamisItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KamisItemActionPerformed(evt);
            }
        });
        ViewMenu.add(KamisItem);

        JumatItem.setText("Jumat");
        JumatItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumatItemActionPerformed(evt);
            }
        });
        ViewMenu.add(JumatItem);

        SabtuItem.setText("Sabtu");
        SabtuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SabtuItemActionPerformed(evt);
            }
        });
        ViewMenu.add(SabtuItem);

        jMenuItem2.setText("Minggu");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        ViewMenu.add(jMenuItem2);

        jMenuBar1.add(ViewMenu);

        jMenu1.setText("Help");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TampilkanSeninButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TampilkanSeninButtonActionPerformed
        tampilJadwalSenin();
    }//GEN-LAST:event_TampilkanSeninButtonActionPerformed

    private void TampilkanSelasaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TampilkanSelasaButtonActionPerformed
        tampilJadwalSelasa();
    }//GEN-LAST:event_TampilkanSelasaButtonActionPerformed

    private void RabuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RabuButtonActionPerformed
        tampilJadwalRabu();
    }//GEN-LAST:event_RabuButtonActionPerformed

    private void KamisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KamisButtonActionPerformed
        tampilJadwalKamis();
    }//GEN-LAST:event_KamisButtonActionPerformed

    private void JumatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumatButtonActionPerformed
        tampilJadwalJumat();
    }//GEN-LAST:event_JumatButtonActionPerformed

    private void sabtuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sabtuButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Tidak ada jadwal untuk hari Sabtu", "Warning", 2);
        tampilJadwalSabtu();
    }//GEN-LAST:event_sabtuButtonActionPerformed

    private void MingguButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MingguButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Minggu hari libur,Laboratorium tutup", "Warning", 2);
    }//GEN-LAST:event_MingguButtonActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        int keluar = JOptionPane.showConfirmDialog(null, "Kembali ke halaman Utama ?", "Konfirmasi",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (keluar == JOptionPane.NO_OPTION) {
        } else if (keluar == JOptionPane.YES_OPTION) {
            dispose();
            Homepage home = new Homepage();
            home.setVisible(true);
        }


    }//GEN-LAST:event_HomeButtonActionPerformed

    private void KeluarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarButtonActionPerformed
        int keluar = JOptionPane.showConfirmDialog(null, "Apakah anda akan keluar dari aplikasi ?", "Konfirmasi",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (keluar == JOptionPane.NO_OPTION) {
        } else if (keluar == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_KeluarButtonActionPerformed

    private void SeninItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeninItemActionPerformed
        tampilJadwalSenin();
    }//GEN-LAST:event_SeninItemActionPerformed

    private void CaridosenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaridosenButtonActionPerformed
        CariDosen();
    }//GEN-LAST:event_CaridosenButtonActionPerformed

    private void SelasaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelasaItemActionPerformed
        tampilJadwalSelasa();
    }//GEN-LAST:event_SelasaItemActionPerformed

    private void RabuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RabuItemActionPerformed
        tampilJadwalRabu();
    }//GEN-LAST:event_RabuItemActionPerformed

    private void JumatItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumatItemActionPerformed
        tampilJadwalJumat();
    }//GEN-LAST:event_JumatItemActionPerformed

    private void ExitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitItemActionPerformed

    private void CariDosenItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CariDosenItemActionPerformed
       CariDosen();
    }//GEN-LAST:event_CariDosenItemActionPerformed

    private void SabtuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SabtuItemActionPerformed
        JOptionPane.showMessageDialog(null, "Tidak ada jadwal untuk hari Sabtu", "Warning", 2);
        tampilJadwalSabtu();
    }//GEN-LAST:event_SabtuItemActionPerformed

    private void KamisItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KamisItemActionPerformed
        tampilJadwalKamis();
    }//GEN-LAST:event_KamisItemActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JOptionPane.showMessageDialog(null, "Minggu hari libur,Laboratorium tutup", "Warning", 2);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void EditRabuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditRabuActionPerformed
        RabuEdit rabu = new RabuEdit(null, true);
        rabu.setVisible(true);
    }//GEN-LAST:event_EditRabuActionPerformed

    private void EditJumatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditJumatActionPerformed
        JumatEdit jumat = new JumatEdit(null, true);
        jumat.setVisible(true);
    }//GEN-LAST:event_EditJumatActionPerformed

    private void EditSeninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditSeninActionPerformed
        SeninEdit senin = new SeninEdit(null, true);
        senin.setVisible(true);
    }//GEN-LAST:event_EditSeninActionPerformed

    private void EditSabtuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditSabtuActionPerformed
        SabtuEdit sabtu = new SabtuEdit(null, true);
        sabtu.setVisible(true);
    }//GEN-LAST:event_EditSabtuActionPerformed

    private void EditSelasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditSelasaActionPerformed
        SelasaEdit selasa = new SelasaEdit(null, true);
        selasa.setVisible(true);
    }//GEN-LAST:event_EditSelasaActionPerformed

    private void EditKamisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditKamisActionPerformed
        KamisEdit kamis = new KamisEdit(null, true);
        kamis.setVisible(true);
    }//GEN-LAST:event_EditKamisActionPerformed

    private void EditMingguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditMingguActionPerformed
        JOptionPane.showMessageDialog(null, "Minggu hari libur,Laboratorium tutup", "Warning", 2);
    }//GEN-LAST:event_EditMingguActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        HomeButtonActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(DialogJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogJadwal dialog = new DialogJadwal(new javax.swing.JFrame(), true);
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
    private javax.swing.JMenuItem CariDosenItem;
    private javax.swing.JButton CaridosenButton;
    private javax.swing.JMenuItem EditJumat;
    private javax.swing.JMenuItem EditKamis;
    private javax.swing.JMenu EditMenu;
    private javax.swing.JMenuItem EditMinggu;
    private javax.swing.JMenuItem EditRabu;
    private javax.swing.JMenuItem EditSabtu;
    private javax.swing.JMenuItem EditSelasa;
    private javax.swing.JMenuItem EditSenin;
    private javax.swing.JMenuItem ExitItem;
    private javax.swing.JButton HomeButton;
    private javax.swing.JMenu ItemHari;
    private javax.swing.JButton JumatButton;
    private javax.swing.JMenuItem JumatItem;
    private javax.swing.JButton KamisButton;
    private javax.swing.JMenuItem KamisItem;
    private javax.swing.JButton KeluarButton;
    private javax.swing.JButton MingguButton;
    private javax.swing.JButton RabuButton;
    private javax.swing.JMenuItem RabuItem;
    private javax.swing.JMenuItem SabtuItem;
    private javax.swing.JMenuItem SelasaItem;
    private javax.swing.JMenuItem SeninItem;
    private javax.swing.JTable TabelJadwal;
    private javax.swing.JButton TampilkanSelasaButton;
    private javax.swing.JButton TampilkanSeninButton;
    private javax.swing.JMenu ViewMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sabtuButton;
    // End of variables declaration//GEN-END:variables
}
