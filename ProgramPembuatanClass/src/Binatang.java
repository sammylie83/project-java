/*
 * Program Class Binatang
 */

/**
 *
 * @author sammy
 */
public class Binatang {
private String suara;
private String makanan;
private int kaki;

public Binatang() {
    this.suara = "Suara Binatang";
    this.makanan = "Makanan Binatang";
    this.kaki = 4; // misalkan kakinya 4
}

public Binatang(String suaranya, String makanannya, int kakinya) {
    suara = suaranya;
    makanan = makanannya;
    kaki = kakinya;
}

public void setSuara(String suaranya){
    suara = suaranya;
}

public void setMakanan(String makanannya) {
    makanan = makanannya;
}

public void setKaki(int kakinya) {
    kaki = kakinya;
}

public String getSuara() {
    return suara;
}
 
public String getMakanan() {
    return makanan;
}

public int getkaki() {
    return kaki;
}

public void infoBinatang() {
    System.out.println("Makanan = " +makanan);
    System.out.println("Suara = " +suara);
    System.out.println("Kaki = " +String.valueOf(kaki));
    System.out.println(" "); //dikosongkan untuk jarak
}

public static void main(String[] args){
    System.out.println("<= membuat Objek kuda secara default =>");
    Binatang kuda = new Binatang();
    kuda.infoBinatang();
    
    System.out.println("<= membuat Objek Singa dengan parameter =>");
    Binatang singa = new Binatang("Mengaum", "Daging", 4);
    singa.infoBinatang();
    
    System.out.println("<= membuat Objek ayam dengan parameter =>");
    Binatang ayam = new Binatang();
    ayam.setSuara("Kukuruyuk");
    ayam.setMakanan("Biji-bijian");
    ayam.setKaki(2);
    ayam.infoBinatang();
    }
}