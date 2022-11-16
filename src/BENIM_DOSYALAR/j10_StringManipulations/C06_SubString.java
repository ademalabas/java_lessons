package BENIM_DOSYALAR.j10_StringManipulations;

import java.util.Scanner;

public class C06_SubString {
    public static void main(String[] args) {
/*
substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
substring(i)->Method'Test01 parametre olarak girilen  index'den sona kadar olan parcayi return eder
substring(baslangicIndexi, bitisIndexi)->Method'Test01 parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> eclusive/haric
 */
String str = "Java bilen sirti yere gelmez :)";
System.out.println(str.substring(10));  //sirti yere gelmez :)
        // son 1o karakter
System.out.println(str.substring(str.length()-10));//gelmez :)
        // ilk 10 karakter
System.out.println(str.substring(0,10));//Java bilen 0 1 2 3 4 5 6 7 8 9
        //ilk karakter
System.out.println(str.substring(0,1));//J  0 alir 1 i almaz


      //  Tasl-> Girilen dort harfli kelimeyi tersten print eden kod crete edinix

        Scanner scan = new Scanner(System.in);
        System.out.println("4 harfli kelime giriniz");
        String kelime =scan.next();
        if (kelime.length()!=4) {
            System.out.println("4 harfli kelime istedik ");
        }else {
            System.out.print(kelime.substring(kelime.length() - 1));// LAST LETTER
            System.out.print(kelime.substring(2,3));// sondan ikinci yani ikinci indeks
            System.out.print(kelime.substring(1,2));//sondan cuucun yani birinci indeks
            System.out.print(kelime.substring(0,1));// 0 inci index

        }

         /*
        substring()
        Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
        substring(i)->Method'Test01 parametre olarak girilen  index'den sona kadar olan parcayi return eder
        substring(baslangicIndexi, bitisIndexi)->Method'Test01 parametre olarak girilen  baslangicIndexi'den bitis
        indexi'e kadar parçayı return eder
        baslangic indexi ==> inclusive/dahil
        bitis indexi ==> eclusive/haric
         */
/*
        String str = "java bilen sırtı yere gelmez : )";
        System.out.println(str.substring(10));//  sırtı yere gelmez :)
        // str datasının son 10 karakterini print ediniz...
        System.out.println(str.substring(str.length() - 10));//gelmez :

        // str datasının ilk 10 karakterini print ediniz..
        System.out.println(str.substring(0, 10));//java bilen->0,1,2..9 karakteri alır

        // str datasının ilk  karakterini print ediniz..
        System.out.println(str.substring(0, 1));//j->0 alır 1 almaz yani 0. karakter ilk karakteri verir

        //task -> girilen 4 harfli kelimeyi tersten print eden code create ediniz
        Scanner sc=new Scanner(System.in);
        System.out.print("dört harfli kelime giriniz : " );

        String kelime=sc.next();


        if (kelime.length()!=4){
            System.out.println("agam sana 4 garfli gir demedik mi :(");
        }else{
            System.out.print(kelime.substring(kelime.length() - 1));//e
            System.out.print(kelime.substring(2,3));//l
            System.out.print(kelime.substring(1,2));//Test01
            System.out.print(kelime.substring(0,1));//k



        */

    }
}
