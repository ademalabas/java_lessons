package Code_Challange.Day06;

import java.util.Scanner;

public class Q05_NestedForLoop {

    public static void main(String[] args) {
/*
   Get the number of rows and columns from user.
   Create a rectangle.
   rows = 3 and column = 5 ==> * * * * *
                               * * * * *
                               * * * * *
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers of row ");
        int row = scan.nextInt();
        System.out.println("Enter numbers of column ");
        int column = scan.nextInt();
        for (int i = 0; i <row; i++) {
            System.out.print("* ");
            for (int j = 0; j <column; j++) {
                System.out.print("* ");
            }
            System.out.println();// dummy

        }

     //  for (int i = 1; i <=satir; i++) {       //i =1         i=2         i=3
     //      for (int j = 1; j <= sutun; j++) {  //* * * * *    * * * * *   * * * * *
     //          System.out.print("* ");
     //      }
     //      System.out.println(); //dumy, bu bosluk olmazsa hepini yan yana yazar
     //  }
     //  }











}// main end
}
