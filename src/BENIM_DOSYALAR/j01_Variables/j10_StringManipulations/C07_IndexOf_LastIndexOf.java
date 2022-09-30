package BENIM_DOSYALAR.j01_Variables.j10_StringManipulations;

import java.util.Scanner;

public class C07_IndexOf_LastIndexOf {
    public static void main(String[] args) {

/* indexOf()
 * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
 * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false

*/

        String str ="Good";
        System.out.println("Ilk gorulen o nun yeri index no;" +str.indexOf('o')); //1
        System.out.println("d nin yeri index no;" +str.indexOf('d')); //d
        System.out.println("d nin yeri index no;" +str.indexOf('D')); //-1 D karakteri olmadigi icin
        // ahanda trick olmayan karakter -1 yazdirir

        System.out.println("od nin yeri index no;" +str.indexOf("od")); //2
        System.out.println("d nin yeri index no;" +str.indexOf("Od")); //-1

        /** lastIndexOf()
         *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
         *  indexOf un sondan olan hali fakat index numaraları değişmez.
         *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
         *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
         */

        String isim ="mustafa nizamoglu";
        System.out.println(isim.indexOf('a'));//4
        System.out.println(isim.lastIndexOf('a'));//11
        System.out.println(isim.lastIndexOf("fa"));//5

        /*
task
 Girilen cümlenin aşaıdaki durumları sağlayacak code create ediniz

 1-Girilen cumle java icermiyor  indexOf("java") ==-1
 2-Girilen cumle 1 tane java iceriyor
 3-Girilen cumlede birden fazla java var
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Kafi miktar cumle giriniz");
        String cumle = scan.next();

        if (cumle.contains("java")) {
            if (cumle.indexOf("java") == cumle.lastIndexOf("java")) {
                System.out.println("cümlede 1 tane java ifadesi geçiyor");
            }else {
                System.out.println("cümlede bir den fazla java geçiyor");
            }
        }else {
            System.out.println("cümlede java içermiyor");

        }
if (cumle.indexOf("java")==-1){
    System.out.println("cümlede java içermiyor");

} else if (cumle.indexOf("java")== cumle.lastIndexOf("java")) {
    System.out.println("1 java var" );
}else System.out.println( "1 dem fazla vardir");


    }
}
