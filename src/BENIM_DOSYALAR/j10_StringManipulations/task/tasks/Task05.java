package BENIM_DOSYALAR.j10_StringManipulations.task.tasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

/* Task->
Girilen ad soyad bilgilerinin ilk harflerini
buyuk harf print eden code create ediniz..
 */


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.nextLine();
        System.out.println("Enter your surname");
        String surname = scan.nextLine();

        System.out.println("Name Surname : "+name.toUpperCase().charAt(0)+name.substring(1)+" "+
                surname.toUpperCase().charAt(0)+surname.substring(1));


      // Scanner sc = new Scanner(System.in);

      // System.out.print("1 adınızı giriniz : ");
      // String ilkAd = sc.nextLine();

      // System.out.print("2 adınızı giriniz : ");
      // String ikinciAd = sc.nextLine();

      // System.out.print("soyadınızı giriniz : ");
      // String soyad = sc.nextLine();

      // System.out.print(ilkAd.substring(0, 1).toUpperCase() + ilkAd.substring(1));
      // System.out.print(" "+ikinciAd.substring(0, 1).toUpperCase() + ikinciAd.substring(1));
      // System.out.println(" "+soyad.substring(0, 1).toUpperCase() + soyad.substring(1));

      //

    }


}

