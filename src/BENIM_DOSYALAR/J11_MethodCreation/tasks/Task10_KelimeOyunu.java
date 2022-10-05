package BENIM_DOSYALAR.J11_MethodCreation.tasks;

import java.util.Scanner;

public class Task10_KelimeOyunu {

    /* Iki kisinin oynayacagi bir kelime oyunu uretelim
     * Kurallar
     * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
     *
     * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
     *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
     *        ve 3.adima gecin
     *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
     *        kazandigini yazip oyunu bitirin
     *
     * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
     *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
     *          basa mi sona mi ekleyecegini sorun
     *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
     *
     *      *   Devam etmek istemezse
     *          "Oyun bitti" yazin
     *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
     */

      static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println( "Oyuncu 1 Lutfen kelime giriniz");
        String oyuncu1 = scan.nextLine();
        System.out.println( "Oyuncu 2 Lutfen kelime giriniz");
        String oyuncu2 = scan.nextLine();
        System.out.println("lutfen bir kelime giriniz");
        String kelime = scan.nextLine();
        System.out.println("kelimeyi kabul ediyormusunuz <E>vet  <H>ayir ");
        String cevap1 = scan.nextLine();
        String cevap2 = scan.nextLine();

        int puan1 =0;
        int puan2 =0;


        if(cevap1.equals("E")){
            System.out.println("puaniniz = " + (puan1 +=kelime.length()));
        }else if(cevap1.equals("H")){
        System.out.println("Kaybettiniz " );
        }else {
            System.out.println("gecersiz kelime");
            System.out.println("Oyuna devam etmek istiyormusunuz <E>vet  <H>ayir ");











        }





    }/// main end










}



