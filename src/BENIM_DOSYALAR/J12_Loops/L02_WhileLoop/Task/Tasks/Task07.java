package BENIM_DOSYALAR.J12_Loops.L02_WhileLoop.Task.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz

        Scanner scan = new Scanner(System.in);
        int count = 1;
        int maxnum = 0;
        System.out.println("Enter 5 integer values");
        while (count <= 5) {
            int entry = scan.nextInt();
            maxnum = Math.max(maxnum, entry);
            count ++;
        }System.out.println("Maximum integer value is = " + maxnum);

    }
}
