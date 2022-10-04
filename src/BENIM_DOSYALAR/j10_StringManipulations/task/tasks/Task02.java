package BENIM_DOSYALAR.j10_StringManipulations.task.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

/*
   Girilen passwordun aşagıdakişartları sağlamasını
   kontrol eden coden create ediniz
    a)Ilk karakteri buyuk harf olmalı
    b)Son karakteri sayi olamlı
    c)en az 6 karakter uzunlugunda olmalı

 */


        Scanner scan = new Scanner(System.in);
        System.out.println("Password giriniz");
        String str = scan.next();
        if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z' &&
                (str.charAt(str.length() - 1) >= 0 && str.charAt(str.length() - 1) <= 9) &&
                (str.length() >= 6)){


            System.out.println("Password gecerli");


        }else
        System.out.println("şifre geçersizdir.");

      // if ((password.charAt(0)>='A'&&password.charAt(0)<='Z') &&(password.charAt(password.length()-1)>='0'&&
      //         password.charAt(password.length()-1)<='9')&&(password.length()>=6)) {
      //     System.out.println("password geçerli");
      // }else System.out.println("password geçersiz");}


    }


}

