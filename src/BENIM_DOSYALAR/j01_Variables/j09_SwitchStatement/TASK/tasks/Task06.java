package BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK.tasks;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz
		Scanner scan = new Scanner(System.in);
		System.out.print("VIP kisaltmasindaki harflerden birini giriniz");
		char ch = scan.next().toUpperCase().charAt(0);


		switch (ch) {

			case 'V':
				System.out.print("very");
                break;
			case 'I':
				System.out.print("important");
                break;
			case 'P':
				System.out.print("person");
                break;
			default:
				System.out.println("Hatalı giriş.");



		}

		/*

		char harf=sc.next().toUpperCase().charAt(0);

   switch (harf){
   case 'V':
      System.out.println("Very");
      break;
   case 'I':
      System.out.println("Important");
      break;
   case 'P':
      System.out.println("Person");
      break;
   default:
      System.out.println("Hatalı giriş.");

		 */



	}
}
