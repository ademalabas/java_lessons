package BENIM_DOSYALAR.J26Inheritance.Inheritance02;
import BENIM_DOSYALAR.J26Inheritance.Inheritance01.Koyun;
import BENIM_DOSYALAR.J26Inheritance.Inheritance01.Paluk;
public class Runner {

    public static void main(String[] args) {

       // data type        obje          constructure
       Kedi                 k1 =         new Kedi();
        System.out.println("k1.a = " + k1.a);// hayvancik
        System.out.println("k1.c = " + k1.c);// kedi
        System.out.println("k1.d = " + k1.d);// kedi
        System.out.println("k1.m = " + k1.m);// mammal



/*
  Ayni isimli variable'lardan hangisinin kullanildi
olusturulan object'in data type'ina göre bilinir
Variable'i arastirmaya data type'i classindan baslanır.
*/

        k1.mA();// hayvanxcik klass dan call edilir
        k1.mC();// kedi class dan
        k1.mM();// mammal class call edecek


          /*
 Method cagirilirken ayni isimli methodlardan
 hangisinin kullanilacagina Constructor karar verir.
 Methodlari arastirmaya Consctuctor ismini tasiyan
 class'dan baslayin ve parentlarda arastirmaya devam edin.
 */
        System.out.println("********************************");
        Mammal k2 =new Kedi("Kevser");
        System.out.println("k2.c = " + k2.c);// DatatYPE mAMMAL cONS p'LI kEDI
        System.out.println("k2.a = " + k2.a);//// DatatYPE mAMMAL cONS p'LI kEDI
        System.out.println("k2.m = " + k2.m);//
     // k2.d ->  CTE verir  obje dt Mammalclass  d variable call edilemez
        k2.mA();//hayvancik
        k2.mC();//kedi
        k2.mM();//mammal


        Hayvancik  k3 =new Kedi();
     System.out.println("k3.m = " + k3.m);//
     System.out.println("k3.a = " + k3.a);//
     // k3.c -> dt hayvancik class oldugu icin c var call edilemez
   k3.mA();
   k3.mM();

     Mammal  m1 =new Mammal('$');
     System.out.println("m1.m = " + m1.m);//1
     System.out.println("m1.a = " + m1.a);//0
     System.out.println("m1.c = " + m1.c);//4
     // m1.d -> parent mammal child kediden  variable call edemezsiniz
   m1.mA();// hayvancik class
   m1.mM();// mammal
   m1.mC();// mamal

    }



}
