package BENIM_DOSYALAR.j01_Variables.j03_ScannerClass_TypeCasting;


import java.util.Scanner;

public class C01_ScannerClass {

    public static void main(String[] args) {
        // kullanıcıdan veri almak içinn şu adım takip edilir
        //1. adım-> Scanner class'dan obj create edilir.
/*
        Scanner scan = new Scanner(System.in); // Scanner classından scan isminde değerini System içinden alan bir obj.

        // 2 adım->Kullanıcıdan istenen veri için bildirimde bulunulur->sout("...");
        System.out.println("adınızı giriniz :");

        // 3. adım-> kuulanıcının girdigi veri data type'ne göre bir variable atanır.
        String isim=scan.nextLine();// kullanıcıdan gelen String tipinde isim verisi scan obj'ni nextLine() methodu ile atandı

        System.out.println("isim = " + isim);

        // Task -> Kullanıcının girdiği değere göre kare alanı ve cevresini hesaplayan bir code create ediniz...

        // 1.adım Scanner clastan obje üretilir.
       // Scanner scan =new Scanner(System.in);
        // scanner classından scan isminde değerini sistem içinden alan bir objedir.
        //2. adım: Kullanıcıdan istenen veri için bildirimde bulunulur.
        System.out.print("adınızı giriniz");
        //3.adım: kullanıcının girdiği data tipine göre bir variable a atanır.
*/
       Scanner sc =new Scanner(System.in); // 1. adim
       // System.out.println("karenin kenarini giriniz: ");//2. adim
      // int kenar= sc.nextInt(); // 3. adim
      //  System.out.println("alan:"+(kenar*kenar)+"  cevre: "+(kenar*4)); //4. adim


        /*
 Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
 Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
 1 seker = 1.7 gr
 Ornek : Input : cay sayisi : 10 seker sayisi :2
         Output : Yilda 12.41 kg seker kullaniyorsunuz
 */

   /* System.out.println("gunluk ictiginiz cay sayisini giriniz:  "); //cay icin 2. adim
            int caySayisi=sc.nextInt(); // cay icin 3. adim
    System.out.println("seker sayinizi giriniz:");// seker icin 2.adim
            int sekerSayisi=sc.nextInt(); // seker icin 3. adim
    System.out.println("Yillik sekertuketiminiz: " + (caySayisi*sekerSayisi*1.7*365/1000));//12.41 kg
*/
     // System.out.println("isminizi giriniz:");
     //  char ch = sc.nextLine().charAt(0);
     //  System.out.println("Isminizin ilk Karakteri = " + ch);
      //  String isim = sc.nextLine();
        //String iad = sc.next();// ilk ifade
       // System.out.println("isminizi giriniz: " + isim);

        System.out.println("isminiz giriniz : ");//2. adım
        // char ch = sc.nextLine().charAt(0);// kullanıcıdan gelen string ifadenin 0. index ilk  karakteririni alır
        // System.out.println("isminizin ilk karakteri :" + ch);
        // String isim=sc.nextLine();//kullanıcını girdiği tüm satırı isim'e atar
        String ad = sc.next();//kullanıcını girdiği ilk ifadeyi  ad'e atar
        System.out.println("ad = " + ad);
        // System.out.println("isim = " + isim);


    }




}
