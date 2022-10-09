package BENIM_DOSYALAR.J12_Loops.L01_ForLoops.Task.Tasks;

import java.util.Scanner;

public class Odev09 {
    public static void main(String[] args) {

    /*  Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */


        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER INTEGER: ");
        int number = scanner.nextInt();
        int total = 0;

        for (int i = 1; i < number; i++) {

            total = (i * i) + total;

        }
        System.out.println("Power of integers 1 to input number    : " + total);

    }
}
