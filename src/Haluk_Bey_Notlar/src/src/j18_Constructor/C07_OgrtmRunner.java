package Haluk_Bey_Notlar.src.src.j18_Constructor;

public class C07_OgrtmRunner {
    public static void main(String[] args) {
        C07_Ogrtm hcm=new C07_Ogrtm("SevdeNur Öğretmenim :)",11);
        System.out.println("hcm.isim = " + hcm.isim);//
        System.out.println("hcm.kıdem = " + hcm.kıdem);//
        hcm.kıdemHesapla(13);//
    }
}
