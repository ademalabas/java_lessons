package BENIM_DOSYALAR.j09_SwitchStatement.TASK.tasks;

import java.util.Scanner;

public class Trip_Ex {

    public static void main(String[] args) {

        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
 İşlemlerde direkt bunları cağırabilirsiniz.

        todo İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.
      todo  case: KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.



       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.


        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.


         */

        Scanner scan = new Scanner(System.in);
        System.out.println("***** seyahat şirketimize hos geldiniz *****");
        System.out.println("Frankfurt : 60 km \nKoln : 80 km\n 20 Km basına 5 euro ucretlendirme yapılır :) ");
        System.out.print("yolculuk yapacagınız sehri seciniz : ");
        String hedef = scan.next().toUpperCase();//sehir buyuk harfe update edildi


        int f = (60 / 20) * 5;
        int k = (80 / 20) * 5;
        switch (hedef) {
            case "F":
                System.out.println("Frankfurt bilet ucreti  " + f + " Euro'dur ");
                System.out.println("Kac kisilik bilet istiyorsunuz? (Max 2 kisiliktir):  ");
                byte kisi = scan.nextByte();
                if (kisi <3 && kisi >0) {
                    switch (kisi) {
                        case 1:
                            System.out.println("Frankfurt bilet ucreti  " + f + " Euro'dur ");
                            break;
                        case 2:
                            System.out.println("Frankfurt bilet ucreti  " + (f * 2) + " Euro'dur ");
                            break;
                    }
                    System.out.println("Bakiyenizi giriniz:");
                    double dbl = scan.nextDouble();
                    if (dbl > f * kisi)
                        System.out.println("Para Ustu= " + (dbl - (f * kisi)) + " Euro'dur \n *** Iyi yolculuklar dileriz ***");
                    else System.out.println("yetersiz bakiye. ");
                    break;
                }else {
            System.out.println("Yanlis rakam girdiniz Lutfen 1 yada iki kisilik seciniz");
            break;}
            case "K":
                System.out.println("Koln bilet ucreti " + k + "Euro'dur");
                System.out.println("Kac kisilik bilet istiyorsunuz (Maksimum iki kisilikti)");
                byte kisi1 = scan.nextByte();
                if (kisi1 <3 && kisi1 >0) {
                switch (kisi1) {
                    case 1:
                        System.out.println("Koln 1 kisilik bilet ucreti " + k + "Euro'dur");
                        break;
                    case 2:
                        System.out.println("Koln 2 kisilik bilet ucreti " + (k * 2) + "Euro'dur");
                        break;
                }
                System.out.println("Bakiyenizi Giriniz");
                double dbl1 = scan.nextDouble();
                if (dbl1 > k * kisi1)
                    System.out.println("Para ustu = " + (dbl1 - (k * kisi1)) + " Euro'dur \n Iyi yolculuklar dileriz");
                else System.out.println("Yetersiz Bakiye ");
                break;
                }else {
                    System.out.println("Yanlis rakam girdiniz Lutfen 1 yada iki kisilik seciniz");
                    break;}
        }


    }


}

