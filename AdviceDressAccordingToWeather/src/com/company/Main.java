package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int heat ;
        System.out.println("please say me how many degrees you have : ");
        Scanner sc = new Scanner(System.in);
        heat  = sc.nextInt();
        if (heat<5){
            System.out.println("skiing is good about this weather");

        }
        else if(heat>=5 && heat<=15){
            System.out.println("Cinema is the perfect in this weather");
        }
        else if(heat>15 && heat<=25){
            System.out.println("you can go for a picnic");
        }
        else{
            System.out.println("go to swimming :)");
        }
    }
}
