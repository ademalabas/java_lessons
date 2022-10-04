package BENIM_DOSYALAR.j08_IfStatement_Ternary_Operators.Task_Nestedİf;

import java.util.Scanner;

public class Q16 {
/* BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number");
        int n1 = scan.nextInt();
        System.out.println("Please enter second number");
        int n2 = scan.nextInt();
        System.out.println("Please enter third number");
        int n3 = scan.nextInt();

        if ((n1>n1) && (n1>n3)){
            if (n2>n3)
            System.out.println("Max No: n1=" +n1+ "  Min No: n3=  "+n3);
            else {
                System.out.println("Max No: n1=" +n1+ "  Min No: n2=  "+n2);
            }

        }else if (n2>n3 && n2>n1) {
            if (n1<n3)
            System.out.println("Max No: n2 =" +n2+ "  Min No: n1=  "+n1);
            else {
                System.out.println("Max No: n2= " +n2+ "  Min No: n3= "+n3);
            }
        } else
            if (n1<n2) {
                System.out.println("Max No: n3=" +n3+ "  Min No:n1=  "+n1);
            } else {
                System.out.println("Max No: n3=" +n3+ "  Min No: n2= "+n2);
            }

    }
}

