package BENIM_DOSYALAR.J18_Constructor;

public class C05_AracRunner {
    public static void main(String[] args) {

        C05_Arac arc1=new C05_Arac(210);
        C05_Arac arc2=new C05_Arac();
        System.out.println("arc1.maxHız = " + arc1.maxHiz);//210
        System.out.println("arc1.model = " + arc1.model);// hacıMurat
        System.out.println(arc2.maxHiz);



    }

}
