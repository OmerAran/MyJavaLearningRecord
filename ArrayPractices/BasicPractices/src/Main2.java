import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {
		
		int [] newArray = {23,25,27,29} ; // creaate a array.
		
		int [] copyOfArray = Arrays.copyOf(newArray, 2);   // use a method from Arrays , and copy array which you want.
		
		System.out.println(Arrays.toString(copyOfArray));  // print your new copy array in console
		
		
		////////////////////////////////////////////////////////
		
		int [] range = { 13,24,35,46,57,68,79}; // create a array.
		
		int [ ] copyofrange = Arrays.copyOfRange(range, 0,2); // use a methohd from arrays again, and  determine what range
		
		System.out.println(Arrays.toString(copyofrange));  // print it.
		

		
		
		
		// there are lots of methods in  java.util.Arrays . you can search if you are wondering.
		/* 
		 
		 
		 some of these methods names : 
		 
		 Arrays.toString()
		 Arrays.fill()
		 Arrays.sort()
		 Arrays.binarySearch()
		 Arrays.copyOf() 
		 Arrays.copyOfRange()
		 Arrays.equals() 
		 
		 */
	}

}
