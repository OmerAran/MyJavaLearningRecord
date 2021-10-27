package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double aSide=0,bSide=0,cSide=0,area=0,u =0 ;

	System.out.println("Bir kenar giriniz : ");
	Scanner side = new Scanner(System.in);
	aSide = side.nextDouble() ;

        System.out.println("Bir diğer kenar giriniz : ");
        Scanner side2 = new Scanner(System.in);
        bSide= side2.nextDouble() ;

        System.out.println("Bir diğer kenar giriniz : ");
        Scanner side3 = new Scanner(System.in);
        cSide = side3.nextDouble() ;


	u = (aSide+bSide+cSide)/2 ;

        Math math;
        area =Math.sqrt( u*(u-aSide)*(u-bSide)*(u-cSide))  ;

      System.out.println("the area of triangle : "+area);



    }

}
