package BENIM_DOSYALAR.j01_Variables.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _25_Scanner4 {

    public static void main(String[] args) {

    /*   kullanıcının arabansındaki kapı sayısını print eden code create ediniz.  */

        Scanner sc = new Scanner (System.in);
        System.out.println("Arabanin kapi sayisini giriniz:");
        Integer kapiSayisi = sc.nextInt();
        System.out.println("Arabanizin Kapi Sayisi:" +kapiSayisi);




    }
}


