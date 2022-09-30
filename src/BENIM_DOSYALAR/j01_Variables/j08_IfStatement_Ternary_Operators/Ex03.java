package BENIM_DOSYALAR.j01_Variables.j08_IfStatement_Ternary_Operators;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        /*
girilen bir yılın artık (leap year) olmasını kontrol eden code create ediniz..
    artık yıl:
    Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
    Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
    Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.
 */

        Scanner sc = new Scanner(System.in);
        System.out.println("agam yili   gir : ");
        int yil = sc.nextInt();
        if ((yil % 4 == 0) && (yil % 100 != 0) || (yil % 400 == 0))
        {
            System.out.println("Girdiginiz artik yil ");
        }else{

            System.out.println("girdiginiz yil artik yil degildir");
        }

   /* if ((yil%4==0)       &&  (yil %100!=0)  ||   (yil%400==0) ){
        System.out.println("girdiğiniz yil artık yıl  :-)");
    }else {
        System.out.println("giridiğinz yıl artık yıl değildir  :-(");
    }

    */


    }

}







