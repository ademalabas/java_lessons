package BENIM_DOSYALAR.J15_Arrays.odev;

import java.util.Arrays;

public class _19_2d_Array_3 {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.
         */

String strArr[][]={{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}};

        System.out.println(Arrays.deepToString(strArr).replace("ohio", "Florida"));

        for (int i=0; i<strArr.length; i++){
            for (int j=0; j<strArr[i].length; j++){

                if(strArr[i][j]=="ohio"){
                    strArr[i][j]="Florida";
                }
            }
        }
    }
}

