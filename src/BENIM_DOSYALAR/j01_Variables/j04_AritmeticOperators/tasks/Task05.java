package BENIM_DOSYALAR.j01_Variables.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task05 {

    /*
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter hours : ");
        int h = scan.nextInt();
        System.out.print("Please enter minutes : ");
        int min = scan.nextInt();
        System.out.print("Please enter seconds : ");
        int sec = scan.nextInt();
        System.out.println("Your total time is: "+(h*3600)+(min*60)+sec+"  seconds" );

    }

}
