package BENIM_DOSYALAR.J16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _06_arraylist6 {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

    public static void main(String[] args) {
ArrayList<Integer> number = new ArrayList<>(List.of(5,4,6,2,1,1));
        hillNum(number);
    }

    private static void hillNum(ArrayList<Integer> number) {
        for (int i = 1; i < number.size(); i++) {
            if (number.get(i) < number.get(i - 1) && number.get(i) > number.get(i + 1)) {
                System.out.println(number.get(i)+" ");
            }
        }

    }
}
