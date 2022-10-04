package BENIM_DOSYALAR.j06_Comparison_Karsilastirma_Operators.tasks;

import java.util.Scanner;

public class _22_ComparisonOperators_not_equal2 {

    public static void main(String[] args) {

    /*    2 String oluşturunuz.
          İlk String'in değeri "Techno Study", ikinci String'in değeri de "Techno Study" olsun.
          İlk String'in ikinci String'e eşit olmadığını doğrulayın. örn: (  !=    işareti ile)
          Eğer eşit değilse cevap true, eğer eşitse cevap false olacaktır.
          Cevabı yazdırın.  */

        //Kodu aşağıya yazınız.
        Scanner scan = new Scanner(System.in);
        String i = "Techno Study";
        String e = "Techno Study";
        System.out.println( !(i==e));//1st wat
        System.out.println( !((i).equals(e)));//2nd way




    }
}
