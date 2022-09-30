package BENIM_DOSYALAR.j01_Variables.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */

        Scanner input = new Scanner(System.in);
       // System.out.println("Banka hesabiniz var mi? Varsa true yoksa False giriniz:");
       // boolean hesap = input.nextBoolean();
       //  System.out.println("hesap = " + hesap);
        boolean banka= true;
        System.out.println("Banka hesabiniz var mi:  <V>ar - <Y>ok" );
        String cevap = input.next();
        banka = cevap.equals("V");
        System.out.println(banka);

    }
}
