package BENIM_DOSYALAR.j01_Variables.J11_MethodCreation.tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Pelase  Enter Year");
        int year = scan.nextInt();
        System.out.println(leapYear(year));


    }//main end

    public static boolean leapYear (int year){
        boolean ly;
        if ((year%4 == 0) && (year%100!=0) || (year%400==0)) {
            ly = true;
        } else { ly= false;}
        return ly;
    }

    }






