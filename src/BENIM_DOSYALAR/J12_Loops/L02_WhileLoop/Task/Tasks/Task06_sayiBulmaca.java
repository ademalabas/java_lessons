package BENIM_DOSYALAR.J12_Loops.L02_WhileLoop.Task.Tasks;

import java.util.Random;
import java.util.Scanner;

public class Task06_sayiBulmaca {

    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        Random rand = new Random();
        int num = rand.nextInt(100);
        int numberOfGuess = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please guess the number: ");
        int guess = scan.nextInt();

        while (guess != num) {
            if (num < guess) {
                System.out.print("Decrease the number ");
            } else {
                System.out.print("Increase the number ");
            }
            guess = scan.nextInt();
            numberOfGuess++;
        }
        System.out.println("You hit the target at " + numberOfGuess + " try.");



    }

}
