package Haluk_Bey_Notlar.src.src.j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C03_LinkedLİst {
    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("javaCAN", "Ebubekir", "Gülsüm", "Ebubekir", "Adem", "İlker", "javaCAN", "Merve"));
        System.out.println("ll1 = " + ll1);//[javaCAN,Ebubekir, Gülsüm, Ebubekir, Adem, İlker, javaCAN, Merve]
        //LİnkdList remove()...ilk node silinir ve silinen node return edilir
        System.out.println("ll1.remove() = " + ll1.remove());//javaCAN
        System.out.println("ll1 = " + ll1);//[Ebubekir, Gülsüm, Ebubekir, Adem, İlker, javaCAN, Merve]

        System.out.println("ll1.remove(3) = " + ll1.remove(3));//Adem->silinen node return eder.
        System.out.println("ll1 = " + ll1);//[Ebubekir, Gülsüm, Ebubekir, İlker, javaCAN, Merve]

        System.out.println("ll1.remove(\"Merve\") = " + ll1.remove("Merve"));//true
        System.out.println("ll1.remove(\"javaTAR\") = " + ll1.remove("javaTAR"));//false->olmayan node false olan node true return eder
        System.out.println("ll1 = " + ll1);//[Ebubekir, Gülsüm, Ebubekir, İlker, javaCAN]

        System.out.println("ll1.removeFirstOccurrence(\"Ebubekir\") = " + ll1.removeFirstOccurrence("Ebubekir"));//true
        System.out.println("ll1 = " + ll1);//[Gülsüm, Ebubekir, İlker, javaCAN]

        System.out.println("ll1.element() = " + ll1.element());//ilk node return eder-> Gülsüm

        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("javaCAN", "Ebubekir", "Gülsüm", "Ebubekir", "Adem", "İlker", "javaCAN", "Merve"));
        LinkedList<String> ll3 = new LinkedList<>(Arrays.asList("Hasan", "Harun", "Haluk", "Hasmayan"));

        ll2.addAll(ll3);
        System.out.println("ll2 = " + ll2);//[javaCAN, Ebubekir, Gülsüm, Ebubekir, Adem, İlker, javaCAN, Merve, Hasan, Harun, Haluk, Hasmayan]
        System.out.println("ll2.remove(ll3) = " + ll2.removeAll(ll3));//True


        System.out.println("ll3.removeAll(ll2) = " + ll3.removeAll(ll2));//false
        System.out.println("ll2 = " + ll2);//[javaCAN, Ebubekir, Gülsüm, Ebubekir, Adem, İlker, javaCAN, Merve]
        //LinkedList get() getFirst() getLast()....girilen index ve ilk son node return eder..
        System.out.println("ll2.get(2) = " + ll2.get(2));//Gülsüm
        System.out.println("ll2.getFirst() = " + ll2.getFirst());//javaCAN
        System.out.println("ll3.getLast() = " + ll3.getLast());//Hasmayan

        List<Integer> ll4 = new LinkedList<>(Arrays.asList(1,3,4,6,7,54,34,45));
        System.out.println("ll4 = " + ll4);
        ll4.remove(3);// remove() method'unun icine integer yazılırsa  eleman değil index olarak tanımanır .
                          //Burada index'i 3 olan 6 silinir.
        //remove() method'unun icinde olmayan bir index kullanirsaniz
        //Java IndexOutOfBoundsException throw eder
        //ll1.remove(33);
    }
}
