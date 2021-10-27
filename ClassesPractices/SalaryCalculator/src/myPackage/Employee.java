package myPackage;

public class Employee {
	
	String name ;


	double salary ;


	int workHours ;


	int hireYear ;


	public Employee(String name, double salary, int workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	
	public double tax(){
		
		double taxPrice = 0 ;
		
		
		if(this.salary<=1000) {
			taxPrice = 0 ;
		}
		
		
		else if (this.salary>1000 ) {
		 taxPrice = (this.salary * 3)/100 ;		
		}
		
	return taxPrice ;
	
	}	
	
	
	
	public	double bonus() {
		
		double normalWeekHours = 40 ;
		double extraHours = this.workHours - normalWeekHours  ;
		double perHour = 30 ;
		double bonus = 0;
		
		if(extraHours>0) {
			bonus = extraHours*perHour ;
		}
		
		return bonus ;
	}
	
	
	public	double raiseSalary() {
		
	
		
		if ((2021-hireYear)>19) {
			
			return (this.salary *15)/100 ;
		}
		
		else if(2021-hireYear>9 && 2021-hireYear<20) {
			
			return (this.salary*10)/100 ;
			
		}
		
		else {
			
			return (this.salary*5)/100 ;
			
		}
		
		
	
	}
	
	public double netSalary() {
		
		double net = this.salary+bonus()+raiseSalary()-tax() ;
		
		return net ;
		
		
	}
	
	
	
	
	public void tostring()  {
		System.out.println("==============================");
		System.out.println("Name :  "+ this.name);
		System.out.println("Work Hours :  "+this.workHours);
		System.out.println("Start Year :  "+this.hireYear);
		System.out.println("Tax Amount :  "+ tax());
		System.out.println("Bonus :  "+bonus());
		System.out.println("Raise :  "+raiseSalary());
		System.out.println("Salary with tax and bonus :  "+ (this.salary+bonus()-tax()));
		System.out.println("Net Salary :  "+ netSalary() );
		
	
	}
	
}   
























