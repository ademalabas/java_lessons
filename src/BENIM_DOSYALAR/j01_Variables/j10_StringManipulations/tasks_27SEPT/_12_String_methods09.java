package BENIM_DOSYALAR.j01_Variables.j10_StringManipulations.tasks_27SEPT;

public class _12_String_methods09 {

    public static void main(String[] args) {

        /*  apple kelimesinden  oluşan bir String yaz.
            String'in içinde App olup olmadığını doğrula.  */

        //Kodu buraya yazınız.

        String h ="apple";
        System.out.println(h.contains("App"));//false
        System.out.println(h.substring(0,3)== ("App"));//false
        System.out.println(h.substring(0,3).equals("App"));//false

    }
}
