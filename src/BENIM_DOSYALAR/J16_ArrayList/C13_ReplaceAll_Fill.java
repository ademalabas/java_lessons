package BENIM_DOSYALAR.J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C13_ReplaceAll_Fill {
    public static void main(String[] args) {


        // replace all  listete belirli bir elemani  bir degerle update edere
        ArrayList <Integer> listSayi = new ArrayList<>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));//
        System.out.println("listSayi = " + listSayi);// replace oncesi[1, 24, 23, 14, 19, 60, 1, 55, 27, 1, 38]

        Collections.replaceAll(listSayi,1,20);
        System.out.println("listSayi = " + listSayi);// replace sonrasi[20, 24, 23, 14, 19, 60, 20, 55, 27, 20, 38]

        // Fill lisstte tumm elemanlari belirli bir elemen yapar
        Collections.fill(listSayi,33);
        System.out.println("listSayi = " + listSayi);// fill sonrasi   [33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33]


    }

}
