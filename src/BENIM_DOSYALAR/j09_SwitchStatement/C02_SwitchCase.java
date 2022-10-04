package BENIM_DOSYALAR.j09_SwitchStatement;

import java.util.Scanner;

public class C02_SwitchCase {
    public static void main(String[] args) {



     //   Task--> Kulllanicini girdigi yilin ay sirasina gore ayi  print eden code create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen  aylardan yildaki sirasini giriniz");
        int rakam = scan.nextInt();
        switch (rakam) {
            case 1 : System.out.println(" Girdiginiz ay 1. ay yani OCAK.");break;
            case 2 : System.out.println(" Girdiginiz ay 2. ay yani SUBAT.");break;
            case 3 : System.out.println(" Girdiginiz ay 3. ay yani MART.");break;
            case 4 : System.out.println(" Girdiginiz ay 4. ay yani NISAN.");break;
            case 5 : System.out.println(" Girdiginiz ay 5. ay yani MAYIS.");break;
            case 6 : System.out.println(" Girdiginiz ay 6. ay yani HAZIRAN.");break;
            case 7 : System.out.println(" Girdiginiz ay 7. ay yani TEMMUZ.");break;
            case 8 : System.out.println(" Girdiginiz ay 8. ay yani AGUSTOS.");break;
            case 9 : System.out.println(" Girdiginiz ay 9. ay yani EYLUK.");break;
            case 10 : System.out.println(" Girdiginiz ay 10. ay yani EKIM.");break;
            case 11 : System.out.println(" Girdiginiz ay 11. ay yani KASIM.");break;
            case 12 : System.out.println(" Girdiginiz ay 12. ay yani ARALIK.");break;
            default : System.out.println(" Girdiginiz ay  TAKVIMDE BULUNAMADI.");break;





        }


        System.out.println("   *** if-else   ***   ");
        if (rakam == 0) {
            System.out.println("girilen rakam SIFIR");
        } else if (rakam == 1) {
            System.out.println("girilen rakam BİR");
        } else if (rakam == 2) {
            System.out.println("girilen rakam İKİ");
        } else if (rakam == 3) {
            System.out.println("girilen rakam ÜÇ");
        } else if (rakam == 4) {
            System.out.println("girilen rakam DORT");
        } else if (rakam == 5) {
            System.out.println("girilen rakam BEŞ");
        } else if (rakam == 6) {
            System.out.println("girilen rakam ALTI");
        } else if (rakam == 7) {
            System.out.println("girilen rakam YEDİ");
        } else if (rakam == 8) {
            System.out.println("girilen rakam SEKİZ");
        } else if (rakam == 9) {
            System.out.println("girilen rakam DOKUZ");
        } else System.out.println("agam adam gibi rakam gir :(");

        System.out.println("   ***  switch case   ***   ");

        switch (rakam) {
            case 0:
                System.out.println("girilen rakam SIFIR");
                break;
            case 1:
                System.out.println("girlen rakam BİR");
                break;
            case 2:
                System.out.println("girilen rakam İKİ");
                break;
            case 3:
                System.out.println("girlen rakam ÜÇ");
                break;
            case 4:
                System.out.println("girilen rakam DORT");
                break;
            case 5:
                System.out.println("girlen rakam BEŞ");
                break;
            case 6:
                System.out.println("girilen rakam ALTI");
                break;
            case 7:
                System.out.println("girlen rakam YEDİ");
                break;
            case 8:
                System.out.println("girilen rakam SEKİZ");
                break;
            case 9:
                System.out.println("girlen rakam DOKUZ");
                break;
            default:
                System.out.println("adam gibi bir rakam gir  :(");
        }
        System.out.println("agam bu yazıyı oluduysan code run olup switch den çıkmıştır");













    }



}
