package java101;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int [] list= {15,12,788,1,-1,-778,2,0} ;
		int min= list[0];
		int max= list[0];
		for(int i : list) {
			if(i<min) {
				min = i ;
			}
			
			if(i>max) {
				max = i ;
			}
		}
		
		System.out.println("max : "+max+"    "+"min : "+min);
		
	}
}


