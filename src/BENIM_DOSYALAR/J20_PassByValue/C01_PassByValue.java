package BENIM_DOSYALAR.J20_PassByValue;

public class C01_PassByValue {



    public static void main(String[] args) {
        /*
         Java Pass By Value bir programlama dilidir.
        Bir  primitive  variable  argument olarak bşr methoda call edildiğinde variable
        değil bir copy clone (vesikalık) (pointer)değeri gönderilir.
         */
        // Task--> Verilen fiyat icin %24 artirilmis fiyati print eden method create ediniz

        double fiyat =100;//primitive double type variable

        System.out.println("metod oncesi fiyat degeri = " + fiyat);//100

        fiyatArtir(fiyat); //fiyat variable method'Test01 parametre call edildi
        System.out.println("metod sonrasi fiyat degeri = " + fiyat);//100


    }// main sonu

    private static void fiyatArtir(double bisey) {
        bisey *=1.24;
        System.out.println("artirilmis bisey fiyati = " + bisey);//124
    }
}
