package BENIM_DOSYALAR.j01_Variables.J11_MethodCreation.tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

    /*    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden method create ediniz

    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email address;");
        String email = scan.nextLine();
        System.out.println(emailControl(email));

    }//main ends
    private static boolean emailControl(String email) {
        boolean  valid;
        if ((email.contains("@")) && (email.contains(".")) && (email.indexOf("@")>0)){
            valid = true;
        }else { valid= false;}
        return valid;

    }


}