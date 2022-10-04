package Code_Challange.Day04.day04.Day40;

import java.util.Scanner;

public class Q07_StringManipulation {

    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String.:");
        String s = sc.nextLine().toLowerCase();
        System.out.println(s.contains("xyz") ? "true" : "false");

        //diğer yöntem

        String a = "xyaz";
        boolean xyzIceriyorMu = false;
        if (s.contains("xyz")) {
            xyzIceriyorMu = true;
            System.out.println(xyzIceriyorMu);
        } else {
            xyzIceriyorMu = false;
            System.out.println(xyzIceriyorMu);
            //   başka yöntem

            System.out.println(s.contains("xyz"));


        }
    }
}