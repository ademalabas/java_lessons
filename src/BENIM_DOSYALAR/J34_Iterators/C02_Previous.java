package BENIM_DOSYALAR.J34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_Previous {
    public static void main(String[] args) {
        List <Integer> l1 = new ArrayList<>(Arrays.asList(24,38,65,9,11,7,27,23));
     // l1 elemanlarini tersten print ediniz
        System.out.println("l1 list ilk hali  = " + l1);// (24,38,65,9,11,7,27,23)
/*
tekrarda son elemandan baslamak icin pointer son elemana goturmeli
Bunun icin pointerri  sona goturen hasnext() calismali
 */
        ListIterator <Integer> it1 = l1.listIterator();
        while (it1.hasNext()){// bastan sona pointer surekli ilerler
            it1.next();
        }
        while (it1.hasPrevious()){// sondan basa pointer surekli basa dogru ilerler
            System.out.print( it1.previous()+"  ");//23  27  7  11  9  65  38  24
        }
        //System.out.println("l1 list tersten  hali hali  = " + l1);[24, 38, 65, 9, 11, 7, 27, 23]










    }




}
