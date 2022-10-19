package BENIM_DOSYALAR.J18_Constructor;

public class C02_Arac {

    // field
    String marka;
    String model;
    int km;
    double motorHcm;
    boolean vitesAuto= false;
    boolean ikinciEl;
    int yil;
    String renk;


    @Override
    public String toString() {
        return "C02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHcm=" + motorHcm +
                ", vitesAuto=" + vitesAuto +
                ", ikinciEl=" + ikinciEl +
                ", yil=" + yil +
                ", renk='" + renk + '\'' +
                '}';
    }

    public static void main(String[] args) {
C02_Arac arac1 = new C02_Arac();//defaul cons ile arac1  obj create edildi
arac1.ikinciEl=true;
arac1.marka = "volvo";
arac1.km =50000;
arac1.model = "xc60";
arac1.motorHcm=2.4;

                    // volvo            xc60           2,4                50000        default0             true
System.out.println(arac1.marka+" "+arac1.model+" "+arac1.motorHcm+" "+arac1.km+" "+arac1.yil+   "       "+arac1.ikinciEl );

// Task -> ikinci bir aracin tum fielslarini arayarak  create edinis
        C02_Arac arac2 = new C02_Arac();

        arac2.ikinciEl=false;
        arac2.marka = "mercedes";
        arac2.km =0;
        arac2.model = "D60";
        arac2.motorHcm=2.4;
        arac2.yil=2022;
        arac2.renk="Beyaz";
        System.out.println(arac2.marka+" "+ arac2.km+" "+ arac2.yil+ " "+ arac2.ikinciEl+ "  "+ arac2.renk+ " "+ arac2.model+" "+ arac2.motorHcm );
        System.out.println(arac2);//C02_Arac{marka='mercedes', model='D60', km=0, motorHcm=2.4, vitesAuto=false, ikinciEl=false, yil=2022, renk='Beyaz'}


    }
}
