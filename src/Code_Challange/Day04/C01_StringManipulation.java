package Code_Challange.Day04;

import java.util.Scanner;

public class C01_StringManipulation {
    public static void main(String[] args) {

        //Kullanicidan ismini ve soyisimi girmesini isteyin,
        // sonrasinda konsola tam ismini buyuk harfler ile yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println(" Please enter Name and Surname:");
        String name = scan.nextLine(), surname = scan.nextLine();
        String fullName = name.concat(" "+ surname).toUpperCase();
        System.out.println("fullName = " + fullName);



    }



}
