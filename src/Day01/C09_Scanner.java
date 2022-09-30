package Day01;

import java.util.Scanner;

public class C09_Scanner {

    public static void main(String[] args) {
        //  Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin (pi =3.14)
//  Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
//  Isim – soyisim : Elly Dainty
//  Kullanicidan ismini alip isminin bas harfini yazdirin.

        Scanner scanner = new Scanner(System.in);
      // System.out.println("Lütfen cemberin yari capini \"cm\" olarak giriniz: ");
      // double r = scanner.nextDouble();
      // double pi = 3.14;
      // double cevre = 2*pi*r;
      // double alan = pi*r*r;
      // System.out.println("cemberin cevresi = " + cevre + "cm\'dir" + "\nCemberin alani = " + alan + "cm²\'dir");

        System.out.println("Lutfen isminizi Giriniz" );
       // String isim = scanner.nextLine();
       // System.out.println("Lutfen Soy isminizi Giriniz" );
       // String soyIsim = scanner.nextLine();
       // System.out.println("isin soyIsim = "+isim  + "  " + soyIsim);

        char ilkHarf = scanner.nextLine().charAt(0);
        System.out.println("Girdiginiz ismin ilkHarf = " + ilkHarf);

    }
}
