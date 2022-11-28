package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_match {


    public static void main(String[] args) {
        List<String> menu = new ArrayList<String>(Arrays.asList("küşleme", "distin", "küşleme", "soğanlı", "soğanlı", "soğanlı", "trileçe", "bicibici", "büryan", "welemen", "cacix", "kokerç", "yağlama", "güveç", "arabAşı", "tantuni"));
        hrfSys7denAzKontrol(menu);
        System.out.println("\n   ***   ");
        WileBalamaKontrol(menu);
        System.out.println("\n   ***   ");
        XilebitenKontrol(menu);
        System.out.println("\n   ***   ");


    }// mainsonu
//anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
//allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
//noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.

    // Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.

    public static void hrfSys7denAzKontrol(List<String> menu) {
        boolean kontrol = menu.stream().allMatch(t -> t.length() <= 7);
        if (kontrol) {
            System.out.println("Agam menudekiler 7 ve daha az karakterden olusuyor");
        } else {
            System.out.println("Agam menudekiler 7  karakterden fazla");
        }
        System.out.println(menu.stream().allMatch(t -> t.length() <= 7) ? "Menudekileri 7 ve daha az karakterden oluşuyor" : " Menudekilerin en az biri 7 karakterden fazla");

    }
// Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.

    public static void WileBalamaKontrol(List<String> menu) {
        System.out.println("menu.stream().allMatch(t->t.charAt(0)=='W') = " + menu.stream().allMatch(t -> t.charAt(0) == 'W'));
        System.out.println(menu.stream().noneMatch(t -> t.toLowerCase().startsWith("W")) ? "Agam  w ile balayan yemek olur mu" : "Agam wlwlwmwn ");

    }
// Task : List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz.

    public static void XilebitenKontrol(List<String> menu) {

        System.out.println(menu.stream().anyMatch(t -> t.toLowerCase().endsWith("x")) ? "Agam  x ile biten yemek olur mu" : "Agam yemek x ile bitmez ");


    }
}