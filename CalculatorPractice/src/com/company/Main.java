package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
           int processNumber = 0;

        System.out.println("enter the numbers : ");
        ProcessManager processManager = new ProcessManager();
        Scanner number1 = new Scanner(System.in);
        double a = number1.nextDouble() ;
        double b = number1.nextDouble();

        System.out.println("press 1 - sum\npress 2- sub\n press 3 - mul \n press 4 - div");
        Scanner sc = new Scanner(System.in);
        processNumber= sc.nextInt();

        switch (processNumber){

            case 1 :
                System.out.println("result : "+processManager.sum(a,b));
                break ;
            case 2 :
                System.out.println("result : "+processManager.sub(a,b));

                break ;
            case 3 :
                System.out.println("result : "+processManager.mul(a,b));
                break;

            case 4 :
                System.out.println("result : "+processManager.div(a,b));
                break ;



        }


    }
}
