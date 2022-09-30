package BENIM_DOSYALAR.j01_Variables.j03_ScannerClass_TypeCasting.tasks;

import java.awt.*;
import java.util.Scanner;

public class Calisma {


    public static void main(String[] args) {
      //  Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
      //  Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
      //  120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?*/
//
      /*  Scanner scan=new Scanner(System.in);
        System.out.println("hızı giriniz");
        double v=scan.nextDouble();
        System.out.println("mesafe giriniz ");
        double x=scan.nextDouble();
        System.out.println("zaman : " + x/v );
*/
       Scanner scan =new Scanner(System.in);
    /*    System.out.println("Enter distance");
        double v = scan.nextDouble();
        System.out.println("Enter Speed");
        double x = scan.nextDouble();
        System.out.println("Time of trip="+v/x);
*/




        // *** Task08 ***
        /*
          Kullanicidan alacaginiz vize1 vize2 ve final notlarini
          vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

     /* System.out.println("vize1 notunuzu giriniz");
        int vize1=scan.nextInt();
        System.out.println("vize2 notunuzu giriniz");
        int vize2=scan.nextInt();
        System.out.println("final notunuzu giriniz");
        int fınal=scan.nextInt();
        System.out.println ((vize1+vize2)/2*0.3+fınal*0.7);
*/

        System.out.println("Enter first MTerm Exam =");
        int mte1 =scan.nextInt();
        System.out.println("Enter second MTerm Exam =");
        int mte2 =scan.nextInt();
        System.out.println("Enter Final Exam =");
        int fınal =scan.nextInt();
        System.out.println((mte1+mte2)/2*0.3+ fınal*0.7);





    }
}