/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Packages_Log_Database;

import Pack_Laboratorium.Homepage;
import Packages_Log_Database.Kelas_Database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author NANO
 */
public class LoginAdmin {

    Connection conn;
    Statement stat;
    ResultSet reset;
    String query;

    public LoginAdmin() {
    }

    public boolean cekadmin(String user, String pass) throws SQLException {
        boolean status = false;
        conn = Kelas_Database.Koneksi();
        query = "select * from sam where usernam='" + user + "' AND passw='" + pass + "'";
        stat = conn.createStatement();
        reset = stat.executeQuery(query);

        if (reset.next()) {
            status = true;
            JOptionPane.showMessageDialog(null, "Berhasil Login");
            Homepage home = new Homepage();
            home.setVisible(true);
        } else {
            status = false;
        }
        return status;

    }
}
