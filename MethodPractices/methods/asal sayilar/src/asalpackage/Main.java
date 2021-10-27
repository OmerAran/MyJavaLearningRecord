package asalpackage;

import java.util.Scanner;

public class Main {

	
	public static boolean asalMi(int number) {
		 
		int counter = 0 ;
		
		for(int i=2 ; i<number ; i++) {
			
			if(number%i == 0) {
				counter++ ;
				}
		}
		
		if(counter==0) {
			return true ;
		}
		else {
			return false ;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in) ;
		
		System.out.println("Sayı giriniz : ");
		int sayi = sc.nextInt();
		
		if(asalMi(sayi)) {
			System.out.println(sayi +" sayısı ASALDIR !");
			
		}
		else {
			System.out.println(sayi+ " sayısı ASAL değildir !");
		}

	}

}
