package yemekPaketi;

import java.util.Scanner;

public class YemekKarti {
	public	int id;
	public	String name;
	public	String surname;                    //HAS-A
	public	static String kampus_ismi="Midyat MYO";
    public	int miktar=100;                       	// bakiye 100tl.
	

public YemekKarti(int id,String name,String surname) {
	this.id =id;
	this.name=name;
	this.surname=surname;
	
}
 
public void display() {
	System.out.println("id degeri  : "+ id);
	System.out.println("isim       : "+ name);
	System.out.println("Soyisim    : "+ surname);
	System.out.println("Kampus     : "+ kampus_ismi);
	System.out.println("Bakiye     : "+ miktar);
}
 
public void yemekList() {
	System.out.println("1-Su     3 TL             6-Tost      15  TL    \n"
			         + "2-Çay    3 TL             7-Simit     10  TL    \n"
			         + "3-Kahve  5 TL             8-Kraker     7  TL    \n"
			         + "4-Soda   6 TL             9-Biskuvi    5  TL    \n"
			         + "5-Kola   9 TL            10-Cips       9  TL      ");
System.out.println();
System.out.println("SATIN ALINACAK URUNLERIN NUMARASINI GIRIN");}



}
