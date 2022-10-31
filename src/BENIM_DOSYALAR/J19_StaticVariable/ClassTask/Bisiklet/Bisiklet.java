package BENIM_DOSYALAR.J19_StaticVariable.ClassTask.Bisiklet;

import java.util.Scanner;

public class Bisiklet {
 /*
    Task 04->
     Bisiklet Class :Properties(fields) : hiz, vites
     method  :hizdegistir(int yeniHiz), vitesArtir()-> 1 değer vites artırıyor,
     vitesAzalt() -> 1 deger vites azaltıyor, durumGoster -> O andaki hızı ve vitesi gösteriyor
     vites 5 den büyük ve 1 den küçük olamaz.
     yukarıdaki methodları seçtirilen islemYap methodu ile Runner class'da obj ile methodları çalıştırınız
    Trick -> Kullanıcıya metodlarla iligli bir menü veriniz.
     */
// Fields
 int hız;
    int vites;
    public int islem;


    public Bisiklet(int hız, int vites) {
        this.hız = hız;
        this.vites = vites;
    }

    public int HizDegistir() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Yeni hızınızı giriniz.");
        hız = sc.nextInt();
        durumGoster();
        return hız;
    }

    public int VistesArttır() {
        vites += 1;
        if (vites > 5) {
            System.out.println("Vites 5 ten büyük olamaz.");
            vites = 5;
        }
        durumGoster();
        return vites;
    }

    public int VistesAzalt() {
        vites -= 1;
        if (vites < 1) {
            System.out.println("Vites 1 den küçük olamaz.");
            vites = 1;

        }
        durumGoster();
        return vites;
    }

    public void durumGoster() {
        System.out.println("vites :" + vites + "\nhız :" + hız);
    }

    public void islemYap() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Yapmak istediğiniz işlemi seçiniz :\n Hız değiştirmek için (1) \n Vites arttırmak için (2) \n Vites azaltmak için (3) \n Mevcut durum için (4) \n Çıkış için (0)");
            islem = sc.nextInt();

            switch (islem) {
                case 1:
                    HizDegistir();
                    break;
                case 2:
                    VistesArttır();
                    break;
                case 3:
                    VistesAzalt();
                    break;
                case 4:
                    durumGoster();
                    break;
                case 0:
                    System.out.println("***Dikkatli sürün***");
                    break;
                default:
                    System.out.println("Yanlış veri girdiniz");
            }
        } while (islem != 0);
    }

}
