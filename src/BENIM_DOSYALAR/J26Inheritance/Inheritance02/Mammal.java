package BENIM_DOSYALAR.J26Inheritance.Inheritance02;

public class Mammal extends Hayvancik {

    public Mammal() {// p'siz cons
        this('Y');
        System.out.println(" Agam ahanda MAMAL p'siz cons..");


    }

    public Mammal(char c) {// p'li cons
      super(17);
        System.out.println(" Agam ahanda MAMAL p'siz cons..");


    }

    public void mC() {// ezilen metod

        System.out.println("mC - Mammal class danmetod call..");
    }
    int m =1;
    int c=4;

    @Override
    public void mM() {// ezen metod yani parentten
        System.out.println("mC - Mammal class danmetod call..");
    }
}// class sonu
