package BENIM_DOSYALAR.J18_Constructor.Hoca;

public class C04_TeacherHoca {//ogtremen obj ureten kalıphane Class
    String ad;
    String soyad;
    String branş;
    int tecrube;
    double maaş;
    int id;
    boolean emekli;

    public  void  dersSaati(){

        System.out.println( " agam haftada 20 saatten sonra extraya girer :)");
    }

    public C04_TeacherHoca() {//p'lini ezdiği dafult cons yerine p'siz cons. cerate edidli
    }

    //king of Trick-> p'li cons default cons ezer.
    public C04_TeacherHoca(String ad, String soyad, String branş, int tecrube, double maaş, int id, boolean emekli) {//pLİ cons
        this.ad = ad;
        this.soyad = soyad;
        this.branş = branş;
        this.tecrube = tecrube;
        this.maaş = maaş;
        this.id = id;
        this.emekli = emekli;
    }

    @Override
    public String toString() {
        return "C04_Teacher{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", branş='" + branş + '\'' +
                ", tecrube=" + tecrube +
                ", maaş=" + maaş +
                ", id=" + id +
                ", emekli=" + emekli +
                '}';
    }



    }





