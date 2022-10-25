package Haluk_Bey_Notlar.src.src.j18_Constructor;

public class C02_Arac {
    //Fields
    String marka;
    String model;
    int km = 10;
    double motorHcm;
    boolean vitesAuto = false;
     boolean ikinciEl;
    int yıl;


    public static void main(String[] args) {


        C02_Arac arac1 = new C02_Arac();//default cons ile arac1 obj create edildi
        arac1.ikinciEl = true;
        arac1.marka = "volvo";
        arac1.km = 50000;
        arac1.model = "xc60";
        arac1.motorHcm = 2.4;
        //                   volvo            xc60             50000       default=0       true               2.4
        System.out.println(arac1.marka + " " + arac1.model + " " + arac1.km + " " + arac1.yıl + " " + arac1.ikinciEl + " " + arac1.motorHcm);//

        //task -> 2. bir aracın tum field'larını atayarak print ediniz
        C02_Arac myCar = new C02_Arac();//default cons ile arac1 obj create edildi
        myCar.ikinciEl = false;
        myCar.marka = "honda";
        myCar.km = 11;
        myCar.model = "accord";
        myCar.motorHcm = 2.0;
        myCar.vitesAuto = true;
        myCar.yıl = 2022;
        System.out.println(myCar.marka + " " + myCar.model + " " + myCar.km + " km " + myCar.yıl + " " + myCar.ikinciEl + " " + myCar.motorHcm + " cc " + myCar.vitesAuto);//
        System.out.println("myCar = " + myCar);//myCar = j18_Constructor.C02_Arac@396a51ab

    }//maın dısı

    // @Override
    // public String toString() {//tum obj field print edilir
    //     return "C02_Arac{" +
    //             "marka='" + marka + '\'' +
    //             ", model='" + model + '\'' +
    //             ", km=" + km +
    //             ", motorHcm=" + motorHcm +
    //             ", vitesAuto=" + vitesAuto +
    //             ", ikinciEl=" + ikinciEl +
    //             ", yıl=" + yıl +
    //             '}';
    // }


    @Override
    public String toString() {
        return "C02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", motorHcm=" + motorHcm +
                ", vitesAuto=" + vitesAuto +
                ", yıl=" + yıl +
                '}';
    }
}
