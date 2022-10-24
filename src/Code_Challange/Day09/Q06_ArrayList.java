package Code_Challange.Day09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q06_ArrayList {
    public static void main(String[] args) {
        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */
        Scanner scan = new Scanner(System.in);
        List<Integer> liste=new ArrayList<>(List.of(1,2,3,4,5,6,7,8));
        List<Integer> listeBuyuk=new ArrayList<>();
        System.out.println("n sayısını giriniz");
        int n=scan.nextInt();
        for (int i = 0; i < n; i++) {
            int max=Integer.MIN_VALUE;
            for (int j = 0; j < liste.size(); j++) {
                if(liste.get(j)>max)
                    max=liste.get(j);
            }
            listeBuyuk.add(max);
            liste.remove((Integer) max);
        }
        System.out.println(listeBuyuk);


//2.yol Hocanin
        int[] arr = {2, 5, 8, 78, 12, -4, 11, 0};
        int n1 = 3;
        //bir liste olusturalim
        List<Integer> list = new ArrayList<>();
        for (Integer each : arr) {
            list.add(each);
        }
        List<Integer> maxList = new ArrayList<>();
        int count = 0;
        while (count < n1) {//max liste eklenecek eleman sayisi kontrolu
            int max = list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > max) { //listedeki herhangi bir eleman, max dan buyukse
                    max = list.get(i); //o max olsun
                }
            }
            maxList.add(max); //o max degeri maxListe ekle
            list.remove(list.indexOf(max));//ayni buyuk sayi olmamasi icin, bulunan en buyuk sayiyi ilk listten siler
            count++;
        }
        System.out.println("Arrayin ilk " + n + " max degerleri " + maxList);








    }
}
