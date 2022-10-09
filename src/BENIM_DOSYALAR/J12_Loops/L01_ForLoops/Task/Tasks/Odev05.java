package BENIM_DOSYALAR.J12_Loops.L01_ForLoops.Task.Tasks;

import java.util.Scanner;

import static BENIM_DOSYALAR.J11_MethodCreation.tasks._12_method12.powerOfThree;


public class Odev05 {
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
        System.out.print("Please enter number : ");
        int power = scan.nextInt();
        System.out.println(powerOfThree(power));

    }// main sonu
    public static boolean powerOfThree (int a) {
        if (a % 6 == 0) {
            return false;
        } else {
            int count =0;
            for (int i=3; i<a;i*=3){
                if (a % i != 0);
                count++;}
            return count == 0;
        }
    }



}
