package BENIM_DOSYALAR.J34_Iterators;

import java.util.*;

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
            System.out.println("   *** *****  ");
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
                System.out.print(it1.next()+"   ");//Nur :-)  Gamze :-)  Erol :-)  Bekir :-)

            }
            System.out.println();
            System.out.println("   *** Iterators ***   ");
            List<String> l2 = new ArrayList<>(Arrays.asList("Adem", "Baran", "Akif", "Ismail"));


            // l2 elemanlarini iterator ile silip print ediniz  ==> l2=[]
            System.out.println(" Iterator oncesi l2 =" + l2);
            Iterator<String> it2 = l2.iterator();//"Adem", "Baran", "Akif", "Ismail"

            while (it2.hasNext()){//tekrardaki pointer onundeki eleman varligini kontrol eder
                it2.next();// tekrardaki pointer onundeki elemani verir
                it2.remove();// next() ile gelen elemani siler

            }
            System.out.println(" Iterator sonrasi  l2 =" + l2);// []



            List<String> l3 = new ArrayList<>(Arrays.asList("adem", "baran", "Akif", "Ismail"));
            // l3 elemanlarini iterator ile  :-) set edip  print ediniz  ==> l3="Adem""Baran", "Akif", "Ismail"

            System.out.println(" Iterator oncesii  l3 =" + l3);// "Adem""Baran", "Akif", "Ismail"
            ListIterator<String> it3 = l3.listIterator();// tekrar iterator yapisi tanimlandi
            while (it3.hasNext()){
              it3.set(it3.next()+ "  :-)  "); // tekrardaki next() ile elemani :-) concat ederek update edildi
               // it3.set(it3.next().toUpperCase().charAt(0)+"***"); // tekrardaki next() ile elemani :-) concat ederek update edildi
            }


            System.out.println(" Iterator sonrasi  l3 =" + l3);// Adem",:-) "Baran",:-)  "Akif",:-)  "Ismail":-)



            List<String> l4 = new ArrayList<>(Arrays.asList("Aliye", "Sumeyra ", "Busra", "Ismail"));
            // l3 elemanlarini ilk harfi buyuk  kalan 3 hari *** karakteri ve l4 listesi ekleyip print ediniz ==> l3="Adem""Baran", "Akif", "Ismail"

            System.out.println(" Iterator oncesii  l3 =" + l3);// "Adem""Baran", "Akif", "Ismail"
            ListIterator<String> it4 = l3.listIterator();// tekrar iterator yapisi tanimlandi
            while (it4.hasNext()){

                 it4.set(it4.next().toUpperCase().charAt(0)+"***"); // tekrardaki next() ile gelen l4 elemani ilk harfi buyuk harf kalan 3 harf ** ile update edildi
            it4.add((l4.toString()));// tekrardaki update edilen  l3 e l4 add edildi

            }


            System.out.println(" Iterator sonrasi  l3 =" + l3);// A *** "B***   "A***   "I***






        }



}
