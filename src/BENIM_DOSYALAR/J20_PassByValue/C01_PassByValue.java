package BENIM_DOSYALAR.J20_PassByValue;

public class C01_PassByValue {



    public static void main(String[] args) {
        /*
        Java Pass by value programlama dilidir
        Bir primitive variable argument olarak bir metoda call edildiginde

         */
        // Task--> Verilen fiyat icin %24 artirilmis fiyati print eden method create ediniz

        double fiyat =100;
        System.out.println("metod oncesi fiyat degeri = " + fiyat);//100

        fiyatArtir(fiyat); //metod call edildi // 124
        System.out.println("metod sonrasi fiyat degeri = " + fiyat);//100


    }// main sonu

    private static void fiyatArtir(double bisey) {
        bisey *=1.24;
        System.out.println("artirilmis bisey fiyati = " + bisey);//124
    }
}
