package BENIM_DOSYALAR.J15_Arrays.Tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)

         */
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.println(i+". elemanını giriniz");
            arr[i]=scan.nextInt();
        }
        System.out.print("Ucun kati olan sayilar : " );
        for (int i = 0; i < 8; i++) {
            if (arr[i] % 3 == 0) {
                System.out.print((arr[i] + ",  "));


            }
        }}
}
