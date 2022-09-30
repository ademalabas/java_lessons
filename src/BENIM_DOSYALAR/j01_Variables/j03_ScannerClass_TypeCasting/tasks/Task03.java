package BENIM_DOSYALAR.j01_Variables.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Gunde kac saat uyuyorsunuz?:");
        double uyku = sc.nextDouble();
        System.out.println("Ayda : " + (uyku/24)*30+ ", Yilda:"+(int)((uyku/24)*365)+", 40 Yilda:"+(int)((uyku/24)*365*40)+"   gununuz uykuda geciyor!!!");

    }
}
