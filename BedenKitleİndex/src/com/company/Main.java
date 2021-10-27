package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double weight,height , bmi;
	System.out.println("please enter your weight(kg): ");
        Scanner kg = new Scanner(System.in) ;
        weight = kg.nextDouble() ;

        System.out.println("please enter your height(m) example : 1,80 meter : ");
        Scanner m = new Scanner(System.in) ;
        height = m.nextDouble() ;

        bmi= weight / (height*height) ;

        System.out.println("Body Mass index : "+bmi);

    }
}
