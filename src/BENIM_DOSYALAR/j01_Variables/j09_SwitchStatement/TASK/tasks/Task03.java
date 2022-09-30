package BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Girilen  gün sayısına karşılık gelen günün  adını print eden code create ediniz
        // 1.gün Pazartesi alınız

        Scanner oku = new Scanner(System.in);
        System.out.print("gunNo = ");
        int gunNo = oku.nextInt();
        int gun = gunNo % 7;

        switch (gun) {
            case 1:
                System.out.printf("pazartesi");break;
            case 2:
                System.out.printf("salı");break;
            case 3:
                System.out.printf("çarşamba");break;
            case 4:
                System.out.printf("perşembe");break;
            case 5:
                System.out.printf("cuma");break;
            case 6:
                System.out.printf("cumartesi");break;
            case 7:
                System.out.printf("pazar");break;
            default:
                System.out.println("hatalı giriş");
                break;

        }
    }
}
