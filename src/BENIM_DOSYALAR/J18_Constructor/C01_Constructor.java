package BENIM_DOSYALAR.J18_Constructor;

public class C01_Constructor {
    /*
   1- Constructor ismi class name ile ay ni olmali yani buyuk harf ile baslamali
   2->constructor create edildiginde name den sonra () {} mutlaka kullanilmali
   3-> eger parametreli cons. create edildiginge java default cons ezer siler
   4-> cons return type olmaz metod den ayiran ozelligidor
   5-> Class olustugunda java defoault cons kendi create eder
    */
    String str ;
    String selam="guzel insan";


    // C01_Constructor obj1 =new C01_Constructor();
    public static void main(String[] args) {
// call name    obj name   new keyword   default cons.
        C01_Constructor   obj1      =new       C01_Constructor();
        C01_Constructor   obj2      =new       C01_Constructor();
        C01_Constructor   obj3      =new        C01_Constructor();
        C01_Constructor  obj4      =new        C01_Constructor();


        obj1.str="javacan";
        obj2.str="javatar'";
        obj4.selam="Nasilsiniz";
        System.out.println(obj1.selam);// guzel insan
        System.out.println("obj1.str = " + obj1.str);//javacan
        System.out.println("obj2.str = " + obj2.str);//javatar
        System.out.println("obj4.str = " + obj4.selam);//null

obj3.aga();/// Agaya Selaamke
obj2.aga();/// Agaya Selaamke
    }
    public static void aga(){
        System.out.println("Agaya selamkeee :)");
    }


}
/*
public class C01_Constructor {
    /*
    1- consturctor ismi Calss bame ile aynı olmalı.Buyuk harf ile başlamalı
    2- constructor creta eedildigğinde name den sonra () {} mutlaka kullanılmalı
    3- eger p'li cons. create edildiğinde java default cons ezer(siler)
    4- cons. return type olmaz method'dan ayıran özelliğidir.
    5-Class oluştugunsa java default cons. kendi create eder.


        String str;  // inst variable-> obj variable
        String selam = "güzel insan";
        ​
        // C01_Constructor obj1 = new C01_Constructor();
        ​
public static void main(String[] args) {
        //   clas name      obje name    new keyword   default cons.
        C01_Constructor obj1 = new C01_Constructor();
        C01_Constructor obj2 = new C01_Constructor();
        C01_Constructor obj3 = new C01_Constructor();
        C01_Constructor obj4 = new C01_Constructor();
        ​
        obj1.str = "javacan";//str ins. variable obj1 ile call edilerek obj1  javacan değeri atandı
        obj2.str = "javatar";//str ins. variable obj2 ile call edilerek obj2 javatar değeri atandı
        System.out.println(obj3.selam);//"güzel insan"
        ​
        System.out.println("obj1.str = " + obj1.str);//obj1.str = javacan
        System.out.println("obj2.str = " + obj2.str);//obj2.str = javatar
        System.out.println("obj4.str = " + obj4.str);//obj4.str = null
        ​
        obj3.aga();//agama selamkeee :)
        obj2.aga();//agama selamkeee :)
        ​
        }// main sonu
public   void aga(){
        System.out.println("agama selamkeee :)");

 */