package Code_Challange.Day05;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("bir yıl giriniz:");
        int yl=sc.nextInt();
        System.out.println(deneme(yl));
    }



    private static boolean deneme(int yl) {
        if ( yl % 4 == 0 && yl % 400 == 0) {
            return true;
        }else
            return false;
    }


    }


