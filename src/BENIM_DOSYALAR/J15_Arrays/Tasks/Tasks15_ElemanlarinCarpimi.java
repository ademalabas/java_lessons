package BENIM_DOSYALAR.J15_Arrays.Tasks;

public class Tasks15_ElemanlarinCarpimi {

    public static void main(String[] args) {
      // task arr tum elemanlari carpimini print eden code create ediniz

        int tower [][] = {
                {1, 2, 3},//0
                {9,8},//1
                //2
        };
        int times = 1;
        for (int floor = 0; floor < tower.length; floor++) {
            for (int flat = 0; flat < tower[floor].length; flat++){
                times*=tower[floor][flat];
            }
        }
        System.out.println("Multiplication = " +times);


        /*
         //task-> arr  tum elemalarının çarpımını print eden code create edinz
        int sayi[][]={{1,2,3},{9,8}};
        int crpm=1;//ilk 1 verielerk carpmada etki etmeyecek değer kullanıldı

        for (int kat = 0; kat < sayi.length; kat++) {//kat kontrolu

            for (int daire = 0; daire < sayi[kat].length; daire++) {//daire kpntrolu
                crpm*=sayi[kat][daire];
            }
        }
        System.out.println(crpm);//432

         */

    }
}
