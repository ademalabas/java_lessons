package BENIM_DOSYALAR.j09_SwitchStatement.TASK.tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
		/*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */

        System.out.println("\n\n************ayların gün sayısı********");
        Scanner scan = new Scanner(System.in);
        System.out.println("bir ay ismi yazınız :");
        String ay = scan.next().toLowerCase();

        switch (ay) {
            case "ocak":
            case "mart":
            case "mayıs":
            case "temmuz":
            case "ağustos":
            case "ekim":
            case "aralık":
                System.out.println("31 gün çekiyor");
                break;

            case "nisan":
            case "haziran":
            case "eylül":
            case "kasım":
                System.out.println("30 gün çekiyor");
                break;
            case "subat":
                System.out.println("yılınızı giriniz :");
                int yil = scan.nextInt();
                if (yil % 4 == 0) {
                    System.out.println(" Girdiginiz ay 28 gun ceker.");
                } else
                    System.out.println(" Girdiginiz ay 29 gun ceker.");
                break;

                default:
                    System.out.println("hatalı giriş!!!!");
                    break;


            }

        }

    }
