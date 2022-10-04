package BENIM_DOSYALAR.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _26_Scanner5 {

    public static void main(String[] args) {

    /*    kullanıcının  10 sene önceki yaşadığın şehri print eden code create ediniz.   */

        Scanner sc= new Scanner(System.in);
        System.out.println("!0 yil once yasadiginiz sehri giriniz:");
        String sehir = sc.nextLine();
        System.out.println("10 yil onceki sehriniz : " + sehir);

    }
}
