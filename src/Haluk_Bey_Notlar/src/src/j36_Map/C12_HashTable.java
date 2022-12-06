package Haluk_Bey_Notlar.src.src.j36_Map;

import java.util.Hashtable;

public class C12_HashTable {
    public static void main(String[] args) {
        /*
        HashTable ->
        HashMap'e kullanılan  tüm methodlar hashTable obj ile de call edilir.
        1- HashMap ve TreeMap thread-safe ve synchronized olmadıgı için Map'lar arasında thread-safe ve synchronize
        olam bir map'e ihityaç oldugundan Hashtable tanımlanmıştır.
        2-HashTable HashMap'e göre daha yavaştır
        3-HashTable key ve value'lerda null değere izin vermez.
        4-HashTable eleman atamsı yapılırken  HashMap randum(rastgele: hurra )  yapar.
         */

        Hashtable<String ,String > ht = new Hashtable<>();

        ht.put("kebab","adana");
        ht.put("döner","sivas");
        ht.put("köfte","tekirdağ");
        ht.put("çorba","beyran");
        ht.put("söğüş","");
        System.out.println("ht = " + ht);//{köfte=tekirdağ, söğüş=, çorba=beyran, döner=sivas, kebab=adana}
        ht.put("döner","dönerse senindir :) ");//döner key update edilir key'de dublicate değil üzerine value atamsı yapılır
        System.out.println("ht = " + ht);//{köfte=tekirdağ, söğüş=, çorba=beyran, döner=dönerse senindir :) , kebab=adana}
       // ht.put(null,"trileçe");//RTE->NullPointerException
       // ht.put("kahve",null);//RTE->NullPointerException
        System.out.println("agam selametle dewamkeee...");

        Hashtable<String ,String > ht1 = new Hashtable<>();
        ht1.put("salata","patlıcan közleme");
        ht1.put("ara sıcak","içli küfte");
        System.out.println("ht1 = " + ht1);//{salata=patlıcan közleme, ara sıcak=içli küfte}

        ht.putAll(ht1);
        System.out.println("ht = " + ht);//{köfte=tekirdağ, salata=patlıcan közleme, söğüş=, çorba=beyran, döner=dönerse senindir :) , ara sıcak=içli küfte, kebab=adana}
        System.out.println("ht1 = " + ht1);
    }
}
