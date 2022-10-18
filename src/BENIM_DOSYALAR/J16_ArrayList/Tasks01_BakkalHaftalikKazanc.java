package BENIM_DOSYALAR.J16_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Tasks01_BakkalHaftalikKazanc {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.

     */
    static ArrayList<String> DayList = new ArrayList<>(java.util.List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday, Sunday"));
    static ArrayList<Integer> GunlukKazancclar   = new ArrayList<>();

    public static void main(String[] args) {
        int i = 0;
        while (i<DayList.size()) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Gunluk kazancinizi giriniz");
            double kazanc = scanner.nextDouble();
            GunlukKazancclar.add((int)kazanc);
            i++;


        }
        System.out.println("GunlukKazancclar = " + GunlukKazancclar);
     //   getOrtalamaKazanc(toplam);



    }

  // private static double getOrtalamaKazanc(ArrayList<String>gun , ArrayList<Integer>kazanc) {
  //     double toplam = 0;
  //     for (int i = 0; i < gun.size(); i++) {
  //         toplam += kazanc.get(i);
  //     }
  // }return toplam;


}
