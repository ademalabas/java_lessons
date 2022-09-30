package Haluk_Bey_Notlar.src.src.j10_StringManipulations.tasks;

        import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
        Scanner scan = new Scanner (System.in);
        System.out.print("Bir isim giriniz. Maksimum 3 harfli olmalıdır : ");
        String cumle = scan.nextLine();
        if (cumle.length() >= 4) {
            System.out.println("girdiğiniz cümle 3 harften fazladır");
        }else{
            String kontrol = (cumle.charAt(0) == cumle.charAt(1) || cumle.charAt(0) == cumle.charAt(2) || cumle.charAt(1) == cumle.charAt(2)  ) ? "aynı harf vardır" : "harfler farklıdır";
            System.out.println(kontrol);}



    }
}