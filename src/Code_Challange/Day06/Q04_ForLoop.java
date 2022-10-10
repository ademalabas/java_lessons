package Code_Challange.Day06;

import java.util.Scanner;

public class Q04_ForLoop {

    public static void main(String[] args) {
/*    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
   ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
   hesaplayan kodu yazın
  Örnek Ekran Çıktısı
  Girilen sayı=4
  Kareler toplamı=14
   */
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter integer");
        int num = scanner.nextInt();
        int powertotal=0;
      for(int i=1; i<num; i++){
         powertotal+= i*i;      // 1 4 3 16
      }
        System.out.println("Power Total = " +powertotal );





    }// main end
}
