package BENIM_DOSYALAR.j08_IfStatement_Ternary_Operators.TASK.tasks;

import java.util.Scanner;

public class _07_if_else_if_statement7 {

    public static void main(String[] args) {
        System.out.println("Please enter any number");
 /*  int number 8. satırda.
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit ise "number is a EVEN number" yazdırın.
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit değil ise "number is a ODD number" yazdırın.
*/
        Scanner scan = new Scanner(System.in);

        int numberx = scan.nextInt();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        if (numberx % 2== 0 ) {
            System.out.println("number is a EVEN number");
        } else  {
            System.out.println("number is a ODD number");

        }
    }
}
