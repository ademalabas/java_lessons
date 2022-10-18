package BENIM_DOSYALAR.J17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {

        // Task --> Iki string array elemanlarinin ortak olmasini kontrol eden code create ediniz __. for each ile

        String arr1[] = {"nazım", "gülsüm", "dilek", "erol", "cüneyt", "ciğdem"};
        String arr2[] = {"musty", "gülsüm", "ayşe", "enise", "cüneyt", "ciğdem"};
        for (String s1 : arr1) {
            for (String s2 : arr2) {
                if (s1.equalsIgnoreCase(s2)) {
                    System.out.print(s1+ "  ");
                }
            }
        }
        // 2. yol
        List<String > ortakIsim=new ArrayList<>();//ortak ısımlerin atanacagı boş list
        for (String str1:arr1){
            for (String str2:arr2){
                if (str2.equalsIgnoreCase(str1)){//her bir çekirdek eşitliği kontrol
                    ortakIsim.add(str2);
                }
            }
        }
        if (ortakIsim.isEmpty()){//ortak isim list boşluk kontrol
            System.out.println("ararylerinizde ortak isim yok "+ortakIsim);
        }else System.out.println(ortakIsim);






    }
}
