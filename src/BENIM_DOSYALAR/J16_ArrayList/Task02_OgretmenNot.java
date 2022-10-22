package BENIM_DOSYALAR.J16_ArrayList;

import java.util.Scanner;

public class Task02_OgretmenNot {
    public static void main(String[] args) {
 /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Sınıf mevcudu nedir hocam? ");
        int size = scan.nextInt();
        int sinif[] = new int[size];
        int toplam=0;
        for (int i = 0  ; i<=size-1; i++) {
            System.out.println(i+". öğrencinin notunu giriniz hocam = ");
            sinif[i]=scan.nextInt();
            toplam+=sinif[i];
        }
        int ortalama = toplam / sinif.length;
        System.out.println("Not ortalaması = " + ortalama);
        int gecen = 0;
        for (int i = 0 ; i<=sinif.length-1; i++) {
            if (sinif[i]>=ortalama) gecen++;
            System.out.println(sinif[i]<ortalama? i+ ".öğrenci dersten "+ (sinif[i])+ " notu ile kaldı" :i+ ".öğrenci dersten "+ (sinif[i])+ " notu ile geçti" );
        }
        System.out.println("Sınıfta geçen öğrenci sayısı = " + gecen);




    }
}
