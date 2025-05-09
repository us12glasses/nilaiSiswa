/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

/**
 *
 * @author Ghozi
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class koneks {
    public static Connection con;
    public static Statement stm;
    public void konek(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sekolah","root","");
        stm = con.createStatement();
        } catch(ClassNotFoundException | SQLException e) {
        JOptionPane.showMessageDialog(null, "koneksi gagal....");
        System.out.println(e.getMessage());
        }
    }
}
