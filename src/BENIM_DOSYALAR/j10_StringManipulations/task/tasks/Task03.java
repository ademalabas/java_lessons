package BENIM_DOSYALAR.j10_StringManipulations.task.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

//"Alamanya" Stringindeki ikinci 'a' caharacterinin indexini bulunuz.

String str ="Alamanya";
        // str.indexof 'a' ilk anin indexini verir
        System.out.println(str.indexOf('a', str.indexOf('a')+1));//4

        // str.indexOf('a')-> ilk a'nın index'ini verir
        System.out.println(str.indexOf('a', str.indexOf('a') + 1));



    }


}

