package BENIM_DOSYALAR.J16_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C02_nCopies_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> listUlke =new ArrayList<>(List.of("Almanya","Amerigonya","Ingiltere","Isvec"));
        ArrayList<String> listSehir =new ArrayList<>(List.of("Munih","losAngeles","Londra","Stocolm"));

        // nCopies(int, Obj);  int elemanli bir obj olusan list atamayi yapiyor
        ArrayList<String> yeniist = new ArrayList<>(Collections.nCopies(7,"JavaCan"));
        System.out.println(yeniist);//[JavaCan, JavaCan, JavaCan, JavaCan, JavaCan, JavaCan, JavaCan]

        // addall(); bir liste  listi oldugu gibi ekler
        listUlke.addAll(listSehir);
        System.out.println("ListUlke = " + listUlke);//[Almanya, Amerigonya, Ingiltere, Isvec, Munih, losAngeles, Londra, Stocolm]
        listSehir.addAll(3,listUlke);// 3. indeksten sonra ulke  listesini ekledi
        System.out.println(listSehir);//[Munih, losAngeles, Londra, Almanya, Amerigonya, Ingiltere, Isvec, Munih, losAngeles, Londra, Stocolm, Stocolm]

        // Task  1 den 10 Test01 kadar sayilara bir liste atayip print eden code create ediniz
        ArrayList<Integer> sayiList =new ArrayList<>(10);
        for (int i=1;i<=10;i++) {
            sayiList.add(i);
            System.out.println("sayiList = " + sayiList);
        }

    }
}
