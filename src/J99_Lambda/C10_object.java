package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C10_object {

    /*
TASK :
fields --> Universite (String)
           bolum (String)
           ogrcSayisi (int)
           notOrt (int)
           olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
 */

    public static void main(String[] args) {
      Universite u01= new Universite( "Bogazici","Matematik",571,73) ;
      Universite u02= new Universite( "Istanbul","Matematik",622,77) ;
      Universite u03= new Universite( "Marmara","Hukuk",1453,52) ;
      Universite u04= new Universite( "Itu","Ucak Muh",333,63) ;
      Universite u05= new Universite( "Yildiz Teknik","Gemi",216,55) ;


        List<Universite> unv = new ArrayList<>(Arrays.asList(u01,u02,u03,u04,u05)) ;
        System.out.println("Task01 : "+notOrt74Byk(unv));//false
        System.out.println("\n   ***   ");
        System.out.println("task2( unv) = " + task2(unv));// true
        System.out.println("\n   ***   ");
        System.out.println("task3( unv) = " + task3(unv));// true
        System.out.println("\n   ***   ");
        System.out.println("task4( unv) = " + task4(unv));//[universite='Marmara', bolum='Hukuk', ogrcSayisi=1453, notOrt=52, universite='Istanbul', bolum='Matematik', ogrcSayisi=622, notOrt=77, universite='Bogazici', bolum='Matematik', ogrcSayisi=571, notOrt=73, universite='Itu', bolum='Ucak Muh', ogrcSayisi=333, notOrt=63, universite='Yildiz Teknik', bolum='Gemi', ogrcSayisi=216, notOrt=55]

        System.out.println("\n   ***   ");
        System.out.println("task5( unv) = " + task5(unv));//[universite='Istanbul', bolum='Matematik', ogrcSayisi=622, notOrt=77, universite='Bogazici', bolum='Matematik', ogrcSayisi=571, notOrt=73, universite='Itu', bolum='Ucak Muh', ogrcSayisi=333, notOrt=63]

        System.out.println("\n   ***   ");
        System.out.println("task6( unv) = " + task6(unv));//universite='Itu', bolum='Ucak Muh', ogrcSayisi=333, notOrt=63]
        System.out.println("\n   ***   ");
        System.out.println("task5( unv) = " + task6(unv));
        System.out.println("\n   ***   ");
        System.out.println("task5( unv) = " + task6(unv));

    }//main sonu
//task 01--> notOrt'larinin 74' den buyuk oldg kontrol eden pr create ediniz.
public static  boolean notOrt74Byk(  List<Universite>unv){

    return unv.
            stream().
            allMatch(t->t.getNotOrt()>74);
}

    //task 02-->ogrc sayilarinin   110 den az olmadigini  kontrol eden pr create ediniz.
    public static boolean task2(List<Universite> list) {
        return list.stream().allMatch(t-> t.getOgrcSayisi()>=110);}





//task 03-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.
public static boolean task3(List<Universite> list) {
    return list.stream().anyMatch(t-> t.getBolum().toLowerCase().contains("matematik"));}



    //task 04-->universite'leri ogr sayilarina gore b->k siralayiniz.
    public static List<Universite> task4(List<Universite> unv) {
        return unv.stream().sorted(Comparator.comparing(Universite::getOgrcSayisi).reversed()).collect(Collectors.toList());}

//task 05-->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print ediniz.
public static List<Universite> task5(List<Universite> unv) {
    return unv.stream().sorted
            (Comparator.comparing(Universite::getNotOrt).

                    reversed()).limit(3).collect(Collectors.toList());}

//task 06--> ogrc sayisi en az olan 2. universite'yi  print ediniz.

    public static List<Universite> task6(List<Universite> unv) {
        return unv.stream().sorted
                (Comparator.comparing(Universite::getOgrcSayisi)).limit(2).skip(1)

                       .collect(Collectors.toList());}


//task 07--> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print ediniz.



}
