package BENIM_DOSYALAR.j06_Comparison_Karsilastirma_Operators.tasks;

import java.util.Scanner;

public class Cavaplar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 14 -
        int a = 13; int b = 10;
        System.out.println("a > b " + (a>b)); // true
        //BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 15 -
        int c = 17; int d = 20;
        System.out.println(" c < d " + (c < d)); // true
        // BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 16 -
        int e = 13; int f = 13;
        System.out.println(" e <= f " + (e <= f)); // true
        //BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 17 -
        System.out.print("num 1 değerini giriniz : ");
        int num1 = scan.nextInt();
        System.out.print("num 2 değerini giriniz : ");
        int num2 = scan.nextInt();
        System.out.println(num1 == num2);
        // BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 18 -
        System.out.print("Birinci Double değerini giriniz : ");
        double dNum1 = scan.nextDouble();
        System.out.print("İkinci Double değerini giriniz : ");
        double dNum2 = scan.nextDouble();
        System.out.println(dNum1 == dNum2);
        //BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 19 -
        String str = "Apple"; String yazi = "Apple";
        System.out.println(str.equals(yazi)); // true
        //BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 20 -
        float f1 = 14f; float f2 = 17f;
        System.out.println(f1>=f2 || f1>f2 || !(f1>f2)); // true
        //BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 21 -
        double k = 14.23; double m = 19.52;
        System.out.println(!(k == m)); // true
        //BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 22 - ;)
        String str1 = "ClarusWay"; String str2 = "ClarusWay";
        System.out.println(!(str1.equals(str2))); // false
        //BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 23 -
        double x1 = 14.23; double x2 = 14.23;
        System.out.println(!(x1<x2)); // true
        //BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 24 -
        int s1 = 120; int s2 = 158;
        System.out.println(!(s1>s2)); // true

  //  <<<----KONSOL ÇIKTILARI ----->>>
  //     -----------------BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 14 ÇIKTISI --------------------
  //     a > b true
  //             -----------------BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 15 ÇIKTISI --------------------
  //     c < d true
  //             -----------------BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 16 ÇIKTISI --------------------
  //     e <= f true
  //             -----------------BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 17 ÇIKTISI --------------------
  //     num 1 değerini giriniz : 24
  //     num 2 değerini giriniz : 69
  //     false
  //             -----------------BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 18 ÇIKTISI --------------------
  //     Birinci Double değerini giriniz : 14,53
  //     İkinci Double değerini giriniz : 12,34
  //     false
  //             -----------------BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 19 ÇIKTISI --------------------
  //     true
  //             -----------------BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 20 ÇIKTISI --------------------
  //     true
  //             -----------------BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 21 ÇIKTISI --------------------
  //     true
  //             -----------------BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 22 ÇIKTISI --------------------
  //     false
  //             -----------------BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 23 ÇIKTISI --------------------
  //     true
  //             -----------------BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 24 ÇIKTISI --------------------
  //     true




    }



}
