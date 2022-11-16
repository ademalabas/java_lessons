package BENIM_DOSYALAR.j10_StringManipulations.task.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

//"Alamanya" Stringindeki ikinci 'Test01' caharacterinin indexini bulunuz.

String str ="Alamanya";
        // str.indexof 'Test01' ilk anin indexini verir
        System.out.println(str.indexOf('a', str.indexOf('a')+1));//4

        // str.indexOf('Test01')-> ilk Test01'nın index'ini verir
        System.out.println(str.indexOf('a', str.indexOf('a') + 1));



    }


}

