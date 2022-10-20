package BENIM_DOSYALAR.J16_ArrayList.Tasks;

import java.util.Scanner;

public class _11_prime_numbers {

    /*
    negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kaç asal sayı var ise yazdırın.

        Örnek 1:
        n = 20

        cevap: 8      ==   (2,3,5,7,11,13,17,19)  20 ye kadar 8 adet asal sayı vardır.
        Örnek2:
        Input(Girdi): 10
        Output(Çıktı): 4
        Explanation(Açıklama): 10'dan küçük 4 adet asal sayı vardır. (2,3,5,7)
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Prime numbers up to : ");
        int lastNum =scan.nextInt();
        int count=0;
        boolean flag = false;
        for (int i=2 ; i<=lastNum ; i++) {
            int j;
            for ( j=2 ; j<= i ;j++) {
                if (i%j==0){break;}
            } if (i==j){
                System.out.print(i + "  ");
                count++;
            }
        }
        System.out.println("are prime and  total  " + count + "  numbers are prime ");



    }
}
/*
ArrayList<Integer> asals = new ArrayList<Integer>();
        int a=20;
        int counter;
        for (int i=2; i<=a; i++) {
            counter=0;
            for (int j=2 ; j<i ; j++) {
                if (j!=i) {
                    if (i%j == 0){
                        counter++;
                        break;
                    }
                }
            }
            if(counter==0)asals.add(i);
        }
        System.out.println(asals);

 */