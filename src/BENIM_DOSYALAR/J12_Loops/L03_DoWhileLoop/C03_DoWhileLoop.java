package BENIM_DOSYALAR.J12_Loops.L03_DoWhileLoop;

import java.util.Scanner;

public class C03_DoWhileLoop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Agam Sayi gircen");
        int sayi = scan.nextInt();
        do {
            System.out.println("agam sayi "+sayi+ " kazandiniz :)");
            sayi++;
        } while (sayi<17);
        System.out.println("agam sayi "+sayi+ " kaybettin daha kucuk sayi gir :)");



    }
}
