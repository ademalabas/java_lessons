package Haluk_Bey_Notlar.src.src.j10_StringManipulations.tasks;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner scan = new Scanner (System.in);
        System.out.print("Herhangi bir cümle yazınız : ");
        String str = scan.nextLine();
        if (str.contains(" ")) {
            System.out.println("cümlede boşluk var.");
        }else {
            System.out.println("cümlede boşluk yok");
        }





    }
}

