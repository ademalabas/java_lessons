package BENIM_DOSYALAR.j09_SwitchStatement.TASK.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter POZITIF number= ");
        int number = sc.nextInt();
        switch ((number/10)%10) {
            case 0:
                System.out.println(" TENS VALUE OF Number you entered is ZERO");
                break;
            case 1:
                System.out.println(" TENS VALUE OF Number you entered is ONE");
                break;
            case 2:
                System.out.println("TENS VALUE OF Number you entered is TWO");
                break;
            case 3:
                System.out.println("TENS VALUE OF Number you entered is THREE.");
                break;
            case 4:
                System.out.println("TENS VALUE OF Number you entered is FOUR");
                break;
            case 5:
                System.out.println("TENS VALUE OF Number you entered is FIVE");
                break;
            case 6:
                System.out.println("TENS VALUE OF Number you entered is SIX");
                break;
            case 7:
                System.out.println("TENS VALUE OF Number you entered is SEVEN");
                break;
            case 8:
                System.out.println("TENS VALUE OF Number you entered is EIGHT");
                break;
            case 9:
                System.out.println("TENS VALUE OF Number you entered is NINE");
                break;

            default:
                System.out.println(" Number you entered is Negatif");
                break;
        }

/*
        public static void main(String[] args) {
            // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

            Scanner sc = new Scanner(System.in);

            System.out.print("Bir sayı giriniz:");
            int sayi = sc.nextInt();

            switch ((sayi / 10) % 10) {
                case 0:
                    System.out.println("Girdiğiniz sayının onlar basamağı \"SIFIR\" dır.");
                    break;
                case 1:
                case -1:
                    System.out.println("Girdiğiniz sayının onlar basamağı \"BİR\" dir.");
                    break;
                case 2:
                case -2:
                    System.out.println("Girdiğiniz sayının onlar basamağı \"İKİ\" dir.");
                    break;
                case 3:
                case-3:
                    System.out.println("Girdiğiniz sayının onlar basamağı \"ÜÇ\" tür.");
                    break;
                case 4:
                case-4:
                    System.out.println("Girdiğiniz sayının onlar basamağı \"DÖRT\" tür.");
                    break;
                case 5:
                case -5:
                    System.out.println("Girdiğiniz sayının onlar basamağı \"BEŞ\" dir.");
                    break;
                case 6:
                case -6:
                    System.out.println("Girdiğiniz sayının onlar basamağı \"ALTI\" dır.");
                    break;
                case 7:
                case -7:
                    System.out.println("Girdiğiniz sayının onlar basamağı \"YEDİ\" dir.");
                    break;
                case 8:
                case -8:
                    System.out.println("Girdiğiniz sayının onlar basamağı \"SEKİZ\" dir.");// "SEKİZ"
                    break;
                case 9:
                case -9:
                    System.out.println("Girdiğiniz sayının onlar basamağı \"DOKUZ\" dur.");
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız.");
*/




    }
}
