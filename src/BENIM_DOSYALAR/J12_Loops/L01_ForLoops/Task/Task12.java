package BENIM_DOSYALAR.J12_Loops.L01_ForLoops.Task;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
/*
Task -> girilen 5 sayının 10 ile 20 arası hariç diğerlerinin
toplamının hesap eden code create ediniz
 */

        Scanner sc = new Scanner(System.in);
        int toplam =0; // degeri 0 olan bir degisken olusturuldu
        for (int i = 1; i <=5; i++) {
            System.out.print(i+". Sayiyi giriniz :");
            int sayi = sc.nextInt();
            if (sayi>=20 || sayi<= 10)
                toplam +=sayi;
        }// for  sonu


        System.out.println("girdigimiz sayilarin istenen sartta toplami = "+ toplam);




    }

}
