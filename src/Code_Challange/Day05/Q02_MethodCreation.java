package Code_Challange.Day05;

import java.util.Scanner;

public class Q02_MethodCreation {


/* Write a method named isEven that accepts an integer argument.
 The method should return true if the argument is even, or false otherwise.*/


    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the number");
        int a = scan.nextInt();
        System.out.println(isEven(a));
    }// MAIN
    public static boolean isEven(int a) {
        if (a%2 == 0) {
            return true;
        }else return false;

// return a%2==0?true:false;  //best practice



    }





}
