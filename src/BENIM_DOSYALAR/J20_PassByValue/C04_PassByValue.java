package BENIM_DOSYALAR.J20_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_PassByValue {
        static double etiketFiyati;
        static double indirimOrani;


    public static void main(String[] args) {
      /*
        eger bir method2Da yapılan değişiklik kalıcı olsun istenirse
        1.değişklik  yapılan variable'lar STATIC olarak tanımlanır.
         */
        etiketFiyati = 100;
        System.out.println("indirim öncesi etiketFiyatı = " + etiketFiyati);//100
        indirimOrani = 0.1;

        indir();//method call
        indirimOrani = 0.1;

        indir();
        indirimOrani = 0.1;

        indir();
        System.out.println("indirim sonrası etiketFiyatı = " + etiketFiyati);// 72.9
    }//main sonu
    public static void indir() {
        etiketFiyati *= (1 - indirimOrani);//etiketfiyatı indirimli hale getirlidi
        System.out.println("etiketFiyatı = " + etiketFiyati);

    }


}
