package BENIM_DOSYALAR.j01_Variables.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen  boyunu cm olarak giriniz:");
        double boy = sc.nextDouble();
        System.out.println("Kullanicidan kilonuzu kg olarak giriniz");
        double kilo = sc.nextDouble();
        double VKI =kilo/((boy/100)*(boy/100));

        System.out.println("VKI = " +(int)VKI);
        System.out.println("VKI = " + VKI);

    }
}
