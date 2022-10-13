package BENIM_DOSYALAR.J12_Loops.L02_WhileLoop;

public class Pr01_WhileLoop {
    public static void main(String[] args) {
        String[] isimler = {"Hamza", "Mehmet", "Sefa", "Bartu", "Ahmet", "Ayse"};
        int index = 0;
        while (index <isimler.length) {
        System.out.println(isimler[index]);

            if (isimler[index].equals("Ayse")){
                System.out.println("Ayse ismi array icerisinde var");
            }
            index++; // da olabilir        yukaridakinin(++) yerine
        }

    }
}
