package BENIM_DOSYALAR.J11_MethodCreation;

public class C04_MethodDepo { // remork
    // Main metod olmayacak
    //main method-> motor olmayacak -> malzeme taşıyon romörk

    /*
    her class'da main method mecburiyeti yoktur. belilrli aksiyonlara özel class'lar tanımlanabilir..
     */

    public static void gecmeNotu(int not) {
        if (not >= 85) {
            System.out.println(" Agam tebrikler gayet basarili");

        } else if (not >= 70) {
            System.out.println(" Agam  basarili");
        } else if (not >= 60) {
            System.out.println(" Agam sadece gectin");
        } else if (not >= 45) {
            System.out.println(" Agam ucuz yirttin");
        } else System.out.println(" Agam fena caktin");

    }
    public static void topla (int a, int b) {
        System.out.println(a + b);

    }


    }

