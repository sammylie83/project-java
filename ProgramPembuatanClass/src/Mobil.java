class Mobil {
	String aktifitas;
	String warna;
	int kecepatan;
	void cekKecepatan() {
		if (kecepatan==0)
			aktifitas="parkir";
		}
	void cetakAtribut() {
	System.out.println("Aktifitas	="+aktifitas);
	System.out.println("Warna		="+warna);
	System.out.println("Kecepatan	="+kecepatan);
	}

	public static void main(String [] args) {
		Mobil mobilku = new Mobil();
		mobilku.kecepatan=0;
		mobilku.warna="merah";
		mobilku.cekKecepatan();
		mobilku.cetakAtribut();
	}
}