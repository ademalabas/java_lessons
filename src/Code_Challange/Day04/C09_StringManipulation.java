package Code_Challange.Day04;

import java.util.Scanner;

public class C09_StringManipulation {
    public static void main(String[] args) {

 /*
      Kullanicidan bir kelime girmesini isteyin.
      * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
      * kelimenin ortasindaki karakteri yazdirin.
      */


            Scanner input = new Scanner(System.in);
            System.out.println("Enter an expression : ");
            String s = input.nextLine();
            char middleCh = s.charAt((s.length() - 1) / 2);

            if (s.length() % 2 == 1 && s.length() >= 3) {
                System.out.println("Middle character :" + middleCh);
            } else
                System.out.println("Please enter name contain odd numbered character...");




    }



}
