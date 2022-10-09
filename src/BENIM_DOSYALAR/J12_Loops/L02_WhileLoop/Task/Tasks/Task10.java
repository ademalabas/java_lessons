package BENIM_DOSYALAR.J12_Loops.L02_WhileLoop.Task.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = scan.nextInt();
        int i = 1;
        while (i <= number) {
            System.out.print(i % 2 == 1 ? i+", " : " ");
            i++;
        }
    }
}
