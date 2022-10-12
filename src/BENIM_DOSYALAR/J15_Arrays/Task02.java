package BENIM_DOSYALAR.J15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

        //task-> girilen int array elemanları toplamını print eden code create ediniz.
        Scanner sc = new Scanner(System.in);

        System.out.print("agam kaç elemanlı array istirsen : ");
        //int arrBoyut = sc.nextInt();

        int arr[] = new int[sc.nextInt()];//boyutu belirlenmiş boş int array

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + ". index  elemanı giriniz : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("agam istedgin array : " + Arrays.toString(arr));
        int arrToplam = 0;//local var.

        for (int i = 0; i < arr.length; i++) {
            arrToplam += arr[i];
        }
        System.out.println("array eleman toplamları : "+arrToplam);





        // girilen integer array elemanlari toplamini print eden code create ediniz

      /*  Scanner scan = new Scanner(System.in);
        System.out.println(" kac elemanli array istiyorsun");
        int arrBoyut = scan.nextInt();
        int arr[] = new int[arrBoyut];
        int toplam =0;
        for (int i = 0   ; i < arrBoyut ; i++) {
            System.out.println(i+ ". index elemani giriniz");
            arr[i] = scan.nextInt();
            toplam +=  arr[i];
        }
        System.out.println("Agam istedigin array: " + Arrays.toString(arr));
        System.out.println("Array deki sayilar toplami = "+(toplam));


       */
    }
}
