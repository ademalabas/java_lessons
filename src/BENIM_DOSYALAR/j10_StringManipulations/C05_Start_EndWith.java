package BENIM_DOSYALAR.j10_StringManipulations;

import java.util.Scanner;

public class C05_Start_EndWith {
    public static void main(String[] args) {

/**
 * startsWith()
 *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
 *  String'in basladigi characteri dogrular
 * endsWith()
 * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
 */
/*
String sehir ="Istanbul";

        System.out.println(sehir.startsWith("I"));//true
        System.out.println(sehir.startsWith("Is"));//true
        System.out.println(sehir.startsWith("s"));//false
        System.out.println(sehir.startsWith("Test01", 3));//true
        System.out.println(sehir.endsWith("l"));//true
        System.out.println(sehir.endsWith("bul"));//true
        System.out.println(sehir.endsWith("bu"));//false

*/

        String sehir = "istanbul";
        System.out.println(sehir.startsWith("i"));//true
        System.out.println(sehir.startsWith("is"));//true
        System.out.println(sehir.startsWith("s"));//false
        System.out.println(sehir.startsWith("t", 2));//true 3. indexten itibaren strin Test01 ile mi başlar

        System.out.println(sehir.endsWith("l"));//true
        System.out.println(sehir.endsWith("bul"));//true
        System.out.println(sehir.endsWith("bu"));//false

        String str="bul";
        System.out.println(sehir.endsWith(str));//true
        int yas=48;
        // System.out.println(sehir.endsWith(yas));// cte

        //Task-> girilen e-mail hesabının  @gmail.com içermiyorsa "lütfen gmail hesabı giriniz"
        // @gmail.com ile  bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz print edn code creae ediniz.


        Scanner sc=new Scanner(System.in);
        System.out.println("Email adresinizi giriniz.");
        String email= sc.next();
        if (!email.contains("@gmail.com"))System.out.println("Lütfen gmail hesabı giriniz.");
        else if (email.endsWith("gmail.com")) System.out.println("Hesabınız onaylandı");
        else System.out.println("Lütfen geçerli adres giriniz.");


    }
}
