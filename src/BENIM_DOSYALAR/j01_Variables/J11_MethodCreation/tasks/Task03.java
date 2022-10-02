package BENIM_DOSYALAR.j01_Variables.J11_MethodCreation.tasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a 
		// ceviren bir method yaziniz.

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter hours=");
		int hour = scan.nextInt();
		System.out.print("Please enter miles=");
		int miles = scan.nextInt();
		System.out.print("Please enter weight as kg=");
		int weight = scan.nextInt();
		converter(hour, miles, weight);


	}//main sonu
	public static void converter(int hour, int miles, int weight) {
		int seconds = hour *3600;
		double km = miles * 1.609344;
		int gram = weight * 1000;
		System.out.println(hour + " hour(s)= " +seconds + "  seconds \n"
				+ weight + " kilogram(s)= " + gram + " grams \n"
				+miles + " mile(s)= " +km + "kilometers ");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
