package BENIM_DOSYALAR.J34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_Iterators {


        public static void main(String[] args) {
            List<String> l1 = new ArrayList<>(Arrays.asList("Nur", "Gamze", "Erol", "Bekir"));
            System.out.println("l1 List ilk hali : " + l1);//[Nur, Gamze, Erol, Bekir]
            // l1 elamanları for loop ile print ediniz...
            for (int i = 0; i < l1.size(); i++) {
                System.out.print(l1.get(i) + " ");// Nur Gamze Erol Bekir
            }
            System.out.println();
            System.out.println("   ***   ");
            // l1 elamanları for-each loop ile print ediniz...
            for (String w : l1) {
                System.out.print(w + " ");//Nur Gamze Erol Bekir
            }
            System.out.println();
            System.out.println("   ***   ");
            // l1 herbir elamanı :-)  for loop ile update edip  print ediniz...
            for (int i = 0; i < l1.size(); i++) {
                l1.set(i,l1.get(i)+" :-) ");
            }
            System.out.println("l1 :-) update sonrası :"+l1);//[Nur :-) , Gamze :-) , Erol :-) , Bekir :-) ]
            System.out.println();
            System.out.println("   ***   ");
            // l1 herbir elamanı :-(  for-each loop ile update edip  print ediniz...
            for (String w:l1){
                w+=" :-( ";
            }
            System.out.println("l1 :-) update sonrası :"+l1);//[Nur :-) , Gamze :-) , Erol :-) , Bekir :-) ]
        /*
        index desteklemeyn yapılarda tekrarlayan  aksiyon için for-each lopp update yapamaybilir yukarıdaki task'de oldugu gibi
        Bu durumda java ıterator intarface'den tanımlanacak variable ile takrarlayan aksiyonlar index olmadan yapılır.
         */
            System.out.println();
            System.out.println("   *** Iterators ***   ");
            Iterator<String > it1=l1.iterator();//Iterator intface'den it1 variable tanımlandı .Atama olarak l1 elemanları atandı
            while(it1.hasNext()){
                //hasNext()->it1 elamanları için pointer old yerde elekman varsa true yoksa false verir ve pointer bir sonrakı elelman önüne koyulur
                // next()-> list'in pointer önündeki  elemnını return eder
                System.out.print(it1.next()+" ");//Nur :-)  Gamze :-)  Erol :-)  Bekir :-)

            }
        }



}
