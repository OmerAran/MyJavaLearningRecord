
public class Main {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4} ;
		
		double sum =0;
		
	
		for(int i =1 ; i<numbers.length ; i++) {
		
					sum += (1 / i);
					
		} 
		
		double result = numbers.length / sum  ;
		
		System.out.println(result);

	}

}
