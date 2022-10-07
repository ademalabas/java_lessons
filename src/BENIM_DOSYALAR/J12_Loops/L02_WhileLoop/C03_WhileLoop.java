package BENIM_DOSYALAR.J12_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {


    public static void main(String[] args) {

// task girilen tamsayinin pozitif tam bolen sayyisini print code  create ediniz
// 20 1,2,4,5,10,20 nin6 tam boleni var
// 30 1,2,3,5,6,10,15,30 nin 8 tam boleni var
        Scanner scan = new Scanner(System.in);
        System.out.println(" Agam bi sayi gircen =");
        int sayi = scan.nextInt();
        int bolen =1;
        int tamBolenAdedi=0;
    while (bolen< sayi){
        if (sayi % bolen==0) {// sayi bolensayiya tam bolunuyor
          tamBolenAdedi++;
        }
        bolen++; // loop sonsuza dusmemesi icin ve diger sayilarin boldugu kontrol icin icin yazildi
    }
        System.out.println("agam girdigin sayi  " +sayi + "  nin "+tamBolenAdedi+ " kadar tam boleni var");

    }// main ends

 //  Scanner sc = new Scanner(System.in);
 //      System.out.println("bir sayi giriniz  :");
 //  int  sayi = sc.nextInt();
 //  int n =1;
 //  int tb=0;
 //  while (n<=sayi){
 //      if (sayi%n==0){
 //          System.out.println(n);

 //          tb++;
 //      } n++;
 //  }System.out.println("tam bolen sayisi  toplamda " + tb);
 //
 //
 //

}


      //         Scanner sc = new Scanner(System.in);
      //       System.out.println("AGAM nassıng :) bir tamsayı giriyorsun : ");
      //        int sayi = sc.nextInt();
      //        int bolenSayi=1;
      //        int tamBolenAdedi=0;
      //        while (bolenSayi<=sayi){
      //        if (sayi%bolenSayi==0){//sayi bolenSayıya tam bölünme şartı
      //        tamBolenAdedi++;
      //
      //        }
      //        bolenSayi++;//lopp sonsuza düşmemesi için ve diğer sayılarun böldüğü kontrol edilmesi için yazıldı
      //        }
      //
      //        System.out.println("agam girdiğin "+sayi+" nın "+tamBolenAdedi+" kadar tam boleni var :)");
      //