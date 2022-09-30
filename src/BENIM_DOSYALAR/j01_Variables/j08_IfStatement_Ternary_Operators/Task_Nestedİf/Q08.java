package BENIM_DOSYALAR.j01_Variables.j08_IfStatement_Ternary_Operators.Task_Nestedİf;

import java.util.Scanner;

public class Q08 {
    /*
     * BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK :

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amaunt of product");
        int amount = scan.nextInt();
        System.out.println("Enter Unit price of product");
        double price= scan.nextDouble();
        System.out.println("Do you have card? sress <Y>es or <N>o button");
        char card = scan.next().toUpperCase().charAt(0);
        if (card == 'Y') {
            if (amount > 10) {
                System.out.println("Diccount % 20: "+ amount * price*0.80 +" $  is enough "   );
            }else {
                System.out.println("Diccount: %15  "+ amount * price*0.85 +" $  is enough ");
            }

        } else
            if (amount > 10) {
                System.out.println("Diccount: %15 "+ amount * price*0.85 +" $  is enough ");
            }else {
                System.out.println("Diccount: % 10  "+ amount * price*0.90 +" $  is enough ");
            }
        }


    }


