package BENIM_DOSYALAR.J26Inheritance.Inheritance02;

public class Mammal extends Hayvancik {

    public Mammal() {// p'siz cons
        this('Y');// bu klassin p'li cons call edildi
        System.out.println(" Agam ahanda MAMAL p'siz cons..");
    }
    public Mammal(char c) {// p'li cons
      super(17);// parenten p'li cons call edildi
        System.out.println(" Agam ahanda MAMAL p'li cons..");
    }
    public void mC() {// ezilen metod

        System.out.println("mC - Mammal class danmetod call..");
    }
    int m =1;
    int c=4;

    @Override
    public void mM() {// ezen metod yani parentten
        System.out.println("mM - Mammal class danmetod call..");
    }
}// class sonu
