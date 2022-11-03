package BENIM_DOSYALAR.J26Inheritance.Inheritance01;

public class Kedi extends Mammal {// Mammal parent class childi // torun
/*
Child class obj olmadan parent class variable ve methodlara ulasabilir
 */

    public Kedi() {
        System.out.println(" Agam ahanda Kedi p'siz cons..");


    }

    public void cirmalar() {

        System.out.println("Kedi fena cirmalar miyavlar...");
    }


}
