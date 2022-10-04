package BENIM_DOSYALAR.j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("vize 1 notunu giriniz");
        int v1 = scan.nextInt();
        System.out.println("vize 2 notunu giriniz");
        int v2 = scan.nextInt();
        System.out.println("Final notunuzu giriniz");
        int vfinal = scan.nextInt();
        double sunuc = (((v1+v2)/2*0.30) + vfinal*0.70);
        System.out.println("sunuc = " + sunuc);








    }
}
