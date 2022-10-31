package BENIM_DOSYALAR.J23_Varargs_StringBuilder.StringBuilders;

public class Task02 {
    public static void main(String[] args) {


        //String ile StringBuilder karsilastirmasi

        /*
        Compare iki sb'i esit mi diye kontrol etmek icin
        ilk harften baslayarak tum karakterleri karsilastirir
        Ayni olan karakterler icin bir sey return etmezken
        farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride
        oldugunu print eder
        Tamamen ayni ise bize 0 return eder

        bir sb ile bir String'i compare etmek istersek Java CTE verir
         */
        StringBuilder sb5=new StringBuilder("javaCAN");
        StringBuilder sb6=new StringBuilder("javaCAN");
        String  str1="javaCAN";
        System.out.println("sb5.compareTo(sb6) = " + sb5.compareTo(sb6));//0
        System.out.println("sb6.compareTo(new StringBuilder(str1)) = " + sb6.compareTo(new StringBuilder(str1)));//0
        // sb6.compareTo((str1)//CTE-> elam armut kıyası olamazzz

        System.out.println("sb6.equals(sb6) = " + sb6.equals(sb5));//false-> SB equals == gibi çalışır -> hem value hem de ref değere bakar
        System.out.println("sb6.equals(sb6) = " + sb6.equals(sb6));//true

        System.out.println("str1.equals(sb6.toString()) = " + str1.equals(sb6.toString()));//True



    }
}
