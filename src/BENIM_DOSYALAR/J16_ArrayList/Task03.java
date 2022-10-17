package BENIM_DOSYALAR.J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

// bir listte istenen elemanin varligini control eden code create ediniz

        ArrayList<Integer> listSayi = new ArrayList<>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));

        Scanner scan = new Scanner(System.in);
        System.out.print("Agam Sayi gir : ");
        int ara = scan.nextInt();
        boolean flag = false;
        for (int i = 0; i <listSayi.size(); i++) {
            if (listSayi.get(i) == ara) {
                flag = true;
                System.out.println("Aradigin sayi Mevcut");
                break;
            }
        }
        if (!flag ) {
            System.out.println("Aradigin sayi Yok Maalesef");
        }




    }
}
