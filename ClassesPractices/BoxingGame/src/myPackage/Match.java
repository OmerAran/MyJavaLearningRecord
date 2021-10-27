package myPackage;

import java.util.Random;

public class Match {
	
	 Fighter f1 ;
	 Fighter f2 ;
	 int minWeight ;
	 int maxWeight ;
	 
	 
	public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
		super();
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
	}
	 
public void run() {
	if(isCheck()) {
	if(isWhoStart()) { 
		
            while(this.f2.health>0 && this.f1.health>0) {
			
			this.f2.health = this.f1.hit(this.f2) ;
			
			System.out.println(this.f2.name + " health :  "+this.f2.health +"   "+this.f1.name+"  health : "+this.f1.health );
			System.out.println("_____________");
			if(isWin()) {
				break ;
			}
			
			this.f2.health = this.f1.hit(this.f2) ;
			if(isWin()) {
				break ;
			}
			
			
		}
	}else {
		
        while(this.f1.health>0 && this.f2.health>0) {
			
			this.f1.health = this.f2.hit(this.f1) ;
			System.out.println(this.f1.name + " health :  "+this.f1.health +"   "+this.f2.name+"  health : "+this.f2.health );
			System.out.println("_____________");
			if(isWin()) {
				break ;
			}
			
			this.f1.health = this.f2.hit(this.f1) ;
			if(isWin()) {
				break ;
			}
			
			
		}
	}
		
		
	}
	else {
		System.out.println("Sporcuların sikletleri uyuşmuyor.");
	}
}

public boolean isCheck() {
	
	return (this.f1.weight>=minWeight && this.f1.weight<=maxWeight) && (this.f2.weight>=minWeight && this.f2.weight<=maxWeight) ; 
	
	
}
	
	
public boolean isWin() {
	
	if(this.f1.health== 0 ) {
		
		System.out.println(this.f2.name + "  kazandı !");
		return true ;
	}
	
if(this.f2.health== 0 ) {
		
		System.out.println(this.f1.name + "  kazandı !");
		return true ;
	}

return false ;
	
}


public boolean isWhoStart() {
	
	Random sc = new Random();
    	return sc.nextBoolean();
    			
    
			
}

}



















