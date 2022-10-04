package Code_Challange.Day04;

import java.util.Scanner;

public class C05_StringManipulation {
    public static void main(String[] args) {
        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter word :");String str1 = scan.next();
        System.out.println("Please enter word :");String str2 = scan.next();
        System.out.println("Please enter word :");String str3 = scan.next();
        System.out.println("Please enter word :");String str4 = scan.next();

        System.out.println(str1.substring(0,1).toUpperCase() + str1.substring(1)
        + " "+str2+" "+str3+" "+str4+".");

        // String unity= word1.substring(0,1).toUpperCase().concat(word1.substring(1)).concat(" ")
        // .concat(word2).concat(" ").concat(word3).concat(" ").concat(word4).concat(".");


    }



}
