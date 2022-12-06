package Haluk_Bey_Notlar.src.src.j36_Map;

public class Task02_Kartvizit {//pojo->obj uretecek

   String isim;
   String email;
   String adres;
   String telefon;
   int id=100;

    public Task02_Kartvizit(String isim, String email, String adres, String telefon) {
        this.isim = isim;
        this.email = email;
        this.adres = adres;
        this.telefon = telefon;
        this.id++;
    }

    @Override
    public String toString() {
        return
                "isim='" + isim + '\'' +
                ", email='" + email + '\'' +
                ", adres='" + adres + '\'' +
                ", telefon='" + telefon + '\'' ;
    }
}
