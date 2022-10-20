package BENIM_DOSYALAR.J16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;

public class _07_arraylist7_CommonValues {

    /*
        common_values() isminde bir method oluşturun.
        Parametre olarak 2 tane Integer ArrayList
        Return tipi integer ArrayList olmalı
         İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
        Örneğin;
        ArrayList 1:    3 , 2 , 5 , 6
        ArrayList 2:     5 , 8 , 9
        return  5 olmalı

        Örneğin;
        ArrayList 1: 8,7,9,6,7
        ArrayList 2: 6,7,12,3,1
        return 6 ve 7 olmalı
     */

    public static void main(String[] args) {

        ArrayList<Integer> num1 = new ArrayList<>(List.of(8,7,9,6,7));
        ArrayList<Integer> num2 = new ArrayList<>(List.of(6,7,12,3,1));
        common_values(num1, num2);

    }private static void common_values(ArrayList<Integer> num1, ArrayList<Integer> num2) {

        ArrayList<Integer>a = new ArrayList<>(List.of());

        for (int i:num1) {
            for (int j:num2) {
                if (i==j&& !a.contains(i)){
                    a.add(i);
                }}
        }System.out.println(a);


    }
}
