package BENIM_DOSYALAR.J36_Map;

import java.util.HashMap;
import java.util.Scanner;

public class Task08 {
 /*
    ismi update() olan bir method oluşturun.
    Parametreleri , Integer -String HashMap,  int ve String olmalı. (3ayrı parametre)
    return tipi  Integer - String HashMap
    Eğer HashMap, int olan parametreyi içeriyorsa,
    int değerinde var olan String'i güncelleyin.
    Örnek :
     Hash map:
    1, "New jersey"
    2, "New York"
    3, "London"
    4, "Paris"

    int = 3
    String = Miami
    cevap aşağıdaki gibi olmalı:
    1, "New jersey"
    2, "New York"
    3, "Miami"
    4, "Paris"
     */

    public static void main(String[] args) {
        HashMap<Integer,String>hm = new HashMap<>();
        hm.put(1,"New Jersey");
        hm.put(2,"New York");
        hm.put(3,"London");
        hm.put(4,"Paris");
        hm.put(5,"Istanbul");


        Scanner sc = new Scanner(System.in);
        System.out.println("Agam sayi giresen");
        int sayi = sc.nextInt();
        System.out.println("Agam sehir giresen");
        String sehir = sc.next();

        System.out.println("update(hm,sayi,sehir) = " + update(hm, sayi, sehir));//
        //{1=New Jersey, 2=New York, 3=angara, 4=Paris, 5=Istanbul}


    }// main sonu

    public static HashMap<Integer , String> update(HashMap<Integer ,String> hm  , int sayi , String str) {
        if(hm.containsKey(sayi)) hm.put(sayi, str);

        return hm;
    }


}
