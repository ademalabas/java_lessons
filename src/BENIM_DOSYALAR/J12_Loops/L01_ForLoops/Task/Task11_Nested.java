package BENIM_DOSYALAR.J12_Loops.L01_ForLoops.Task;

public class Task11_Nested {
    public static void main(String[] args) {
/*
    A          //(Char) apt +Daire
    A B
    A B C
    A B C D
    A B C D E
    A B C D E F
    şeklini yazdırınız.  65=A'nın ascıı değeri
    */

        int harf = 65;// ascii degeri
        for (int i = 0; i < 6; i++) {// apt dongu
            for (int j = 0; j <= i; j++) {// daire dongu
                System.out.print((char) (harf + j) + " ");

            }
            System.out.println();// dummy

        }
    }//main


}
