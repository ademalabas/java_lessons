package BENIM_DOSYALAR.j10_StringManipulations.tasks_27SEPT;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your First and Lastnames"); // Adem Alabas
        String str3 = scan.nextLine();

        String name = str3.substring(0, str3.indexOf(" "));
        String Lastname = str3.substring(str3.indexOf(" ")+1);

        System.out.println("  Name= " +name +  " \n Lastname = " + Lastname);

       // Name= Adem
       // Lastname = Alabas




    }
}
