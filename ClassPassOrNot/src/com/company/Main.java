package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int math,physics,chemistry ;
	int average , sum;
        System.out.println("add your math note : ");
	      Scanner sc = new Scanner(System.in) ;
           math = sc.nextInt() ;

        System.out.println("add your physics note : ");
         physics = sc.nextInt() ;

        System.out.println("add your chemistry note : ");
        chemistry = sc.nextInt() ;

        sum = chemistry+physics+math ;
        average = sum / 3 ;
        System.out.println("your average note : "+average);

        if(average>=0 && average<=100){
            if (average>=55){
                System.out.println("you passed !");
            }else{
                System.out.println("you failed !");
            }
        }else {
            System.out.println("average can not over 100 and subzero");
        }


    }
}
