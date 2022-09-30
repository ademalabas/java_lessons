package BENIM_DOSYALAR.j01_Variables.j10_StringManipulations;

public class C11_ValueOf_parse {
    public static void main(String[] args) {

// Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur.
// Boylece rakamlarla olusturulan
// Stringlerle matematiksel islemler yapabilmemizi saglar.

//valueOf() hem Integer wrapper classinin icinde hem de String'in
// icinde var. Integer wrapper classinin icinde
//olan valueOf() methdou String'i integer'a cevirir.
// String'in icindeki valueOf() methodu integer'i String'e cevirir.

    // Task-> String type verilen iki adet bagis miktarini prin eden code crete ediniz


String bayi1 ="1500";
String bayi2 ="2500";

int bagisdegeri1 = Integer.valueOf(bayi1);// stringi int cevirdi
int bagisdegeri2 = Integer.valueOf(bayi2);

        System.out.println("toplam bagis = "+(bagisdegeri1+ bagisdegeri2));//toplam bagis = 4000

int fetih =Integer.valueOf("1453");
        System.out.println(fetih);//1453

// parse int

        System.out.println("Toplam bagis=  "+(Integer.parseInt(bayi1) + Integer.parseInt(bayi2)));//Toplam bagis=  4000

     int tc =1234567;
  String strtc   =String.valueOf(tc);
        System.out.println("strtc = " + strtc);//strtc = 1234567
        System.out.println("strtc+tc = " + (strtc+tc));//strtc+tc = 12345671234567

        String fiyat = "$150";
        int yenifiyat = Integer.valueOf(fiyat);
        System.out.println("yenifiyat = " + yenifiyat);//RTE
/*
        String bagis1 = "1500";
        String bagis2 = "2500";
​
​
        int bagisDegeri1=  Integer.valueOf(bagis1);//bagis1 string içindeki sayı değerini int'e cavirdi bagisDegeri1'e atadı
        int bagisDegeri2=  Integer.valueOf(bagis2);//bagis2 string içindeki sayı değerini int'e cavirdi bagisDegeri2'e atadı
​
        System.out.println("toplam bagis miktarı : "+(bagisDegeri1+bagisDegeri2));//bagısDegerleri toplanıp perint edildi:4000
​
​
        int fetih=Integer.valueOf("1453");
        System.out.println(fetih);//1453
​
​
        System.out.println("toplam bagıs : "+(Integer.parseInt(bagis1) + Integer.parseInt(bagis2)));//4000
​
​
        int tc=1234567;
        String strTc = String.valueOf(tc);
        System.out.println("strTc = " + strTc);//1234567
        System.out.println("strTc+tc = " + (strTc + tc));//

        String  fiyat="$150";
        int yeniFiyat=  Integer.valueOf(fiyat);
        System.out.println("yeniFiyat = " + yeniFiyat);
*/

    }
}
