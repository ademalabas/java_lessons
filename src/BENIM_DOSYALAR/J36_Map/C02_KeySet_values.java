package BENIM_DOSYALAR.J36_Map;

import java.util.HashMap;

public class C02_KeySet_values {
    public static void main(String[] args) {
/*  Map bir interface'dir. Map interface'inin 3 tane child class'i vardir

        1) HashMap: HashMap key-value yapisini kullanir. Key ve value   programci tarafindan yazilir. Key değeri benzersiz(unique) olmalı
        dublicate kabul etnez
        Key ve value'da null degeri kullanilabilir. Key'de  1'den fazla null degeri kullanilirsa Java son kullanilan
        null'i kabul eder. Value'da 1'den fazla null degeri kullanilabilir.
        HashMap console'a yazdirildiginda hem key degerleri hem de value degerleri aralarina = sembolu konularak yazdirilir
        HashMap'ler tanımlanırken rastgele siralama yapar  HasMap map'ler arasinda en hizlisidir.
        HashMap'ler "thread safe" degildir.
                */
        HashMap<String, String> hm = new HashMap<>();
        //map.keySet();->map key değerlerini Set'e atayıp return eder.
        //map.values();->map value değerlerini coll. atayıp return eder.
        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");

        System.out.println("hm = " + hm);

        System.out.println("hm.keySet() = " + hm.keySet());//[Saturn, Ebay, Apple store, MediaMarkt, Amazon, Vatan]
        System.out.println("hm.values() = " + hm.values());//[300 Euro, 234 Euro, 333 Euro, 183 Euro, 296 Euro, 111 Euro]
        System.out.println("   ***   ");
        //Task-> hm key ve value değerlerini satır satır print ediniz.with loop(for-each)


        for (String s : hm.keySet()) {//key
            System.out.print(s + " ");
        }
        System.out.println();
        for (String w : hm.values()) {//value
            System.out.print(w + " ");
        }
    }





}
