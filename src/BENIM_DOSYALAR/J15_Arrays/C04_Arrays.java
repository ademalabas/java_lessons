package BENIM_DOSYALAR.J15_Arrays;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {
        /// Array esitligi equals() metodu indeks ve value kontrolu yapar ve true/false  return eder

        //Array eşitilk kontrolu... equals()-> methodu index ve value kontrolu yapar ve true/false return eder

        int sayi1[] = {39, 3, 72, 63, 84};
        int sayi2[] = {84, 72, 63, 3, 39};

        System.out.println("sayı1 ve sayı2 eşit mi : " + Arrays.equals(sayi1, sayi2));//false

        Arrays.sort(sayi1);//[3,39,63,72,84]
        Arrays.sort(sayi2);//[3,39,63,72,84]

        System.out.println("sayı1 ve sayı2 eşit mi : " + Arrays.equals(sayi1, sayi2));//true

    }//
}
