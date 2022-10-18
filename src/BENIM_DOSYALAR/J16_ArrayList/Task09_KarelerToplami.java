package BENIM_DOSYALAR.J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task09_KarelerToplami {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
     ArrayList<Integer> listSayi = new ArrayList<Integer>(Arrays.asList(6,8,3,4,1,7,9));
     ArrayList<Integer> listKare = new ArrayList<Integer>();
    int karetoplam=0;
     for  (int i = 0; i < listSayi.size(); i++){
         listKare.add(listSayi.get(i)*listSayi.get(i));
         karetoplam+=listSayi.get(i)*listSayi.get(i);
     }
        System.out.println("listKare = " + (listKare));
        System.out.println("karetoplam = " + karetoplam);




    }
}

