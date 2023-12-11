/*
 * Program Pencabangan if hubungan dan bentuk 1
 */

package projectlatih18java;
import javax.swing.JOptionPane;
/**
 *
 * @author epurwanto
 */
public class Main {

    public static void main(String[] args) {
         String	SNilai=JOptionPane.showInputDialog("Nilai Anda?");
		float Nilai=Float.parseFloat(SNilai);
        
	 String STinggi=JOptionPane.showInputDialog("Tinggi Badan?");
		float Tinggi_badan=Float.parseFloat(STinggi);
                
         String SUmur=JOptionPane.showInputDialog("Umur Anda?");
		float Umur=Float.parseFloat(SUmur);
		
		if ((Nilai>=55) && (Tinggi_badan>=170) && (Umur>=20))
		{
		System.out.println("Anda telah Lulus TES");
	}
	else
	{
	System.out.println("Maaf Anda Gagal");
	}
	}
    else
    {
        System.out.println("Maaf Anda Gagal");
    }
   }
}
