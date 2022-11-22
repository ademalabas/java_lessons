package BENIM_DOSYALAR.J36_Map;

import java.util.HashMap;
import java.util.Map;

public class C04_entrySet {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();
        //map.entrySet();->Girilen  map in key  value'tum detaylarini sete atayip  return eder.

        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");

        System.out.println("hm = " + hm);
        System.out.println("hm.entrySet() = " + hm.entrySet());//[Saturn=300 Euro, Ebay=234 Euro, Apple store=333 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro]


        for (Map.Entry<String,String>e:hm.entrySet()){// entrySet ile gelen key value loop icin Entry<key, value> data type verir
                      //key   value
            System.out.println("e.getValue() = " + e.getValue());

        }

    }
}
