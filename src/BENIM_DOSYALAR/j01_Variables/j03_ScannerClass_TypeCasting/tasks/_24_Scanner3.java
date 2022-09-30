package BENIM_DOSYALAR.j01_Variables.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _24_Scanner3 {

    public static void main(String[] args) {

     /*  kullanıcını sevdiği meyveyi print eden code create ediniz  */
        Scanner sc = new Scanner(System.in);
        System.out.println("Sevdiginiz meyveyi yaziniz:");
        String meyve = sc.nextLine();
        System.out.println("Sevdiginiz meyve: " + meyve);



    }
}
