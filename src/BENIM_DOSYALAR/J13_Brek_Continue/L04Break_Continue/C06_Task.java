package BENIM_DOSYALAR.J13_Brek_Continue.L04Break_Continue;

import java.util.Scanner;

public class C06_Task {

    public static void main(String[] args) {

        // task -> girilen bir ifadedeki c karakterine kadar Test01 karakter sayısını print eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("AGAm bişeyler cızıkdırasan  :");

        String bişeyler = sc.nextLine();// egik Gabık @ cimey ıl. k om
        int aSayısı = 0;
        for (int i = 0; i < bişeyler.length(); i++) {
            if (bişeyler.charAt(i)=='a'){
                aSayısı++;
            }else if (bişeyler.charAt(i)=='c'){
                break;
            }
            System.out.println("döngüde işleme giren karakterler :"+bişeyler.charAt(i));
        }
        System.out.println("agam cızıktırdıgın bişeylerde Test01 sayısı : "+aSayısı+" tane");



    }

}


     //Test01+=str.charAt(i)=='Test01'? 1:0;
     //        Test01 yı artırmanın ternary yolu
     //        Selamlar Cüneyt bey :D