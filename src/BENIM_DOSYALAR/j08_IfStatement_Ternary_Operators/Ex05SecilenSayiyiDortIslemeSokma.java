package BENIM_DOSYALAR.j08_IfStatement_Ternary_Operators;

import java.util.Scanner;

public class Ex05SecilenSayiyiDortIslemeSokma {
    public static void main(String[] args) {
       /*
       Task ->girilen iki sayiyi seçilen dört işlemden birine uygulayıp sonucu print eden code crate ediniz

        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1.Sayi Giriniz");
        double sayi1 = scan.nextDouble();
        System.out.println("Lutfen 2.Sayi Giriniz");
        double sayi2 = scan.nextDouble();


        System.out.println("+ icin ->1 secin ,\n- icin 2 secin,\n/ icin 3 secin ,\n* icin 4 secin");
        int secim = scan.nextInt();

        if (secim == 1) {
            System.out.println("toplama sonucu : " + sayi1 + "+" + sayi2 + "=" + (sayi1 + sayi2));
        } else if (secim == 2) {
            System.out.println("cıkarma sonucu : " + sayi1 + "-" + sayi2 + "=" + (sayi1 - sayi2));
        } else if (secim == 3) {
            System.out.println("carpma sonucu : " + sayi1 + "*" + sayi2 + "=" + (sayi1 * sayi2));
        } else if (secim == 4) {
            System.out.println("bolme sonucu : " + sayi1 + "/" + sayi2 + "=" + (sayi1 / sayi2));

        } else System.out.println("agam ne istiyon adam akıllı bişey gir işlemini yapalım");


      /*  System.out.println("işlem seçiniz : ");
        char islem=scan.next().charAt(0);

        if (islem=='+') System.out.println("Toplam = " + (sayi1+sayi2));
        else if (islem=='-') System.out.println("Çıkarma = " + (sayi1-sayi2));
        else  if (islem=='*') System.out.println("Çarpma = " +(sayi1*sayi2));
        else if (islem=='/') System.out.println("Bölme = "+ (sayi1/sayi2));
        else System.out.println("yanlış işlem girdiniz");
*/
/*
        double sayi3 = scan.nextDouble();

        if (sayi3 == 1) {
            System.out.println(sayi1 + sayi2);
        } else if (sayi3 == 2) {
            System.out.println(sayi1 - sayi2);

        } else if (sayi3 == 3) {
            System.out.println(sayi1 / sayi2);

        } else if (sayi3 == 4) {
            System.out.println(sayi2 * sayi1);

        } else {
            System.out.println("düzgün sayı giriniz");


 */
        }
    }





