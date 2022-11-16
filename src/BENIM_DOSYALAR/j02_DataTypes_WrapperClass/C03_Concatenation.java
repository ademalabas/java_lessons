package BENIM_DOSYALAR.j02_DataTypes_WrapperClass;

public class C03_Concatenation {

    public static void main(String[] args) {
        String ad ="Adem";
        String soyad = "Alabas";

        int a = 7;
        int b = 11;

        //Birden cok string variable ile farkli data type variabllar + ile isleme alinirsa
        // java birlestirme yaparak yeni bir string olusturur

        // TRICK :) Bir aritmetik işlem içinde String kullanılırsa, aritmetik işlem önceliğine göre
        // işlem yapılıp String variable'Test01 Concatenation yapılır.


        System.out.println(a+ad+soyad+b);
        System.out.println(ad+soyad+a+b);
        System.out.println(a+b+ad+soyad);
        System.out.println(ad+soyad+(a+b));
        System.out.println((a+b)+ad+soyad);

        System.out.println(ad+soyad+a+b);//AdemAlabas711

        System.out.println(a+ad+soyad+b);//7AdemAlabas11

        System.out.println(a+b+ad+soyad);//18AdemAlabas

        System.out.println(" "+a+b);//711

        System.out.println(ad+soyad+(a+b));//AdemAlabas18

        System.out.println((a+b)+ad+soyad);//18AdemAlabas

        System.out.println(ad+(a-b)+(a-b));//Adem-4-4

        System.out.println(ad+((a-b)+(a-b)));//Adem-8



        char ch='1';//
        System.out.println(ad+ch);// Adem1

        System.out.println(a+ch+ad);//56Adem

        System.out.println(ad+(ch+b));//Adem60

        System.out.println(a+ad+ch);//7Adem1

    /* TRICK -> char data turu isleme girdigi variables'in turune gore farkli işlem yapar
     eger isleme girdigi variables  aritmetik bir islemse  ascii değeri ile işelm yapar ->
    */


    }
}
