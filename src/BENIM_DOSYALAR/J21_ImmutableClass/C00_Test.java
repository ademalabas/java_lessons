package BENIM_DOSYALAR.J21_ImmutableClass;

import java.util.*;

public class C00_Test {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        System.out.println("Verilecek Olan Eğitimde Kaç Adet Ders Almak İstiyorsunuz  ?");

        int n = klavye.nextInt();


        ArrayList<String> dersler = new ArrayList<>();


        System.out.println("Almak İstediğiniz Dersleri Yazınız...");


        for (int i = 0; i < n; i++) {

            dersler.add(klavye.next());

        }

        System.out.println("Aldığınız Dersler :");

        for (int k = 0; k < n; k++) {

            System.out.println(dersler.get(k));

        }

        System.out.println();


        System.out.println("Eklediğiniz Derslerden Hangisinin Sırasını Öğrenmek İstiyorsunuz?");


        String ara = klavye.next();

        System.out.println();


        if (dersler.contains(ara) == true) {


            System.out.println("Eklediğiniz Ders :" + ara);


            System.out.println("Eklediğiniz Dersin Eğitimini " + (dersler.indexOf(ara)+1) + ". Sırada Alacaksınız");


        } else {

            System.out.println("Aradığınız Ders, Seçimlerinizde Gözükmemektedir.");

        }
    }
}