package BENIM_DOSYALAR.J12_Loops.L01_ForLoops.Task;

public class Task13Nested {
    public static void main(String[] args) {


        /*
A
B B
C C C
D D D D
E E E E E
F F F F F F
şekli yazdırınız
*/

        int harf = 65;// ascii
        for (int i = 0; i < 6; i++) {// apt
            for (int j = 0; j <= i; j++) {// daire
               // System.out.print((char) (harf + j) + " "); // j= daire
                System.out.print((char) (harf + i) + " ");// i== daire
            }
            System.out.println();// dummy

            /*  Altarnatif cozum
                Scanner sc=new  Scanner(System.in);
        System.out.println("ağam hangi BÜYÜK harfe kadar yazdıralım : ");
        int c=sc.next().trim().charAt(0);

            for (int i = 65; i <=c ;i++) {
                System.out.print((char) (i));
                System.out.println();
            }


             */





        }

    }
}

