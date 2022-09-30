package BENIM_DOSYALAR.j01_Variables.j06_Comparison_Karsilastirma_Operators.tasks;

import java.util.Scanner;

public class _20_ComparisonOperators_bigger_equal {

    public static void main(String[] args) {

        /*  İki tane float oluşturun. Birinci float 14, ikinci float 17'dir.
            Birinci float'un, ikinci float'dan büyük eşit olduğunu veya  büyük olduğunu yada olmadığını doğrulayın.
            Sonucu yazdırınız. */

        //Kodu aşağıya yazınız.
        Scanner scan = new Scanner(System.in);
        float f1 = 14f;
        float f2 = 17f;
        System.out.println((f1>= f2) || (f1>f2) || !(f1>f2));


    }
}
