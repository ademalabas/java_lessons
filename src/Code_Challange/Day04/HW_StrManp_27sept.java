package Code_Challange.Day04;

import java.util.Scanner;

public class HW_StrManp_27sept {
    public static void main(String[] args) {

        //*************** Code Challenge Elly Hoca String Manipulation****************//

            //***************  Task 11 ****************//
        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter your Name and Surname:");//Adem Alabas
            String ns = scan.nextLine();

            String name = ns.substring(0, ns.indexOf(" "));
            String Lastname = ns.substring(ns.indexOf(" ")+1);

            System.out.println("Name and length = " + name+" "+ (name.length()) //Name and length = Adem 4
                    +"\n"+"Lastname and Length= "+Lastname+ " "+ (Lastname.length()) );//Lastname and Length= Alabas 6


            //***************  Task12  ****************//

        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any statement");// Adem Alabas
        String str = sc.nextLine();
        System.out.println(str.contains(" "));//true
        System.out.println(str.isEmpty()); //False

            //***************  Task13  ****************//


        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 4 letter word");// Adem
        String s5 = input.next();
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
