package BENIM_DOSYALAR.j01_Variables.j10_StringManipulations.task.tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {

//"Grilen stringin sicindeki istenen indexi karakterini printcode create ediniz


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String str = scanner.nextLine();
        System.out.println("Istenen karaktrerin indeksinin giriniz");
        int     index= scanner.nextInt();

        if (str.length()>index) {
           // System.out.println(str.substring(index, index + 1));
            System.out.println(str.charAt(index));

        } else System.out.println("Olmayan index istiyorsun");


        //System.out.println(str.substring(sayi,sayi+1));

      //  /*
      // Girilen string içindeki istenen index'deki karakteri print eden code create ediniz
      //  */
      // Scanner sc = new Scanner(System.in);
      // System.out.print("bir metin giriniz : ");
      // String str = sc.next();
      // System.out.println("istenen karakterin index'ini giriniz : ");
      // int index=sc.nextInt();
      // if (str.length()>index){
      //     // System.out.println(str.substring(index, index + 1));
      //     System.out.println(str.charAt(index));
      // }else System.out.println("girdiğiniz metinde olmayan index istiyorsunuz");


    }


}

