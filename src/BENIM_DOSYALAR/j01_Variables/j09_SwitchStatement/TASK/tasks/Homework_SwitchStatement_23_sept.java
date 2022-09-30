package BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK.tasks;

import java.util.Scanner;

public class Homework_SwitchStatement_23_sept {
    public static void main(String[] args) {
        //***************  Task1  ****************//
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter POSITIVE number= ");
        int number = scan.nextInt();
        switch ((number/10)%10) {
            case 0: System.out.println(" TENS VALUE OF Number you entered is ZERO");break;
            case 1: System.out.println(" TENS VALUE OF Number you entered is ONE");break;
            case 2: System.out.println("TENS VALUE OF Number you entered is TWO");break;
            case 3: System.out.println("TENS VALUE OF Number you entered is THREE.");break;
            case 4: System.out.println("TENS VALUE OF Number you entered is FOUR");break;
            case 5: System.out.println("TENS VALUE OF Number you entered is FIVE");break;
            case 6: System.out.println("TENS VALUE OF Number you entered is SIX");break;
            case 7: System.out.println("TENS VALUE OF Number you entered is SEVEN");break;
            case 8: System.out.println("TENS VALUE OF Number you entered is EIGHT");break;
            case 9: System.out.println("TENS VALUE OF Number you entered is NINE");break;
            default: System.out.println(" Number you entered is Negative");break;
        }
        //***************  Task2  ****************//
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


        //***************  Task3  ****************//
        System.out.print("gunNo = ");
        int gunNo = scan.nextInt();
        int gun1 = gunNo % 7;

        switch (gun1) {
            case 1: System.out.printf("pazartesi");break;
            case 2: System.out.printf("salı");break;
            case 3: System.out.printf("çarşamba");break;
            case 4: System.out.printf("perşembe");break;
            case 5: System.out.printf("cuma");break;
            case 6: System.out.printf("cumartesi");break;
            case 7: System.out.printf("pazar");break;
            default: System.out.println("hatalı giriş");break;
        }
        //***************  Task4  ****************//

        System.out.println(" \n\n************ayların gün sayısı********");
        System.out.println("bir ay ismi yazınız :");
        String ay = scan.next().toLowerCase();
        switch (ay) {
            case "ocak":
            case "mart":
            case "mayıs":
            case "temmuz":
            case "ağustos":
            case "ekim":
            case "aralık":
                System.out.println("31 gün çekiyor");break;
            case "nisan":
            case "haziran":
            case "eylül":
            case "kasım":
                System.out.println("30 gün çekiyor");break;
            case "subat":
                System.out.println("yılınızı giriniz :");
                int yil = scan.nextInt();
                if (yil % 4 == 0) {
                    System.out.println(" Girdiginiz ay 28 gun ceker.");
                } else
                    System.out.println(" Girdiginiz ay 29 gun ceker.");break;
            default:
                System.out.println("hatalı giriş!!!!");
                break;
        }

        //***************  Task5  ****************//
        System.out.print("Notunuzu giriniz : ");
        int not = scan.nextInt()/10;
        switch (not) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Notunuz:\"D\'"); break;
            case 5: System.out.println("Notunuz:\"C\'");break;
            case 6:
            case 7: System.out.println("Notunuz:\"B\'");break;
            case 8:
            case 9:
            case 10: System.out.println("Notunuz:\"A\'");break;
            default:
                System.out.println("hatalı giriş 0 ile 10 arasi bir sayi giriniz");
        }
        //***************  Task6  ****************//

        System.out.print("VIP kisaltmasindaki harflerden birini giriniz");
        char ch = scan.next().toUpperCase().charAt(0);
        switch (ch) {
            case 'V':
                System.out.print("very");
                break;
            case 'I':
                System.out.print("important");
                break;
            case 'P':
                System.out.print("person");
                break;
            default:
                System.out.println("Hatalı giriş.");
        }
        //***************  Task7  ****************//
        System.out.println("sayi giriniz :");
        int sayi = scan.nextInt();
        int birler = sayi % 10;//sayının birler basamagı
        int onlar = (sayi / 10) % 10;//
        int yuzler = sayi / 100;
        if (sayi > 99 && sayi < 1000) {
            switch (yuzler) {
                case 1: System.out.println("yuz");break;
                case 2: System.out.println("ikiyuz");break;
                case 3: System.out.println("uc yuz");break;
                case 4: System.out.println("dort yuz");break;
                case 5: System.out.println("bes yuz");break;
                case 6: System.out.println("alti yuz");break;
                case 7: System.out.println("yedi yuz");break;
                case 8: System.out.println("sekiz yuz");break;
                case 9: System.out.println("dokuz yuz");break;
            }
            switch (onlar) {
                case 1: System.out.println("on");break;
                case 2: System.out.println("yirmi");break;
                case 3: System.out.println("otuz");break;
                case 4: System.out.println("kirk");break;
                case 5: System.out.println("elli");break;
                case 6: System.out.println("altmis");break;
                case 7: System.out.println("yetmis");break;
                case 8: System.out.println("seksen");break;
                case 9: System.out.println("doksan");break;
            }
            switch (birler) {
                case 1: System.out.println("bir");break;
                case 2: System.out.println("iki");break;
                case 3: System.out.println("uc");break;
                case 4: System.out.println("dort");break;
                case 5: System.out.println("bes");break;
                case 6: System.out.println("alti");break;
                case 7: System.out.println("yedi ");break;
                case 8: System.out.println("sekiz ");break;
                case 9: System.out.println("dokuz ");break;
            }
        } else {System.out.println("Hatali giris yaptiniz");
        }
        //***************  Task Trip Project  ****************//
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
                    case 1: System.out.println("Toplam ücret :"+f+" Euro");break;
                    case 2: System.out.println("Toplam ücret "+f*2+" Euro");break;}
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
                    case 1: System.out.println("Toplam ücret :"+k+"Euro");break;
                    case 2: System.out.println("Toplam ücret "+k*2+"Euro");break;}
                System.out.println("Bakiyenizi giriniz :");
                double b= scan.nextDouble();
                if (b<k*kişi)
                    System.out.println("Yetersiz bakiye.");
                else System.out.println("Para üstünüz :"+(b-(k*kişi))+" Euro \n İyi yolculuklar dileriz.");
                break;
        }
