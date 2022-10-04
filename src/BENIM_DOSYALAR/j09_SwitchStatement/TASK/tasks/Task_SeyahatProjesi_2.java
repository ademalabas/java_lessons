package BENIM_DOSYALAR.j09_SwitchStatement.TASK.tasks;

import java.util.Scanner;

public class Task_SeyahatProjesi_2 {

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


        int f=(60/20)*5;
        int k=(80/20)*5;
        switch (hedef){
            case "F":{
                System.out.println("Frankfurt  bilet ücreti:"+f+" Euro");
                System.out.println("Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   ");
                int kişi= scan.nextInt();
                switch (kişi){
                    case 1:
                        System.out.println("Toplam ücret :"+f+" Euro");
                        break;
                    case 2:
                        System.out.println("Toplam ücret "+f*2+" Euro");
                        break;}
                System.out.println("Bakiyenizi giriniz :");
                double b= scan.nextDouble();
                if (b<f*kişi)
                    System.out.println("Yetersiz bakiye.");
                else System.out.println("Para üstünüz :"+(b-(f*kişi))+" Euro \n ***İyi yolculuklar dileriz.***");
                break;}
            case "K":
                System.out.println("Köln  bilet ücreti:"+k+" Euro");
                System.out.println("Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   ");
                int kişi= scan.nextInt();
                switch (kişi){
                    case 1:
                        System.out.println("Toplam ücret :"+k+"Euro");
                        break;
                    case 2:
                        System.out.println("Toplam ücret "+k*2+"Euro");
                        break;}
                System.out.println("Bakiyenizi giriniz :");
                double b= scan.nextDouble();
                if (b<k*kişi)
                    System.out.println("Yetersiz bakiye.");
                else System.out.println("Para üstünüz :"+(b-(k*kişi))+" Euro \n İyi yolculuklar dileriz.");
                break;
        }






    }
}
