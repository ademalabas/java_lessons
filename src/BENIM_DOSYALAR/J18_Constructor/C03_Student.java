package BENIM_DOSYALAR.J18_Constructor;

public class C03_Student {

    String ad;
    String soyad;
    int sinif;
    double ortalama;
    boolean takdirl;
    int okulNo;

    public void mezuniyet() {
        if (ortalama>=50){
            System.out.println("Agam mezuniyetiniz hayirli olsun");
        }else System.out.println("Agam mezuniyetiniz ge3ecikti");
        System.out.println();
    }
public void sosyalfaaliyet(){
    System.out.println("Agam zinde olmak icin spor lutfen");
}

    @Override
    public String toString() {
        return "C03_Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sinif=" + sinif +
                ", ortalama=" + ortalama +
                ", takdirl=" + takdirl +
                ", okulNo=" + okulNo +
                '}';
    }

    public static void main(String[] args) {






    }
}
