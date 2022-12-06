package Haluk_Bey_Notlar.src.src.J99_Lambda.lambdaTutorial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class C12_textRead {
    public static void main(String[] args) throws IOException {
//TASK 01 --> haluk dosyasini okuyunuz.(Console'a print ediniz.)
        System.out.println("\n TASK 01 --> haluk dosyasini okuyunuz ");
        Path hlk = Path.of("src/J99_Lambda/haluk");//erişilecek dosyanın path'i tanımlandı
        Stream<String> akıs = Files.lines(hlk);
        //Stream<String> akıs1= Files.lines(Path.of("src/J99_Lambda/haluk"));

        akıs.//erişimi verilen dasyadaki satırlar akısa alındı
                forEach(System.out::println);//akısdaki satırlar(lines) print edildi


        //TASK 02 --> haluk.txt dosyasini map okuyunuz.(Console'a buyuk harflerle print ediniz.)
        System.out.println("\n TASK 02 --> haluk.txt dosyasini buyuk harflerle okuyunuz ");
        Files.lines(Paths.get("src/J99_Lambda/haluk")).//erişim verilen path deki saırlar akısa alındı
                map(String::toUpperCase).//akısdaki  satırların Stringleri byk hrf update edildi
                forEach(System.out::println);


        //TASK 03 --> haluk dosyasindaki ilk satiri kucuk harflerle print ediniz..
        System.out.println("\n TASK 03 --> haluk.txt dosyasindaki ilk satiri kucuk harflerle print ediniz.. ");

        Files.lines(Paths.get("src/J99_Lambda/haluk")).//erişim verilen path deki saırlar akısa alındı
                map(String::toLowerCase).//akısdaki  satırların Stringleri kck hrf update edildi
                limit(1).//akısdaki ilk eleman(ilk satır) alındı
             //  findFirst();//akısdaki ilk eleman(ilk satır) alındı
                forEach(System.out::println);

        //TASK 04 --> haluk dosyasinda "basari" kelimesinin kac satirda gectiginiz print ediniz.
        System.out.println("\n TASK 04 --> haluk dosyasinda \"basari\" kelimesinin kac satirda gectiginiz print ediniz.");

        System.out.println(Files.lines(Paths.get("src/J99_Lambda/haluk")).//erişim verilen path deki saırlar akısa alındı
                map(String::toLowerCase).//akısdaki  satırların Stringleri kck hrf update edildi
                filter(t -> t.contains("basarı")).//akısdaki elemanların basarı içerenleri filtrelendi
                count()//akısdaki elelmanlar saydırıldı
        );


    }
}
