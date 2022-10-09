package BENIM_DOSYALAR.J12_Loops.L01_ForLoops.Task.Tasks;

import java.util.Scanner;

public class Odev02 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
	//Task-> girilen bir String'deki rakam sayısını hesaplayan method create ediniz
	stringcount();
	}// main ends
	private static void stringcount() {
		System.out.println(" Please enter statement");
		String str = scan.nextLine();
		int counting =0;
		for (int b =0 ; b <str.length(); b++){
			if (str.charAt(b) >= '0' && str.charAt(b) <= '9'){
				counting++;}
		}System.out.println("There are "  + counting + " number of digits in statement");
	}

}
