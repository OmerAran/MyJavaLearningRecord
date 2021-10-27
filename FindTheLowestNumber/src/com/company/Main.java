package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int number1,number2,number3 ;
        System.out.println("give me three number : ");
        Scanner sc = new Scanner(System.in);
        number1 = sc.nextInt();
        number2 = sc.nextInt() ;
        number3 = sc.nextInt() ;

       if(number1<number2 && number1<number3){
            if (number2<number3) {
                System.out.println(number1+" < "+number2 +" < "+number3);
            }else if(number3<number2){
                System.out.println(number1+" < "+number3+" < "+number2);
            }
       }

        if(number2<number1 && number2<number3){
            if (number1<number3) {
                System.out.println(number2+" < "+number1 +" < "+number3);
            }else if(number3<number1){
                System.out.println(number2+" < "+number3+" < "+number1);
            }
        }

        if(number3<number2 && number3<number1){
            if (number2<number1) {
                System.out.println(number3+" < "+number2 +" < "+number1);
            }else if(number1<number2){
                System.out.println(number3+" < "+number1+" < "+number2);
            }
        }

    }
}
