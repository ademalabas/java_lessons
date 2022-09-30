package Day04.day04;

import java.util.Scanner;

public class Q12_StringManipulation {
    public static void main(String[] args) {

        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any statement");// Adem Alabas
        String str = scan.nextLine();
        System.out.println(str.contains(" "));//true
        System.out.println(str.isEmpty()); //False


    }
}