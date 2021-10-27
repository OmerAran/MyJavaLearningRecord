package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double appleprice,bananaprice,tomatoprice, applekg , bananakg, tomatokg ,totalprice;

        System.out.println("firstly enter product price per kg and after that enter kg : ");

       System.out.println("apple price per kg : ");
        Scanner applee = new Scanner(System.in) ;
        appleprice = applee.nextDouble() ;

        System.out.println("how many kg apple do you want to buy  : ");
        Scanner appl = new Scanner(System.in) ;
         applekg= appl.nextDouble() ;

        System.out.println("banana price per kg : ");
        Scanner bananaa = new Scanner(System.in) ;
        bananaprice = bananaa.nextDouble() ;

        System.out.println("how many kg banana do you want to buy  : ");
        Scanner banana = new Scanner(System.in) ;
        bananakg= banana.nextDouble() ;

        System.out.println("tomato price per kg : ");
        Scanner tomatoo = new Scanner(System.in) ;
        tomatoprice = tomatoo.nextDouble() ;

        System.out.println("how many kg tomato do you want to buy  : ");
        Scanner tomato = new Scanner(System.in) ;
        tomatokg= tomato.nextDouble() ;

        double tomatototal,bananatotal,appletotal ;
        tomatototal = tomatoprice*tomatokg ;
        bananatotal = bananakg*bananaprice ;
        appletotal = applekg*appleprice ;
        totalprice = tomatototal+bananatotal+appletotal ;

        System.out.println("TOTAL PRICE : "+totalprice);

     }
}
