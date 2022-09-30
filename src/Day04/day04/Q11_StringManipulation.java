package Day04.day04;

import java.util.Scanner;

public class Q11_StringManipulation {
    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your Name and Surname:");//Adem Alabas
        String ns = scan.nextLine();

        String name = ns.substring(0, ns.indexOf(" "));
        String Lastname = ns.substring(ns.indexOf(" ")+1);

        System.out.println("Name and length = " + name+" "+ (name.length()) //Name and length = Adem 4
                    +"\n"+"Lastname and Length= "+Lastname+ " "+ (Lastname.length()) );//Lastname and Length= Alabas 6









    }


}