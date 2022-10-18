package BENIM_DOSYALAR.J17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {

 /*
        for-each loop for loop'un gelilmş halıdir.
        1. clean code- yazım kolaylığı
        2. code okuma kolaylıgı
        3. hata yapma riskini azaltır.

         */
        System.out.println("*** Task 1 ****");
List<Integer> sayiList = new ArrayList<>(List.of(16,5,2,33,22,27,41,24));
// task list elemanlarini ayri satirlara print ediniz
        System.out.println("*** for ****");
for (int i = 0; i < sayiList.size(); i++) {
        System.out.println(sayiList.get(i) +" ");
    } System.out.println("*** for each ****");
    for (Integer a : sayiList) {
        System.out.println((a + " "));
    }

    // Task lst elemanlarini ilk 3 eleman haric tek olaanlarini print ediniz
        System.out.println("*** Task 2 ****");
        for (Integer a : sayiList.subList(3, sayiList.size())) {
            if (a%2 == 1) {
                System.out.println((a + " "));
            }

        }

       //Task lst elemanlarini2 ile 5 indeks arasindaki(1, 3,4,5) elemanlarin toplamlarini print ediniz
        System.out.println("*** Task 3 ****");
        int toplam=0;
        for (int value : sayiList.subList(2, 6)) {
            toplam += value;
        }
        System.out.println("toplam = " + toplam);
    }
}
