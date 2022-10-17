package BENIM_DOSYALAR.J15_Arrays.odev;

import java.util.Arrays;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

    String  str = "$12 $23 $10 $2 $5 $2" ;
    String strArr[] = str.split(" ");
        System.out.println(Arrays.toString(strArr));
        int toplam =0;
        for(int i=0; i<strArr.length; i++){
            toplam +=Integer.parseInt(strArr[i].replace("$",""));
        }
        System.out.println("toplam = " + toplam);

    }
}