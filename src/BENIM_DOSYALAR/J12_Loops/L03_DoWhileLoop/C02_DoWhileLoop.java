package BENIM_DOSYALAR.J12_Loops.L03_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {

    public static void main(String[] args) {
// Task girilen sayi 17 den kucuk ise "kazandiniz" buyuk ise "kaybettiniz" perinr eden  code create ediniz
        Scanner scan = new Scanner(System.in);

        int sayi = 0;


        do {
            System.out.println("Agam Sayi gircen");

            sayi= scan.nextInt();
            System.out.println(sayi +"  Kazandiniz :))");
        } while (sayi<=17);
        System.out.println(sayi+ "  Kaybettiniz:((");


    }
}
/*
 //task-> girilen sayı 17 den kucuk ise "kazandınız" print eden  değilse ise sayı girişi isteyen
        //  code create ediniz...
        Scanner sc =new Scanner(System.in);
        int sayi = 0;
        do {
            System.out.println("AGAM nassıng :) bir tamsayı giriyorsun : ");

           sayi= sc.nextInt();


            sayi++;
        }while (sayi>=17);
        System.out.println(sayi+" için kazandınız... :) ");


 */