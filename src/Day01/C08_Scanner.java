package Day01;

import java.util.Scanner;

public class C08_Scanner {

    // kullanicidan 2 tam sayi alin
// bu tam sayilari toplayin ve sonucu yazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("1.sayi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("2. sayi giriniz" );
        int sayi2 = scan.nextInt();
        int sum = sayi1 + sayi2;
        System.out.println("sum = " + sum);





    }


}
