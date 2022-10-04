package BENIM_DOSYALAR.j06_Comparison_Karsilastirma_Operators.tasks;

import java.util.Scanner;

public class _18_ComparisonOperators_equal_equal2 {

    public static void main(String[] args) {

    /*    Oluşturulan double'lar hakkında (num1, num2)
          birbirine eşit olup olmadıklarını doğrulayın.
          Eğer eşitlerse konsolda true yazacaktır.  */

        Scanner dp = new Scanner(System.in);

      // double num1 = dp.nextDouble();
      // double num2 = dp.nextDouble();

        // Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        // 1st way
        // System.out.println(num1==num2);

        // 2nd way

        System.out.println("Please enter first double: ");
        double dnum1 = dp.nextDouble();
        System.out.println("Please enter second double: ");
        double dnum2 = dp.nextDouble();
        System.out.println(dnum1 == dnum2);

    }
}
