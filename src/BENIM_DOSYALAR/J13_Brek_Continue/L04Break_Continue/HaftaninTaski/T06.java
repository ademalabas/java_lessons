package BENIM_DOSYALAR.J13_Brek_Continue.L04Break_Continue.HaftaninTaski;

import java.util.Arrays;
import java.util.Scanner;

public class T06 {
    public static void main(String[] args) {
        /* TASK :
         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
         */
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        System.out.println("Bir String giriniz");
        String str = scan.nextLine();
        String s = "";
        while (!str.isEmpty()) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(0) == str.charAt(i)) {
                    count++;
                }
            }
            s += str.charAt(0) + "=" + count + " ";
            str = str.replace(str.substring(0, 1), "");
        }
        String[] arrStr = s.split(" ");
        System.out.println(Arrays.toString(arrStr));
      // String str = "Javacilar cook afilli";
      // String arr []= str.toLowerCase().replaceAll(" ","").split("");

      // System.out.println(Arrays.toString(arr));


    }

}
    

