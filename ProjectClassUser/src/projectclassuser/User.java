/*
 * Program Login sederhana menggunakan servlet
 */

package projectclassuser;

/**
 *
 * @author epurwanto
 */
public class User {

    private String username;
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void login(String username, String password) throws Exception {
        this.username = username;
        this.password = password;
        this.login();
    }

    public void login() throws Exception {
        //Hardcode
        if (!(this.username.equals("username") && this.password.equals("password"))) {
            throw new Exception("Invalid Login");
        }
    }
}

