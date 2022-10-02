package BENIM_DOSYALAR.j01_Variables.J11_MethodCreation.tasks;

import java.util.Locale;
import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini 
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please type \n1 for parallelogram   \n2 for rectangle \n3 for triangle \n");
		int ch =scan.nextInt();
		System.out.println("Enter first number");
		int num =scan.nextInt();
		System.out.println("Enter second number");
		int num2 =scan.nextInt();


		switch (ch){
			case 1:parallelogramAreaPerimeter(num,num2);break;
			case 2:rectangle(num,num2);break;
			case 3:triangle(num,num2);break;
			default: System.out.println("Wrong entry");
		}


	}// main ends
	private static void triangle(int num, int num2) {
		System.out.println("triangle perimeter : "+((num + num2+Math.sqrt(num * num + num2 * num2))
				      +"\n"+" triangle area : "+(num + num2 +(Math.sqrt(num * num + num2 * num2)))/2));
	}
	private static void rectangle(int num, int num2) {
		System.out.println("Rectangle perimeter : "+(2 * (num + num2))+"\n"
						+("Rectangle Area : "+(num * num2)));
	}
	private static void parallelogramAreaPerimeter(int num, int num2) {
		System.out.println("parallelogram perimeter : "+( 2* num * num2)+"\n"
						+(" Area calculation height is needed"));

	}




} //class end










