package Code_Challange.Day04;

public class C03_StringManipulation {
    public static void main(String[] args) {

        // str1 ve str2 icerigi sayi olan String ifadelerdir
// Eger iceriginin tamamen sayi oldugunu bildigimiz
// String varsa parseDouble() veya parseInteger() methodu kullanbiliriz

/* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
         1) \\d    ==> tum rakamlar
             \\D    ==> tum rakam disi character ler
         2) \\w   ==> A->Z        a->z         0->9    _
             \\W  ==> A->Z        a->z         0->9    _ disindaki hersey
         3) \\s   ==> space
             \\S   ==> space disindaki hersey  */

            String str1= "$13.99";
            str1=str1.replaceAll("\\D", "");
            System.out.println(str1); //1399
            String str2= "$10.55";
            str2=str2.replaceAll("\\D", "");
            System.out.println(str2); //1055
            System.out.println(str1 + str2); //13991055
            // str1 ve str2 icerigi sayi olan String ifadelerdir
            // Eger iceriginin tamamen sayi oldugunu bildigimiz
            // String varsa parseDouble() veya parseInteger() methodu kullanbiliriz
            // kelimeyi sayiya donustur methodu...
            double sayi1 = Double.parseDouble(str1); //String olan str1, sayi olan sayi1 e donustu
            double sayi2 = Double.parseDouble(str2); //String olan str2, sayi olan sayi ye donustu
            double toplam = (sayi1 + sayi2) /100; //virgullu sayi oldugu icin bolduk
            System.out.println( "$" +toplam);




    }



}
