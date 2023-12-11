
package sess.ion.bean;

/**
 * Program Java session 1 (Create by: sam) 
 * Date: 09 Mei 2011
 * 
 */
public class User {
    private int id;
    private String username;
    private String password;
    public int getId(){
        return id;
    }
    
public void setId(int id){
    this.id = id;
}
    
public String getPassword(){
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

public String getUsername(){
    return username;
}
    
public void setUsername(String username){
    this.username = username;
 }
}
