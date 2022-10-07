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

// Task03   Iki basamakli tek sayilari yanyana yazan code create ediniz

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

        while (kelimeUzunluk >= 1){// metin uzunlugu 0 a esit ve buyuk iken calisir

            System.out.print(metin.charAt(kelimeUzunluk-1)+" ");
            kelimeUzunluk--;
        }

//for (int a=kelimeUzunluk-1; a>0  ;a--){
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
