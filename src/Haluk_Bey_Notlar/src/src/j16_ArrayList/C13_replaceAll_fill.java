package Haluk_Bey_Notlar.src.src.j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C13_replaceAll_fill {
    public static void main(String[] args) {

        //replaceAll();-> listte belirli bir elemanı belirli bir değer ile update eder
        ArrayList<Integer> listSayi = new ArrayList<>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));
        System.out.println("listSayi = " + listSayi);//replaceAll öncesi->[1, 24, 23, 14, 19, 60, 1, 55, 27, 1, 38]

        Collections.replaceAll(listSayi,1,20);//sayilist'inde 1 yerine 20 değeri atandı
        System.out.println("listSayi = " + listSayi);//replaceAll sonrası-> [20, 24, 23, 14, 19, 60, 20, 55, 27, 20, 38]

        //fill();->listte tüm elelmanları belirli bir değere update der.
        Collections.fill(listSayi,33);
        System.out.println("listSayi = " + listSayi);//fill sonrası->[33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33]



    }
}
