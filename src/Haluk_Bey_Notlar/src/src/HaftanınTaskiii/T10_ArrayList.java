package Haluk_Bey_Notlar.src.src.HaftanınTaskiii;

import java.util.ArrayList;
import java.util.Arrays;

public class T10_ArrayList {
    public static void main(String[] args) {
        /* Listedeki 8 ve 12 dışındaki her öğenin değerini 2'şer artırınız.
     Örnek: (15, 31, 8, 13, 12) ==> Çıktı (17, 33, 8, 15, 12)
     */


        ArrayList<Integer> sayilar = new ArrayList<>(Arrays.asList(15, 31, 8, 13, 12));
        ArrayList<Integer> yeni = new ArrayList<>();

        for (int i = 0; i < sayilar.size(); i++) {

            if (sayilar.get(i) != 8 && sayilar.get(i) != 12) {

                sayilar.set(i,(sayilar.get(i)+2));

            }else sayilar.set(i,sayilar.get(i));


        }
        System.out.println(sayilar);
    }
}
