package BENIM_DOSYALAR.J12_Loops.L01_ForLoops.Task;

import java.util.Scanner;

public class Task08Nested {
    public static void main(String[] args) {
/*
 task-> girilen boyutta kare çarpım tablosu print eden code create ediniz
   Örnek Ekran çıktısı
1  2  3  4  5
2  4  6  8 10
3  6  9 12 15
4  8 12 16 20
5 10 15 20 25

5x5
  */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {

                System.out.print(i * j + " ");


            }
            System.out.println();//dummy

        }
    }//main


}