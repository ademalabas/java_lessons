package BENIM_DOSYALAR.j08_IfStatement_Ternary_Operators;

import java.util.Scanner;

public class Ex06_Emekli {
    public static void main(String[] args) {
       /*
       Task ->  Kullanicini cinsiyeti Kadin ise 60 yasindan buyuk ve pirim gunu 6000 den fazla ise emekliligini
                Kullanicini cinsiyeti erkek ise 65 yasindan buyuk ve pirim gunu 7000 den fazla ise emekliligini
                kontrol edip kalan yil ve prim gununu print eden code create ediniz.


        */

        Scanner sc = new Scanner(System.in);

        System.out.print("cinsiyetiniz \n KADIN için-> K\n ERKEK için-> E\n giriniz : ");

        char cnsyt = sc.next().charAt(0);

        System.out.println("yasınızı giriniz : ");
        int yas = sc.nextInt();
        if  (cnsyt=='K') {
            if(yas>60) {
                System.out.println("Prim gunnu giriniz");
                int prim = sc.nextInt();
                if(prim>6000) {
                    System.out.println("Tebrikler emekliliginizi kazandiniz");
                }else System.out.println("Emeklliginiz icin:"+(6000-prim)+"gun yatirmaniz lazim");
            }else System.out.println("Emekliliginize daha = " + (60-yas)+"yil daha var");


        }else if (cnsyt=='E') {
            if (yas > 65) {
                System.out.println("Prim gunnu giriniz");
                int prim = sc.nextInt();
                if (prim >7000) {
                    System.out.println("Tebrikler emekliliginizi kazandiniz");
                } else System.out.println("Emeklliginiz icin:" + (7000-prim) + "gun yatirmaniz lazim");
            } else System.out.println("Emekliliginize daha = " + (60 - yas) + "yil daha var");

        }else System.out.println("Ne oldugunu yaz ona gore emekli edelim");



    }

}
