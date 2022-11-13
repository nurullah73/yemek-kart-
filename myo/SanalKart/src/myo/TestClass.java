package myo;

import java.util.Random;
import java.util.Scanner;

import yemekPaketi.Address;
import yemekPaketi.YemekKarti;

public class TestClass {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		 int deger=0;
		 String isim;
		 String soyIsım;
		 String d;
		 String e;
		 
		 System.out.println("MIDYAT MYO KAMPUSE HOS GELDINIZ (: "+"\n"+
		 "LUTEN UYE OLUNUZ..");//ekrana üye olmasını söylüyor
		 System.out.println();
		System.out.println("isim degerini giriniz");//isim değerini isime atıyor
		isim = in.nextLine();
		
		System.out.println("soyisim degerini giriniz");//soy isime atama yapıyor
		soyIsım = in.nextLine();
		
		 System.out.println("lutfen kart numarasının son 4 sayısını giriniz");
		 
			
		try { if(in.hasNextInt()) {
			 deger= in.nextInt();}else {
				 deger=new Random().nextInt(9000);
				 System.out.println("kart degeri otomotik girildi");
			 }
			 
			 }catch(Exception ex) {
				 
				 deger=new Random().nextInt(1000);
				 System.out.println("kart degeri otomotik girildi");
			 }
		
		YemekKarti k1= new YemekKarti(deger,isim,soyIsım);
		System.out.println("Para ekleme ekranına gidiliyor..");
		System.out.println("-----------------------------------");
		System.out.println("TL yuklemek istermisiniz Evet için->1"+"\n"+"Hayir için->");
		Scanner scanner = new Scanner(System.in);
		
		if(scanner.nextInt()==1) {
			System.out.println("Ne kadar Yüklemek istersiniz:  ");
			try {
				
		           if(scanner.hasNextInt()) {
				k1.miktar=scanner.nextInt();
				}else {
					System.out.println("TL tutari 100 tl olarak belirlendi.");
				}
			
		}catch (Exception ex) {
			System.out.println("TL tutari 100 tl olarak belirlendi.");
			}
		
		}else if(scanner.nextInt()==2) {
		System.out.println("100 TL default olarak atandı.");
		}
		
			
			
		           
		
		
   k1.display();

System.out.println();
System.out.println();

System.out.println("SiMDi ALISVERiS YAPABiLiRSiNiZ");
System.out.println();
k1.yemekList();
Scanner ing =new  Scanner(System.in);
try { while (true) {int n=ing.nextInt();
 if(n>k1.miktar) {
	 System.out.println("BAKiYE YETERSiZ YUKLENECEK TUTARI GiRiNiZ");
	 k1.miktar+=ing.nextInt();
	 System.out.println("YENi BAKiYE : "+k1.miktar);
 }else {
	 
switch(n) {
case 1:
	k1.miktar -=3;
	System.out.println("KALAN : "+k1.miktar+" TL");
	break;
case 2:
	k1.miktar -=3;
	System.out.println("KALAN : "+k1.miktar+" TL");
	break;
case 3:
	k1.miktar -=5;
	System.out.println("KALAN : "+k1.miktar+" TL");
	break;
case 4:
	k1.miktar -=6;
	System.out.println("KALAN : "+k1.miktar+" TL");
	break;
case 5:
	k1.miktar -=9;
	System.out.println("KALAN : "+k1.miktar+" TL");
	break;
case 6:
	k1.miktar -=15;
	System.out.println("KALAN : "+k1.miktar+" TL");
	break;
case 7:
	k1.miktar -=10;
	System.out.println("KALAN : "+k1.miktar+" TL");
	break;
case 8:
	k1.miktar -=7;
	System.out.println("KALAN : "+k1.miktar+" TL");
	break;
case 9:
	k1.miktar -=5;
	System.out.println("KALAN : "+k1.miktar+" TL");
	break;
case 10:	
	k1.miktar -=9;
	System.out.println("KALAN : "+k1.miktar+" TL");
	break;
	default:
		System.out.println("GECERSiZ DEGER ALISVERiS TAMAMLANDI");
		break;
}
 }}

}catch(Exception ex) {
	System.out.println("GECERSiZ DEGER ALISVERiS TAMAMLANDI");
}
}

	}
