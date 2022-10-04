package BENIM_DOSYALAR.j09_SwitchStatement;


import java.util.Scanner;

public class C05_SwitchCaseHocaATM {
    public static void main(String[] args) {
        /*
Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış
işlemlerinin yapıldıgı bie ATM app. code create ediniz
 */





        Scanner scan = new Scanner (System.in);
        int bakiye = 1000;
        System.out.println("Clarusway bangasına hoşgeldin ağamm, ne istirsenn ???");
        System.out.println("bakiye öğrenme <1> \npara yatırma <2> \npara cekme <3> \nçıkış işlemi <4> \ngiriniz");
        int a = scan.nextInt();
        switch (a) {
            case 1:
                System.out.println("güncel bakiyeniz : " + bakiye); break;
            case 2:
                System.out.println("yatırmak istediğiniz tutarı yazınız");
                int yatPara = scan.nextInt();
                bakiye += yatPara;
                System.out.println("güncel bakiyeniz : " + bakiye);
                break;
            case 3:
                System.out.println("çekmek istediğiniz tutarı yazınız");
                int cekPara = scan.nextInt();
                if (cekPara > bakiye) {
                    System.out.println("ağam bakiyen o kadar yok. para vermirem sanaa :)");
                }else {
                    bakiye -= cekPara;
                }
                System.out.println("güncel bakiyeniz : " + bakiye);
                break;
            case 4:
                System.out.println("Çıkış yapirsan ağam , Uğurlar olaaa");
                break;
            default: System.out.println("yanlış işlem girdin ağam, gene dene");
        }
/*
        Scanner sc = new Scanner(System.in);
        System.out.print("bir işlem seçiniz  : ");
        String islem = sc.nextLine();
        int bakiye = 1000;
        switch (islem) {
            case "Bakiye Öğrenme":
                System.out.println("Bakiyeniz : "+bakiye); break;
            case "Para Yatırma":
                System.out.println("Para Yatırma miktarını giriniz");
                int miktar = sc.nextInt();
                bakiye += miktar;
                System.out.println("Bakiyeniz : "+bakiye); break;
            case "Para Çekme":
                System.out.println("Para Çekme miktarını giriniz");
                int cekme = sc.nextInt();
                bakiye -= cekme;
                System.out.println("Bakiyeniz : "+bakiye); break;
            default:
                System.out.println("adam gibi bişey gir :( "); break;
        }

        */








    }
}