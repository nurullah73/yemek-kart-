package yemekPaketi;

//Kalıtım (is-a)
class Ogrenci_YemekKarti extends YemekKarti{
//Overloading
//Overriding
	void yemek(int yemekUcreti, String kt) {
		if(kt=="indirimli") {
			if(bakiye>=yemekUcreti-2) {
			yemekUcreti= yemekUcreti-2;
			bakiye = bakiye - yemekUcreti-2;		
			}
		else {
			System.out.println("Yetersiz Bakiye");
			}
		}
	}
}