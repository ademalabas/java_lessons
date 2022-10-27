package BENIM_DOSYALAR.J18_Constructor;

public class C04_Teacher {

    String ad;
    String soyad;
    String brans;
    double maas;
    boolean emeklimi;
    int tecrube;
    int id;

    public void dersSaati(){
        System.out.println("Agam 20 saatten sonra ek derse girer");
    }

    public C04_Teacher() {
    }

    public C04_Teacher(String ad, String soyad, String brans) {
        this.ad = ad;
        this.soyad = soyad;
        this.brans = brans;
    }

    public C04_Teacher(String ad, String soyad, String brans, double maas, boolean emeklimi, int tecrube, int id) {
        this.ad = ad;
        this.soyad = soyad;
        this.brans = brans;
        this.maas = maas;
        this.emeklimi = emeklimi;
        this.tecrube = tecrube;
        this.id = id;
    }

    @Override
    public String toString() {
        return "C04_TeacherHoca{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", brans='" + brans + '\'' +
                ", maas=" + maas +
                ", emeklimi=" + emeklimi +
                ", tecrube=" + tecrube +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {






    }
}
