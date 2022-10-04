package BENIM_DOSYALAR.J11_MethodCreation;

public class Task04 { // amele koyunden irgat cagiran sehir
   /*
Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış
işlemlerinin yapıldıgı bie ATM app. code create ediniz
 */

  //  static Scanner scan = new Scanner(System.in);
  //  static int bakiye = 1000;

    public static void main(String[] args) {
        System.out.println("   ***   ");
        System.out.println("  ***   ATM'ye hoş Geldiniz  ***  ");
        System.out.println("   ***   ");
        System.out.println("MÖNÜÜÜ :-)\nBakiye öğrenme -> 1\nPara yatırma -> 2\nPara Çeke -> 3\nÇıkış -> 4\nGiriniz : ");
        Task04_AtmMetod.secim(); // method call yapildi amele koyunden


    }// main sonu

  // private static void secim() {

  //     System.out.println("agan islem sec");
  //     int secim = scan.nextInt();
  //     switch (secim) {
  //         case 1:
  //             bakiyeVer();
  //             ;
  //             break;
  //         case 2:
  //             paraYatir();
  //             break;
  //         case 3:
  //             paraCek();
  //             break;
  //         case 4:
  //             cikisYap();
  //             break;
  //         default:
  //             System.out.println("Agam secim yapamiysen para istiyorsun");
  //     }
  // }

  // private static void cikisYap() {
  //     System.out.println("agam yine bekleriz cikisiniz yapildi selametle :)");


  // }

  // private static void paraCek() {
  //     System.out.println("agam nekadar cekecen");
  //     int cekilecekMiktar = scan.nextInt();
  //     if (cekilecekMiktar <= bakiye) {
  //         bakiye -= cekilecekMiktar;
  //         System.out.println("agam para cepte gozun aydin:)");
  //         System.out.println("agam bakiye = " + bakiye);

  //     } else System.out.println("agan niddin olmayan parayini cekecen");
  //     karar();


  // }

  // private static void paraYatir() {
  //     System.out.println("agam nekadar yatirceng");
  //     int yatirilacakMiktar = scan.nextInt();
  //     bakiye += yatirilacakMiktar;
  //     System.out.println("agam para hesabinda  ahanda yeni  bakiye" + bakiye);
  //     //bakiyeVer();
  //     karar();

  // }

  // private static void bakiyeVer() {
  //     System.out.println("agam bakiye = " + bakiye);

  //     karar();

  // }

  // public static void karar() {
  //     System.out.println("agam islem \n devamke -.1\nyeter ->0");
  //     int karar = scan.nextInt();
  //     if (karar == 1) {
  //         secim();
  //
  //     } else if (karar == 0)
  //         cikisYap();
  //     else
  //         System.out.println("Hatali secim adam gibi karar gir");
  // }

}






