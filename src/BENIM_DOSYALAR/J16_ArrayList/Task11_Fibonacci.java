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



Scanner sc = new Scanner(System.in);
System.out.println("Bir tamsayı  giriniz :");
int sayı= sc.nextInt();
// F(n) = F(n - 1) + F(n - 2)
ArrayList<Integer>fibonacci = new ArrayList<>(Arrays.asList(1,1));
int i = 2;
while ((fibonacci.get(i - 1) + fibonacci.get(i - 2)) <= sayı) {
    fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));
    i++;
}
System.out.println("fibonacci = " + fibonacci);




 */