package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double pi ,yarıcap,aci , dilimAlan ;
	pi = 3.14 ;
	System.out.println("yarıçapı giriniz : ");
        Scanner r = new Scanner(System.in) ;
        yarıcap= r.nextDouble() ;

        System.out.println("Merkez açı ölçüsünü giriniz : ");
        Scanner a = new Scanner(System.in) ;
        aci = a.nextDouble() ;

        dilimAlan = (pi*(yarıcap*yarıcap)*aci)/360 ;

        System.out.println("Daire diliminin alanı : "+dilimAlan);




    }
}

