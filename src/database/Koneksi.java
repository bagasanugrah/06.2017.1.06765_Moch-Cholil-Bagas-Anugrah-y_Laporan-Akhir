package database;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



public class Koneksi {
    public static Connection koneksiDB() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection koneksi = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Bagas_06765", "bagasanugrah");
            return koneksi;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}