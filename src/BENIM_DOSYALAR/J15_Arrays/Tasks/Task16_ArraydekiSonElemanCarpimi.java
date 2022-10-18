package BENIM_DOSYALAR.J15_Arrays.Tasks;

public class Task16_ArraydekiSonElemanCarpimi {
    public static void main(String[] args) {
        // task sayi arrayindeki son elemanlarin carpimini prin eden code yaziniz

        int tower [][] = {
                {1, 2, 3},//0
                {9,8},//1
                {24,0,4}//2
        };
        int times = 1;
        for (int floor = 0; floor < tower.length; floor++) {

                times *=tower[floor][tower[floor].length-1];

        }
        System.out.println("Multiplication = " +times);

        /*
        package j15_Arrays;

public class Task16_ArraydekiSonElemanCarpimi {
    public static void main(String[] args) {
        // task-> sayi arr'deki son elemanların çarpımını print eden code create ediniz
        int sayi[][]={{1,2,3},{9,8},{24,0,4}};

        int crpm=1;

        for (int kat = 0; kat < sayi.length; kat++) {

                crpm*=sayi[kat][sayi[kat].length-1];

        }
        System.out.println(crpm);//96->3*8*4

         */



    }
}
