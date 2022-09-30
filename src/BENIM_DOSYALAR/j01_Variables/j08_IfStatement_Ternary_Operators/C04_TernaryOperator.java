package BENIM_DOSYALAR.j01_Variables.j08_IfStatement_Ternary_Operators;

import java.util.Scanner;

public class C04_TernaryOperator {
    public static void main(String[] args) {

// BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK-> girilen pozitif bir tamsayının 2 veya daha fazla basamkalı olmasını kontrol eden code create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("agam bi tamsayı gir bakam : ");
        int agaSayisi   = scan.nextInt();
        String sonuc = agaSayisi > 9 ? "sayi iki veya daha fazla basamakli" : "sayi tek basamakli";
        System.out.println(sonuc);
       // System.out.println(agaSayisi > 9 ? "sayi iki veya daha fazla basamakli" : "sayi tek basamakli");


    }


}
