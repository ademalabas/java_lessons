package BENIM_DOSYALAR.j08_IfStatement_Ternary_Operators;

public class C01_IfStatement {
    public static void main(String[] args) {
/*
        int kyas = 33;
        int iyas = 40;

        if (kyas == iyas) {

            System.out.println("ayni yastasiniz");
            System.out.println("yoksa siz ikizmisiniz");
        }
        if (kyas >= 40)
            System.out.println("kerim bey olgunluk yasindasiniz");
        System.out.println("bu metni okuduysaniz if den bagimsiz");
        if (kyas + iyas > 100) {
            System.out.println("kerim bey ve ismail beylerin yas toplami 100 den buyuk");
        }
        System.out.println("selam java canlar");
        //  Bagimsiz if statement yapilari sadece kendi scope eder
        // birden fazla bagimsiz if statement yapilari hepsinin calisabilecegi
        // gibi hic birisi de calismayabilir
*/
        int krmYas = 45;
        int ismlYas = 63;
        if (krmYas == ismlYas) {
            System.out.println("aynı yasdasınız güzel insanlar");
            System.out.println("yoksa siz ikiz misiniz ? ");
        }
        if (krmYas >= 40)
            System.out.println("krm bey olgunluk yaşındasınız");
        //if blok'da {} kullanılmazsa ilk ; kadar olan komut çalışır veya çalışmaz alt satırdan devam eder
        System.out.println("bu yazıyı okuduysanız 12. satırdaki if'den bagımsız");
        if (krmYas + ismlYas > 100) {
            System.out.println("kerm bey ve ismal bey yaşları toplamı 100 den buyuk");
        }
        System.out.println("selam javacanlar");
    /*
    Bagımsız if statement  yaoıları sadece kendi  scop(kapsamlarını ) run eder.
    Birden fazla bagımsız if statement  yapıları hepsinin body calışabilecegi gibi hiçbirisini body de çalışmayablir
     */
//ctrl+alt+l-->code reformat java format


    }
}
