package BENIM_DOSYALAR.J13_Brek_Continue.L04Break_Continue;

public class C05_OCA_Control {

    public static void main(String[] args) {
        int count = 0;
        //for (int row = 1; row <= 3; row++) {
        //    for (int col = 1; col <= 2; col++) {
        //        if (row * col % 2 == 0) continue;//raw*col cift ise bekleme yapma devam ticari: count artma
        //        count++;
        //    }
        //}
        //System.out.println(count);

        ROW_LOOP:
        for (int row = 1; row <= 3; row++)//dış loop
            //  System.out.println(); -> iç dış arası komut girerse looplar arası ilişki kopar
            for (int col = 1; col <= 2; col++) {//iç loop
                if (row * col % 2 == 0) continue ROW_LOOP;
                count++;
            }
    }

}
