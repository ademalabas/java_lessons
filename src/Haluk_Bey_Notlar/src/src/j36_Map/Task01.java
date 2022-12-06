package Haluk_Bey_Notlar.src.src.j36_Map;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

public class Task01 {
    public static void main(String[] args) {


        HashMap<String, Integer> map = new HashMap<>();

        map.put("Amazon", 296);
        map.put("Ebay", 301);
        map.put("Saturn", 326);
        map.put("MediaMarkt", 340);
        map.put("Apple Store", 320);
        // task -> urun fiyatları toplamını hesaplayan code create ediniz..
        int fiyatToplam = 0;

        // for (Map.Entry<String, Integer> a : map.entrySet()){//["Amazon"=296,"Ebay"=301,..]
        //     fiyatToplam+=a.getValue();
        // }
        for (Integer w : map.values()) {//[296,301,..]
            fiyatToplam += w;
        }

        System.out.println("agama fiyat toplamın : " + fiyatToplam);// 1583
    }
}
