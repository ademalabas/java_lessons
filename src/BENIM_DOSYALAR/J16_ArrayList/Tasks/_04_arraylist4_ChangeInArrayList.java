package BENIM_DOSYALAR.J16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;

public class _04_arraylist4_ChangeInArrayList {

    /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */

    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>(List.of("yellow", "red", "blue", "red", "blue"));
        String b = "blue";
        String y = "yellow";

        System.out.println("changeInArraylist(colorList,b,y) = " + changeInArraylist(colorList, b, y));
    }

    private static List<String> changeInArraylist(ArrayList<String> colorList, String b, String y) {

        for (int i = 0; i < colorList.size(); i++) {
            if (colorList.get(i).equals(b)) {
                colorList.set(i, y);
            }
        }
        return colorList;
    }
}
