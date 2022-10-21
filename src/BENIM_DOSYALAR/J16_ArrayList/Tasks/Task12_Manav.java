package BENIM_DOSYALAR.J16_ArrayList.Tasks;

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

        ArrayList<String>manav = new ArrayList<>(Arrays.asList("Elma (0)","Armut(1)","Çilek(2)","Erik(3)","Patlıcan(4)"));
        ArrayList<Integer>fiyat= new ArrayList<>(Arrays.asList(15,20,30,60,15));

        int toplam=0;
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("\"Elma (0)\",\"Armut(1)\",\"Çilek(2)\",\"Erik(3)\",\"Patlıcan(4)\"lütfen ürün seçiniz");
            int ürün=sc.nextInt();
            System.out.println("kaç kg istersiniz");
            double kg=sc.nextDouble();
            toplam+=fiyat.get(ürün)*kg;
            System.out.println("Alışverişe devam etmek istiyorsanız (1) çıkış yapmak istiyorsanız(0) giriniz");
            int karar = sc.nextInt();
            if (karar==0)
                break;
        }System.out.println("toplam ödemeniz gereken tutar"+toplam);


    }




}

