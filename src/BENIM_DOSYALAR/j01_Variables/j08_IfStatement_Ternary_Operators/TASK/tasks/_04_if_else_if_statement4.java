package BENIM_DOSYALAR.j01_Variables.j08_IfStatement_Ternary_Operators.TASK.tasks;

import java.util.Scanner;

public class _04_if_else_if_statement4 {

    public static void main(String[] args) {

     /* double1 ve double2 isimli iki tane double oluşturulmuştur.
        Eğer double1, double2'dan büyük ise "double 1 is greater than double 2" yazdırınız.
        Eğer double1, double2'dan küçük ise "double 1 is smaller than double 2" yazdırınız. */

        double db1 = 12.5;
        double db2 = -3.5;

        if (db1 > db2) {
            System.out.println("double 1 is greater than double 2");

        } else if (db1 < db2) {
            System.out.println("double 1 is smaller than double 2");
        }
    }

}
