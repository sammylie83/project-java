/*
 * Program Pencabangan Switch
 */

package projectlatih21java;
import javax.swing.JOptionPane;
/**
 *
 * @author epurwanto
 */
public class Main {
    public static void main(String[] args) {
        
    String Pilihan =JOptionPane.showInputDialog("Menu Bangun:\n1. Segi tiga\n2. Persegi Empat\n3. Bujur Sangkar"); 
            int Pilih=Integer.parseInt(Pilihan);
            switch(Pilih)
            {
                case 1:
                
                String SAlas=JOptionPane.showInputDialog("Alas?");
                double A=Double.parseDouble(SAlas);
                
                String STinggi=JOptionPane.showInputDialog("Tinggi?");
                double T=Double.parseDouble(STinggi);
                
                double Luas1=A*T*0.5;
                String SLuas=Double.toString(Luas1);
                System.out.println("Luas Segi Tiga(Luas1=A*T*0.5)=" +SLuas);
                break;
                
                case 2:
                
                String SPanjang=JOptionPane.showInputDialog("Panjang?");
                float P=Float.parseFloat(SPanjang);
                
                String SLebar=JOptionPane.showInputDialog("Lebar?");
                float L=Float.parseFloat(SLebar);
                float Luas2=P*L;
                String SLuas2=Float.toString(Luas2);
                System.out.println("Luas Persegi Empat (Luas2=P*L) =" +SLuas2);
                break;
                
                case 3:
                
                String SSisi=JOptionPane.showInputDialog("Sisi?");
                Double S=Double.parseDouble(SSisi);
                double Luas3=S*S;
                String SLuas3=Double.toString(Luas3);
                System.out.println("Luas Bujur Sangkar (Luas3=S*S) ="+SLuas3);
                break;
            }
        }
    }
            
                
                
                
                   
