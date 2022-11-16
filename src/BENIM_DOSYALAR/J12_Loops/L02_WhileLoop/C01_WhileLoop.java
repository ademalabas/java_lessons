package BENIM_DOSYALAR.J12_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {


    public static void main(String[] args) {

        /*
        Baslangic ve bitis degerleri net bilinendegerler olan tekrarlarda for loop\
        ama adim sayisi belli olmayip bir sarta duruma bagli olan tekrarlarda while loop kullanmali
         */
// Task  11 den 20mye kadar olan tamsayilari prin eden code create ediniz
        System.out.println(" ****for cozumu***");


        for (int i = 11; i < 20; i++) {
            System.out.println(i+" ");

        }
        System.out.println(" ****while cozumu***");
        int basla =11;
        while (basla < 20) {    //basla 21 den kucuk oldugu surece calisir
            System.out.print(basla+" ");
            basla++;// while dongu degisim komutu basla+=1
             }
        System.out.println();// dummy
// task 7 kere Java can print eden kode crete adin
int b =1;
while (b < 8) { //b
    System.out.println(b+".javaCAN");
    b++; // bunu yazmazsan sonsuza kadar yazar

    }

// Task03_Student   Iki basamakli tek sayilari yanyana yazan code create ediniz

        int i = 11;

while (i<100){

    System.out.print(i+" " );
    i+=2;// her iki artirmada 2 ser ikiser gider
   // if (i%2==1)
   //     System.out.print(i+" " );
   //     b++;
    }
        System.out.println();// dummy
//Task 04 irilen metni while loop ile tersten tazdiran code create ediniz
        Scanner scan = new Scanner(System.in);
      //  System.out.print("Enter expression: ");

        String metin = scan.nextLine();
       int kelimeUzunluk = metin.length();

        while (kelimeUzunluk >= 1){// metin uzunlugu 0 Test01 esit ve buyuk iken calisir

            System.out.print(metin.charAt(kelimeUzunluk-1)+" ");
            kelimeUzunluk--;
        }

//for (int Test01=kelimeUzunluk-1; Test01>0  ;Test01--){
//            System.out.println( );
//        }

// Task 5 Girilem tam sayiya kadar girilen satilarin toplamini create code create ediniz

        System.out.println(" Agam bi sayi giricen");
int sayi = scan.nextInt();
int Toplam =0;// dongu aksiyonunundam alusacak toplam icim bos bir integer olusturuldu
while (sayi > 0 ){// sayi bir olana dek
    Toplam+=sayi;// her dondugunde sayiyi ekle
    sayi--;// her dongude  sayiyi bir azalt
    System.out.println( "girilen sayilarin faktoriyel"+ Toplam);


}

        System.out.println(" ****Task 6 ***");
//task girilen sayilarin faktoriyelini alan code create din
        System.out.println(" Agam bi sayi giricen");
        int sayi1 = scan.nextInt();
        int faktoriyel =0;// dongu aksiyonunundam alusacak toplam icim bos bir integer olusturuldu
        while (sayi > 0 ) {// sayi bir olana dek
            faktoriyel *= sayi;// her dondugunde sayiyi ekle
            sayi--;// her dongude  sayiyi bir azalt
            System.out.println("girilen sayilarin faktoriyel" + faktoriyel);

        }







    }// main ends


}


/*

        başlangıç ve bitiş değerleri net(bilinen değerler) olan tekrarlarda foor loop
        ama adım sayısı belli olmayıp bir şarta(duruma) bağlı olan tekrarlarda while lopp kullanılmalı

// task01-> 11 den 20'ye kadar olan tamasayıları print eden code create ediniz...
        System.out.println("   *** for çözüm ***   ");
                for (int i = 11; i < 21; i++) {
        System.out.print(i + " ");
        }
        System.out.println("   *** while çözüm ***   ");
        ​
        int basla = 11;//while başlangıc degeri
        while (basla < 21) {//basla 21 den kucuk oldugu surece (iken) body action uygula
        System.out.print(basla + " ");
        basla++;//while dongü değişim komutu basla+=1;
        }
        //task02RomaRakam1-> 7 kere javaCAN print eden code create ediniz...
        System.out.println("   *** task02RomaRakam1 ***   ");
        int b = 1;
        while (b < 8) {
        System.out.println(b + ". javaCAN");
        b++;
        }
        // task03-> 2 basamaklı tek sayıları yanyana print eden code create ediniz
        System.out.println("   *** task03 ***   ");
        b = 11;
        while (b < 100) {
        //System.out.print(b+" ");
        // b+=2;//her iki artırmada b = 11,13 ... 99 surekli tek sayı verir
        if (b % 2 == 1) System.out.print(b + " ");
        b++;
        }
        // task04-> girilen metni while loop ile  tersden print eden code create ediniz
        System.out.println("   *** task04 ***   ");

        Scanner sc = new Scanner(System.in);
        //System.out.println("bir metin giriniz : ");
        //String metin = sc.nextLine();
        //int metinUzunluk = metin.length();

        //while (metinUzunluk >= 1) {//metnin uzunlugu 1'e Test01 eşit ve buyuk iken
        //    System.out.print(metin.charAt(metinUzunluk - 1));//
        //    metinUzunluk--;
        //}

        // task05-> girilen tamsayıya kadar tamsayıların toplamını print eden code create ediniz...
        // System.out.println("   *** task05 ***   ");
        System.out.println("AGAM nassıng :) bir tamsayı giriyorsun : ");
        int sayi = sc.nextInt();
        //int toplam = 0;//döngü actiondan oluşacak toplam için bpş int oluşturuldu
        //while (sayi > 0) {// sayı 1 olana dek

        //    toplam += sayi;// her döngüde sayıyı toplama ekle

        //    sayi--;// her döngüde sayıyı 1 azalt ki dünta döndükçe dönmesin.!!

        //}
        // System.out.println("agam girdigin sayılar toplamı : " + toplam);
        // task06-> girilen tamsayın faktoriyelini print eden code create ediniz...
        System.out.println("   *** task06 ***   ");

        int faktoriyel = 1;

        while (sayi > 0) {// sayı 1 olana dek body de ne varsa yap
        faktoriyel *= sayi;// her döngüde sayıyı toplama ekle
        sayi--;// her döngüde sayıyı 1 azalt ki dünta döndükçe dönmesin.!!
        }
        System.out.println("agam girdigin sayılar faktoriyeli : " + faktoriyel);


 */