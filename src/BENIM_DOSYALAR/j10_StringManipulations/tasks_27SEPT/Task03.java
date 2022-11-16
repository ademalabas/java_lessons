package BENIM_DOSYALAR.j10_StringManipulations.tasks_27SEPT;

public class Task03 {
    public static void main(String[] args) {
        //"Alamanya" Stringindeki ikinci 'Test01' caharacterinin indexini bulunuz.

        String str = "Alamanya";

       // str.indexOf('Test01')-> ilk Test01'nın index'ini verir
        System.out.println(str.indexOf('a', str.indexOf('a') + 1));

    }
}
