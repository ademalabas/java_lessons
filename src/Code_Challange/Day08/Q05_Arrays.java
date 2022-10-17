package Code_Challange.Day08;

import java.util.Scanner;

public class Q05_Arrays {
    public static void main(String[] args) {
/*
  Kullanicidan aldigimiz 8 elemanli arrayin icinde
  kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
 */
      // Scanner scan = new Scanner(System.in);
      // System.out.println("Kac elemanli istersiniz");

      // int arr1[] = new int [scan.nextInt()];
      // for(int i = 0 ; i<=arr1.length-1;i++) {
      //     System.out.println(i + ". indexteki elemanı giriniz");
      //     arr1[i]=scan.nextInt();
      //     System.out.println(i==7? "8 elemanın tamamlandi " : "");
      // }
      // int sayac=0;
      // for (int i = 0; i<=arr1.length-1;i++) {
      //     sayac+=(arr1[i]%3==0 ? 1 : 0);
      // }
      // System.out.println("3 e bolunen eleman sayisi = "+sayac);

        int arr[]  =new int[8];
        Scanner scanner = new Scanner(System.in);
        int count = 0; //3 e bolunebilen eleman sayisi
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + " .indexteki elemani giriniz :");
            arr[i] =scanner.nextInt();
            if(arr[i]%3 ==0 && arr[i]!=0){
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("count = " + count);





    }


}
