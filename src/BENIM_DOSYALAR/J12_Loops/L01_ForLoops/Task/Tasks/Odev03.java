package BENIM_DOSYALAR.J12_Loops.L01_ForLoops.Task.Tasks;

import java.util.Scanner;

public class Odev03 {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *  getAsalMi(int sayi)
     *  	return true/false
     * */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Please enter number");
        int number = scan.nextInt();
        System.out.println(checkPrimeNumber(number)?  number+ "  is PRIME NUMBER ": + number + "  is NOT Prime Number");

    }// main end

    private static boolean checkPrimeNumber(int number) {
        boolean prime= true;

        for(int i =2 ; i< number; i++){
            if (number%i==0){
                prime=false;}
        } return prime;

    }
}
