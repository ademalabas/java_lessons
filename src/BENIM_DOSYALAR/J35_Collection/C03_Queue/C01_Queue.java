package BENIM_DOSYALAR.J35_Collection.C03_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {
         /*
      Queue coll. interface oldg için child calss olan LinkedList ve PriorityQueue
      ile obj uretilir.
      Eczane yemekhane vs belirli şart ile aksiyon alan elemanlar için kullanılır.
      Cons seçimine göre queue obj özelliklieri belirlenir.
      FİFO -> first in first out: Coll. ilk giren eleman ilk çıkar.Elemen en sona eklenişr enbaştan silinir

       */

        Queue<String> q1 = new LinkedList<>(Arrays.asList("Cebrail", "Sümeyra", "Yakup", "Muharrem"));
        System.out.println("q1 = " + q1);// [Cebrail, Sümeyra, Yakup, Muharrem]->insertion order
        q1.add("Erol");
        System.out.println("q1 = " + q1);//[Cebrail, Sümeyra, Yakup, Muharrem,Erol]

        Queue<String> q2 = new PriorityQueue<>(Arrays.asList("javaCAN", "javaSU", "javaNAZ", "javİYE"));//[javaCAN, javaSU, javaNAZ, javİYE]
        System.out.println("q2 = " + q2);//[javaCAN, javaSU, javaNAZ, javİYE]
        q2.add("javiDAN");
        System.out.println("q2 = " + q2);//[javiDAN, javaCAN, javaNAZ, javİYE, javaSU]

        System.out.println("q1.element() = " + q1.element());// Cebrail
        System.out.println("q1.peek() = " + q1.peek());// Cebrail


        System.out.println("q1.remove() = " + q1.remove());//Cebrail
        System.out.println("q1.poll() = " + q1.poll());//Cebrail
        //peek()-> copt-paste gibi ilk elemanı return eder ama silmez
        //poll()-> cut-paste gibi ilk elemanı siler ve  return eder
        // element() -> ilk elemanı silmeden return eder.
        //remove() -> ilk elemnı siler ve return eder..

        //ahan da Trick kösesinde bugun : poll ve remove farkı ->  eger queue coll. boş ise remove NoSuchElementException
        // poll ise null return eder.

        q1.clear();//queue coll. elemanları silindi.
        System.out.println("q1 = " + q1);//[]
        System.out.println("q1.size() = " + q1.size());//0
        System.out.println("q1.poll() = " + q1.poll());//null
        System.out.println("q1.remove() = " + q1.remove());//NoSuchElementException5


        //offer()-> queue coll. eleman eklemek için kullnılır.
        System.out.println("q2.offer(\"küşleme\") = " + q2.offer("küşleme"));//true


    }
}
