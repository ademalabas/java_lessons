package BENIM_DOSYALAR.j09_SwitchStatement;


import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {
        // Girilen ay sirasina gore kac gun cektigini print eden code create ediniz....

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen  bir ay giriniz");
        int ayNo = scan.nextInt();
        switch (ayNo) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(" Girdiginiz ay 31 gun ceker.");break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(" Girdiginiz ay 30 gun ceker.");break;
            case 2:
                System.out.println("yilinizi giriniz");
                int yil = scan.nextInt();
                if (yil%4==0){
                    System.out.println(" Girdiginiz ay 28 gun ceker.");
                }else
                    System.out.println(" Girdiginiz ay 29 gun ceker."); break;



            default:  System.out.println(" Girdiginiz ay takvimde yoktur");break;
        }
    }

}
