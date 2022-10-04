package Code_Challange.Day04;

import java.util.Scanner;

public class C06_StringManipulation {
    public static void main(String[] args) {

/* String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
        Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin (gh  -  g  -  h   : 3 durum var)

       ORNEK:          INPUT     OUTPUT
                       goat        gat
                      photo        hoto
                      ghost        ghost
                      kalem        lem

*/
      // Scanner scan = new Scanner(System.in);
      // System.out.println("Enter String  :");
      // String str = scan.nextLine().toLowerCase();
      // if (str.startsWith("gh")) {
      //     System.out.println(str);
      // } else if (str.startsWith("g")) {
      //     System.out.println(str.charAt(0) + str.substring(2));
      // } else if (str.charAt(1) == 'h') ;
      //     System.out.println(str.substring(1));
      // }else
      // System.out.println(str.substring(2));

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string");
        String s = scan.next().toLowerCase();
        if(s.startsWith("gh")){
            System.out.println(s);
        }else if(s.startsWith("g")){
            System.out.println(s.charAt(0) + s.substring(2));
        }else if(s.charAt(1) == 'h'){
            System.out.println(s.substring(1));
        }else
            System.out.println(s.substring(2));


    }


}
