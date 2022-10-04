package BENIM_DOSYALAR.j01_Variables.J11_MethodCreation.tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int first =sc.nextInt();
        System.out.print("Enter second number:");
        int second =sc.nextInt();
        System.out.print("Enter third number:");
        int third =sc.nextInt();
        smallest(first,second,third);
    }// main ends
    public static void smallest(int first,int second,int third){
        if (first < second && first <third) {
            System.out.println("Smallest number is  :" + first);
        } else if (second < first && second < third){ System.out.println("Smallest number is  :" + second);

        } else if (third < first && third < second){ System.out.println("Smallest number is  :" + third);

        }else System.out.println("Wrong Entry.");
    }


    }




