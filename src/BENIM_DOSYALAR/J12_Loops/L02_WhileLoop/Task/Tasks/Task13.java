package BENIM_DOSYALAR.J12_Loops.L02_WhileLoop.Task.Tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
        do-while lopp
         */
        Scanner scan = new Scanner(System.in);
        char character;
        do {
            System.out.print("Enter character : ");
            character = scan.next().toLowerCase().charAt(0);
            System.out.println(character== 'x'?"jAVATAR":"javaCAN");
        } while (character != 'x');



    }
}
