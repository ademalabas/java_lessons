package BENIM_DOSYALAR.J12_Loops.L03_DoWhileLoop;

public class C01_DoWhileLoop {

    public static void main(String[] args) {
/*
While loop-> önce sart konrol edilir eğer  sart sonucu true alınırsa body action çalışır
do-While loop-> önce body action çalışır sonra şart kontrol edilir.Sart true ise döngü devam eder.
sart false ise döngü lırılır ve döngüden sonraki ilk satır çalışır.
do-While loop->  game app. de daha çok kullanılır.
Trick: while loop sart sağlanmazsa hiç çaılşmayabilir ama do-while sart sağalasın sağlamasın
en az bir kez çalışır..
 */
int yas = 31;
 // while (yas < 33){
 // System.out.println("Agam yas  " +(yas) +"  gayet basarili While body actio");

 // yas++;
  //          }
        do {
            System.out.println("Agam Yas" +yas+ " GAYET BASARILI   dO While body actio");

            yas++;

        }while(yas<33);

    }
}

/*
        // task-> girilen tam sayının rakamları toplamını print eden METHOD create ediniz
        Scanner sc = new Scanner(System.in);
        System.out.println("AGAM nassıng :) bir tamsayı giriyorsun : ");
        int sayi = sc.nextInt();

        System.out.println(rakamTopla(sayi));//method call
    }//main sonu

    private static int rakamTopla(int sayi) {

        int rakamToplamı=0;
        while (sayi>0) {//sayı 1 olana dek body action çalış

        rakamToplamı+=sayi%10;// sayının birler basamağı rakamToplamına eklendi
            sayi/=10;// sayı 1 basamak eksiltildi
        }
   return rakamToplamı;
    }


 */