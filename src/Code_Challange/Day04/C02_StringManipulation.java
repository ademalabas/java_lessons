package Code_Challange.Day04;

import java.util.Scanner;

public class C02_StringManipulation {
    public static void main(String[] args) {
//Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.
        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

            Scanner scan = new Scanner(System.in);
            System.out.println("String 1 :");
            String str1 = scan.nextLine();
            System.out.println("String 2 :");
            String str2 = scan.nextLine();
            System.out.println("1.method ile birlesim :" + str1 + " " + str2);
            System.out.println("2.method ile birlesim :" + str1.concat(" " + str2));
            String  str1Ilksiz = str1.substring(1);
            String  str2Ilksiz = str2.substring(1);
            System.out.println("ilk harfler olmadan birlesimi : " + str1Ilksiz + " " + str2Ilksiz);


    }



}
