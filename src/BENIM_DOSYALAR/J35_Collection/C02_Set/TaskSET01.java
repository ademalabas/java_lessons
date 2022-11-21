package BENIM_DOSYALAR.J35_Collection.C02_Set;

import java.util.Arrays;
import java.util.HashSet;

public class TaskSET01 {
/*
    Task
    Parametre olarak bir String HashSet   ve  iki String alan  return type HashSet
   olan  changeSet() isminde bir method oluşturun.
    Eğer HashSet String 1 e sahipse,HashSet'in  String 1 elemanını String 2 ile değiştirin.
    ÖRNEK:
    hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
    String 1 = banana
    String 2 = peach
    CEVAP: "peach" , "strawberry" , "kiwi" , "pineapple"
     */


    public static void main(String[] args) {

        HashSet<String> hs= new HashSet<>(Arrays.asList("Adem" ,"Ismail","Sumeyra","Murat","Busra"));
        String str1="Adem";
        String str2="Umit";

        changeSet(hs,str1,str2);

        System.out.println("hs = " + hs);
    }
    private static HashSet changeSet(HashSet<String>hs, String str1, String str2) {

        if (hs.contains(str1)){
            hs.remove(str1);
            hs.add(str2);
        }
        return hs;



    }


}
