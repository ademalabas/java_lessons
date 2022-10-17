package BENIM_DOSYALAR.J15_Arrays.odev;

public class _07_array_max_value {

    public static void main(String[] args) {
        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

      int arr[] = {12,2,5,15,8,} ;

      int max=0;
      for (int i=0; i<arr.length; i++) {
          if (arr[i]>max) max=arr[i];
      }
        System.out.println("Max number  = "+max);


    }
}

