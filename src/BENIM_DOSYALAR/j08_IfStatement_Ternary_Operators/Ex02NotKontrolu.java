package BENIM_DOSYALAR.j08_IfStatement_Ternary_Operators;

import java.util.Scanner;

public class Ex02NotKontrolu {
    public static void main(String[] args) {
/*
        Kullanicidan 100 uzerinden notunu isteyin.
                Not’u harf sistemine cevirip yazdirin.
        50’den kucukse “D”,->1,2,3..49
                =50  <60 arasi “C”,->50,51,52,..59
                =60  <80 arasi “B”,->60,61,62,63..79
                =80’nin uzerinde ise “A”->80,81..100
                */

        Scanner sc = new Scanner(System.in);
        System.out.println("agam notunu  gir : ");
        int not = sc.nextInt();
      // if (not < 0 || not > 100) {
      //     System.out.println("agam negatif ve 100 den buyuk not olmaz\nadam gibi bişeyler gir :(\n" + "gelmiim oraya");
      // } else if (not < 50) {//50 den kucuk not alma kontrolu
      //     System.out.println("D");//1,2,3..49
      // } else if (not < 60) {//60 den kucuk not alma kontrolu
      //     System.out.println("C");
      // } else if (not < 80) {//80 den kucuk not alma kontrolu
      //     System.out.println("B");//60,61,...79
      // } else {//80 ve buyuk    not alma kontrolu
      //     System.out.println("A");//80,81...1000
      // }


        if (not < 0 || not > 100) {
            System.out.println("agam negatif ve 100 den buyuk not olmaz\nadam gibi bişeyler gir :(\n" + "gelmiim oraya");

        } else if (not < 50) {//50 den kucuk not alma kontrolu
            System.out.println("D");//1,2,3..49

        } else if (not>=50 && not < 60) {//60 den kucuk not alma kontrolu
            System.out.println("C");

        } else if (not>=60 && not < 80) {//80 den kucuk not alma kontrolu
            System.out.println("B");//60,61,...79
        }else if (not>=800 && not <= 100) {//80 den kucuk not alma kontrolu
                System.out.println("B");//60,61,...79
        } else {//80 ve buyuk    not alma kontrolu
            System.out.println("A");//80,81...1000
        }




    }
}