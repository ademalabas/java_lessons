package BENIM_DOSYALAR.J12_Loops.L02_WhileLoop.Task.Tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz
		 */
		Scanner scan=new Scanner(System.in);
		System.out.print( "Enter Your Name :");
		String name=scan.nextLine().toUpperCase();
		System.out.print( "Enter Surname :");
		String surname=scan.nextLine().toUpperCase();
		String nameSurname=name.concat(surname);
		int count = 0;
		while (count < nameSurname.length()) {
			System.out.print(nameSurname.charAt(count) + " ");
			count++;}
	}

}
