package Code_Challange.StudentPractice.W05Ebubekir.ObebOkek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObebOkek {

    /*
TASK => Girilen iki sayının EBOB ve EKOK larını print eden method yazınız.
Ekok(Test01,b)= |Test01*b|/ebob(Test01.b)
*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Birinci Sayıyı Giriniz");
        int num1= sc.nextInt();
        System.out.println("İkinci Sayıyı Giriniz");
        int num2= sc.nextInt();
        System.out.println("obeb(num1,num2) = " + obeb(num1, num2));
        System.out.println("okekbul(num1,num2,obeb(num1,num2)) = " + okekbul(num1, num2, obeb(num1, num2)));
    }

    private static int okekbul(int num1, int num2, int obeb) {
        return Math.abs(num1*num2)/obeb;
    }

    private static int obeb(int num1, int num2) {
        List<Integer> list=new ArrayList<>();
        for (int i = 1; i <=Math.max(num1,num2) ; i++) {
            for (int j = 1; j <=Math.min(num1,num2) ; j++) {
                if (num1%i==0 && num2%j==0){
                    if (i==j){
                        list.add(i);
                    }
                }

            }
        }

        return list.get(list.size()-1);
    }

}
