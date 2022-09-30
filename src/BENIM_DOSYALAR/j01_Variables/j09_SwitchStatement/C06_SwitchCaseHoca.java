package BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement;


import java.util.Scanner;

public class C06_SwitchCaseHoca {
    public static void main(String[] args) {
        // BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK-> Girilen haftanın gününü hafta içi veya sonu oldugunu print eden code create ediniz..


        Scanner sc = new Scanner(System.in);
        System.out.print("gun giriniz : ");

        String gun = sc.next().toLowerCase();//PazAR girilse bile girilen karakterler kucuk harfe atanır


        switch(gun) {

            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("girilen gün hafta içine aittir ... ");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("girilen gün hafta sonuna aittir ... ");
                break;

            default:
                System.out.println("lütfen doğru giriş yapınız :( ");

        }


    }
}