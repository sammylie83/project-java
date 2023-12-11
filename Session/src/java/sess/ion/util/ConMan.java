package sess.ion.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *Program Java session 3 (Create by: sam) 
 * Date: 09 Mei 2011
 */
public class ConMan {

    private Connection conn;
    private String url = "jdbc:mysql://localhost:3306/sam_java_session";
    private String user ="root";
    private String password = "admin";
    
    public ConMan (String url, String user, String password){
        this.url = url;
        this.user = user;
        this.password = password;
    }
    
    public ConMan(){ 
    }

    public Connection logon(){
        conn = null;
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected Succesded");
          
        } catch (SQLException e){
            System.out.println("Connection Error : " + e.getMessage());
        }
    
        return conn;
    }
    
    public void logOff() {

    try {

    if (conn != null) {

        conn.close();

        System.out.println("Connection Closed");

         }

         } catch (SQLException e) {

        System.out.println("Connection Error : " + e.getMessage());

         }

         }

    public static void main(String args[]){

    ConMan cm = new ConMan();

    cm.logon();

   }

  }
    
    
    