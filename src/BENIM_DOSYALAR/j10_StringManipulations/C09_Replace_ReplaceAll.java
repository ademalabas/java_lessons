package BENIM_DOSYALAR.j10_StringManipulations;

import java.util.Scanner;

public class C09_Replace_ReplaceAll {
    public static void main(String[] args) {
/** replace()
 * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter
 * ya da metinle degistirilmesini (update -set) saglar. Sonuc String'dir..

 */

String str ="javaCAN'lara selam olsun java ile bolcana offer";
        System.out.println(str.replace('a', '@'));//j@v@CAN'l@r@ sel@m olsun j@v@ ile bolc@n@ offer
        System.out.println(str.replace("can", "kan"));//javaCAN'lara selam olsun java ile bolkana offer

        /** ReplaceFirst
         * Replace ile aynı sadece ilk bulunanı değiştirir
         */
        System.out.println(str.replaceFirst("a", "@"));//j@vaCAN'lara selam olsun java ile bolcana offer

        // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
//1-replace() methodu char kabul eder ama replaceAll kabul etmez
//2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)
//(Regular Expressions)
//   \\s bosluk (
//   \\S bosluk disindaki tum karakterler
//   \\w harfler ve rakamlar (Test01 z A Z, 0 9)
//   \\W harfler ve rakamlar disindaki tum karakterler
//   \\d rakamlar 0 9
//   \\D rakamlar disindaki tum karakterler

        String str1 ="javaCAN'lara selam olsun java ile12345 bolcana offer***";

        System.out.println(str1.replaceAll("\\s", "+"));//javaCAN'lara+selam+olsun+java+ile12345+bolcana+offer***
        System.out.println(str1.replaceAll("\\S", "+"));///++++++++++++ +++++ +++++ ++++ ++++++++ +++++++ ++++++++
        System.out.println(str1.replaceAll("\\w", "+"));//++++++++++++ +++++ +++++ ++++ ++++++++ +++++++ ++++++++
        System.out.println(str1.replaceAll("\\W", "+"));//javaCAN+lara+selam+olsun+java+ile12345+bolcana+offer+++
        System.out.println(str1.replaceAll("\\d", "+"));//javaCAN'lara selam olsun java ile+++++ bolcana offer***
        System.out.println(str1.replaceAll("\\D", "+"));//+++++++++++++++++++++++++++++++++12345+++++++++++++++++

        //task  Girilen ismini, soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki formatta print eden code create ediniz.
// isim-soyisim : M***** B*******
// kart no : **** **** **** 1234
//

       // Scanner scan = new Scanner(System.in);
       // System.out.println("Lutfen Adinizi giriniz" );

       String isim = "Cigdem";
       String soyad = "Sen";
       //long kartNo = 1234567890123456L;
        String kartno = "1234567890123456";
       String yeniIsim =isim.charAt(0)+isim.substring(1).replaceAll("\\w","*");
       String yeniSoyisim =soyad.charAt(0)+soyad.substring(1).replaceAll("\\w","*");

       String yeniKartNo = " **** **** **** " +kartno.substring(12);
        System.out.println("isim-soyisim = " + yeniIsim+"  "+yeniSoyisim+"   kart no"+yeniKartNo);//isim-soyisim = C*****  S**   kart no **** **** **** 3456





    }
}
