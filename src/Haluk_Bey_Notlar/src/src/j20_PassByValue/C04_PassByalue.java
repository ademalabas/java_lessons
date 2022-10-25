package Haluk_Bey_Notlar.src.src.j20_PassByValue;

public class C04_PassByalue {

    static double etiketFiyatı;//güneş
    static double indirimOranı;//güneş

    public static void main(String[] args) {//mnain bası
        /*
        eger bir method2Da yapılan değişiklik kalıcı olsun istenirse
        1.değişklik  yapılan variable'lar static olarak tanımlanır.
         */
        etiketFiyatı = 100;

        System.out.println("indirim öncesi etiketFiyatı = " + etiketFiyatı);//100
        indirimOranı = 0.1;

        indir();//method call
        indirimOranı = 0.1;

        indir();
        indirimOranı = 0.1;

        indir();
        System.out.println("indirim sonrası etiketFiyatı = " + etiketFiyatı);// 72.9
    }//main sonu
    public static void indir() {
        etiketFiyatı *= (1 - indirimOranı);//etiketfiyatı indirimli hale getirlidi
        System.out.println("etiketFiyatı = " + etiketFiyatı);
    }
}
