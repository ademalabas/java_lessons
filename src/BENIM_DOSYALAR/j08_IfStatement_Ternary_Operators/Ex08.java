package BENIM_DOSYALAR.j08_IfStatement_Ternary_Operators;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
       /* // Task0
        Kullanicidan bir sayi alin

        Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
        Eger 10 dan buyuk ise "Buyuksun!" yazdirin
        Eger 10 dan kucuk ise "Normalsin!" yazdirin

        Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
        Eger -10 dan buyuk ise "Negatifsin!" yazdirin
        Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirin
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi Giriniz");
        int sayi = scan.nextInt();

        if (sayi > 0) {
            if (sayi > 10) {
                System.out.println("Buyuksun");
            } else {
                System.out.println("Normalsin");
            }
        } else if ((sayi < 0) && (sayi > -10)) {
            System.out.println("Negatifsin");

        } else {
            System.out.println("çok negatifsin");
        }

    }

}
