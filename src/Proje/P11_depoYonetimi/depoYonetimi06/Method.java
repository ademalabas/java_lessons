package Proje.P11_depoYonetimi.depoYonetimi06;

import java.util.*;

public class Method implements GirisCikisInterface {
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";
    public static final String P = "\u001B[35m";
    static Scanner scan = new Scanner(System.in);
    static int id = 1004;//***
    static HashMap<Integer, UrunTanimlama> urunler = new HashMap<>();

    static int count = 0;

    public void girisPaneli() {

        System.out.println(Y + "========================== İŞLEMLER =======================\r\n"
                + "   ____________________              ____________________   \n"
                + "   | 1-URUN TANIMLAMA |              |  2-URUN LİSTELE  |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                + "   ____________________              ____________________   \n"
                + "   | 3-URUN GIRISI    |              |  4-URUN RAFA KOY |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                + "   ____________________              ____________________   \n"
                + "   | 5-URUN CIKISI    |              |  6-BITIRME       |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯  " + R);

        System.out.print("Yapmak istediginiz islem : ");

        try {
            int secim = scan.nextInt();

            switch (secim) {
                case 1:
                    urunTanimlama();

                    girisPaneli();
                    break;
                case 2:
                    urunListele();
                    girisPaneli();
                    break;
                case 3:
                    miktarGuncelle();

                    //urunListele(); ***
                    girisPaneli();
                    break;
                case 4:
                    rafaKoy();
                    //urunListele();***
                    girisPaneli();
                    break;
                case 5:
                    urunCikis();
                    //urunListele();***
                    girisPaneli();
                    break;
                case 6:
                    cikisYap();
                    break;
                default:
                    System.out.println("Hatali secim yaptınız");
                    girisPaneli();
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Sayi disinda karakter girilemez");
            scan.nextLine();
            girisPaneli();
        }
    }

    public void cikisYap() {
        System.out.println("Cikis yapildi");
        System.exit(0);//***

    }

    public static void urunTanimlama() {


        System.out.println("lutfen urun bilgilerini giriniz");
        System.out.println("Urun ismi");
        scan.nextLine();
        String urunIsmi = scan.nextLine();
        Set<Map.Entry<Integer, UrunTanimlama>> urunlerSeti = urunler.entrySet();

        try {//*** Aynı ürün isim kontrolu için for döngüsü ile karşılaştırdık..
            for (Map.Entry<Integer, UrunTanimlama> each : urunlerSeti) {

                if (each.getValue().getUrunIsmi().equals(urunIsmi)) {
                    System.out.println(P + "Ürün mevcut Lütfen tekrar ürün girişi yapmak için (D)' ye basın ");
                    scan.next();
                    urunIsmi = "";
                    urunTanimlama();
                }
            }
        } catch (Exception e) {
            Main g = new Main();
            g.girisPaneli();
        }
        System.out.println("Uretici firma");
        String uretici = scan.nextLine();
        System.out.println("Birim");
        String birim = scan.nextLine();

        UrunTanimlama urun = new UrunTanimlama(id, urunIsmi, uretici, birim);
        urunler.put(id, urun);

        System.out.println(P + "Ürün ID :" + urunler.get(id).getId() + "/  Adı :" + urunler.get(id).getUrunIsmi() + "/   Üretici : " + urunler.get(id).getUretici() + "/   Birimi : " + urunler.get(id).getBirim());//***
        id++;

    }

    public static void urunListele() {
        Set<Map.Entry<Integer, UrunTanimlama>> urunlerSeti = urunler.entrySet();

        System.out.println("id       ismi         ureticisi       miktari       birimi         raf" +
                "\n----------------------------------------------------------------------");
        for (Map.Entry<Integer, UrunTanimlama> each : urunlerSeti) {
            Integer urunlerKey = each.getKey();
            System.out.printf("%d    %-8s       %-14s %3d          %-14s %s"
                    , urunlerKey, each.getValue().getUrunIsmi(), each.getValue().getUretici(), each.getValue().getMiktar(), each.getValue().getBirim(), each.getValue().getRaf());
            System.out.println("");
        }

    }

    public static void miktarGuncelle() {
        System.out.println("Urun girisi icin Id bilgisi giriniz");

        int arananId = scan.nextInt();

        //if(!Character.isDigit(arananId)){//! işareti koyduk *** gereksiz olmuş ***
        if (urunler.containsKey(arananId)) {
            System.out.println(P + urunler.get(arananId).getUrunIsmi() + "  miktarı : " + urunler.get(arananId).getMiktar() + " Birim : " + urunler.get(arananId).getBirim());//***


            System.out.println("Depoya eklemek istedğiniz miktari giriniz");
            int guncelMik = scan.nextInt();
            urunler.get(arananId).setMiktar(guncelMik + urunler.get(arananId).getMiktar());


            System.out.println(P + "Mevcut " + urunler.get(arananId).getUrunIsmi() + " miktarı  = " + urunler.get(arananId).getMiktar() + " " + urunler.get(arananId).getBirim());
//*** yukarıdaki sout kullanıcıyı bilgilendirme amaçlı

        } else {
            System.out.println("aradiniz urun yok");
        }
    }


    private static void rafaKoy() {
        System.out.println("Raf girisi icin Id bilgisi giriniz");
        int arananId = scan.nextInt();

        if (urunler.keySet().contains(arananId)) {//*** menu
            System.out.println(P + "Raflamak istedğiniz ürünün adı :" + urunler.get(arananId).getUrunIsmi() + " raf =" + urunler.get(arananId).getRaf());
            System.out.println(P + "========================== İŞLEMLER =======================\r\n"
                    + "   ____________________              ____________________   \n"
                    + "   | 1-Şarküteri      |              | 2-Bakliyat       |   \n"
                    + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                    + "   ____________________              ____________________   \n"
                    + "   | 3-Atıştırmalık   |              | 4-Manav          |   \n"
                    + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                    + "   ____________________              ____________________   \n"
                    + "   | 5-İçecek         |              |  6-Temizlik      |   \n"
                    + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯  \n"
                    + "   ____________________              ____________________   \n"
                    + "   | 7-Züccaciye      |              |  8-Konserve      |   \n"
                    + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯  " + R);

            System.out.print("Yapmak istediginiz islem : ");

            //  System.out.println("Guncel raf giriniz \n1-Şarküteri\n2-Bakliyat \n3-Kasap \n4-Manav \n5-İçecek \n6-Temizlik \n7-Züccaciye \n Lütfen Seçiminizi giriniz :");
            scan.nextLine();
            int rfgir = scan.nextInt();
            try {
                switch (rfgir) {//*** Bu switch case i koyduk try catch ile beraber

                    case 1:
                        String guncelRaf = "Şarküteri";
                        urunler.get(arananId).setRaf(guncelRaf);

                        break;
                    case 2:
                        guncelRaf = "Bakliyat";
                        urunler.get(arananId).setRaf(guncelRaf);
                        break;
                    case 3:
                        guncelRaf = "Atıştırmalık";
                        urunler.get(arananId).setRaf(guncelRaf);
                        break;

                    case 4:
                        guncelRaf = "Manav";
                        urunler.get(arananId).setRaf(guncelRaf);
                        break;
                    case 5:
                        guncelRaf = "İçecek";
                        urunler.get(arananId).setRaf(guncelRaf);
                        break;
                    case 6:
                        guncelRaf = "Temizlik";
                        urunler.get(arananId).setRaf(guncelRaf);
                        break;
                    case 7:
                        guncelRaf = "Züccaciye";
                        urunler.get(arananId).setRaf(guncelRaf);
                        break;
                    case 8:
                        guncelRaf = "Konserve";
                        urunler.get(arananId).setRaf(guncelRaf);
                        break;

                    default:
                        System.out.println("Böyle bir raf yoktur");
                }
                System.out.println(P + "Raflanan ürünün Adı :  " + urunler.get(arananId).getUrunIsmi() + " raf :" + urunler.get(arananId).getRaf());
            } catch (Exception e) {
                System.out.println("Lütfen Geçerli bir rafı sayı olarak giriniz ");
                scan.nextLine();
                rafaKoy();


            }


        } else {
            System.out.println("aradiniz urun yok");
        }

    }

    private static void urunCikis() {
        System.out.println("Urun cikisi icin Id bilgisi giriniz");
        int arananId = scan.nextInt();

        if (urunler.keySet().contains(arananId)) {
            System.out.println(P + urunler.get(arananId).getUrunIsmi() + "  miktarı : " + urunler.get(arananId).getMiktar() + " Birim :" + urunler.get(arananId).getBirim());// ***
            System.out.println("Çıkmak istediğiniz  miktari giriniz");//***
            int cikisMik = scan.nextInt();
            if (urunler.get(arananId).getMiktar() > 0 && (urunler.get(arananId).getMiktar() > cikisMik)) {//*** miktar olarak hiç yoksa çıkış yapılamaz uyarısı


                urunler.get(arananId).setMiktar(urunler.get(arananId).getMiktar() - cikisMik);
                System.out.println(P + "Mevcut " + urunler.get(arananId).getUrunIsmi() + "miktarı  = " + urunler.get(arananId).getMiktar() + " " + urunler.get(arananId).getBirim());//***
                //***
            } else System.out.println(P + "Ağam olmayan yada olandan fazla ürün çıkartmaya zorluyorsun");//***
        } else {
            System.out.println("aradiniz urun yok");
        }

    }
}
