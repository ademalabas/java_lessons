package BENIM_DOSYALAR.J18_Constructor;

public class C05_Arac {
    // fieldm objenin uretilirken alacagi degerler
    // bir class da birden cok constructor tanimlanabilir

   /*   1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
Aksi takdirde Compile Time Error alirsiniz.
        2) Bir Constructor icinden sadece bir tane Constructor cagirisi yapabilirsiniz.Cunku iki tane cagri yaprsaz
birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
        */


    int maxHiz;
    String model;

    public C05_Arac() {// sefil parametresiz constructor
    }

    public C05_Arac(int maxHiz) {// tekli constructor
        this(180,"hacıMurat");//2 p'li cons. call edildi..ilk satıra yazılmalı
        // yoksa cte verir

        // maxHız = maxHız;// this olmadıgı için prmtre değeri inst.
        // variable atanmaz obj maxHız değeri inst. variabledeki default değeri alır
        this.maxHiz = maxHiz;//->this keyword parmetre değeri inst. variable atama yapar
        //obj maxHız değeri parmetrden alır
        System.out.println("agam bu sefer de 1p'li cons. call edilidi");
    }

    public C05_Arac(int maxHiz, String model) {// 2 li constructor
        this.maxHiz = maxHiz;
        this.model = model;
        System.out.println("Agam bu yaziyi okuduysan 2 li cons call edilmistir ");
    }

    public C05_Arac(String model, int maxHiz) {// 2 li constructor parametre sirasi farkli
        this.maxHiz = maxHiz;
        this.model = model;
        System.out.println("Agam bu yaziyi okuduysan 2 li cons call edilmistir ");


    }
}
