package BENIM_DOSYALAR.j08_IfStatement_Ternary_Operators;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
       /*
       Task -> girilen bir karakterin harf  olup olmadığını  kontrol eden code create ediniz..

        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Karakter Giriniz");
        char  ch = scan.nextLine().charAt(0);
        if ((ch >= 'A' && ch<='Z')|| (ch >= 'a' && ch <='z')) {
            System.out.println(" girdiginiz karakterdir");
        }else {
            System.out.println(" girdiginiz karakter harf degildir");

        }



    }

}
