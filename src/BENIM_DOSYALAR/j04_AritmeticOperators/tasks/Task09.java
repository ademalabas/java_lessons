package BENIM_DOSYALAR.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task09 {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of cows in the farm:");
        int cow = scan.nextInt();
        System.out.println("Enter number of sheep in the farm:");
        int sheep = scan.nextInt();
        System.out.println("Enter number of hens in the farm:");
        int hen = scan.nextInt();
        System.out.println("Total leg numbers of cows, sheep and hens in the farm:" +(  cow*4+sheep*4+hen*2));





    }

}
