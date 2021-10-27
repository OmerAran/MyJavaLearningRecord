package emptyPackage;

import java.util.Scanner;

public class Main {

	
	static boolean isPalindrom (int oldNumber) {
		
		int temp = oldNumber  ;
		int reverseNumber =0 ,lastNumber ;
		System.out.println("========================================") ;
		while(temp !=0) {
			
			
			
			lastNumber = temp % 10 ;
			
			reverseNumber = (reverseNumber * 10) + lastNumber ;
			
			temp /= 10 ;
			}
		System.out.println("new number is : "+ reverseNumber);
		System.out.println("========================================") ;

		
		return true ;
	}
	
	
	public static void main(String[] args) {
		
     
		int number  ;
		
		System.out.println("number : ");
		
		Scanner sc = new Scanner(System.in) ;
		number = sc.nextInt() ;
		
		isPalindrom(number) ;
		

	}

}
