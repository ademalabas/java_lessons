package BENIM_DOSYALAR.J16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;

public class _05_arraylist5_rotateList {

    /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */

    public static void main(String[] args) {
List<String> clist = new ArrayList<>(List.of("New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"));
        System.out.println("clist = " + clist);
        List<String> reverselist;
        System.out.println("rotateList(clist) = " + rotateList(clist));
    }

    private static List<String> rotateList(List<String> clist ) {
        List<String> reverselist = new ArrayList<>();
        for (int i = clist.size()-1;i>=0 ;i--) {
            reverselist.add(clist.get(i));
        }
        return reverselist;
    }
}

