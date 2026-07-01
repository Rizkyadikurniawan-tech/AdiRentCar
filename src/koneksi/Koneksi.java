/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author kurni
 */
public class Koneksi {
    Connection conn;

    public Connection getConnection() {

        try {

            String url =
                    "jdbc:mysql://localhost:3306/adirentcar";

            String user = "root";

            String pass = "";

            DriverManager.registerDriver(
                    new com.mysql.cj.jdbc.Driver()
            );

            conn = DriverManager.getConnection(
                    url,
                    user,
                    pass
            );

            System.out.println("Koneksi Berhasil");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Koneksi Gagal : " + e
            );
        }

        return conn;
    }
}
