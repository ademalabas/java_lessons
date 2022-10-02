package BENIM_DOSYALAR.j01_Variables.J11_MethodCreation.tasks;

import java.util.Scanner;

public class _12_method12 {

    /*
    powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {

//Tam sayının 3 üssü olup olmadığını bulma
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int ucUs = scan.nextInt();
        System.out.println(powerOfThree(ucUs));


    }// main sonu

   public static boolean powerOfThree1 (int i) {
       while (i > 3) {
           i /= 3;
       }

       return i % 3 == 0;

   }


    public static boolean powerOfThree (int a) {
        if ( a%3 ==0) {

            return true;
        } else {return false;}

    }

}
