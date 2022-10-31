package BENIM_DOSYALAR.j08_IfStatement_Ternary_Operators;

import java.util.Scanner;

public class Ex07_EhliyetTecrube {
    public static void main(String[] args) {
       /*
       Task ->   Kuualanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını teslim ediniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
        */

      /*  Scanner sc = new Scanner(System.in);
        System.out.print("Ehliyetiniz var mı? Var ise 'E' , yok ise 'H' yazınız ");

        char ch=sc.next().toUpperCase().charAt(0);

        if (ch=='E') {
            System.out.println("Kaç yıllık şoförsünüz?");
            int tecrube=sc.nextInt();
            if (tecrube>=7) {
                System.out.println("Şu zamana kadar kaç km yol yaptınız?");
                int yol=sc.nextInt();
                if (yol>=10000) {
                    System.out.println("O zaman buyrun, anahtarlar sizde :)");
                } else System.out.println("Malesef daha gidecek "+(10000-yol)+" km daha yolunuz var");

            }else System.out.println("O halde "+ (7-tecrube)+" yıl daha tecrüne kazanıp öyle gel :P");

        } else if (ch=='H'){
            System.out.println("Ben canımı sokakta bulmadım");

        } else System.out.println("Doğru düzgün cevap verir misin :/");
*/
        Scanner sc = new Scanner(System.in);

        System.out.print("ehliyetiniz var ise E yoksa H giriniz : ");

        char ehlyt = sc.next().charAt(0);//kullanıcının girdiği karakteri buyuk harfe cevirip ilk değerini alır
        if (ehlyt == 'E' || ehlyt == 'e') {//ehlyt varlığı k0ntrol edildi

            System.out.print("kac yıllık tecrübeniz var :");
            int tcrb = sc.nextInt();

            if (tcrb >= 7) {//tecrübe yılı kntrol edildi
                System.out.print("yaptıgınız km mesafeyi girniz : ");
                int km = sc.nextInt();
                if (km >= 100000) {//km mesafe kontrol edildi
                    System.out.println("agam gözün aydın kontak anahtarı senindir :)");
                } else//km sartı saglamazsa çalışır
                    System.out.println("kontak anahatarı lamanız için önce " + (100000 - km) + " yola ihtiyacınız var");

            } else //tecrübe şartı sağlamzsa çalışır
                System.out.println("kontak anahatarı lamanız için önce " + (7 - tcrb) + " yıla ihtiyacınız var");
            //yıl 7den byk olma şartı sağlamadığı içib eksik trc yazdrıldı

        } else if (ehlyt == 'H' || ehlyt == 'h') {//ehliyet yoklugu kontrol edildi
            System.out.println("agam önce bi ehliyet al sonra kontak anahtarı sor :(");
        } else //ehlyt varlığı için e h girilme şartı sağlanmazsa  çalışır
            System.out.println("agam önce adam gibi karakter gir :(");


    }

}
