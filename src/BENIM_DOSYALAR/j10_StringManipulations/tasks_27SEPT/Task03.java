package BENIM_DOSYALAR.j10_StringManipulations.tasks_27SEPT;

public class Task03 {
    public static void main(String[] args) {
        //"Alamanya" Stringindeki ikinci 'a' caharacterinin indexini bulunuz.

        String str = "Alamanya";

       // str.indexOf('a')-> ilk a'nın index'ini verir
        System.out.println(str.indexOf('a', str.indexOf('a') + 1));

    }
}
