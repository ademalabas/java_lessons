package BENIM_DOSYALAR.J22_DateTime.QuestionOfTheWeek;

import java.util.ArrayList;
import java.util.Scanner;

public class GirisPanali {
   // public static void giris (){
    public void giris (){

        Scanner scan = new Scanner(System.in);

        Kayit yeniKayıt = new Kayit();// Kayit klasa erisim icin parametresiz obje uretioldi
// kayit klasdan obje olmadan metodlar statik yapilirsa class name ile call edilir
        ArrayList<Kullanici> kisi=new ArrayList<>();//Kullanici Classdan uretilen obj tutulacagi bos liste
        boolean cikilsinMi =true;// while dongu icin sart olusturuldu

        while (cikilsinMi) {
            System.out.println("Agam ne istirsen\n1 -> Kullanici Kayit Al \n2 -> Sansli Kisi Bul  \n3 ->lListele \n4 ->Cikis ");
            int tercih =scan.nextInt();

            switch (tercih) {
                case 1: kisi=yeniKayıt.kayitAl();break;
                case 2:yeniKayıt.sansliKullanici(kisi);break;
                case 3: yeniKayıt.listeler(kisi);break;
                case 4: cikilsinMi=false;  break;

                default: System.out.println("Agam adam gibi bisey giresen"); break;




            }


        }



    }


}
