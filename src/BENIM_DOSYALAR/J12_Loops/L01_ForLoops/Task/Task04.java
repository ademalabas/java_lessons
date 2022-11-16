package BENIM_DOSYALAR.J12_Loops.L01_ForLoops.Task;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
/*
Girilen iki sayi arasindaki cift sayilari yanyana print eden code create ediniz
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("birinci pozitif tam sayı giriniz : ");
        int sayi1 = sc.nextInt();
        System.out.println("ikinci pozitif tam sayı giriniz : ");
        int sayi2 = sc.nextInt();

        if (sayi1 < sayi2) {
            for (int i = sayi1; i <= sayi2; i++) {
                if (i % 2 == 0) {// dongu icindeki sayilarin cift kontrolu
                    System.out.println(i);
                }
            }
        } else System.out.println("Hatali giris yaptiniz");


     //   for (int i=(Test01<b?Test01:b);i<=(Test01>b?Test01:b);i++ ){
     //       System.out.print(i%2==0?i:" ");
     //   }

    }//main


}
