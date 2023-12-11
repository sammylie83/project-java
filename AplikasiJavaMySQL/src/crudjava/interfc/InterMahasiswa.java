/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crudjava.interfc;

import crudjava.entity.Mahasiswa;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author bahrie
 */
public interface InterMahasiswa {

    Mahasiswa insert(Mahasiswa o) throws SQLException;

    void update(Mahasiswa o) throws SQLException;

    void delete(String nim) throws SQLException;

    List<Mahasiswa> getAll() throws SQLException;
}
