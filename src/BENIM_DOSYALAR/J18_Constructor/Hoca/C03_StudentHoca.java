package BENIM_DOSYALAR.J18_Constructor.Hoca;

public class C03_StudentHoca {//main olmayan sadece student obj cretae etmek için pojo-> plan old java object : obj için standart class kalıphane
    //fields->
    String ad;
    String soyad;
    int sinif;
    double ortalama;
    int okulNo;
    boolean takdir;

    public void mezuniyet(){//method
        if (ortalama >=50) {
            System.out.println("agam diploman hayırlı nolsun :)");
        }else System.out.println("agam seneye de bekleriz dewamkeee :(");
    }

    @Override
    public String toString() {//obj referans değeri print etmemesi için obj datalarını  stringe ceviren method
        return "{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sınıf=" + sinif +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                '}';
    }
}
