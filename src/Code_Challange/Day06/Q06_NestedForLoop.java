package Code_Challange.Day06;

import java.util.Scanner;

public class Q06_NestedForLoop {

    public static void main(String[] args) {

/* Interview Question
 Write Test01 Java program to reverse Test01 string. Use for loop and create Test01 method called
  reverseString */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scan.nextLine();
        System.out.println(reverseString(str));
        ;

    }// main end

    private static String reverseString(String str) {
        String reverse ="";
        for(int i=str.length()-1; i>=0; i--){
            reverse+= str.charAt(i);
        }
        return reverse;





    }
}
