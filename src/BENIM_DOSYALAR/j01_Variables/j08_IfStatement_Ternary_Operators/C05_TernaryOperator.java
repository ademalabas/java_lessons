package BENIM_DOSYALAR.j01_Variables.j08_IfStatement_Ternary_Operators;

import java.util.Scanner;

public class C05_TernaryOperator {
    public static void main(String[] args) {

// BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK-> girilen bir tamsayı çiftse yarısını değilse
// "girilen sayı tek oldugu için yarısı tamsayı değildir" print eden code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("agam bi tamsayı gir bakam : ");
        int agaSayisi   = scan.nextInt();

        System.out.println((agaSayisi % 2 == 0 ? agaSayisi / 2 : "girilen sayı tek oldugu için yarısı tamsayı değildir"));

        /*
        Trick   Ternary iki durum(T/F) icin farkli data type ciktisi veriyorsa atama yapilmadan print(sout) yapilmali
        yada ternary ciktisi ayni data tye cast edilmeli.
         */

        //int sonuc=agaSayisi%2==0 ? agaSayisi/2 : "girilen sayı tek oldugu için yarısı tamsayı değildir";
         /*
        ahan da TRICK -> ternary iki durum(T/F) için farklı data type çıktısı veriyorsa variable atama yapmadan sout yapılmalı
        ya da ternary çıktısı aynı data type serializable edilmeli...

         */
        System.out.println(agaSayisi % 2 == 0 ? agaSayisi / 2 : "girilen sayı tek oldugu için yarısı tamsayı değildir");




    }
}
