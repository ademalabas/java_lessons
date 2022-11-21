package BENIM_DOSYALAR.J35_Collection.C02_Set;

import java.util.LinkedHashSet;
import java.util.List;

public class TaskSET02 {
    /*
    Task->
   return tipi linkedhashset olan removing() isminde bir method oluşturun.
    Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
    Eğer Stringler LinkedHashset 'in içinde varsa, silinmeli.

    Örneğin,
    linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
    String 1= Germany
    String 2 = USA
     Germany ve USA 'i sil.
    Set'i return et.
     */

    public static void main(String[] args) {

        LinkedHashSet<String>ls1 = new LinkedHashSet<>(List.of( "Murat", "Aliye" , "Umut" , "Nalan" , "Handan" , "Isa"));
        String a="Handan";
        String b="Murat";

        removing(ls1, a, b);
        System.out.println("ls1 = " + ls1);

        System.out.println("removing() = " + removing());

    }private static LinkedHashSet removing(LinkedHashSet<String>ls,String s1,String s2) {

        ls.remove(s1);
        ls.remove(s2);
        return ls;
    }
    private static  LinkedHashSet removing(){

        LinkedHashSet<String> ls = new LinkedHashSet<>(List.of( "Germany", "France" , "USA" , "Canada" , "Mexico" , "Brazil"));
        String s1="Germany";
        String s2="USA";
        ls.remove(s1);
        ls.remove(s2);
        return ls;


    }
}
