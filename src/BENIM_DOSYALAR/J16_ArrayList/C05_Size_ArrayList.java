package BENIM_DOSYALAR.J16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_Size_ArrayList {
    public static void main(String[] args) {
// size();-> listin eleman saysısını return eder (arr->length)
        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih", "losAngeles", "Londra", "stockholm"));
        System.out.println(listSehir.size());//4


    }
}
