package BENIM_DOSYALAR.j01_Variables.J11_MethodCreation;

import java.util.Scanner;

public class C02_MetodCreation {
    public static void main(String[] args) {
        //task-> girilen 3 notun ortalamasını hesaplayan method create ediniz.

        Scanner sc =new Scanner(System.in);
        System.out.print("1. notu giriniz : ");
        double not1=sc.nextDouble();

        System.out.print("2. notu giriniz : ");
        double not2=sc.nextDouble();

        System.out.print("3. notu giriniz : ");
        double not3=sc.nextDouble();

        double ortalamanız=ortalamaHesapla(not1,not2,not3);

        System.out.println(ortalamaHesapla(45, 58, 79));// 60.66
        System.out.println("not ortalamanız agam = " + ortalamanız);//75.0



    }//main sonu

    private static double ortalamaHesapla(double a, double b, double c) {
        return (a+b+c)/3;
    }


    }






