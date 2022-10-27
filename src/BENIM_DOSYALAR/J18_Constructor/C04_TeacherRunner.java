package BENIM_DOSYALAR.J18_Constructor;

public class C04_TeacherRunner {



    public static void main(String[] args) {
      C04_Teacher ogrt = new C04_Teacher();

ogrt.ad="Muharrem";
ogrt.soyad="Guzel";
ogrt.brans="QA";
ogrt.emeklimi=false;
ogrt.maas=230000;
ogrt.tecrube=11;

C04_Teacher ogrt2 = new C04_Teacher("Adem","Alabas","QA",70000,false,22,1234567
);
    }


}
