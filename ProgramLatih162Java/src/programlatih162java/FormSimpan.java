/*
 * FormSimpan.java
 *
 * Created on March 2, 2011, 2:07 PM
 */

package programlatih162java;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author  epurwanto
 */
public class FormSimpan extends javax.swing.JFrame {
    private String user="root";
    private String pwd="admin";
    private String host="localhost";
    private String db="dbpenggajian";
    private String url="";
    private Connection conn=null;
    /** Creates new form FormSimpan */
    
    public FormSimpan() {
        initComponents();
        jButton2.setEnabled(false);
    try {
        Class.forName("com.mysql.jdbc.Driver");
            url="jdbc:mysql://"+ host +"/"+ db +"?user=" + user +
                "&password=" + pwd;
          conn =DriverManager.getConnection(url);
        }
    
    catch(ClassNotFoundException e) {
        System.out.println("Driver tidak ditemukan");
    }
    catch (SQLException e) {
        System.out.println("koneksi gagal:" + e.toString());
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
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        bCekKartu = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setText("EDIT KARTU ABSEN");

        jLabel2.setText("NO KARTU");

        jLabel3.setText("NIP");

        jLabel4.setText("WARNA");

        bCekKartu.setText("CEK KARTU");
        bCekKartu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCekKartuActionPerformed(evt);
            }
        });

        jButton2.setText("SIMPAN");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))))))
                .addGap(18, 18, 18)
                .addComponent(bCekKartu)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCekKartu))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCekKartuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCekKartuActionPerformed
        // TODO add your handling code here:
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from absen" + jTextField1.getText() + "");
            if (rs.next()) {
                jButton2.setEnabled(true);
//                jTextField1.setText(rs.getString("NoKartu"));
                jTextField2.setText(rs.getString("Nip"));
                jTextField3.setText(rs.getString("warna"));
            } else {
                JOptionPane.showMessageDialog(this, "No Kartu: Salah", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
                
                jButton2.setEnabled(false);
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField1.requestFocus();
            }
        } catch (SQLException e) {
            System.out.println("koneksi gagal" + e.toString());
        }
    }//GEN-LAST:event_bCekKartuActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            PreparedStatement pStatement = null;
            ResultSet rs = pStatement.executeQuery("update absen set Nip=?, warna=? where nokartu=?"+ jTextField1.getText() +"");
       
            
            pStatement.setString(1, jTextField2.getText());
            pStatement.setString(2, jTextField3.getText());
            pStatement.setString(3, jTextField1.getText());
            
            int intTambah= pStatement.executeUpdate();
            if (intTambah>0){
                JOptionPane.showMessageDialog(this, "Edit sukses", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(this, "Edit gagal", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            pStatement.close();
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
        } catch (SQLException e){
            System.out.println("koneksi gagal" + e.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSimpan().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCekKartu;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}