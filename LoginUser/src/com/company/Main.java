package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String password,userName;
        String newP ,newpassword;
        System.out.println("write your userName : ");
        Scanner input = new Scanner(System.in) ;
        userName = input.nextLine();
        System.out.println("write your password : ");
        password = input.nextLine() ;

        if(userName.equals("omer") && password.equals("123")) {
            System.out.println("Successfully logged in. Welcome,"+userName);
        }
        else if(userName.equals("omer") && !password.equals("123")){

            System.out.println("we are sorry wrong password,do you want to change your password ?");
            System.out.println("if you say yes ,please write yes.");

            newP = input.nextLine();
            if (newP.equals("yes")) {
                System.out.println("enter your new password : ");
                newpassword = input.nextLine();

                if (!newpassword.equals("123")) {
                    System.out.println("successfully changed!");
                } else {
                    System.out.println("passwords can not be same");
                }
            }
            else {
                System.out.println("try again !");
            }


        }else
        {
            System.out.println("wrong password and username ! ");
        }


    }
}
