package BENIM_DOSYALAR.J18_Constructor.Haftanin_Taski;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task01 {



    public static void main(String[] args) {
       /*
      Task:
    Create 2D ArrayList which can store String ArrayLists
    Create 3 ArrayLists which are Employees, Employers, Companies
    Store this 3 ArrayList in 2D ArrayList
    String data type ArrayList'leri depolayabilen 2D ArrayList create ediniz
    Çalışanlar, İşverenler, Şirketler olmak üzere 3 ArrayListesi oluşturun
    Bu 3 ArrayList'i 2D ArrayList'te saklayın
     */
        ArrayList<String> çalışanlar = new ArrayList<>(List.of("Fatih","Cüneyt","Koray"));
        ArrayList<String> işverenler = new ArrayList<>(List.of("HalukHoca","GarryHoca"));
        ArrayList<String> şirketler = new ArrayList<>(List.of("Google","Amazon","Microsoft","IBM"));
        ArrayList<ArrayList<String>> list2D = new ArrayList<>(Arrays.asList(çalışanlar,işverenler,şirketler));//Arrays.asList ile direkt storing
        System.out.println(list2D);

        System.out.println();

        for(ArrayList<String> arr : list2D){//for each loop ile satır satır printing
            for(String i: arr){
                System.out.print(i + " ");
            }
            System.out.println();
        }



    }




}
