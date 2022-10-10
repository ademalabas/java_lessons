package BENIM_DOSYALAR.J13_Brek_Continue.L04Break_Continue;

import java.util.Scanner;
//task-> girilen tamsayının asal olmasını kontrol eden code create ediniz
//asal tamsayı: 1 ve kendisinden başka tam böleni olmayan sayılar->asil bölünemeyen sayı
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("AGAm bi dene tamsayı  giresen :");
        int sayi=sc.nextInt();// 23->2,3,4,5,6,7...23 24
        //     v x x          x -> false
        ​
        ​
        boolean asalMı=true;
        for (int i = 2; i < sayi; i++) {
        if (sayi%i==0){//eğer sayi kendisine kadar olan sayılara tam bölunuyorsa
        asalMı=false;
        break;
        }
        ​
        }
        if (asalMı && !=1){
        System.out.println("girilen sayı ASAL");
        }else System.out.println("girlen sayı asal DEGİL ");
        ​
*/

public class C03_Asal_Control {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scan.nextInt();
        boolean prime= true;

        for (int i = 2; i < number; i++) {

            if (number % i  == 0 ) {
                prime= false;
                break;}
        }
        if (prime && number!=1) {
            System.out.println(number+"  is prime");
        }else
        System.out.println(number + ": is not prime number.");

    }

}
