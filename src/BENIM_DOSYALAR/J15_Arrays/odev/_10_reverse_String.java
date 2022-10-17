package BENIM_DOSYALAR.J15_Arrays.odev;

public class _10_reverse_String {

    public static void main(String[] args) {
        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */
        // first solution
        String str = "Hello World";
        String reverse[] = str.split("");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(reverse[i] + " ");
        }
        System.out.println();// dummy
        //second solution
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i) +" ");
        }

    }
}