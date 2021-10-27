package algorithmsPackage;

import java.util.Scanner;

/*
 * Klavyeden girilen 25 adet sayı içerisinden
 *  negatif olanların toplamını,
 *   çift sayıların çarpımını,
 *    7'ye eşit olanların adetini bulup 
 *    ekrana yazdıran programın algoritma ve akış diyagramını çiziniz.
 */

public class A14 {

	public static void main(String[] args) {
		int number,
		negativeNumber = 0,
		evenNumber=1,
		howManySeven=0,
		howManyNumbers;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("how many numbers will you enter ? ");
		howManyNumbers = sc.nextInt();
		
		
		for(int i =1 ;i<=howManyNumbers ;i++) {
			System.out.println("number "+i+" : ");
			number = sc.nextInt() ;
			
			if(number<0) {
				negativeNumber += number ;
			}
			
			if(number%2 == 0) {
				
				evenNumber *= number ;
			}
			
			if(number== 7) {
				howManySeven ++ ;
				
			}
			
			System.out.println();
			
			
		}
		

		System.out.println("Sum of negative numbers :  "+negativeNumber);
		System.out.println("mul of even numbers :  "+evenNumber);
		System.out.println("there are "+ howManySeven+" seven.");

	}

}
