package BENIM_DOSYALAR.j08_IfStatement_Ternary_Operators;

import java.util.Scanner;

public class Ex01gIRILENsAYININnEGATIFLIGINIkONTROL {
    public static void main(String[] args) {

        /*
        Task01_BkSiralama
girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen sayi giriniz: ");
        int sayi = scan.nextInt();
      /*  if (sayi > 0) {
            System.out.println("Pozitif");
        } else if (sayi < 0) {
            System.out.println("negatif");
        } else  {
            System.out.println("notr");
        }
*/
        if (sayi > 0) {//sayinin sıfırdan buyuk olması şarta baglandı
            System.out.println("girilen sayi pozitif");
        } else if (sayi < 0) {//sayinin sıfırdan buyuk olmaması halinde sıfırdan kucuk olamsı sarta baglandı
            System.out.println("girilen sayi negatif");
        } else {//syının sıfırdan buyuk veya kucuk olmaması halıinde kalan durum(sıfıra eşit olması) şarta bağlandı
            System.out.println("girilen sayi ne negatif  ne de pozitifdir yani nötr'dür");
        }

   /*
        Task01_BkSiralama
girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */


        }
    }
