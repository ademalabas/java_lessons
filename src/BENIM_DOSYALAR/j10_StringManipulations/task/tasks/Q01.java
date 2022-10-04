package BENIM_DOSYALAR.j10_StringManipulations.task.tasks;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner scan = new Scanner (System.in);
        System.out.print("Please write any statement : ");
        String str = scan.nextLine();
        if (str.contains(" ")) {
            System.out.println("There is(are) space character(S) in statement.");
        }else {
            System.out.println("There is(are) no space character(S) in statement.");
        }





    }
}

