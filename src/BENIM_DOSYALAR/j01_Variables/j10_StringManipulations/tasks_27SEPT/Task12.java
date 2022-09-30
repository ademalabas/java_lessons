package BENIM_DOSYALAR.j01_Variables.j10_StringManipulations.tasks_27SEPT;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your First Middle and Surname=");//java adem alabas
        String fms = scan.nextLine();
        String first = fms.toUpperCase().charAt(0)+".";
        String middle = fms.toUpperCase().charAt(fms.indexOf(" ")+1)+".";
        String Surname = fms.toUpperCase().charAt(fms.lastIndexOf(" ")+1)+".";

        System.out.println(first+middle+Surname);//  J.A.A.

    }
}
