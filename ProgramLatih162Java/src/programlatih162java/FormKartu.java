/*
 * FormKartu.java
 *
 * Created on March 2, 2011, 1:24 PM
 */

package programlatih162java;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.JOptionPane;
/**
 *
 * @author  sammy
 */
public class FormKartu extends javax.swing.JFrame {
private String user = "root";
private String password = "admin";
private String host = "localhost";
private String db = "dbpenggajian";
private String urlvalue = "";
private Connection conn=null;
    /** Creates new form FormKartu */


    public FormKartu() {
        initComponents();
        showTable();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormKartu().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
     private Object[][] getData()
        {
        Object[][] data1 = null;

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            urlvalue = "jdbc:mysql://" + host + "/" + db + "?user=" + user + "&password=" + password;
             conn =DriverManager.getConnection(urlvalue);
             Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("Select * from absen");
            
            rs.last();
            int rowCount = rs.getRow();
            rs.beforeFirst();

            data1 = new Object[rowCount][3];

            int no=-1;
               while (rs.next())
{
                no=no+1;
                data1[no][0]=rs.getString("nokartu");
                data1[no][1]=rs.getString("Nip");
                data1[no][2]=rs.getString("warna");
                
               }
               st.close();
               conn.close();
        }

        catch (ClassNotFoundException e)
        {
JOptionPane.showMessageDialog(this, "kelas Tidak ditemukan", "Driver gagal", JOptionPane.ERROR_MESSAGE);
        }

        catch (SQLException e)
        {
JOptionPane.showMessageDialog(this, "Pengambilan Data Gagal", "Informasi", JOptionPane.ERROR_MESSAGE);
        }
        return data1;
        }

private void showTable ()
    {
        String[] columnNames = {"NO KARTU","NIP","WARNA"};

        JTable table = new JTable (getData(),columnNames);
        jScrollPane1.setViewportView(table);
    }

}
