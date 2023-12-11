/*
 * Program Pencabangan If Majemuk
 */

package projectlatih17java;
import javax.swing.JOptionPane;
/**
 *
 * @author epurwanto
 */
public class Main {
    
    public static void main(String[] args) {
        String sNilai=JOptionPane.showInputDialog("Nilai Anda?");
        float Nilai=Float.parseFloat(sNilai);
        if (Nilai>=55)
        {
          System.out.println("Lulus");
        }
        else
        {
          System.out.println("Gagal");
        }
    }

}
