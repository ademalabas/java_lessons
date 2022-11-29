package J99_Lambda;

import java.util.stream.IntStream;

public class C11_stream_iterator {

    public static void main(String[] args) {


        System.out.println("TASK01--> amele topla : "+toplaAmele(10));//55
        System.out.println("TASK01--> cincix topla : "+toplaCincix(10));//55
        System.out.println("TASK02--> cincix çift topla : "+toplaCift(24));//156

    }//main sonu

        //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir program create ediniz.

    //Structured Programming(Amele coding...)
    public static int toplaAmele(int x) {
        int toplam = 0;
        for (int i = 0; i <= x; i++) {
            toplam += i;
        }
        return toplam;
    }
    //Functional Programming(cincix code...)
    public static int toplaCincix(int x){

        return IntStream.//manual akıs tanımlandı
                range(1,x+1).//1 dahil x+1 hariç-> 1,2,3...x int sayılarından aralık tanımlandı
                sum();//akısa giren 1,2,3...x tam sayıları toplandı
        //range(startInclusive,endExclusive);-> 1'lik artımlı bir adımla startInclusive'den (dahil) endExclusive'e (exclusive) kadar sıralı bir IntStream return eder.
    }

    //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz
    public static int toplaCift(int x){

        return IntStream.//manual akıs tanımlandı
                // range(1,x+1).//1 dahil x+1 hariç-> 1,2,3...x int sayılarından aralık tanımlandı
                        rangeClosed(1,x).//1 dahil x+1 hariç-> 1,2,3...x int sayılarından aralık tanımlandı
                        filter(C01_LambdaExpression::ciftMi).//akısdaki tamsayıların çift olanları akısa alındı
                        sum();//akısa giren 1,2,3...x tam sayıları toplandı
        //rangeClosed(startInclusive,endInclusive);-> 1'lik artımlı bir adımla startInclusive'den (dahil) endInclusive'e (dahil) kadar  sıralı bir IntStream return eder.
    }









}
