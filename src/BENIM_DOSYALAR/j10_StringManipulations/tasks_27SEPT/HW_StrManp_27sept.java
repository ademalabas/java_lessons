package BENIM_DOSYALAR.j10_StringManipulations.tasks_27SEPT;

import java.util.Scanner;

public class HW_StrManp_27sept {
    public static void main(String[] args) {

        //***************  Haluk Hoca String Manipulation****************//

            //***************  Task 11 ****************//
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

        //***************  Task12_ElemanlarinKaresi  ****************//
        /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your First Middle and Surname=");//java adem alabas
        String fms = sc.nextLine();
        String first = fms.toUpperCase().charAt(0)+".";
        String middle = fms.toUpperCase().charAt(fms.indexOf(" ")+1)+".";
        String Surname = fms.toUpperCase().charAt(fms.lastIndexOf(" ")+1)+".";

        System.out.println(first+middle+Surname);//  J.A.A.




    }




}
