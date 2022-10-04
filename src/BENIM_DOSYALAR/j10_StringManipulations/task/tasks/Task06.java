package BENIM_DOSYALAR.j10_StringManipulations.task.tasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

//"Grilen stringin son karakterini silen code create ediniz


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name");
String str = scan.nextLine();
       // str.replace(str.length() - 1, "");

        Scanner sc = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");
        String str1 = sc.next();

        System.out.println(str1.substring(0, str1.length() - 1));



    }


}

