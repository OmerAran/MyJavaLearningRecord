package methods;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("N Sayısı: ");
        int n = sc.nextInt();
        
        azalt(n);
    }

    static void azalt(int n) {
        azalt(n,0);
    }

    static int azalt(int n, int count) {
        if(n <= 0)
            return arttır(n,count);

        System.out.print(n + " ");
        return azalt(n-5,++count);
    }

    static int arttır(int n, int count) {
        System.out.print(n + " ");

        if(count == 0)
            System.exit(0);

        return arttır(n+5, --count);
    }

}
