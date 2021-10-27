package chapter2.FirstJavaCode;

public class Selam {
	
	String world = "millet" ;
	
	public String SelamSoyle(String kime) {
		String cumle ;
		
	if(kime != "")
		cumle = "Selam "+ kime+ " : )" ;
	else 
		cumle = "Selam "+ world+ " : )" ;
	
	return cumle ;
}

}
