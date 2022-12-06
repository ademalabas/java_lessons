package Haluk_Bey_Notlar.src.src.J99_Lambda.lambdaTutorial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C13_flatMap {
    public static void main(String[] args) throws IOException {
        Path haluk = Path.of("src/lambdaTutorial/haluk.txt");//path haluk obj atandi
        Stream<String> akıs = Files.lines(haluk);//haluk.txt dataları akıs stream'e atandı
        //TASK 05 --> haluk.txt dosyasindaki farkli kelimeleri  print ediniz..
        System.out.println("\nTASK 05 --> haluk.txt dosyasindaki farkli kelimeleri  yazdiriniz. -->  ");
/*
   Stream.flatMap, adıyla tahmin edilebileceği gibi, bir map ve flat işleminin birleşimidir. Bu, ilk önce elemanlarınıza bir
   fonksiyon uyguladığınız ve daha sonra düzleştirdiğiniz anlamına gelir.
   Stream.map yalnızca akışı düzleştirmeden bir işlevi uygular.

   Bir akışın düzleştirme'in neyi içerdiğini anlamak için, "iki seviye" olan [ [1,2,3],[4,5,6],[7,8,9] ] gibi bir yapı düşünün.
   Bunun düzleştirilmesi, "bir seviye" yapısında dönüştürülmesi anlamına gelir: [ 1,2,3,4,5,6,7,8,9 ].
   flatMap yöntemi, bir akışın her bir değerini başka bir akışla değiştirmenizi sağlar
   ve ardından oluşturulan tüm akışları tek bir akışa birleştirir.

 */

        //1. yol.. distinct()
        System.out.println(Files.lines(haluk).
                map(t -> t.split(" ")).//satırlardaki kelimeler arraya atandı
                        flatMap(Arrays::stream).//2D arraydaki elelmanlar tek eleman olarak akısa alındı
                        distinct().//akısdaki elemanlar tekrarsız yapıldı
                        collect(Collectors.toList()));//akısdaki tekrarsız elemanlar liste atandı

        //2. yol.. toSet()
        System.out.println(Files.lines(haluk).
                map(t -> t.split(" ")).//satırlardaki kelimeler arraya atandı
                        flatMap(Arrays::stream).
                collect(Collectors.toSet()));
        //TASK 06 --> haluk.txt dosyasindaki tum kelimeleri natural order  print ediniz..
        System.out.println("\nTASK 06 --> haluk.txt dosyasindaki tum kelimeleri natural order  yazdiriniz. -->  ");
        Files.lines(haluk).
                map(t -> t.split(" ")).//satırlardaki kelimeler arraya atandı
                flatMap(Arrays::stream).//2D arraydaki elelmanlar tek eleman olarak akısa alındı
                sorted().//harf sırası yapıldı
                forEach(System.out::println);//print edildi

        //TASK 07 --> haluk.txt dosyasinda "basari" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız print ediniz.
        System.out.println("\nTASK 07 --> haluk.txt dosyasinda basari kelimesinin kac kere gectigini  yazdiriniz. -->  ");

        System.out.println(Files.lines(haluk).
                map(t -> t.toLowerCase().split(" ")).
                flatMap(Arrays::stream).
                filter(t -> t.equals("basari")).
                count());
        //TASK 08 --> haluk.txt dosyasinda "a" harfi gecen kelimelerin sayisini print eden  programi create ediniz.
        System.out.println("\nTASK 08 --> haluk.txt dosyasinda a harfi gecen kelimelerin sayisini ekrana yazdiran programi yazdiriniz. -->  ");
        System.out.println(Files.lines(haluk).//txt dosyasıne erişldi
                map(t -> t.split(" ")).//satırlar akısa alındı
                flatMap(Arrays::stream).//her satırdaki her kelime akısa alındı
                filter(t -> t.contains("a")).//a bulunduran kelimeler fitrelenedi
                count());//a bulunduran kelimeler sayıldı

        //TASK 09 --> haluk.txt dosyasinda icinde "a" harfi gecen kelimeleri print ediniz.
        System.out.println("\nTASK 09 --> haluk.txt dosyasinda a harfi gecen kelimeler yazdiriniz. -->  ");
        System.out.println(Files.lines(haluk).
                map(t -> t.split(" ")).//satırlar akısa alındı
                        flatMap(Arrays::stream).//her satırdaki her kelime akısa alındı
                        filter(t -> t.contains("a")).//a bulunduran kelimeler fitrelenedi
                        collect(Collectors.toList()));


        //TASK 10 --> haluk.txt dosyasinda kac /farklı harf kullanildigini print ediniz.
        System.out.println("\nTASK 10 --> haluk.txt dosyasinda kac /farklı harf kullanildigini  yazdiriniz. -->  ");
        System.out.println(Files.lines(haluk).
                map(t -> t.replaceAll("\\W", "").//satırlar \\W ifadesi a-z A-Z 0-9 _ disindakileri kapsar
                        replaceAll("\\d", "").
                        split("")).//harf akısı saglanır
                        flatMap(Arrays::stream).
                distinct().
                count());

        //TASK 11 --> haluk.txt dosyasinda kac farkli kelime kullanildigini print ediniz.
        System.out.println("\nTASK 11 --> haluk.txt dosyasinda kac farkli kelime kullanildigini  yazdiriniz. -->  ");
        System.out.println(Files.lines(haluk).
                map(t -> t.replaceAll("[.!,:)\\-]", "").

                        split(" ")).//kelime akısı saglanır
                        flatMap(Arrays::stream).
                distinct().
                count());
        //TASK 12 --> haluk.txt dosyasinda  farkli kelimeleri print ediniz
        System.out.println("\nTASK 12 --> haluk.txt dosyasinda kac farkli kelime kullanildigini  yazdiriniz. -->  ");
        Files.lines(haluk).
                map(t -> t.replaceAll("[.!,:)\\-]", "").
                        split(" ")).//kelime akısı saglanır
                flatMap(Arrays::stream).
                distinct().forEach(System.out::println);
    }
}
