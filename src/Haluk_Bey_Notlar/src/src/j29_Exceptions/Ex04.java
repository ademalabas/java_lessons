package Haluk_Bey_Notlar.src.src.j29_Exceptions;

public class Ex04 {
    public static void main(String[] args) {
        // Aşağıdaki code output ne olur ?

        Object obj = new Integer(3);
        String str = (String) obj;
        System.out.println(str);//ClassCastException
        
    }
}
