/*
 * Program Percabangan If
 */

package projectlatih20java;

/**
 *
 * @author epurwanto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] percabangan) {
        // TODO code application logic here
        double ipk = 3.15;
        int umur = 24;
        String pendidikan = "diploma";
        System.out.println("Pendidikan  = " + pendidikan + "\nIPK = " + ipk + "\nUmur = " + umur);
        if (pendidikan == "diploma")
        {
            if (ipk >= 3.00)
            {
                if (umur <= 30)
                    System.out.println("Memenuhi persyaratan");
            }
        }
    }

}
