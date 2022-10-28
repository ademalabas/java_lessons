package Haluk_Bey_Notlar.src.src.j22_DateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        //LocalTime-> saat dakika saniye milsaniye tutar
        LocalTime suAn = LocalTime.now();//system'den anlık zaman bilgisi atanır

        System.out.println("suAn = " + suAn);
        System.out.println("suAn.getHour() = " + suAn.getHour());
        System.out.println("suAn.getMinute() = " + suAn.getMinute());
        System.out.println("suAn.getNano() = " + suAn.getNano());
        System.out.println("suAn.getSecond() = " + suAn.getSecond());

        //belirli zamanda ileri geri zamana gidilebilir
        LocalTime time1 = LocalTime.of(13, 43, 34);//belirli bir saat dakika saniyesi olan zaman atandı

        System.out.println("time1.plusMinutes(90) = " + time1.plusMinutes(90));
        System.out.println("time1.plusMinutes(150) = " + time1.plusMinutes(150));
        System.out.println("time1.minusHours(23) = " + time1.minusHours(23));

        System.out.println("time1.minusMinutes(100).plusHours(2) = " + time1.minusMinutes(100).plusHours(2));

        LocalTime forBası = LocalTime.now();
        System.out.println("forBası = " + forBası.getNano());
        int sayı=0;
        for (int i = 0; i < 100000; i++) {
            sayı +=i;
        }
        LocalTime forSonu= LocalTime.now();

        System.out.println("forSonu = " + forSonu.getNano());
        System.out.println(forSonu.getNano() - forBası.getNano());
    }
}
