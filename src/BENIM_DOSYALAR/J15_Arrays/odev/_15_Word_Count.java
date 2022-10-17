package BENIM_DOSYALAR.J15_Arrays.odev;

import java.util.Arrays;

public class _15_Word_Count {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */
String str ="Removes white space from both ends of a string";

      String strArr []=  str.split(" ");
        System.out.println(Arrays.toString(strArr));
        System.out.println("strArr.length = " + strArr.length);


    }
}