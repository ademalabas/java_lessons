package BENIM_DOSYALAR.J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task12_Manav {


    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */

        ArrayList<Integer> priceList = new ArrayList<>(Arrays.asList(10, 5, 23, 15, 19));
        Scanner scan = new Scanner(System.in);
        int urun;
        double kilo, sum = 0;
        int daha = 1;

        while (daha == 1) {
            System.out.print("Almak istediğiniz ürünü seçiniz: Portakal:0 , Elma:1 , Muz:2 , Kivi:3 , Ananas:4 ");
            urun = scan.nextInt();
            System.out.print("Kaç kilo aldınız? ");
            kilo = scan.nextDouble();
            sum += priceList.get(urun) * kilo;
            System.out.print("Başka bir ürün almak istiyor musunuz? Evet:1 , Hayır:2 ");
            daha = scan.nextInt();
            if (daha == 2) {
                System.out.println("Ödemeniz gereken tutar= " + sum);


            }


        }
    }
}

