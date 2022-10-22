package BENIM_DOSYALAR.J16_ArrayList.Tasks;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */
        ArrayList<Integer> sayi1 = new ArrayList<Integer>(Arrays.asList(1,2,2,3,1,4,2,5,6,8,7,5,9,1));
        ArrayList<Integer> sayi2 = new ArrayList<Integer>();

        for (int i = 0; i < sayi1.size(); i++){
            if (!sayi2.contains(sayi1.get(i))){
                sayi2.add(sayi1.get(i));
            }
        }
        System.out.println("sayi2 = " + sayi2);


    }

}
