package Haluk_Bey_Notlar.src.src.j20_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        java non-primitive(Class array list-> refrans ) data turlerinde obj kemdisi değil de dataları geğişirse
        obj referans ve kendisi değişmediği dataları değişikliğini kalıcı yapar.
         */
        // Task -> lis elemanları 24,20,87 iki farklı method ile list elemanlarını
        //      update dip print code create ediniz.
        //1. method-> with for each 2. method-> set(index,value)

        List<Integer> list = new ArrayList<>(Arrays.asList(24, 20, 87));
        System.out.println("method öncesi list = " + list);//[24, 20, 87]

        listUpdate1(list);//
        listUpdate2(list);//


        System.out.println("method sonrası list = " + list);//[48, 40, 174]-> Pass By referans


    }//main sonu


    public static void listUpdate1(List<Integer> list) {

        for (Integer v : list) {
            v *= 2;
        }
        System.out.println(list);
    }

    public static void listUpdate2(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * 2);

        }
        System.out.println("list = " + list);
    }

}
