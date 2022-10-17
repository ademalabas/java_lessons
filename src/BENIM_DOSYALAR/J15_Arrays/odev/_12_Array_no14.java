package BENIM_DOSYALAR.J15_Arrays.odev;

import java.util.Arrays;
import java.util.Scanner;

public class _12_Array_no14 {

    public static void main(String[] args) {

        /*
        int array oluşturun (intArr)
        Eğer 1 " ve" 4 elemanlarına aynı anda sahip değilse true dönsün.
        Eğer 1 ve 4 elemanlarına aynı anda sahipse false dönsün.

        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true

        bir array oluşturun ve elemanları : 1,2,3,4
        Sonuç false olmalı
        NOT: Array elemanlarını 1,2,3 olarak değiştirirseniz sonuç doğru olmalı
         */
int arr [] = {4,1};

       if (Arrays.toString(arr).contains("4") && Arrays.toString(arr).contains("1")){
            System.out.println(false);
        }else {
           System.out.println(true);
       };

//boolean flag1 = false;
//boolean flag4 = false;
//for (int i = 0; i < arr.length; i++) {
//        flag1 =arr[i]==1?true:false;
//        flag4 = arr[i]==4?true:false;
//    }
//        System.out.println((flag1==false && flag4== false)? false :true);
}}