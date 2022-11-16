package BENIM_DOSYALAR.J11_MethodCreation;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

//Task girilen iki sayiyi secilen dort isleme gore hesaplayan metod create

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi girinizi");
        double a = scan.nextDouble();

        System.out.println("ikinci sayi girinizi");
        double b = scan.nextDouble();

        System.out.println("isleminizi girinizi");
        int c = scan.nextInt();



    }// main sonu
    public static void islemMenu( char ch, int x,int y ) {
        switch (ch) {
            case '+':

        }


    }


    public static void topla( int a, int b) {
        System.out.println("Test01*b="+ (a*b));
    }

    public static void carpma( int a, int b) {
        System.out.println("Test01+b="+ (a+b));
    }

    public static void bolme( int a, int b) {
        System.out.println("Test01+b="+ (a+b));
    }

    public static void cikarma( int a, int b) {
        System.out.println("Test01+b="+ (a+b));
    }


}


/*
 // Task-> girilen iki sayıyı seçilen dört işleme göre hesaplayan method create ediniz..
​
        Scanner sc = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        double sayı1 = sc.nextDouble();
        System.out.print("2. sayıyı giriniz : ");
        double sayı2 = sc.nextDouble();
        System.out.print("işleminizi giriniz : ");
        char islem = sc.next().charAt(0);
        islemMenu(islem, (int) sayı1, (int) sayı2);
    }//main sonu
    public static void islemMenu(char ch, int x, int y) {
        switch (ch) {
            case '+':
                topla(x, y);
                break;
            case '-':
                cıkar(x, y);
                break;
​
            case '*':
                carp(x, y);
                break;
            case '/':
                bol(x, y);
                break;
            default:
                System.out.println("hatalı seçim yaptınız");
        }

    }

    public static void topla(int Test01, int b) {
        System.out.println("Test01+b = " + (Test01 + b));
    }

    public static void carp(int Test01, int b) {
        System.out.println("Test01*b = " + (Test01 * b));
    }

    public static void cıkar(int Test01, int b) {
        System.out.println("Test01-b = " + (Test01 - b));
    }

    public static void bol(int Test01, int b) {
        System.out.println("Test01/b = " + (Test01 / b));
    }

 */

