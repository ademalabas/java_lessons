package BENIM_DOSYALAR.J22_DateTime.QuestionOfTheWeek;

import java.time.LocalDateTime;
// task 1. step
public class Kullanici {//kullanici obje uretecek kaliphane -. main olmaz
    String name;// obj deger alacak instant var
    LocalDateTime kayitZamani;// obj deger alacak instant var

    public Kullanici(String name, LocalDateTime kayitZamani)
    {//full parametreli constor
        this.name = name;
        this.kayitZamani = kayitZamani;


    }


    @Override
    public String toString() {
        return "\nKullanici{" +
                "name='" + name + '\'' +
                ", kayitZamani=" + kayitZamani +
                '}';
    }
}
