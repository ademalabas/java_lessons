package BENIM_DOSYALAR.j01_Variables.J11_MethodCreation.tasks;

import java.util.Scanner;

public class _01_method1 {
    /*
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
     */

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
//Rastgele max sayıya kadar sayı oluşturma
        System.out.print("Rastgele oluşturulacak sayıların maximum değerini giriniz ");
        int max = scan.nextInt();
        System.out.println(randomNum(max));






    }// main sonu

    public static int randomNum(int max) {
        return max = (int) (Math.random() * max);
    }



    }

// bir sayinin tersi

  // public static void main(String[] args) {
  //     int sayi = 1234, tersi = 0;
  //     int yedek=sayi;

  //     while(sayi != 0) {
  //         int basamak = sayi % 10;
  //         tersi = tersi * 10 + basamak;
  //         sayi /= 10;
  //     }
  //     System.out.println("Sayının      : " + yedek);
  //     System.out.println("Sayının Tersi: " + tersi);
  // }

