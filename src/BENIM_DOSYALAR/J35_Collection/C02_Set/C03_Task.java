package BENIM_DOSYALAR.J35_Collection.C02_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class C03_Task {
    // hashSet ve treeSet tanımlayıp run surelerini karsılastırınız..
    // Trick run suresi için System.currrentTimeMillis() meth. call ediniz...


    public static void main(String[] args) {
        long hsBasla = System.currentTimeMillis();
        HashSet<String> hs = new HashSet<>();
        hs.add("Adem");
        hs.add("Ismail");
        hs.add("Sumeyra");
        hs.add("Umit");
        hs.add("Murat");
        hs.add("Busra");
        hs.add("Aliye");
        long hsBitir = System.currentTimeMillis();
        System.out.println("hsBitir-hsBasla = " + (hsBitir - hsBasla));

        long tsBasla = System.currentTimeMillis();
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Adem");
        ts.add("Ismail");
        ts.add("Sumeyra");
        ts.add("Umit");
        ts.add("Murat");
        ts.add("Busra");
        ts.add("Aliye");
        long tsBitir = System.currentTimeMillis();
        System.out.println("tsBitir-tsBasla = " + (tsBitir - tsBasla));
        // iyi bir javaCAN için gelişMAC lazım :)






    }



}
