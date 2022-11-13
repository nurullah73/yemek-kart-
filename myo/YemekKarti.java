package yemekPaketi;

class YemekKarti {
	int kart_no;
	String kart_turu;
	int bakiye; 
	
	void kartEkle(int kn, String kt) {
		kart_no = kn;
		kart_turu = kt;
		bakiye = 100;
	}
	void bakiyeYukle(int b) {
		bakiye = bakiye + b;
	}
	
	void yemek(int yemekUcreti) {
		if(bakiye<yemekUcreti) {
			System.out.println("Yetersiz Bakiye");
		}
		else {
			bakiye = bakiye - yemekUcreti;
			System.out.println(yemekUcreti + " harcandı.");
		}
	}
	void bakiyeGoruntuleme(){
		System.out.println("Bakiyeniz " + bakiye);
	}
}

