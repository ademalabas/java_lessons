package BENIM_DOSYALAR.J22_DateTime.QuestionOfTheWeek;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayit {

    ArrayList<Kullanici> kullaniciKisiler = new ArrayList<>();

    public ArrayList<Kullanici> kayitAl(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Agam Adinizi Giriniz");
        String ad = scan.nextLine();
        Kullanici k1 = new Kullanici(ad, LocalDateTime.now());
        kullaniciKisiler.add(k1);
        return kullaniciKisiler;
    }

}
