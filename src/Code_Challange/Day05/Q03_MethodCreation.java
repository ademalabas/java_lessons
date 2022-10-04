package Code_Challange.Day05;

import java.util.Scanner;

public class Q03_MethodCreation {

    public static void main(String[] args) {
/*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Number as cm");
        double d = scan.nextDouble();
        System.out.println(mconvert(d) + " meter");
        System.out.println(kmconvert(d) + " kilometer");

    }

    private static double mconvert(double d) {
        return d / 100;
    }

    private static double kmconvert(double d) {

        return d / 1000;

    }

    public static void convertFromSM(double sayi) {
        System.out.println("girilen santimeter degeri : " + sayi / 100 + " metre\n" + sayi / 100000 + " kilometredir");

    }
}



