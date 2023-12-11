/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package crudjava.implement;

import crudjava.entity.Mahasiswa;
import crudjava.interfc.InterMahasiswa;
import crudjava.koneksi.DatabaseUtilities;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bahrie
 */
public class ImpleMahasiswa implements InterMahasiswa{

    public Mahasiswa insert(Mahasiswa o) throws SQLException {
        PreparedStatement st=DatabaseUtilities.getConnection().prepareStatement("insert into mahasiswa values(?,?,?)");
        st.setString(1, o.getNim());
        st.setString(2, o.getNama());
        st.setString(3, o.getAlamat());
        st.executeUpdate();
        return o;
    }

    public void update(Mahasiswa o) throws SQLException {
        PreparedStatement st=DatabaseUtilities.getConnection().prepareStatement("update mahasiswa set nama=?,alamat=? where nim=?");
        
        st.setString(1, o.getNama());
        st.setString(2, o.getAlamat());
        st.setString(3, o.getNim());
        st.executeUpdate();
    }

    public void delete(String nim) throws SQLException {
        PreparedStatement st=DatabaseUtilities.getConnection().prepareStatement("delete from mahasiswa where nim=?");
        st.setString(1, nim);
        st.executeUpdate();
    }

    public List<Mahasiswa> getAll() throws SQLException {
        Statement st=DatabaseUtilities.getConnection().createStatement();
        ResultSet rs=st.executeQuery("select * from mahasiswa");
        List<Mahasiswa>list=new ArrayList<Mahasiswa>();
        while(rs.next()){
            Mahasiswa mhs=new Mahasiswa();
            mhs.setNim(rs.getString("nim"));
            mhs.setNama(rs.getString("nama"));
            mhs.setAlamat(rs.getString("alamat"));
            list.add(mhs);
        }
        return list;
    }

}
