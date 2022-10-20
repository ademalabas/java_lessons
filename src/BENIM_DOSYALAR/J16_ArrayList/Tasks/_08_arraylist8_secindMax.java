package BENIM_DOSYALAR.J16_ArrayList.Tasks;

import java.util.*;

public class _08_arraylist8_secindMax {

    /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */

    public static void main(String[] args) {
ArrayList<Integer> num = new ArrayList<Integer>(List.of(5,3,4,6,7,8));
        System.out.println("secondMax(num) = " + secondMax(num));

    }

    private static Integer secondMax(ArrayList<Integer> num) {
        Collections.sort(num);
        int secondmax =(num.get(num.size() - 2));
        return secondmax;
    }
}

