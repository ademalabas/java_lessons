package BENIM_DOSYALAR.J18_Constructor;

public class C03_StudentRunner {

    public static void main(String[] args) {

        C03_Student ogrenci1 = new C03_Student();
        ogrenci1.ad="Adem";
        ogrenci1.soyad="Alabas";
        ogrenci1.sinif= 12;
        ogrenci1.ortalama= 85;
        ogrenci1.takdirl= true;
        ogrenci1.okulNo= 4004;
        System.out.println(ogrenci1);
        System.out.println("ogrenci1 = " + ogrenci1);//ogrenci1 = C03_Student{ad='Adem', soyad='Alabas', sinif=12, ortalama=85.0, takdirl=true, okulNo=4004}
ogrenci1.mezuniyet();
    }
}
