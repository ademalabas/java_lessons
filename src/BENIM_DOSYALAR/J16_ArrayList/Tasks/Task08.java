package BENIM_DOSYALAR.J16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task08 {


    static ArrayList<Integer> SayilarList = new ArrayList<Integer>();
    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Sayi giriniz / Cikmak icin 0 Test01 basiniz ");
            double sayi = scan.nextDouble();
            if (sayi==0 ){break;}
            SayilarList.add((int) sayi);

        }
        System.out.println("SayilarList = " + (SayilarList));
        ortalamadanBuyukSayilar(SayilarList);

    }// main sonu

    private static void ortalamadanBuyukSayilar(ArrayList<Integer> listSayi) {
        ArrayList<Integer> ortaUstu = new ArrayList<Integer>();
        double toplam =0;
        for (int i=0; i<listSayi.size(); i++){
            toplam += listSayi.get(i);
        }double ortalama = toplam/listSayi.size();
        System.out.println("ortalama = " + ortalama);
        for (int i=0; i<listSayi.size(); i++){
            if (listSayi.get(i)>ortalama){
                ortaUstu.add(listSayi.get(i));
            }
        }
        System.out.println("ortaUstu Sayilar = " + ortaUstu);









    }


}
