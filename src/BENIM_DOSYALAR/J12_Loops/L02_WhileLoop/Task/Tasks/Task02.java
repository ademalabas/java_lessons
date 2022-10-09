package BENIM_DOSYALAR.J12_Loops.L02_WhileLoop.Task.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first=scan.nextInt();
        System.out.print("Enter second number: ");
        int second=scan.nextInt();

        if (first > second) {
            while (second < first-1) {
                System.out.print(++second+" ");
            }
        } else if (first <second) {
            while (first< second-1) {
                System.out.print(++first+" ");
            }
        }else System.out.println("Wrong entery, numbers are equal ");

    }
}
