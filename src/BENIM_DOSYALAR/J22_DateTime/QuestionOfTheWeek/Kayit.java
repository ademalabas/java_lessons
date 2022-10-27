package BENIM_DOSYALAR.J22_DateTime.QuestionOfTheWeek;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayit {

    ArrayList<Kullanici> kullaniciKisiler = new ArrayList<>();

    // 2. task
    public ArrayList<Kullanici> kayitAl() {// KULLANICI CLASSDAN ONJ URETMEK ICIN CON A GEREKEN
        // NAME VE VE KAYIT ZAMANI bilgilerini olusturup olusan obj i list'e ekler

        Scanner scan = new Scanner(System.in);
        System.out.print("Agam Adinizi Giriniz");
        String ad = scan.nextLine();
        Kullanici k1 = new Kullanici(ad, LocalDateTime.now());
        //k1 objesi name kullanicidan kayit zamaninida local timedam aldi
        kullaniciKisiler.add(k1);// olustrulan k1 objesi liste eklendi
        return kullaniciKisiler;
    }

    // task 3. step
    public void sansliKullanici(ArrayList<Kullanici> kllObj) {

        for (Kullanici k : kllObj) {
            if (k.kayitZamani.getSecond() <= 10) {
                System.out.println(k.name + "  Agam sansli kisisin 5 kilo bal kazandin. Sisteme giris zamanin  ; " + k.kayitZamani);
            } else
                System.out.println(k.name + "  Agam sansli degilden KABAK kazandin. Sisteme giris zamanin  ; " + k.kayitZamani);
        }

    }

    public void listeler(ArrayList<Kullanici> kllObje) {//non-static method}
        System.out.println(kllObje);
    }
}