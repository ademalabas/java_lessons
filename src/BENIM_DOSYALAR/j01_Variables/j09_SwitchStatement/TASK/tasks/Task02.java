package BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunu print eden code create ediniz
        // pazartesi hafta başlangıcı olarak alınız
        Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\n Haftanın kaçıncı gününde olduğunu giriniz : ");
        int kacıncıGun = scan.nextInt();

        int yuzgunsnra = kacıncıGun + 100;

        int gun = yuzgunsnra % 7;
        if (kacıncıGun >=1 && kacıncıGun <= 7) {
            switch (gun) {


                case 1:
                    System.out.println("100 gün sonra Pazartesidir");break;
                case 2:
                    System.out.println("100 gün sonra Salı");break;
                case 3:
                    System.out.println("100 gün sonra Çarşamba");break;
                case 4:
                    System.out.println("100 gün sonra Perşembe");break;
                case 5:
                    System.out.println("100 gün sonra Cuma");break;
                case 6:
                    System.out.println("100 gün sonra Cumartesi");break;
                case 0:
                    System.out.println("100 gün sonra Pazar");break;
            }
        } else System.out.println("hatalı giriş yaptınız...");
/*
        kacıncıGun=(100%7+kacıncıGun)%7;

        switch (kacıncıGun){
            case 1:
                System.out.println("pazartesi"); break;
            case 2:
                System.out.println("salı");break;
            case 3:
                System.out.println("çarşamba"); break;
            case 4:
                System.out.println("perşembe"); break;
            case 5:
                System.out.println("cuma");break;
            case 6:
                System.out.println("cumartesi");break;
            case 7:
                System.out.println("pazar");break;
            default:
                System.out.println("hatalı giriş");
*/

    }
}

