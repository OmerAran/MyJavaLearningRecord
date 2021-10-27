package algorithmsPackage;

public class A15 {

	public static void main(String[] args) {
		int result = 0 ;
		for(int i=1 ;i<=10 ; i++) {
			
			for(int j =1 ; j<=10; j++) {
				
				 result = i*j ;
				 System.out.print(i+"x"+j+":");
				 System.out.print(result+"   ");
				
			}
			System.out.println();
			
		}

	}

}
