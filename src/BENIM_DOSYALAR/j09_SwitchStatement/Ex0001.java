package BENIM_DOSYALAR.j09_SwitchStatement;

import java.util.Scanner;

public class Ex0001 {

    public static void main(String[] args) {

        /*
         * Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle
         * baslayan gun isimlerini yazdirin Ornek: ilkHarf=P output = “Pazar, Pazartesi
         * veya Persembe” ilkHarf=S output = “Sali” Buyuk kucuk harf problem olmamasi
         * icin toUpperCase methodunu kullanin
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("gün isimlerinden birinin ilk harfini giriniz : ");
        char gun = scan.next().toUpperCase().charAt(0);
        switch (gun) {
            case 'P':
                System.out.println("Pazar, Pazartesi veya Perşembe");
                break;
            case 'S':
                System.out.println("Sali");
                break;
            case 'Ç':
                System.out.println("Çarşamba");
                break;
            case 'C':
                System.out.println("Cuma, Cumartesi");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız");
                break;


        }


/*
        switch (ayNo){
            case 1, 3, 5, 7, 8, 10, 12 -> {
                System.out.println("31 gündür");
                break;
            }
            case 4, 6, 9, 11 -> {
                System.out.println("30 gündür");
                break;
            }
            case 2 -> {
                System.out.println("yılınızı giriniz");
                int yıl=scan.nextInt();
                if (yıl%4==0){
                    System.out.println("girilen ay 28 gündür");
                }else {
                    System.out.println("girilen ay 29 gündür");
                }
            }

            default->System.out.println("doğru ay girmediniz");



switch (ayNo){
        case 12, 1, 2 -> {
            System.out.println("kış mevsimi");

        }
        case 3,4,5->{
            System.out.println("ilkbahar");
        }
        case 6,7,8->{
            System.out.println("yaz mevsimi");
        }
        case 9,10,11->{
            System.out.println("sonbahar");
        }default -> System.out.println("yanlış bir ay no girdiniz tekrar deneyiniz");
    }

Scanner scan = new Scanner (System.in);
		System.out.println("Bir ay ismi giriniz : ");
		String ay = scan.nextLine().toLowerCase();
		switch (ay) {
		case "ocak":
		case "şubat":
		case "aralık":
			System.out.println("girdiğiniz ay kış mevsimidir . ");
			break;
		case "mart":
		case "nisan":
		case "mayıs":
			System.out.println("girdiğiniz ay ilkbahar mevsimidir");
			break;
		case "haziran":
		case "temmuz":
		case "ağustos":
			System.out.println("girdiğiniz ay yaz mevsimidir");
			break;
		case "eylül":
		case "ekim":
		case"kasım":
			System.out.println("girdiğiniz ay sonbahar mevsimidir");
			break;
		default :
			System.out.println("girdiğiniz ay ay değildir."); break;

		}



*/

    }
}
