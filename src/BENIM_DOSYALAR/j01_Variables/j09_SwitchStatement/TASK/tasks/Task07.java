package BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK.tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
// 2- Girilen 3 basamaklı sayıyı kelime olarak print eden code create ediniz..


        Scanner scan = new Scanner(System.in);
        System.out.print("sayi giriniz :");
        int sayi = scan.nextInt();
        int birler = sayi % 10;//sayının birler basamagı
        int onlar = (sayi / 10) % 10;//
        int yuzler = sayi / 100;
        if (sayi > 99 && sayi < 1000) {
            switch (yuzler) {
                case 1:
                    System.out.println("yuz");break;
                case 2:
                    System.out.println("ikiyuz");break;
                case 3:
                    System.out.println("uc yuz");break;
                case 4:
                    System.out.println("dort yuz");break;
                case 5:
                    System.out.println("bes yuz");break;
                case 6:
                    System.out.println("alti yuz");break;
                case 7:
                    System.out.println("yedi yuz");break;
                case 8:
                    System.out.println("sekiz yuz");break;
                case 9:
                    System.out.println("dokuz yuz");break;
            }
            switch (onlar) {
                case 1:
                    System.out.println("on");break;
                case 2:
                    System.out.println("yirmi");break;
                case 3:
                    System.out.println("otuz");break;
                case 4:
                    System.out.println("kirk");break;
                case 5:
                    System.out.println("elli");break;
                case 6:
                    System.out.println("altmis");break;
                case 7:
                    System.out.println("yetmis");break;
                case 8:
                    System.out.println("seksen");break;
                case 9:
                    System.out.println("doksan");break;
            }
            switch (birler) {
                case 1:
                    System.out.println("bir");break;
                case 2:
                    System.out.println("iki");break;
                case 3:
                    System.out.println("uc");break;
                case 4:
                    System.out.println("dort");break;
                case 5:
                    System.out.println("bes");break;
                case 6:
                    System.out.println("alti");break;
                case 7:
                    System.out.println("yedi ");break;
                case 8:
                    System.out.println("sekiz ");break;
                case 9:
                    System.out.println("dokuz ");break;
            }
        } else {
            System.out.println("Hatali giris yaptiniz");
        }

        /*
        Scanner scan = new Scanner(System.in);
        System.out.print("üç basamaklı sayi giriniz :");
        int sayi = scan.nextInt();
        int birler = sayi % 10;
        int onlar = (sayi / 10) % 10;
        int yüzler = sayi / 100;
        if (sayi >= 100 && sayi < 1000) {
            switch (yüzler) {
                case 1:
                    System.out.print("yüz");
                    break;
​
                case 2:
                    System.out.print("iki yüz");
                    break;
​
                case 3:
                    System.out.print("üçyüz");
                    break;
                case 4:
                    System.out.print("dörtyüz");
                    break;
​
                case 5:
                    System.out.print("beşyüz");
                    break;
​
                case 6:
                    System.out.print("altıyüz");
                    break;
                case 7:
                    System.out.print("yediyüz");
                    break;
                case 8:
                    System.out.print("sekizyüz");
                    break;
                case 9:
                    System.out.print("dokuzyüz");
                    break;
            }
​
​
            switch (onlar) {
​
​
                case 1:
                    System.out.print("on");
                    break;
​
                case 2:
                    System.out.print("yirmi");
                    break;
​
                case 3:
                    System.out.print("otuz");
                    break;
                case 4:
                    System.out.print("kırk");
                    break;
​
                case 5:
                    System.out.print("elli");
                    break;
​
                case 6:
                    System.out.print("atmış");
                    break;
                case 7:
                    System.out.print("yetmiş");
                    break;
                case 8:
                    System.out.print("seksen");
                    break;
                case 9:
                    System.out.print("doksan");
                    break;
            }
            switch (birler) {
​
​
                case 1:
                    System.out.print("bir");
                    break;
​
                case 2:
                    System.out.print("iki ");
                    break;
​
                case 3:
                    System.out.print("üç");
                    break;
                case 4:
                    System.out.print("dört");
                    break;
​
                case 5:
                    System.out.print("beş");
                    break;
​
                case 6:
                    System.out.print("altı");
                    break;
                case 7:
                    System.out.print("yedi");
                    break;
                case 8:
                    System.out.print("sekiz");
                    break;
                case 9:
                    System.out.print("dokuz");
                    break;
​
​
            }
        }else System.out.println("hatalı giriş yaptınız");

         */





    }
}
