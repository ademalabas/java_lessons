package BENIM_DOSYALAR.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */
		
       Scanner scan = new Scanner(System.in);

        System.out.println("Enter 3 digit number");
		int a = scan.nextInt();

        System.out.println("Sum of first and last digits is = " +(a/100)+"+"+(a%10)+"="+((a/100)+(a%10)));

                //(a/100)+"+"+(a%10)+ "="+((a/100)+(a%10)));

		
	}

}
