package BENIM_DOSYALAR.J20_PassByValue;

public class C05_PassByValue {



    public static void main(String[] args) {
      /*
        eger bir method2Da yapılan değişiklik kalıcı olsun istenirse
        2.değişklik  yapılan variable'lar ATAMA  tanımlanır.
         */
        double etiketFiyati=100;// PRIMITIVE
         double indirimOrani=0.15;// primitive
        System.out.println("indirim oncesi etiketFiyati = " + etiketFiyati);//100

        etiketFiyati=indirim(etiketFiyati,indirimOrani);//85
        System.out.println("indirim sonrasi etiketFiyati = " + etiketFiyati);//85


    }
public static double indirim (double fiyat, double oran ) {
        fiyat *=(1-oran);
    System.out.println("indirimli fiyat = " + fiyat);
        return fiyat;
}

}
