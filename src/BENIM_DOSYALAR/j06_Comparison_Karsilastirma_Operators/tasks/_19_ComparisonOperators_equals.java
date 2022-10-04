package BENIM_DOSYALAR.j06_Comparison_Karsilastirma_Operators.tasks;

import java.util.Scanner;

public class _19_ComparisonOperators_equals {

    public static void main(String[] args) {

    /*    2 tane String oluşturun.
          String 1 "Apple" String 2 "Apple"
          İlk String'in değeri "Apple" , ikinci String'in değeri de "Apple"  olmalı.
        String1'in String2'ye eşit olduğunu doğrulayın.  */

        // Kodu aşağıya yazdırınız.
        Scanner scan = new Scanner(System.in);

        String s1 = "Apple";
        String s2 = "Apple";
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);


    }
}
