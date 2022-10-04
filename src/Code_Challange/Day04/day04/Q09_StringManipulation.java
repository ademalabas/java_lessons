package Code_Challange.Day04.day04;


import java.util.Scanner;

public class Q09_StringManipulation {
    /*
      Kullanicidan bir kelime girmesini isteyin.
      * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
      * kelimenin ortasindaki karakteri yazdirin.
      */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter an expression : ");
        String s = input.nextLine();
        char middleCh = s.charAt((s.length() - 1) / 2);

        if (s.length() % 2 == 1 && s.length() >= 3) {
            System.out.println("Middle character :" + middleCh);
        } else
            System.out.println("Please enter name contain odd numbered character...");
    }

    public static void ortaCh(String args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an expression : ");
        String s = input.nextLine();
        char middlech = s.charAt((s.length() - 1)/2);
        if ((s.length() % 2 == 1) && (s.length() > 3)) {
            System.out.println("middle chaharacter = " + middlech);
        }else {
            System.out.println("Please enter name contain odd numbered character...");

        }

    }





}
