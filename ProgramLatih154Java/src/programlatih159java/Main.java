/*
 * Program Menghapus Rekord Tabel
 */

package programlatih159java;
import java.sql.*;
/**
 *
 * @author epurwanto
 */
public class Main {
public static void main(String[] args) {
        ResultSet rslt; 
        String qry;
        int JmlRekord;
        String user="root";
        String pwd="admin";
        String host="localhost";
        String db="dbpenggajian";
        String urlValue="";
        String fnokartu,fNip,fwarna;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            urlValue="jdbc:mysql://"+ host +"/"+ db +"?user=" + user +"&password="+ pwd;
            Connection conn=DriverManager.getConnection(urlValue);
            Statement st=conn.createStatement();
            qry = "SELECT * from absen";
            rslt = st.executeQuery(qry);
            System.out.println("DATA-DATA ABSEN SEBELUM DI HAPUS              ");
            System.out.println("--------------------------------------------------");
            JmlRekord=0;
         // Mencetak Rekord
         System.out.println("No Kartu        Nip            Warna");
         System.out.println("--------------------------------------------------");
         while (rslt.next()) {
            fnokartu = rslt.getString("nokartu");
            fNip = rslt.getString("Nip");
            fwarna = rslt.getString("warna");
            System.out.print(fnokartu+" ");
            System.out.print(fNip+"  ");
            System.out.print(fwarna+"\n");
            JmlRekord++;
         }
         System.out.println("--------------------------------------------------");
         System.out.println("Jumlah Absen = "+JmlRekord+ " Kartu");
         //Menghapus Absen yang Nip-nya 000000004
         qry="Delete from absen Where Nip='000000004'";
         st.executeUpdate(qry);
         //Menampilkan Rekord Setelah di Update
         qry = "SELECT * from absen";
         rslt=st.executeQuery(qry);
         System.out.println("DATA-DATA ABSEN SETELAH DI HAPUS              ");
         System.out.println("--------------------------------------------------");
         JmlRekord=0;
         // Mencetak Rekord
         System.out.println("No Kartu              Nip        Warna");
         System.out.println("--------------------------------------------------");
         while (rslt.next()) {
            fnokartu = rslt.getString("Nokartu");
            fNip = rslt.getString("Nip");
            fwarna = rslt.getString("Warna");
            System.out.print(fnokartu+" ");
            System.out.print(fNip+"  ");
            System.out.print(fwarna+"\n");
            JmlRekord++;
         }
         System.out.println("--------------------------------------------------");
         System.out.println("Jumlah Absen = "+JmlRekord+ " Kartu");
            st.close();
            conn.close();
        }
        catch (SQLException e){
            System.out.println ("koneksi gagal "+e.toString());
        }
        catch(ClassNotFoundException e) {
            System.out.println("jdbc.Driver tidak ditemukan");
        }
    }
}

