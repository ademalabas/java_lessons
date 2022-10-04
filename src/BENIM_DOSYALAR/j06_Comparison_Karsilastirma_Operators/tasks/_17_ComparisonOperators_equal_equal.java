package BENIM_DOSYALAR.j06_Comparison_Karsilastirma_Operators.tasks;

import java.util.Scanner;

public class _17_ComparisonOperators_equal_equal {

    public static void main(String[] args) {

        /*  Verilen iki tane int (num1, num2) ile ilgili,
            Eger num1  num2 ya  eşitse console'da true yazsın.
            Değilse false  */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number= " );
        int num1 = sc.nextInt();
        System.out.println("Please enter the second number= " );
        int num2 = sc.nextInt();
        System.out.println(num1==num2);



    }
}
