package BENIM_DOSYALAR.J36_Map.j36_Map;

import java.util.ArrayList;
import java.util.HashMap;

public class Task07 {

    /*
    returnKey() isminde bir method oluşturun.
    Parametresi     String-Integer HashMap olsun.
    Return tipi Array List olsun.
    Hashmap:
                       "Lion",     1
                       "Tiger",    2
                       "Elephant", 3
                       "Cat",      4
                       "Dog",      5
    Tüm ANAHTARLARI(Keys) for döngüsü ile döndürün.
     */

    public static void main(String[] args) {
        HashMap<String,Integer>hm1 = new HashMap<>();
        hm1.put("Lion",1);
        hm1.put("Tiger",2);
        hm1.put("Elephant",3);
        hm1.put("Cat",4);
        hm1.put("Dog",5);

        System.out.println("returnKey(hm1) = " + returnKey(hm1));
    }
    private static ArrayList<String> returnKey(HashMap<String, Integer> hm1) {

        ArrayList<String>list = new ArrayList<>();
        for (String a : hm1.keySet())
            list.add(a);

        return list;
    }
}

