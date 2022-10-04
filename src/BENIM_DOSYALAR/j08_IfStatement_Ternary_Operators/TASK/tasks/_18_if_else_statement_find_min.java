package BENIM_DOSYALAR.j08_IfStatement_Ternary_Operators.TASK.tasks;

import java.util.Scanner;

public class _18_if_else_statement_find_min {

    public static void main(String[] args) {

    /*    Oluşturulan bu 3 int arasında en düşük değerdeki numarayı bulunuz.
          Bu numarayı yazdırınız.
          Not: Kodunuz her farklı senaryoda en küçük numarayı yazdırmalıdır.

          Örn: 10-11-12 > 10  */


        Scanner scan = new Scanner(System.in);
        System.out.println("please enter any number");
        int mn1 = scan.nextInt();
        System.out.println("please enter any number");
        int mn2 = scan.nextInt();
        System.out.println("please enter any number");
        int mn3 = scan.nextInt();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        if (mn1>mn2 && mn2>mn3){
            System.out.println("Minimum sayi: "+ mn3);
        } else if (mn1>mn3 && mn3>mn2){
            System.out.println("Minimum sayi: "+ mn2);
        } else if (mn2>mn1 && mn1>mn3){
            System.out.println("Minimum sayi: "+ mn3);
        }else if (mn2>mn3 && mn3>mn1){
            System.out.println("Minimum sayi: "+ mn1);
        }else if (mn3>mn2 && mn2>mn1){
            System.out.println("Minimum sayi: "+ mn1);
        }else if (mn3>mn1 && mn1>mn2){
            System.out.println("Minimum sayi: "+ mn2);
        }


    }
}
