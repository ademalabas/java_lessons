package Code_Challange.Day04.day04;

import java.util.Scanner;

public class Q13_StringManipulation {
    public static void main(String[] args) {

        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

            Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 4 letter word");// Adem
        String s5 = scan.next();
        char ch4 = s5.charAt(s5.length() - 1), ch3 = s5.charAt(2),
             ch2 = s5.charAt(1), ch1 = s5.charAt(0);
        // char method
        System.out.println("Reverse reading ch= " + ch4 + ch3 + ch2 + ch1 );//medA
        //Substring method
        String str4 =s5.substring(s5.length() - 1), str3 =s5.substring(2,3),
                str2 =s5.substring(1,2), str1 =s5.toLowerCase().substring(0,1);
        System.out.println("Reverse reading str= " + str4 + str3 + str2 + str1 );//meda

    }

}