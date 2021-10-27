import java.util.Scanner ;

public class Main {

	public static void main(String[] args) { 
		
    
		
		
		
		int [][] matrix = new int [3][4] ; // i create a matrix , have 3 rows and 4 columns.
		
		Scanner value = new Scanner(System.in) ; // user can give me a value
		
		 System.out.println("enter "+matrix.length +" rows and "+matrix[0].length+ " columns" );
          
		   for(int row = 0 ; row < matrix.length ; row++) { // icice for loop 
			   
			  for( int column = 0 ; column < matrix[row].length ; column++ ){
				 
			    matrix [row][column] = value.nextInt() ;
			   
			 }
	
		   }
		   
		   
		   
		   for(int row = 0 ; row < matrix.length ; row++) { 
			   
				  for( int column = 0 ; column < matrix[row].length ; column++ ){
					 
				   System.out.print( matrix[row][column] + "  ");
				   
				 }
				  System.out.println();
		
			   }

	      
	}
}	
	
