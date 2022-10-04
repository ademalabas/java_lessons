package BENIM_DOSYALAR.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 3 digit number= ");
        int n = sc.nextInt();
        //System.out.println("Digit of 100 place is:"+(n/100));
        //System.out.println("Digit of 10 place is:"+((n%100)-(n%10))/10);
        //System.out.println("Digit of one place is:"+(n%10));
//
        // BIR SAYININ 10 A BOLUMUNDEN KALAN BIRLER BASAMAGINI VERIE
        //
        int birler = (n%10); //sayinin birler basamagi
        n /= 10; // sayi 10 abolumunden bolumu verir 853/10 ->85
        int onlar = n%10; // 85 in 10 bolumunden kalan ->5
        int yuzler = n/10; // 85 in 10 a bolumu ->8

        System.out.println("birler = " + birler+"\nonlar ="+ onlar+"\nyuzler = " + yuzler);

        // hocanin notlari
      //  int sayi = scan.nextInt();

      // // 1 ler basamgı-> bir sayının 10 bolumunden kalan 1 ler basmagıdır..
      // int birler = sayi % 10;//sayının birler basamagı
      // sayi /= 10;// sayı 10 bolumunden bolumu verir 853/10->85
      // int onlar = sayi % 10;// 85in 10 bolumunden kalan->5
      // int yüzler = sayi / 10;// 85'in 10' a bolumu ->8

      // System.out.println("Girdiginiz sayinin birler basamagi :"+birler+"\nGirdiginiz sayinin onlar basamagi : "+onlar
      //         +"\nGirdiginiz sayinin yuzler basamagi :"+yüzler);


    }
}
