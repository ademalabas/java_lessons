package BENIM_DOSYALAR.j01_Variables.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

		 */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter mid-term grade, final grade, and project grade");
        int midtermGrade = sc.nextInt();
        int finalGrade = sc.nextInt();
        int projectGrade = sc.nextInt();
        double gGrade= midtermGrade*0.30+projectGrade*0.20+finalGrade*0.50;
        System.out.println("Your grade is : "+gGrade);


        //System.out.println("Please enter your Midterm grade: ");
        //System.out.println("Please enter your Project grade: ");
        //System.out.println("Please enter your Final grade: ");
    }
}
