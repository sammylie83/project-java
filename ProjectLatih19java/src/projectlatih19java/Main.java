/*
 * Program Statement If
 */

package projectlatih19java;
import javax.swing.JOptionPane;

/**
 *
 * @author epurwanto
 */
public class Main {
    
    public static void main(String[] args) {
    int nilai;
    String n;
    
    n=JOptionPane.showInputDialog(" Input nilai:");
    nilai =Integer.parseInt(n);
    if (nilai <=60)
        JOptionPane.showMessageDialog(null, "Maaf Anda Tidak Lulus");
    
    else
        JOptionPane.showMessageDialog(null, "Anda Lulus Ujian");
    }
}
