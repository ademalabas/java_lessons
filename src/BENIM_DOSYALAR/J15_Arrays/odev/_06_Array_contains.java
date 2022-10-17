package BENIM_DOSYALAR.J15_Arrays.odev;

import java.util.Arrays;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */
        String fruits[] = {"Apple", "Orange", "Banana", "Pineapple"};
        if(
        Arrays.toString(fruits).contains("Apple")){
            System.out.println(true);
        }else {
            System.out.println(false);
        }




boolean flag= false;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].contains("Apple")) {
                flag= true; break;
            }
        }
        System.out.println(flag);
    }}

