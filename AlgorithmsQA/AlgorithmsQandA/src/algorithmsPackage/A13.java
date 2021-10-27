package algorithmsPackage;


/* 10 ile 1000 arasındaki tam kare sayıları
 *  ekrana yazdıran programın algoritma ve akış diyagramını çiziniz.*/


public class A13 {

	public static void main(String[] args) {
		
	int tamKare  ;
		
		int sayi ;
		System.out.print("10 ile 1000 arasındaki tam kare sayılar : ");
		for(sayi=4 ;sayi*sayi<=1000;sayi++) {
		
			tamKare = sayi*sayi ;
			System.out.print(tamKare+"  ");
		}
		

	}

}
