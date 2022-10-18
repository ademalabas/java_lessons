package Code_Challange.Days09;

import java.util.Scanner;

public class Q03_Arrays {
    public static void main(String[] args) {
//Kullanicidan bir cumle isteyin ve kelime sayisini yazdirin.
        // bosluktan bol


                Scanner sc = new Scanner(System.in);
                System.out.println("Lutfen bir cumle tanimlayiniz");
                String a = sc.nextLine();
                String arr[] = a.split(" ");
                System.out.println(arr.length);


    }
}
