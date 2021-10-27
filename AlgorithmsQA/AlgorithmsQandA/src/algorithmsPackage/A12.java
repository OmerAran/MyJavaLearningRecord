package algorithmsPackage;


import java.util.Scanner;


/* 
 * Klavyeden girilen 20 adet sayıdan çift sayıların toplamının
 *  tek sayıların toplamına oranını bulan programın
 *   algoritma ve akış diyagramını çiziniz. */


public class A12 {

	public static void main(String[] args) {
		
		 int sayi ;
			double tekToplam = 0;
			double ciftToplam = 0 ;
			double oran =0;
			
			Scanner sc= new Scanner(System.in) ;
			
			for(int i =1 ; i<=20 ; i++) {
				System.out.print(i+". sayiyi girin: ");
				 sayi = sc.nextInt() ;
				 
				 if(sayi%2==0) {
					 
					 ciftToplam += sayi ; 
				 }
				 else {
					 tekToplam += sayi ; 
				 }
				
			}
			
			oran = ciftToplam / tekToplam ;
			
			System.out.println("oran = "+oran);

		}

	}


