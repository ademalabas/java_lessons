package BENIM_DOSYALAR.j01_Variables.j08_IfStatement_Ternary_Operators.Task_Nestedİf;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();

        if (age >=18) {
            System.out.println("Enter your weight as kg");
            int weight1 = scan.nextInt();
            if (weight1 >= 50) {
                System.out.println("Congratulation !!! You can donate blood");
            } else {
                System.out.println("Your age is more than 18 but weight ile less than 50 so you can't do blood donation");
            }
        } else {
            System.out.println("Your age is less than 18 and can't do blood donation");
        }


    }

}
