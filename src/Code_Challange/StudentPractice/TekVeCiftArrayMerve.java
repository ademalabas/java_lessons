package Code_Challange.StudentPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TekVeCiftArrayMerve {

    public static void main(String[] args) {

  /*
    Write Test01 Java program to separate odd and even numbers of Test01 given array of integers.
    Put all odd numbers first, and then even numbers.
     example: int sayi[] = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};
     */
        int sayi[] = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};

        System.out.println("Sayimiz = " + Arrays.toString(sayi));
        List<Integer>tekVeCift = new ArrayList<>();

        for (int i = 0 ; i< sayi.length ; i++){
            if (sayi[i]%2 == 1){
                tekVeCift.add(sayi[i]);
            }
        }
        System.out.println("Sadece Tek Sayilar = " +tekVeCift);
            for (int a :sayi){
            if (a%2 == 0){
                tekVeCift.add(a);
            }
            }System.out.println(" Tek ve Cift Sayilar = " +tekVeCift);

    }
}
/*
int sayi[] = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};

        System.out.println("sayımız: " + Arrays.toString(sayi));
        System.out.println();//dummy
        ArrayList<Integer> yeniList = new ArrayList<>();
        System.out.println("tek ve çift sayılar ayrıldıktan sonra: \n"+tekCiftAyirma(sayi, yeniList));
    }
    private static ArrayList<Integer> tekCiftAyirma(int[] sayi, ArrayList<Integer> yeniList) {
        for (int Test01 : sayi) {
            if (Test01 % 2 == 1) {
                yeniList.add(Test01);
            }
        }
        System.out.println("tek sayılar: "+yeniList);
        for (int b:sayi){
            if (b%2==0){
                yeniList.add(b);
            }
        }
            return yeniList;

 */