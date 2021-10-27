package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double openFee,km,kmFee,totalFee ;
	openFee = 10 ;

	System.out.println("how many kilometers did you go ?");
	Scanner scanner = new Scanner(System.in) ;
		km = scanner.nextDouble();
		kmFee=km *2.20 ;
		totalFee = openFee+kmFee ;

		 totalFee = (totalFee<20) ? 20 : totalFee ; // that means you have to pay min 20 .
		 System.out.println("You will pay: "+totalFee);


    }
}
//byOmerAran