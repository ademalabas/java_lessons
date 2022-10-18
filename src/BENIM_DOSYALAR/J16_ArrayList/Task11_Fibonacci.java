package BENIM_DOSYALAR.J16_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task11_Fibonacci {
     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */

    static int a = 1, b = 1, last = 0;
    static ArrayList<Integer> fiboList = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("AĞAM hangi tamsayıya kadar FIBONACCI dizisini oluşturalım? ");
        last = scan.nextInt();
        fiboList.add(a);
        fiboList.add(b);
        fibo(a, b);
        System.out.println(fiboList);
    }

    public static void fibo(int a, int b) {
        int c = a + b;
        if (c < last) {
            a = b;
            b = c;
            fiboList.add(b);
            fibo(a, b);

        }
    }
}
/*
System.out.print("Fibonacci serisinin kaçıncı elemanına kadar yazdıralım? ");
		int deger = scan.nextInt();
		ArrayList<Integer> fibo = new ArrayList<>();
		fibo.add(1);
		fibo.add(1);
		toplam = 0;
		for(int i = 2 ; i<=deger ; i++) {
			toplam = fibo.get(i-1)+fibo.get(i-2);
			fibo.add(toplam);
		}
		System.out.println(fibo);

 */