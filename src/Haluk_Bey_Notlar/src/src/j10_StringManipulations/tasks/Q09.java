package Haluk_Bey_Notlar.src.src.j10_StringManipulations.tasks;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */

        Scanner scan = new Scanner (System.in);
        System.out.print("Bir isim giriniz : ");
        String cumle2 = scan.nextLine();
        String yaz = cumle2.substring(0,((cumle2.length()/2)));
        System.out.println(yaz);




    }
}
