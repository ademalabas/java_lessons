package BENIM_DOSYALAR.j01_Variables.j08_IfStatement_Ternary_Operators.TASK.tasks;

import java.util.Scanner;

public class If_homework_19Sept {
    public static void main(String[] args) {

       //******* task 1 ********//
        int first = 35;
        int second = 23;
        if (first > second) {
            System.out.println("int first is greater than second");
        } else {
            System.out.println("int first is smaller than second");
        }
        //******* task 2 ********//

        int birinci = 26;
        int ikinci = 35;
        if (birinci > ikinci) {
            System.out.println("int 1 is greater than 2");
        } else {
            System.out.println("int 1 is smaller than 2");
        }
       //******* task 3 ********//
        String str1 ="Adem";
        String str2 = "Alabas";
        if (str1 == str2) {
            System.out.println("String 1 is equal to String 2");
        }else {
            System.out.println("String 1 is NOT equal to String 2");
        }
       //******* task 4 ********//
        double db1 = 12.5;
        double db2 = -3.5;

        if (db1 > db2) {
            System.out.println("double 1 is greater than double 2");

        } else if (db1 < db2) {
            System.out.println("double 1 is smaller than double 2");
        }
       //******* task 5 ********//
        double dbl1 = 90.25;
        double dbl2 = 90.25;

        if (dbl1 > dbl2) {
            System.out.println("Hello, world!");
        } else if (dbl1 < dbl2) {
            System.out.println("Not Hello, world!");
        } else {
            System.out.println("I love you!");
        }
       //******* task 6 ********//
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any number");
        int number = scan.nextInt();

        if (number == 0) {
            System.out.println("Im neutral");
        } else if (number > 0) {
            System.out.println("I m positive");
        } else {
            System.out.println("I am negative");
        }
       //******* task 7 ********//
        Scanner sc = new Scanner(System.in);
        int numberx = sc.nextInt();

        if (numberx % 2== 0 ) {
            System.out.println("number is a EVEN number");
        } else  {
            System.out.println("number is a ODD number");
        }
       //******* task 8 ********//
        int numa =33;

        if (numa %4==3) {
            System.out.println("Remainder is 3");
        } else if (numa %4==2) {
            System.out.println("Remainder is 2");
        }else if (numa %4==1) {
            System.out.println("Remainder is 1");
        } else {
            System.out.println("Remainder is 0");
        }
       //******* task 10 ********//
        int xy = 60;
        if ((xy % 9 == 0) && (xy % 5 == 0)) {
            System.out.println("Able to divide by 9 and 5");

        } else if ((xy % 4 == 0) && (xy % 5 == 0)) {
            System.out.println("Able to divide by 4 and 15");
        }
       //******* task 16 ********//
        double dbl = 45;
        if ((dbl % 5 == 0) && (dbl % 8 == 0)) {
            System.out.println("Able to divide by 5 and 8");

        } else if ((dbl % 10 == 5) && (dbl % 9 == 0)) {
            System.out.println("Able to divide by 9 and divide by 10 remainder is 5");
        }
       //******* task 17 ********//
        Scanner scan1 = new Scanner(System.in);
        System.out.println("please enter any number");
        int i1 = scan1.nextInt();
        System.out.println("please enter any number");
        int i2 = scan1.nextInt();
        System.out.println("please enter any number");
        int i3 = scan1.nextInt();

        if (i1>i2 && i2>i3){
            System.out.println("Maksimum sayi: "+ i1);
        } else if (i1>i3 && i3>i2){
            System.out.println("Maksimum sayi: "+ i1);
        } else if (i2>i1 && i1>i3){
            System.out.println("Maksimum sayi: "+ i2);
        }else if (i2>i3 && i3>i1){
            System.out.println("Maksimum sayi: "+ i2);
        }else if (i3>i2 && i2>i1){
            System.out.println("Maksimum sayi: "+ i3);
        }else if (i3>i1 && i1>i2){
            System.out.println("Maksimum sayi: "+ i3);
        }
        //******* task 18 ********//
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter any number");
        int mn1 = scanner.nextInt();
        System.out.println("please enter any number");
        int mn2 = scanner.nextInt();
        System.out.println("please enter any number");
        int mn3 = scanner.nextInt();

        if (mn1>mn2 && mn2>mn3){
            System.out.println("Minimum sayi: "+ mn3);
        } else if (mn1>mn3 && mn3>mn2){
            System.out.println("Minimum sayi: "+ mn2);
        } else if (mn2>mn1 && mn1>mn3){
            System.out.println("Minimum sayi: "+ mn3);
        }else if (mn2>mn3 && mn3>mn1){
            System.out.println("Minimum sayi: "+ mn1);
        }else if (mn3>mn2 && mn2>mn1){
            System.out.println("Minimum sayi: "+ mn1);
        }else if (mn3>mn1 && mn1>mn2){
            System.out.println("Minimum sayi: "+ mn2);
        }
        //******* task 20 ********//
        Scanner scan2 = new Scanner(System.in);
        System.out.println("enter your Speed");
        int sppedticket =0;
        int currentSpeed = scan2.nextInt();
        System.out.println("Do you have Driving Licence?");
        boolean isDriverLicenceAvailable = scan2.nextBoolean();

        if (currentSpeed > 94) sppedticket = 500;
        else if (currentSpeed >= 85) sppedticket = 320;
        else if (currentSpeed >= 75) sppedticket = 150;
        else if (currentSpeed >= 55) sppedticket = 100;
        if (isDriverLicenceAvailable == false) sppedticket += 200;
        System.out.println("Your Traffic bill = " + sppedticket+"$");

    }
}
