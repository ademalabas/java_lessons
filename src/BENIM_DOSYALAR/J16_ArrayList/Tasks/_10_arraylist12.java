package BENIM_DOSYALAR.J16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _10_arraylist12 {

    /*
    rangeBtw() isminde bir method oluşturun.
    Parametre olarak   bir Arraylist  ve iki ayrı int
    return tipi int

     Arraylist'in iki int arasında kaç değeri olduğunu sayın.
    return  count       (sayacı (count) döndürün.)

    Example (Örnek):
    ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
    min = 20
    max = 30
    return =  5    (20,22,25,28,30)
    min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
     */

    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(Arrays.asList(1, 5, 22, 10, 20, 14, 8, 25, 30, 28));


        System.out.println(rangeBtw((ArrayList<Integer>) number, 20, 30));
    }

    private static int rangeBtw(ArrayList<Integer> a, int min, int max) {

        int count = 0;

        for (int i = a.indexOf(Math.min(min, max)); i <= a.indexOf(Math.max(min, max)); i++) {
            count++;

        }
        return count;
    }

    }
