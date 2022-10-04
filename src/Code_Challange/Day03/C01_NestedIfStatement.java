package Code_Challange.Day03;

import java.util.Scanner;

public class C01_NestedIfStatement {
    public static void main(String[] args) {



/*
    Kullanici dan yas bilgisini alarak

       oy kullanma yasi :
      age >= 18  ==> oy kullanmaya uygun
      age >= 70  ==> uc kez oy kullanabilir
      70 > age >=50 ==> iki kez oy kullanabilir
      50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Yasini giriniz");
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("Yasiniz oy kullanmaya uygun");
            if (age >=70) {
                System.out.println("uc kez oy kullanabilirsiniz");
            }else if (age >=50) {
                System.out.println("iki kez oy kullanabilirsiniz");
            }else {// 50>age>=18
                System.out.println("bir kez oy kullanabilirsiniz");
            }
            }else System.out.println("Oy kullnmak icin 18 yasi beklemelisiniz");
        }




    }








