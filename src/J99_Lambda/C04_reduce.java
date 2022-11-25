package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C04_reduce {

    /*
reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
kullanımı yaygındır pratiktir.
Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

*/
    public static void main(String[] args) {
// Lambda-> Stream API
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
        //  List<Integer> sayi = new ArrayList<>(Arrays.asList(1, 3, 5));//filter olarak cift  sartı null verecegi için optional class ataması yapar
        //Lambda ->Stream API
        System.out.println("\n   ***   ");
        ciftKareMaxPrint(sayi);//Optional[4356]
        elTopla ( sayi);//Optional[626]



    }//main sonu

    // Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz.
    public static void ciftKareMaxPrint(List<Integer> sayi) {
        //Optional<Integer> maxEleman= sayi.//filter işleimi null değer return etme riskine karsı Optional Class type data casting yapıldı
        //           stream().//list elemanları akısa laındı
        //           filter(C01_LambdaExpression::ciftMi).//akısdaki list elelmnalrı cift fitrelendi
        //           map(t->t*t).//fitrelenen cift akıs elemanları karesi ile update edildi
        //           reduce(Math::max);//cift fitrelelen ve karesi alınan akıs elemanları max elemana göre reduce-> azaltıldı.
        //   System.out.println(maxEleman);
        System.out.println(sayi.
                stream().//list elemanları akısa laındı
                        filter(C01_LambdaExpression::ciftMi).//akısdaki list elelmnalrı cift fitrelendi
                        map(t -> t * t).//fitrelenen cift akıs elemanları karesi ile update edildi
                //reduce(Math::max));
                        reduce(Integer::max));//specific class daha hızlı çalışır

    }
// Task : List'teki tum elemanlarin toplamini yazdiriniz.

public static void elTopla (List<Integer> sayi) {

    System.out.println(sayi.stream().reduce(Integer::sum));

    System.out.println("Lambda expression = " + sayi.stream().reduce(0, (a, b) -> a + b)); // Lambda expression
}

    }