/*
        //***************  Console Print  ****************
        //***************  Task1  ****************
        Enter POSITIVE number= 345
        TENS VALUE OF Number you entered is FOUR

        ***************  Task2  ****************
        Pazartesi: 1
        Salı : 2
        Çarşamba: 3
        Perşembe: 4
        Cuma: 5
        Cumartesi: 6
        Pazar: 7
        Haftanın kaçıncı gününde olduğunu giriniz :
        5
        100 gün sonra Pazar

        ***************  Task3  *****************
        gunNo = 5
        cuma

        ***************  Task4  ****************
        ************ayların gün sayısı********
        bir ay ismi yazınız :
        ocak
        31 gün çekiyor

        ***************  Task5  ****************
        Notunuzu giriniz : 75
        Notunuz:"B'

        ***************  Task6  ****************
        VIP kisaltmasindaki harflerden birini girinizi
        important
        ***************  Task7  ****************
        sayi giriniz :678
        alti yuz
        yetmis
        sekiz
        ***************  Trip  ****************
         ***** seyahat şirketimize hos geldiniz *****
        Frankfurt : 60 km
        Koln : 80 km
        20 Km basına 5 euro ucretlendirme yapılır :)
        yolculuk yapacagınız sehri seciniz : f
        Frankfurt  bilet ücreti:15 Euro
        Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):
        2
        Toplam ücret 30 Euro
        Bakiyenizi giriniz :
        40
        Para üstünüz :10.0 Euro
        ***İyi yolculuklar dileriz.***

 */

    }





}
