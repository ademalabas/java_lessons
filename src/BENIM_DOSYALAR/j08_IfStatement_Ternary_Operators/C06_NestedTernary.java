package BENIM_DOSYALAR.j08_IfStatement_Ternary_Operators;

import java.util.Scanner;

public class C06_NestedTernary {
    public static void main(String[] args) {

/*
 BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK :
Kullanicidan bir sayi aliniz
Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("agam bi tamsayı gir bakam : ");
        int agaSayisi   = scan.nextInt();

        System.out.println(agaSayisi >= 0 ? (agaSayisi < 10 ? "rakam" : "pozitif Sayi") : "Negatif Sayi");


    }
}
