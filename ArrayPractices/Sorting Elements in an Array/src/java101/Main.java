package java101;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in) ;
		System.out.print("dizinin boyutu :  ");
		int n = sc.nextInt() ;
		 
		int [] array = new int [n] ;
		
		for(int i = 0 ; i < n ; i++) 
		{
			System.out.print( (i+1) +". elemanı giriniz : ");
			
			 array[i] = sc.nextInt() ;
		}
		
		Arrays.sort(array);
 	
		System.out.println("sıralama : "+Arrays.toString(array));
		
	}
}
