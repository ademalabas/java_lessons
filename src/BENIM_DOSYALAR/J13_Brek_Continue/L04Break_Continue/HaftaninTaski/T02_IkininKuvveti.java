package BENIM_DOSYALAR.J13_Brek_Continue.L04Break_Continue.HaftaninTaski;

import java.util.Scanner;

public class T02_IkininKuvveti {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */
        Scanner scan = new Scanner(System.in);
      //  System.out.print("Enter a number: ");
        int num = scan.nextInt();
        // System.out.println(powerOfTwo(num));
        powerOfTwo(num);

    }// main

    private static void powerOfTwo(int num1) {

        Scanner sc = new Scanner(System.in);
        int sayi, k = 0;
       // System.out.println("sayi gir");
        sayi = sc.nextInt();
        while (sayi > 1) { //sayi birden küçük olana kadar içeresindeki işlemi yapacak
            if (sayi % 2 == 0) {

                k = 1;
            } else { //eğer kalan bir ise kuvveti değildir.
                k = 2;
                break; //cıksın sistemi yormasın tekrar tekrar
            }
            sayi = (sayi / 2);
        }
        if (1 == k) {
            System.out.println("evet");

        } else {
            System.out.println("hayır");
        }

    }
}

        /*
             private static boolean powerOfTwo(int a) {
             boolean power = true;
                for (int i =2; i <a ; i*=2){
                 if (a%i!=0) {
               power=false;
                }
                }
                return power;
        }*/


