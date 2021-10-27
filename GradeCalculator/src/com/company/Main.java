package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int matNot,fizikNot,kimyaNot , notToplam,notOrtalaması;
        Scanner sc = new Scanner(System.in);
        System.out.println("sınavdan kaç aldınız ? ");
        matNot = sc.nextInt() ;

        Scanner sc2 = new Scanner(System.in);
        System.out.println("sınavdan kaç aldınız ? ");
        fizikNot = sc.nextInt() ;

        Scanner sc3 = new Scanner(System.in);
        System.out.println("sınavdan kaç aldınız ? ");
        kimyaNot = sc.nextInt() ;

        notToplam= (fizikNot+matNot+kimyaNot);
        notOrtalaması= notToplam / 3 ;
        System.out.println("Not ortalamanız : "+notOrtalaması);

        boolean sart = notOrtalaması >=60 ;
        System.out.println("durum : "+ (sart == true ? "dersi başarıyla tamamladınız." : "dersten kaldınız.") );

    }
}
