package BENIM_DOSYALAR.J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15_ArrayConvertList {
    public static void main(String[] args) {
// King of TRICK -> Array'dan çevirilen List aray kaynaklı oduğu için array davraınışı
        // gösterir boyut sabittir dolayısıyle remove add method çalışmaz.
        String arrJavaCan[]={"Akif","Gamze","Musty","SevdeNur"};
        List<String > listJavaTar= Arrays.asList(arrJavaCan);//arrJavaCan değerleri list elelman olarak atandı
        System.out.println("listJavaTar = " + listJavaTar);//[Akif, Gamze, Musty, SevdeNur]
        System.out.println("listJavaTar.size() = " + listJavaTar.size());// 4

        //  listJavaTar.add("sefilCan Haluk");//arraya'a elelman eklenmeeezzzz  :(
        //RTE-> UnsupportedOperationException
        // ahan da kral Trickyyy -> list data type ArrayList tanımlanırsa Rte vermez
        // kaynagı array de olsa list davranır boyut esnekliği yapar.


        ArrayList<String > listJavaTar1= new ArrayList<>(Arrays.asList(arrJavaCan));
        listJavaTar1.add("sefil haluk");
        System.out.println("listJavaTar1 = " + listJavaTar1);//[Akif, Gamze, Musty, SevdeNur, sefil haluk]
    }

}
