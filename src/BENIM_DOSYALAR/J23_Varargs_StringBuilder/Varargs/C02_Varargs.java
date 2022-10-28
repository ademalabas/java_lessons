package BENIM_DOSYALAR.J23_Varargs_StringBuilder.Varargs;

public class C02_Varargs {
    public static void main(String[] args) {
        /*
        arr ve varrargs method
         */

        int arr[] = {24,42,33,19,34,45,58,38};
        // Task1 -> verilen array elemanlari toplamını print eden METHOD create ediniz
        // Task 2-> verilen task1 i vararg ile calisiniz
        System.out.println("arrTopla(arr) = " + arrTopla(arr));//arrTopla(arr) = 293
        System.out.println("varargTopla = " + varargTopla(24, 42, 33, 19, 34, 45, 58, 38));//varargTopla = 293
        System.out.println("varargTopla = " + varargTopla(arr));// 293
        // ahanda trick bogun ; vararg method parametre elemanlari array gibi tanimlamdigi icin  varags metoda
        // parametre olarak  array de verilebilinir

    }// main sonu

    public static int arrTopla(int[] a) {
        int toplam = 0;
        for ( int w : a ) {
            toplam += w;
        }
        return toplam;

    }

    public static int varargTopla(int... b) {
        int toplam = 0;
        for ( int s : b ) {
            toplam += s;
        }
        return toplam;

    }



}
