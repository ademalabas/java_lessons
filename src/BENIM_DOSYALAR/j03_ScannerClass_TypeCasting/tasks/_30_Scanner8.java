package BENIM_DOSYALAR.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _30_Scanner8 {

    public static void main(String[] args) {

    /*    Bir byte oluşturunuz.
          Konsola kg cinsinden bir ağırlık yazınız.
          Byte'ı yazdırınız.   */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Agirlik giriniz :");
        byte agirlik = scanner.nextByte();
        System.out.println("Agirlik = " + agirlik+"kg");


    }
}
