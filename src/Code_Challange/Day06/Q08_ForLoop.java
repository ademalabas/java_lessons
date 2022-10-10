package Code_Challange.Day06;

import java.util.Scanner;

public class Q08_ForLoop {

    public static void main(String[] args) {
// Kullanicidan iki sayi isteyin.
// Girilen sayilar ve aralarindaki tum
// tamsayilari toplayip, sonucu yazdiran bir program yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int total =0;
        if (n1 <n2) {
            for (int i = n1; i <=n2; i++) {
                total += i;
            }
            System.out.println("Between "+n1 +"and " + n2 +"Total: " + total);
        } else if (n1 > n2) {
            for (int i = n2; i <=n1; i++) {
                total += i;
            } System.out.println("Between "+n1 +"and " + n2 +"Total: " + total);
        } else {
            System.out.println("Numbers are equal");
        }

 /* Cuneyt bey den
        int sayi1 = scan.nextInt();
        int sayi2= scan.nextInt();
        int toplam=0;
        for (int i = (sayi1<sayi2 ? sayi1 : sayi2); i<= (sayi1>sayi2 ? sayi1 : sayi2); i++) {
            toplam+=i;
        }System.out.println("toplamları = " + toplam);
     */



    }// main end
}
