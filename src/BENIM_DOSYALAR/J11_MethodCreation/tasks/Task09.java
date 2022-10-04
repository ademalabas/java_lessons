package BENIM_DOSYALAR.J11_MethodCreation.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
    Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */

        System.out.println(howManySecond(3));


    }/// main end

    private static int howManySecond(int h) {
        int min = 60*h;
        int sec =60*min;
        return sec;

    }








}



