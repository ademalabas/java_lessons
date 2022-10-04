package BENIM_DOSYALAR.j08_IfStatement_Ternary_Operators;

import java.util.Scanner;

public class C02_IfElseStatement {

    public static void main(String[] args) {

        /*
BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK-> girilen yasın 18 den buyuklugunu kontrol eden code create ediniz
 */
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen yasinizi giriniz: ");
        int yas = scan.nextInt();
      /*  if(yas>18){
            System.out.println("18 yasindan buyuksünüz");
        }
        else {
            System.out.println("18 yasindan kücüksünüz");
        }

       */

/*
BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK-> girilen yasın 18 den buyuklugunu kontrol eden code create ediniz
18 den kuçuk ise ehliyet alamzsınız print ediniz
 */


        if(yas >= 18){
            System.out.println("18 yasindan kucuk degil" );
        }
        else {
            System.out.println("Ehliyet Alamazsiniz");


    }



}}
