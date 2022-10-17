package BENIM_DOSYALAR.J15_Arrays.odev;

public class _03_Create_array3_int {

    public static void main(String[] args) {
    /*  elemanları   : 25,30,30,35,100 olan   İnt Array oluştur ve
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

        int number[] = {25,30,30,35,100};
        int total=0;
        for (int i =0; i<number.length; i++) {
            total+=number[i];
        }
        System.out.println("total = " + total);



    }
}