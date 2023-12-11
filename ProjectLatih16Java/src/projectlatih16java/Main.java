/*
 * Program Pencabangan If Sederhana
 */

package projectlatih16java;

import javax.swing.JOptionPane;
/**
 *
 * @author epurwanto
 */
public class Main {

    public static void main(String[] args) {
     String Ket = "Gagal";
		String	SNilai=JOptionPane.showInputDialog("Nilai Anda?");

		float Nilai=Float.parseFloat(SNilai);
		if (Nilai>=55)
		{
			Ket="Lulus";
		}
		System.out.println(Ket);
    }

}
