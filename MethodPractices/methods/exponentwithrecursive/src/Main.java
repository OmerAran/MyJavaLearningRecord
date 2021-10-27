import java.util.Scanner;

public class Main {

	static int powerRecursive(int base, int exponent) {
       
		if(exponent==0 && base !=0) return 1;
		
        else if(base==1) return 1;
		
        else if (exponent==0 && base==0)
        { int error = 010000 ; // it should give error.
        	 return error ;
        }
		
        else {
            return base*powerRecursive(base, exponent-1);
        }
    }

	public static void main(String[] args) {
		
		
	   
	        Scanner input = new Scanner(System.in);
	        System.out.print("base :");
	        
	        int base = input.nextInt();
	        System.out.print("exponent:");
	        
	        int exponent = input.nextInt();
	        System.out.println(powerRecursive(base,exponent));
	    }

	}


