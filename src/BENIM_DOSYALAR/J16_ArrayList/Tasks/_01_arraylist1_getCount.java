package BENIM_DOSYALAR.J16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _01_arraylist1_getCount {

    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

    public static void main(String[] args) {
        List<String> meyveList = new ArrayList<>(Arrays.asList("Orange","Kuvi","Peach","Banana","Orange"));
        String meyve = "Orange";
        System.out.println("getCount(meyveList,meyve) = " + getCount(meyveList, meyve));

    }
    public static int getCount(List<String>meyveList,String meyve) {
int count=0;
for(String value : meyveList) {
    if (meyve.equalsIgnoreCase(value))
count++;
}  return count;
    }




}
