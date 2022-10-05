package BENIM_DOSYALAR.J12_Loops.L01_ForLoops.Task;

import java.util.Scanner;

public class Task03_Faktoriyel {
    public static void main(String[] args) {



        /*
Task -> girilen sayının faktoriyelini hesaplayan method create ediniz
sayi!= 1*2*3* ...*sayi
  */
  //     Scanner sc= new Scanner(System.in);
  //     System.out.println("bir pozitif tam sayı giriniz : ");
  //     int sayı=sc.nextInt();

  //     System.out.println(faktoriyel(sayı));//int parametreli method call
  // }//main dışı

  // private static int faktoriyel(int sayı) {
  //     int faktoriyel = 1;

  //     for (int i = 1; i <= sayı; i++) {
  //         faktoriyel *= i;

  //     }
  //     // System.out.println("faktoriyel : "+faktoriyel);
  //     return faktoriyel;

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfeen bir sayi giriniz");
        int sayi = scan.nextInt();
       // faktoriyel1(sayi);
        System.out.println(faktoriyel2(sayi));

    }

    private static int faktoriyel2(int sayi) {
        int faktoriyel =1;
        for (int i=1; i<=sayi;i++){
            faktoriyel*=i;

        }

        //System.out.println("faktoriyel  = " +faktoriyel);// sonsuz donguye girer

        return faktoriyel;


    }

    public static void faktoriyel1(int sayi){
        int faktoriyel =1;

        for (int i=1 ;i <=sayi ;i++){

             faktoriyel *= i;
        }
    System.out.println("faktoriyel  = " +faktoriyel);



}




}
