package BENIM_DOSYALAR.J15_Arrays.Tasks;

import java.util.Arrays;

public class Task18_ArrayiYeniArrayeCevirmeveToplama {
    public static void main(String[] args) {

        // task-> sayi arr'deki iç arr'lerin toplamını yeni bir arr'ya atayıp print eden code create ediniz
        // input :int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};
        // output : int yeniArr[]={6,11,-7}
        int sayi[][]={{1,2,3},
                    {19,-8},
                    {24,10,-41}};

        int yeniArr[]=new int [sayi.length];

        for (int i = 0; i <= sayi.length - 1; i++) {
            int toplam = 0;
            for (int j = 0; j <= sayi[i].length - 1; j++) {
                toplam += sayi[i][j];
            }
            yeniArr[i] = toplam;
        }
        System.out.println(Arrays.toString(yeniArr));

    }
}
