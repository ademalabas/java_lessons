package BENIM_DOSYALAR.J23_Varargs_StringBuilder.Varargs;

public class Task02 {
    public static void main(String[] args) {
 /*
        Task ->
        Girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan METHOD create ediniz.

         */
        int arr[] = {3, 6, 85, 2, 1, 0};

        System.out.println("ilk method ile toplam : " + topla(arr));
        System.out.println("ikinci method ile toplam : " + topla1(6, 5, 8, 4, 2));

    }//main sonu

    //1.yol
    public static int topla(int... num) {
        int toplam = 0;

        for (int i = 1; i < num.length; i++) {
            toplam += num[i];
        }
        toplam = toplam * num[0];
        return toplam;
    }

    //2.yol
    public static int topla1(int a, int... b) {
        int toplam = 0;
        for (int w : b) {
            toplam += w;
        }
        toplam = toplam * a;
        return toplam;

    }

}


