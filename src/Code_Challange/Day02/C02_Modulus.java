package Code_Challange.Day02;

import java.util.Scanner;

public class C02_Modulus {
    public static void main(String[] args) {

        /*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz");
        int x = scan.nextInt();
       // System.out.println((x/10000) + (x/1000)%10 + (x/10)%10 + x%10);

        int birler=x%10;
        int onlar=(x/10)%10;
        int yüzler=(x/100)%10;
        int binler=(x/1000)%10;
        int onbinler= (x/10000)%10;
        int sayi = scan.nextInt();
        int ilkIki =sayi/1000; //12
        int sonIki = sayi%100; //45
        int ilkIkiTop = (ilkIki/10) + (ilkIki%10); //1+2
        System.out.println("ilkIkiTop = " + ilkIkiTop);
        int sonIkiTop = (sonIki/10) + ( sonIki%10); //4+5
        System.out.println("sonIkiTop = " + sonIkiTop);
        System.out.println("esas toplam = " + (ilkIkiTop + sonIkiTop));



        System.out.println((x/10000) + (x/1000)%10 + (x/10)%10 + x%10);

    }






}
