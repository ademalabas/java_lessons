package Code_Challange.Day07;


public class C01_While_DoWhile {
    public static void main(String[] args) {

        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

        int sayi = 2562;
        System.out.println(basamakToplami(sayi));
    }
        private static int basamakToplami(int sayi) {
            int toplam = 0;
            while (sayi != 0) {
                toplam += sayi % 10;
                sayi /= 10;
            }
            return toplam;

        }
    }
    //do while



    //for ile






