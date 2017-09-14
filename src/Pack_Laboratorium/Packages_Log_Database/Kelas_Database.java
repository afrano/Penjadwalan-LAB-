package Packages_Log_Database;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import oracle.jdbc.pool.OracleDataSource;
//jdbc:oracle:thin:@172.23.9.185:1521:orcl

public class Kelas_Database {

    private static String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
//    private static String jdbcUrl = "jdbc:oracle:thin:@172.23.9.185:1521:orcl";
     private static String userid = "HR";
//    private static String userid = "MHS145314005";
      private static String password = "123456";

//   private static String password = "MHS145314005";

    public static Connection Koneksi() {
        Connection Koneksi = null;
        try {
            OracleDataSource ds;
            ds = new OracleDataSource();
            ds.setURL(jdbcUrl);
            Koneksi = ds.getConnection(userid, password);
            //  JOptionPane.showMessageDialog(null, "Berhasil Login");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Gagal koneksi ke database", "Error", 0);
        }
        return Koneksi;
    }
}
