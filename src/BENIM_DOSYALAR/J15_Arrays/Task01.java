package BENIM_DOSYALAR.J15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task-> kullanıcdan alınan değerlerle bir int array elemanlarını
        // bukukten kucuge   print eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Agam kac elemanli array istiyorsun");
        int arrBoyut = scan.nextInt();
        int arr[] = new int[arrBoyut];
       for (int i = 0   ; i < arrBoyut ; i++) {
           System.out.println(i+ ". index elemani giriniz");
           arr[i] = scan.nextInt();
       }
        System.out.println("Agam istedigin array: " + Arrays.toString(arr));

Arrays.sort(arr);// kb ssiralandi
 for (int i = arr.length-1 /*  enbuyuk sondaki elemandan basla*/; i >=0 ; i--) {
     System.out.println((arr[i] + " "));
 }


    }




}
