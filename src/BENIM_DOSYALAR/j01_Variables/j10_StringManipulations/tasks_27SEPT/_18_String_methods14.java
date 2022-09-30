package BENIM_DOSYALAR.j01_Variables.j10_StringManipulations.tasks_27SEPT;

public class _18_String_methods14 {

    public static void main(String[] args) {

        /*  String s1 = "      Clarus  Way          ";
            s1 String'inin önündeki ve arkasındaki boşlukları kaldırın.
            s1 String'ini yazdırın.  */

        //Kodu aşağıya yazınız.

        String s1 ="      Clarus  Way          ";
        System.out.println(s1.length());// 27
        System.out.println(s1.trim());//Clarus  Way
        System.out.println(s1.trim().length());//11

    }
}
