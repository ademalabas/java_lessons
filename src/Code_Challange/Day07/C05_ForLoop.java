package Code_Challange.Day07;


import java.util.Scanner;

public class C05_ForLoop {
    /* Kullanicidan sayilar girmesini isteyin
     * ve girdigi sayilari toplayip yazdirin.
     * yeni sayi isteyin
     * girilen sayilarin toplami 100 'u gecerse
     * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
     *
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalNum = 0;
        int times = 0;
        while (totalNum<=100) {
            System.out.print("Enter Number: ");
            int num = scan.nextInt();
            totalNum+=num;
            System.out.println("Total Number = " + totalNum);
            times++;
        }
        System.out.println("You entred  "+ times + "  times. \nTaotal number = " + totalNum);

    }
}
/*
Scanner scanner=new Scanner(System.in);
        int toplam=0;
        int count=0;
        for (int i = 0; i <100 ; i++) {
            count++;
            System.out.println("sayı giriniz");
            int sayı=scanner.nextInt();
            toplam+=sayı;
            if (toplam>100){
                System.out.println(count +" kere sayı girdin yeter");break;
            }
        }
        System.out.println("toplam "+toplam);
    }
 */