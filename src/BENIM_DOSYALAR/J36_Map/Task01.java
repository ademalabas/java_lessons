package BENIM_DOSYALAR.J36_Map;

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

        int top = 0;
        for (Integer w: map.values()) { ////[296,301,..]
            top +=w;

        }
        System.out.println(top);// 1583
int fiyatToplam=0;
        for (Map.Entry<String, Integer>a:map.entrySet()){
            fiyatToplam +=a.getValue();
        }
        System.out.println("fiyatToplam = " + fiyatToplam);// 1583



    }


}
