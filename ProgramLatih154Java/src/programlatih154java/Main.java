/*
 * Program Koneksi Database
 */

package programlatih154java;

import java.sql.*;
/**
 *
 * @author epurwanto
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        String user="root";
        String pwd="admin";
        String host="localhost";
        String db="dbpenggajian";
        String urlValue="";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            urlValue="jdbc:mysql://"+ host +"/"+ db +"?user=" + user +"&password="+ pwd;
            Connection conn=DriverManager.getConnection(urlValue);
            System.out.println("koneksi sukses");
            conn.close();
        }
        catch (SQLException e){
            System.out.println ("koneksi gagal "+e.toString());
        }
        catch(ClassNotFoundException e) {
            System.out.println("jdbc.Driver tidakditemukan");
        }
    }
}
