package BENIM_DOSYALAR.J16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;

public class _03_arraylist3_getLength {

    /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */

    public static void main(String[] args) {
    ArrayList<String> strLength= new ArrayList<>(List.of("New jersey", "New york", "Ohio", "Florida", "Boston"));
        System.out.println("getLength(strLength) = " + getLength(strLength));
    }

    private static ArrayList<Integer> getLength(ArrayList<String> strLength) {
        ArrayList<Integer> cityLength = new ArrayList<>();
        for(String str : strLength)
            cityLength.add(str.length());
        return cityLength;
    }
}