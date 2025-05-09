/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

/**
 *
 * @author Ghozi
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class config {
    public static Connection con;
    
    public static Connection Con() {
        try {
            String url = "jdbc:mysql://localhost/sekolah";
            String u = "root";
            String p = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, u, p);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
    
    public static void main (String args []) {
        System.out.println(config.Con());
    }
}
