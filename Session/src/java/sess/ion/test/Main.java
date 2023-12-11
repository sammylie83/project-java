package sess.ion.test;

import sess.ion.bean.User;
import sess.ion.dao.UserDao;


/**
 * Program Java session 4 (Create by: sam) 
 * Date: 09 Mei 2011
 */
public class Main {

    public static void main(String args[]) {
    UserDao sd = new UserDao();
    User s = new User();
    String user = "admin";
    String password = "admin";
    
    s.setUsername(user);
    s.setPassword(password);
    System.out.println(sd.cek(s));
    }   
}
