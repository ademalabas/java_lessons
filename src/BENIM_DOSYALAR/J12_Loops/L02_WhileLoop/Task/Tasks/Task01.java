package BENIM_DOSYALAR.J12_Loops.L02_WhileLoop.Task.Tasks;

import java.util.Scanner;

public class Task01 {


    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */
        int total = 0;
        int numberOfInteger = 0;
        while (total <= 333) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Erter Integer");
            int number = sc.nextInt();
            total += number;
            numberOfInteger++;
        }
        System.out.print(numberOfInteger + "  numbers of integer entered" + "\nTotal of these integers are :" + total);

    }// main


}



