/*
 * formedit.java
 *
 * Created on February 24, 2011, 5:37 PM
 */ 

package formedit;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author  sammylie
 */
public class formedit extends javax.swing.JFrame {
    private String user = "root";
    private String password = "admin";
    private String host = "localhost";
    private String db = "latihan";
    private String urlValue= "";
    private Connection conn = null;
    /** Creates new form formedit */
    
    public formedit() {
        initComponents();
        jButton1.setEnabled(false);
        try {

            Class.forName("com.mysql.jdbc.Driver");
            urlValue= "jdbc:mysql://" + host + "/" + db + "?user=" + user + "&password=" + password;
             conn =DriverManager.getConnection(urlValue);
        }
        catch (ClassNotFoundException e) {
            System.out.println("Driver tidak ditemukan");
        }
        catch (SQLException e)
        {
            System.out.println("Koneksi gagal");
        }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("User ID");

        jLabel2.setText("Password");

        jLabel3.setText("Jabatan");

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cek User");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
          PreparedStatement statement = null;
          String query = "update user set password=? , jabatan=? where user_id = ?";
          statement = conn.prepareStatement(query);

          statement.setString(1, jTextField2.getText());
          statement.setString(2, jTextField3.getText());
          statement.setString(3, jTextField1.getText());

            if (statement.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(this, "Edit Sukses", "Informasi", JOptionPane.INFORMATION_MESSAGE);

            } else {
              JOptionPane.showMessageDialog(this, "Edit gagal", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }

          statement.close();
          jTextField1.setText("");
          jTextField2.setText("");
          jTextField3.setText("");
        }
        catch (SQLException e) {
            System.out.println("Koneksi gagal");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from user where user_id = '?'" + jTextField1.getText());

            if (rs.next()) {
                jButton1.setEnabled(true);
                jTextField2.setText(rs.getString("password"));
                jTextField3.setText(rs.getString("jabatan"));
            }
            else {
                JOptionPane.showMessageDialog(this, "User ID salah", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                jButton1.setEnabled(false);
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField1.requestFocus();
            }
        } catch (SQLException e) {
            System.out.println("Koneksi Gagal");
        }
    
    }//GEN-LAST:event_jButton2ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formedit().setVisible(true);
            }
        });
    } 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
    
}