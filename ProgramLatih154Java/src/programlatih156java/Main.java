package programlatih156java;
import java.sql.*;
/**
 *
 * @author epurwanto
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        //String url = "jdbc:odbc:Sisfonil";
        ResultSet rslt; 
        String qry;
        int JmlRekord;
        String user="root";
        String pwd="admin";
        String host="localhost";
        String db="dbpenggajian";
        String urlValue="";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            urlValue="jdbc:mysql://"+ host +"/"+ db +"?user=" + user +"&password="+ pwd;
            Connection conn=DriverManager.getConnection(urlValue);
            Statement st=conn.createStatement();
            qry="Select Count(*) from absen";
            rslt=st.executeQuery(qry);
            rslt.next();
            JmlRekord=rslt.getInt(1);
            System.out.println("Tabel Absen Sebelum Di Tambah Rekord");
            System.out.println("Jumlah rekord="+JmlRekord+"\n");
            st.executeUpdate("insert into absen "+
            "values('K000002','000000002','KUNING')");
            st.executeUpdate("insert into absen "+
            "values('K000003','000000003','HIJAU')");
            st.executeUpdate("insert into absen "+
            "values('K000004','000000004','HIJAU')");
            qry="Select Count(*) from absen";
            rslt=st.executeQuery(qry);
            rslt.next();
            JmlRekord=rslt.getInt(1);
            System.out.println("Tabel Absen Setelah Di Tambah Rekord");
            System.out.println("Jumlah rekord="+JmlRekord+"\n");
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


