package BENIM_DOSYALAR.j10_StringManipulations.task.tasks;

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
        System.out.print("Please Enter any name : ");
        String a = scan.nextLine();
        String b = a.substring(0,((a.length()/2)));
        System.out.println(b);




    }
}
