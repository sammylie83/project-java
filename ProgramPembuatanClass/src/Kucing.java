/*
 * Program class Kucing
 */

/**
 *
 * @author sammy
 */
public class Kucing {
/* attributes
 * mendeklarasikan atribut (variable yang dimiliki kucing
 */
    String nama;
    String warna;
    String suara;
    
  /* methods
   * mendeklarasikan tingkah laku (method) yang dimiliki kucing
   */
  
    public void makan(){
        System.out.println("Kucing bernama "+nama+" yang berwarna "+warna+" sedang makan");
    }
    
    public void tidur(){
        System.out.println("kucing bernama "+nama+" yang berwarna "+warna+" sedang tidur");
    }
        
    public void mengeong(){
        System.out.println("kucing bernama "+nama+" yang berwarna "+warna+" bersuara "+suara);
    }
    
    /*
     * memulai method main atau fungsi utama
     */
    
    public static void main (String[] args) {
    // membuat object kucingku dan kucingmu bertipe class Kucing
    Kucing kucingku = new Kucing();
    Kucing kucingmu = new Kucing();
    
    // mengisikan value ke dalam atribut
    kucingku.nama="mocin";
    kucingku.warna="putih";
    kucingku.suara="meoong";
    
    kucingmu.nama="karin";
    kucingmu.warna="hitam";
    kucingmu.suara="miauww";
    
    // memanggil method dari object
    kucingku.makan();
    kucingku.tidur();
    kucingku.mengeong();
    
    System.out.println();
    
    kucingmu.makan();
    kucingmu.tidur();
    kucingmu.mengeong();
    }
}
    

