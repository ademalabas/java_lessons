package BENIM_DOSYALAR.J13_Brek_Continue.L04Break_Continue.HaftaninTaski;

import java.util.Scanner;

public class T01_TopZiplamaMesafeSaysi {
    public static void main(String[] args) {


   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number as meter for ball to drop = ");
        double height = scan.nextDouble();
        double bounceDistance = 0;
        int bouncenum = 0;

        do {    bounceDistance += height;
                bouncenum++;
                height *= 0.75;
                bounceDistance += height;
            } while (height >= 1) ;
            System.out.println("Bouncing times of ball  = " + bouncenum);
            System.out.println("Bouncing distance of ball  = " + bounceDistance);
    }



}
