package BENIM_DOSYALAR.j08_IfStatement_Ternary_Operators.Task_Nestedİf;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
		/* BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your height as meter");
        double height = scan.nextDouble();
        System.out.println("Enter your weight as kg");
        double weight = scan.nextDouble();
        double VKI = weight / (height * height);
        if (VKI <= 20)
        {
            System.out.println(" so skinny:  "+VKI);
        }else if (VKI <= 25) {
            System.out.println("fit,model type:  "+VKI);
        } else if (VKI <= 30) {
            System.out.println("overweight: "+VKI);
        } else{
            System.out.println("Obese:  "+VKI);
        }


    }

}
