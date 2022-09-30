package BENIM_DOSYALAR.j01_Variables.j02_DataTypes_WrapperClass.TASK;

public class Swap_Task_13_Sept {

    public static void main(String[] args) {
        /*
        BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK :
        Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        code create edip print ediniz.
        a) 3. bir variable kulanarak
        b) 3. bir variable kullanmadan

	     input	: sayi1=20 ve sayi2=34;
		 output  :  sayi1=34 ve sayi2=20

         */


        int sayi1=20;
        int sayi2=34;

        // a)
        System.out.println("*** a çözümü ***");
        System.out.println("Swaptan once sayi1->" + sayi1 +","+ "Swaptan Onceki sayi2->" + sayi2 );

    // Once gecici bir ucuncu variable olusturup  sayi 1 oraya atariz
        int temp = sayi1;

    // Sonra sayi1'e degisecek degerini (yani sayi ikinin degerini)atariz
        sayi1= sayi2;
    //Sonrasinda  temp olarak yedeklenen sayi1 degerini sayi2'ye atayalim
        sayi2=temp;
        System.out.println("Swaptan sonra sayi1->" + sayi1 +","+ "Swaptan sonra sayi2->" + sayi2 );

        // b)

        System.out.println("*** b çözümü ***");
        System.out.println("Swaptan once sayi1->" + sayi1 +","+ "Swaptan Onceki sayi2->" + sayi2 );
        /* A cozumunden sonra yeni degerler
        int sayi1=34;
        int sayi2=20;
        seklinde gerceklesiyor
        B cozumude bu degerler uzerinden yapilacak

         */
        sayi1 = sayi1-sayi2; // sayi1=34-20=14
        sayi2 =sayi1+sayi2; // sayi2=14+20=34
        sayi1 = sayi2-sayi1; // sayi1=34-14=20
        System.out.println("Swaptan sonra sayi1->" + sayi1 +","+ "Swaptan sonra sayi2->" + sayi2 );





    }





}
