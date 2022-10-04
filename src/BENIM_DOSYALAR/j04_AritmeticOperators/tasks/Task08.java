package BENIM_DOSYALAR.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task08 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number value of seconds: ");
        int seconds = scan.nextInt();
        System.out.println(seconds+"   seconds = " + (seconds/3600)+" Hours   "+ ((seconds%3600)/60)+"Minutes   "  + (seconds%60)+"   seconds");


    }
}
