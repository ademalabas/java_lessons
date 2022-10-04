package Code_Challange.Day04.day04;

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


     //  public static void main(String[] args) {
     //      Scanner scan = new Scanner(System.in);
     //      String isim = scan.next();
     //      String soyIsim = scan.next();
     //      if(isim.length()>soyIsim.length())
     //          System.out.println("isminiz daha uzun");
     //      else if(isim.length()==soyIsim.length())
     //          System.out.println("isim ve soyisim uzunluklari esit");
     //      else System.out.println("soyisminiz daha uzun");







        }


}