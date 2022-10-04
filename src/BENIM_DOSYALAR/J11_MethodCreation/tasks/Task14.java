package BENIM_DOSYALAR.J11_MethodCreation.tasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

    /*
    Fazla mesaiyi hesaplayan bir  method create ediniz
    Yazacağınız program toplam kazancı return etsin.

    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */
        Scanner scan =new Scanner(System.in);
        System.out.print("Start time of your work : ");
        int start = scan.nextInt();
        System.out.print("Finis time of your work : ");
        int end = scan.nextInt();
        System.out.print("Payment for an hour : ");
        int payment = scan.nextInt();
        System.out.print("Extra work hour proportion : ");
        double extra = scan.nextDouble();
        double totalPayment = totalPayment(start, payment, extra, end);
        System.out.println("Total daily Payment = " + totalPayment+"$");


    }//main ends

    private static double totalPayment(int start, int payment, double extra, int end) {
        double totalPayment = ((end - start-8)*extra*payment) + (8*payment);
        return totalPayment;






    }
}
