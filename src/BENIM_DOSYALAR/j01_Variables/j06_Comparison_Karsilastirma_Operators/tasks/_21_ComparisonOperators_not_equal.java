package BENIM_DOSYALAR.j01_Variables.j06_Comparison_Karsilastirma_Operators.tasks;

import java.util.Scanner;


public class _21_ComparisonOperators_not_equal {

    public static void main(String[] args) {

        /*  2 double oluşturun.
            İlk double'ın değeri 14.23, ikinci double'ın değeri 19.52 olmalı.
            Double1'in double2'ye eşit olmadığını doğrulayın.
            Eğer eşit değilse cevap true olmalı.
            Cevabı yazdırınız.  */

        // Kodu aşağıya yazınız.

        Scanner scan = new Scanner(System.in);
        double d1 = 14.23;
        double d2 = 19.52;
        System.out.println(!(d1==d2));


    }
}
