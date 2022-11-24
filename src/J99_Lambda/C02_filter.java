package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_filter {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
        printElStructured3( sayi);

        System.out.println("\n   ***   ");
        printCiftElFunctional( sayi);


    }// main sonu

    //Task : "Structured Programming":Amele code kullanarak list elemanlarının çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.
    public static void printElStructured3(List<Integer> sayi) {
        for (Integer w : sayi) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }
//Task : "Functional Programming":cincix code kullanarak list elemanlarının çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.
public static void printCiftElFunctional(List<Integer> sayi) {
        sayi.
                stream().// list elemanlari akisa alindi
                filter(t->t%2==0).// akisdaki list elemanlari
                forEach(C01_LambdaExpression::yazdir);

}






}
