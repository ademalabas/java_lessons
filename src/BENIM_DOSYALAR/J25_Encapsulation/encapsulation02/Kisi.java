package BENIM_DOSYALAR.J25_Encapsulation.encapsulation02;

public class Kisi {
    /*
    kisi pojo class icin field ad, soyad, password(String), yas,
    tum fieldlari kullanici gorebilmeli  ve password haric update edebilmeli
    (password encapsulated update edilmemeli)
    yas variable negatif deger girilmege karsi encapsulated
    runner class'da obj ile fieldlari print eden code create ediniz
     */

    //fields...
    String ad;
    String soyad;
    private int yas;
    private String password;

    public Kisi(String ad, String soyad, int yas, String password) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.password = password;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas<0) {
            this.yas=yas*(-1);

        } else this.yas=yas;
        //this.yas = Math.abs(yas);//parametre gelen yas - den kurtularak ins. var atandı
    }

    public String getPassword() {
        return password;
    }


}





