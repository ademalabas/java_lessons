package Day04;

import java.util.Scanner;

public class C04_StringManipulation {
    public static void main(String[] args) {

        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */
        Scanner scan = new Scanner(System.in);
       // System.out.println("Please enterany  3 letters word :");
       // String str = scan.nextLine();
       // if (str.length() >= 3) {
       //     System.out.println(str.substring(1).concat(str.substring(1)).concat(str.substring(1)));
       // } else System.out.println("Entry word :" + str);


        System.out.println("bir string giriniz :");
        String str = scan.next();
        String  s = str.substring(str.length()-2);
        if(str.length()>=3){
            System.out.println(s+s+s);
        }else System.out.println(str);



    }


}
