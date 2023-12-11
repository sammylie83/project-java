/*
 * Program Melihat Isi tabel (Record)
 */

package programlatih155java;
import java.sql.*;
/**
 * @author epurwanto
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String user="root";
        String pwd="admin";
        String host="localhost";
        String db="dbpenggajian";
        String urlValue="";
        int no=0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            urlValue="jdbc:mysql://"+ host +"/"+ db +"?user=" + user +"&password="+ pwd;
            Connection conn=DriverManager.getConnection(urlValue);
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("Select * from absen");
            while (rs.next()) {
                no=no+1;
                System.out.println(no + ")");
                System.out.println("No kartu  :"+rs.getString("nokartu"));
                System.out.println("Nip       :"+rs.getString("Nip"));
                System.out.println("Warna     :"+rs.getString("warna"));
                System.out.println("==================================");
            }
            st.close();
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
