package BENIM_DOSYALAR.J26Inheritance.Inheritance02;

public class Kedi extends Mammal {// Mammal parent class childi // torun
/*
Child class obj olmadan parent class variable ve methodlara ulasabilir
 */

    public Kedi() {// p'siz cons'
       super();
        System.out.println(" Agam ahanda Kedi p'siz cons..");


    }

    public Kedi(String str) {// p'li cons'
        this();
        System.out.println(super.c);
        System.out.println(" Agam ahanda Kedi p'siz cons..");


    }

    int c=2;
     int d=5;

    @Override
    public void mC() {// mammal parentten ezen metod
        System.out.println("mC - Kedi class dan metod call..");

    }



}// class sonu
