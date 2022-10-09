package BENIM_DOSYALAR.J12_Loops.L02_WhileLoop.Task.Tasks;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println( "Enter Expression:");
		String str=scan.nextLine().toUpperCase();
		int letters=0;
		int digits=0;
		int characters=0;
		int index=0;
		do{
			if (str.charAt(index)>='A' && str.charAt(index)<='Z'){
				letters++;
			} else if (str.charAt(index)>='0' && str.charAt(index)<='9') {
				digits++;
			}else {characters++;}
			index++;
		}while (index<str.length());
		System.out.println("Number of letters are : "+letters+"\nNumber of gidits are : "+digits+
				"\nNumber of characters are : "+characters);


	}

}
