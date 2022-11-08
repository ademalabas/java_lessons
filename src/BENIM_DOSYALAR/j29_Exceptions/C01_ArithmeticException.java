package BENIM_DOSYALAR.j29_Exceptions;

import java.util.Scanner;

public class C01_ArithmeticException {
    public static void main(String[] args) {
        //  ArithmeticException -> Matematiksei işlemlerde oluşan RTE Exception'dur
        String str = "";
        // str.charAt(2);//RTE->StringIndexOutOfBoundsException
        Scanner sc = new Scanner(System.in);

        System.out.print("agam 1. sayı giresen : ");
        int sayi1 = sc.nextInt();

        System.out.print("agam 2. sayı giresen : ");
        int sayi2 = sc.nextInt();

        int oran;//RTE -> ArithmeticException/ by zero

        try {//dene-> hatanın olma ihitmali oldugu code block
            /*
            1- try-catch kullanıldıgında try block hatasız çalışırsa catch block asla çalışmazçcatch block try block exception hat yakalarsa calışır
            2- try block catch veya finally block olmadan CTE verir. try block'tan sonra birden fazla catch block tanımlanabilir.
               aynıa anda  sadece bir catch block çalışabilir hiç bir catch block çalışmaya da bilir

             */
            oran = sayi1 / sayi2;

            System.out.println(oran);
            System.out.println("agam try block'tan selamlar :) ");

        } catch (Exception ebikGabık) {//Exception Class tum exceptionlarınHz Ademi parent class->bad practice
            // hata yakalndıgında yapılacak aksiyonların oldugu block
            System.out.println("agam nişledingg 0 hiç böler mi :( ");
            System.out.println("agam catck block'tan selamlar :) ");
        }
        System.out.println("Agam selametle DEWAMKEEE :) ");
    }

}
