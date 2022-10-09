package BENIM_DOSYALAR.J12_Loops.L02_WhileLoop.Task.Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num1 = scan.nextInt();
        int totalValues = 0;
        int count = 1;
        while (num1 != 0) {
            num1 = scan.nextInt();
            totalValues += num1;
            count++;
        }
        System.out.println("You entered " + count + " integers. \nTotal value of intergers is --> " + totalValues);







    }
}
