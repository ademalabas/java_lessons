package BENIM_DOSYALAR.j01_Variables.j10_StringManipulations.task.tasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {


/*  TASK :
        Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
                String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */

        String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


        System.out.println("" + pickName.charAt(pickName.indexOf("A"))
                + pickName.charAt(pickName.indexOf("D"))
                + pickName.charAt(pickName.indexOf("E"))
                + pickName.charAt(pickName.indexOf("M")));


        char a = pickName.charAt(pickName.indexOf("A"));
        char d = pickName.charAt(pickName.indexOf("D"));
        char e = pickName.charAt(pickName.indexOf("E"));
        char m = pickName.charAt(pickName.indexOf("M"));
        System.out.println(+a + d + e + m);// ascii degeri ->279
        System.out.println("Adim: " + a + d + e + m);//Strind concat Adem

        Scanner scan = new Scanner(System.in);

        String harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.print("isim gir");
        String isim = scan.next();

        for (int i = 0; i < isim.length(); i++) {
            System.out.print(harfDepo.charAt(harfDepo.indexOf(isim.toUpperCase()
                    .substring(i, i + 1))));
        }



    }


}

