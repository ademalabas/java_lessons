package BENIM_DOSYALAR.j08_IfStatement_Ternary_Operators.Task_Nestedİf;

import java.util.Scanner;

public class Homwork_21_sept {
    public static void main(String[] args) {
        //**** Task3 *****//
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
        //**** Task5 *****//
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
        //**** Task8 *****//
        System.out.println("Enter amaunt of product");
        int amount = scan.nextInt();
        System.out.println("Enter Unit price of product");
        double price= scan.nextDouble();
        System.out.println("Do you have card? sress <Y>es or <N>o button");
        char card = scan.next().toUpperCase().charAt(0);
        if (card == 'Y') {
            if (amount > 10) {
                System.out.println("Diccount % 20: "+ amount * price*0.80 +" $  is enough "   );
            }else {
                System.out.println("Diccount: %15  "+ amount * price*0.85 +" $  is enough ");
            }
        } else
        if (amount > 10) {
            System.out.println("Diccount: %15 "+ amount * price*0.85 +" $  is enough ");
        }else {
            System.out.println("Diccount: % 10  "+ amount * price*0.90 +" $  is enough ");
        }
        //**** Task9 *****//
        double d = 45;
        if (d%5 ==0 && d%8==0 ){
            System.out.println( "Able to divide by 5 and 8");
        } else if ((d%10==5 && d%9 == 0)){
            System.out.println( "able to divide by 9 and divide by 10 reminder is 5");
        }
        //**** Task16_ArraydekiSonElemanCarpimi *****//
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
        /*
     //  //**** Task 3 *****/

        //  Enter your height as meter
     //  1.75
     //  Enter your weight as kg
     //  78
     //  overweight: 25.46938775510204

        //**** Task 5 *****//

     //  Enter your age
     //  20
     //  Enter your weight as kg
     //  60
     //  Congratulation !!! You can donate blood
     //  //**** Task 8 *****//
     //  Enter amaunt of product
     //  12
     //  Enter Unit price of product
     //  5.5
     //  Do you have card? sress <Y>es or <N>o button
     //          y
     //  Diccount % 20: 52.800000000000004 $  is enough

        //  //**** Task 9 *****//
       // able to divide by 9 and divide by 10 reminder is 5

     //  //**** Task 16 *****//
      //  Please enter first number
      //  5
      //  Please enter second number
      //  6
      //  Please enter third number
      //  10
      //  Max No: n3=10  Min No:n1=  5


    }





}
