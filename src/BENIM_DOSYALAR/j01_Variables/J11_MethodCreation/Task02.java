package BENIM_DOSYALAR.j01_Variables.J11_MethodCreation;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
      //task -> girilen ad ve soyad ilk harflerini buyuk digerlerini kucuk yapan metod create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("adinizi giriniz");
        String ad = scan.next();
        System.out.println("Soyadinizi giriniz");
        String soyad = scan.next();

        isimKontrol(ad, soyad);





    }//main sonu

    public static void isimKontrol(String ad, String soyad) {// yazdirsin returnsuz
      ad = ad.substring(0, 1).toUpperCase()+ad.substring(1).toLowerCase();
      soyad = soyad.substring(0, 1).toUpperCase()+soyad.substring(1).toLowerCase();
        System.out.println("ad soyad =" +ad+ " " +soyad );


    }

    public static String isimKontrol2(String ad, String soyad) {// return type li
        ad = ad.substring(0, 1).toUpperCase()+ad.substring(1).toLowerCase();
        soyad = soyad.substring(0, 1).toUpperCase()+soyad.substring(1).toLowerCase();
        System.out.println("ad soyad =" +ad+ " " +soyad );

return "ad" + "soyad";
    }



}

//task -> girilen ad ve soyadın ilk harfleri buyuk diğerlerini kucuk yapan method create ediniz

    //    ​
    //    Scanner sc =new Scanner(System.in);
    //    System.out.print("adınızı giriniz : ");
    //    String  ad= sc.next();
    //    ​
    //    System.out.print("soyadınızı giriniz : ");
    //    String  soyad= sc.next();
    //    ​
    //    isimSoyisimHarfKontrol(ad, soyad);
    //    System.out.println(isimSoyisimHarfKontrol2(ad, soyad));
    //    ​
    //    ​
    //    }//main sonu
    //    ​
    //   private static void isimSoyisimHarfKontrol(String ad, String soyad) {
    //    ​
    //    ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
    //    soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
    //    System.out.println("ad  soyad = " + ad + " " + soyad);
    //    }
    //    ​
    //  private static String isimSoyisimHarfKontrol2(String ad, String soyad) {//return typle method
    //    ​
    //    ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
    //    soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
    //    ​
    //    return ad+" "+soyad;
    //    }
    //    }