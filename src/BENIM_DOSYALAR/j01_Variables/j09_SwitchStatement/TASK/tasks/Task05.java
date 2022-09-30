package BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK.tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/*
		TASK :
		Girilen not değerini aşağıdaki tabloya göre karşılığını print eden code create ediniz.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
		
		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.

		 */

        Scanner scan = new Scanner(System.in);

        System.out.print("Notunuzu giriniz : ");
        int not = scan.nextInt()/10;

        switch (not) {
        case 1:
        case 2:
        case 3:
        case 4:
            System.out.println("Notunuz:\"D\'"); break;
        case 5: System.out.println("Notunuz:\"C\'");break;
        case 6:
        case 7: System.out.println("Notunuz:\"B\'");break;
        case 8:
        case 9:
        case 10: System.out.println("Notunuz:\"A\'");break;
        default:
        System.out.println("hatalı giriş 0 ile 10 arasi bir sayi giriniz");

        }

/*
int not = scan.nextInt() / 10;
        switch (not) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Notunuz : \"D\"");
                break;
            case 5:
                System.out.println("Notunuz : \"C\"");
                break;
            case 6:
            case 7:
                System.out.println("Notunuz : \"B\"");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("Notunuz : \"A\"");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız. 0 ila 100 arasında bir sayı giriniz:");
 */



    }


}
