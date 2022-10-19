package BENIM_DOSYALAR.J16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;

public class _02_arraylist2_getSum {

      /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

    public static void main(String[] args) {
ArrayList <Integer> sum = new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println("getSum(sum) = " + getSum(sum));
    }

    private static int getSum(ArrayList <Integer> sum) {
      int total=0;
      for (int value : sum) {
          total += value;
      }
       return total;
    }
}
