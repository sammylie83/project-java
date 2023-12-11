/*
 * Program dengan methid pada class
 */

/**
 *
 * @author sammy
 */
public class Sekolah {
// mendefinisikan variabel nama dan tahun
// dengan memberikan nilai
    String nama = "SMU K-Bethel Petamburan";
    int tahun = 2002;

// membentuk method/fungsi dengan nama Cetak
void Cetak() {
    // menulis fungsi untuk mencetak
    
    System.out.println(" Sekolah = " + nama);
    System.out.println(" Lulus Tahun = " + tahun);
    // akhir dari blok method
    // akhir class Sekolah
    }

// memulai program dengan nama class Coba
public class Coba {
    // memulai program dengan nama class Coba
    // method bernama main
}
    public static void main(String[] args) {
       // membentuk objek dari Sekolah dengan nama smu
        Sekolah smu = new Sekolah ();
        
        //memanggil method Cetak
        smu.Cetak();
        // akhir dari method main
    }
    // akhir dari class Coba
}