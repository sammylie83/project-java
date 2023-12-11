package sess.ion.dao;

import java.sql.*;
import sess.ion.util.*;
import sess.ion.bean.*;


/**
 * Program Java session 2 (Create by: sam) 
 * Date: 09 Mei 2011
 */
public class UserDao {

    private ConMan conn = new ConMan();
    
    public String cek(User user) {
        String Hasil ="0";
        Connection conDB = null;
        try {
            conDB = conn.logon();
            String query = "SELECT * from user where username=? and password=?";
            
            PreparedStatement st = conDB.prepareStatement(query);
            st.setString(1, user.getUsername());
            st.setString(2, user.getPassword());
            
         try {
             ResultSet rs = st.executeQuery();
             if (rs.next()){
                 Hasil ="1";
             }
         } catch (SQLException e){
             System.out.println("Error " + e.getMessage());
             Hasil ="0";
         }
        }    catch (SQLException e){
               System.out.println("Error " + e.getMessage());
               Hasil ="0";
           }   
            return Hasil;
        }
    }
    
    
    
