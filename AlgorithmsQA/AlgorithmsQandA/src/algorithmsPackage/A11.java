package algorithmsPackage;


import java.util.Scanner ;



public class A11 {
	
	public static int kupAlma(int x) {
		return x*x*x ;
		
		
	}

	public static void main(String[] args) {
		
		System.out.print("number : ");
		Scanner sc = new Scanner (System.in) ;
		int number = sc.nextInt() ;
		
		
		
		int sum = 0 ;
		if(number>99 && number<1000) {
			
		int a = number %10  ;
		int b = (number/10) %10 ;
		int c = ((number/10)/10) %10 ;
		int [] array =  {a,b,c };
		
		for(int i = 0 ; i<3 ; i++) {
			int kup = kupAlma(array[i]) ;
			
	       	sum = sum +kup ;
			
		}
		
		System.out.println("sum: "+sum);
		System.out.println("number: "+number);
		
		//370,153
		if(sum == number) {
			System.out.println("basamaklarının küp toplamna eşit.");
			
		}else {
			System.out.println("değil");
		}
		
		
		
		}
	}

	}













	
	
	
	
		
		
		
