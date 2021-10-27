package myPackage;

public class Main {

	public static void main(String[] args) {
		
		Fighter f1 = new Fighter("A", 13, 105, 98,24) ;
		Fighter f2 = new Fighter("B", 17, 99, 87,35) ;
		
		Match match = new Match(f1,f2,85,100);
		match.run();

	}

}
