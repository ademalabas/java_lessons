package BENIM_DOSYALAR.j01_Variables.j06_Comparison_Karsilastirma_Operators.tasks;

import java.util.Scanner;

public class Homework_Adem_Comp_Op {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  *****BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 14 -******

        int a = 13;
        int b = 10;
        System.out.println("a>b " + (a>b)); // true


        //    *****BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 15 -******

        int c =17;
        int d =20;
        System.out.println(" c < d "  + (c<d)); // true


        //  *****BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 16 -******
        int e = 15;
        int f = 15;
        System.out.println("e <= f " +(e<=f) ); // true


        // *****BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 17 -******
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number= " );
        int num1 = sc.nextInt();
        System.out.println("Please enter the second number= " );
        int num2 = sc.nextInt();
        System.out.println(num1==num2);

        //  *****BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 18 -******

        Scanner dp = new Scanner(System.in);
        System.out.println("Please enter first double: ");
        double dnum1 = dp.nextDouble();
        System.out.println("Please enter second double: ");
        double dnum2 = dp.nextDouble();
        System.out.println(dnum1 == dnum2);

        // *****BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 19 -******


        String s1 = "Apple";
        String s2 = "Apple";
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);

        // *****BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 20 -******

        float f1 = 14f;
        float f2 = 17f;
        System.out.println((f1>= f2) || (f1>f2) || !(f1>f2));

        // *****BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 21 -******
        double d1 = 14.23;
        double d2 = 19.52;
        System.out.println(!(d1==d2));


        // *****BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 22 -******
        String i = "Techno Study";
        String l = "Techno Study";
        System.out.println( !(i==l));//1st wat
        System.out.println( !((i).equals(l)));//2nd way

        // *****BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 23 -******


        double d10 = 14.23;
        double d20 = 14.23;
        System.out.println(!(d10<d20));


        // *****BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK 15 -******
        int x = 120;
        int y = 158;
        System.out.println(x>y);




    }

}
