package BENIM_DOSYALAR.J18_Constructor;

public class MyConstructor {
    int x=3;
    int y=5;
    public MyConstructor() {
        x+=1;//ins variable +1 update edildi
        System.out.println("-x"+x);
    }
    public MyConstructor(int i ){
        this();//p'siz cons call edildi
        this.y = i;//conc. parametresi i değeri inst. variable y'ye atandı
        x+=y;//inst. y değeri inst. x değerine atandı
        System.out.println("-x"+x);
    }
    public MyConstructor(int i, int i2) {
        this(3);//int p'li cons.  parametre 3 atanarak call edildi
        this.x -= 4;//inst. x variable -4  uodate edildi
        System.out.println("-x"+x);
    }
    public static void main(String[] args) {
        MyConstructor mc1= new MyConstructor(4,3);//2 int parametre 4 ve 3 atanarak cons. call edildi
    }
}
/*
public class MyConstructor {
    int x=3;
    int y=5;

    public MyConstructor() {//7->burasi calisti
        x+=1;//8-> x degeri 3 den 4 yapildi
        System.out.println("-x"+x);//9-> x degerini print etti ciktimiz "-x4" oldu
    }
    public MyConstructor(int i ){//5-> burasi calisti
        this();//6-> burasi calisti ve bizi parametresiz cons Test01 gecirdi.
        this.y = i;//10-> parametresizade islem bitince burdan parametresize atladigi icin sira buraya geldi
        //ve y degerini i ye esitledi 4. sirada i degerimiz 3 olarak tek parametreli kodumuzu calistirdigi icin y=3 oldu.
        x+=y;//11-> x degerine atama operatoru ile ynin degeri olan 3 ekledi ve x 7 oldu
        System.out.println("-x"+x);//12-> x imiz 7 oldugu icin "-x7" printini elde ettik

    }
    public MyConstructor(int i, int i2) {//3-> burasi calisti
        this(3);//4-> sonra burayi calistirdi tek parametreli consa gecirdi burasi bizi assagisi calismadan
        this.x -= 4;//13-> buraya geldi ve x degerinden atama operatoru ile 4 cikardi ve x degerimiz x degerimiz son degeri 7idi simdi 3 kaldi
        System.out.println("-x"+x);//14->x degerimizi print etti ve x degerimiz 3 oldugu icin ciktimiz "-x3" printi elde ettik.
    }

    public static void main(String[] args) {// 1-> static variable burda oldugu icin ilk once burdan mainden calismaya basladi
        MyConstructor mc1= new MyConstructor(4,3);// 2-> Burasi calistiktan sonra 2 parametreli cons Test01 gecis yaptik
    }
}

 */