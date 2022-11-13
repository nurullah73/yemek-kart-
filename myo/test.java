package yemekPaketi;

public class test {
	static YemekKarti Ogrenci1 = new YemekKarti();
	static YemekKarti Ogrenci2 = new YemekKarti();
	public static void main(String[] args) {
		Ogrenci1.bakiyeYukle(25);
		Ogrenci1.bakiyeGoruntuleme();
		Ogrenci1.bakiyeYukle(30);
		Ogrenci1.bakiyeGoruntuleme();
		
		Ogrenci2.kartEkle(2, "indirimli");
		Ogrenci2.bakiyeGoruntuleme();
		Ogrenci2.yemek(30);
		Ogrenci2.bakiyeGoruntuleme();
		Ogrenci2.yemek(80);
		Ogrenci2.bakiyeGoruntuleme();
	}
}
