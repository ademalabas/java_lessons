package BENIM_DOSYALAR.j01_Variables.j04_AritmeticOperators;

import java.util.Scanner;

public class C03_RakamToplami {
    public static void main(String[] args) {
        // kullanicidan alinan 3 basamakli sayinin rakamlari toplamini create eden code print ediniz

       // Scanner sc = new Scanner (System.in);
       // System.out.print("3 basamaklı bir sayı giriniz : ");
       // int t = scan.nextInt();
       // System.out.println("Rakamların toplamı = " + ((t/100) + (t/10)%10 + t%10));
//

        Scanner scan = new Scanner(System.in);
        System.out.print("3 basamaklı bir sayı giriniz : ");
        int sayi = scan.nextInt();
        // 1 ler basamgı-> bir sayının 10 bolumunden kalan 1 ler basmagıdır..
        int birler = sayi % 10;//sayının birler basamagı
        sayi /= 10;// sayı 10 bolumunden bolumu verir 853/10->85
        int onlar = sayi % 10;// 85in 10 bolumunden kalan->5
        int yüzler = sayi / 10;// 85'in 10' a bolumu ->8

        //int rakamToplamı = birler + onlar + yüzler;
        //System.out.println("rakamToplamı = " + rakamToplamı);
        System.out.println(birler+onlar+yüzler);



    }
}
