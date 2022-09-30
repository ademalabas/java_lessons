package BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement;


import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
        /*
Girilen Haftanin gununu hafta ici veya hafta sonu oldugunu print eden code create ediniz
 */






        Scanner scan = new Scanner (System.in);
        System.out.println("Enter day");
        String day = scan.next().toLowerCase();
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("You entered weekday. ");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("You entered Weekend  . ");
                break;
            default:
                System.out.println("You entered wrong day : ");
                break;
        }


    }
}