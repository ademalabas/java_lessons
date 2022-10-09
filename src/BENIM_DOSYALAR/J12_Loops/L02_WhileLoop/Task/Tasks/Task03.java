package BENIM_DOSYALAR.J12_Loops.L02_WhileLoop.Task.Tasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*
        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.
		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number ");
		int num =sc.nextInt();
		int i=1;
		while (i<=num){
			System.out.println(i+"x"+num+" = "+i*num);
			i++;}


	}

}
