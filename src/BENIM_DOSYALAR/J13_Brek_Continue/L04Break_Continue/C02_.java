package BENIM_DOSYALAR.J13_Brek_Continue.L04Break_Continue;

import java.util.Scanner;

public class C02_ {


    public static void main(String[] args) {
/*
Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
atlar ve loop'un bir sonraki değerinden devam eder.
 */

// Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter mail account: ");
        String mail = scan.nextLine();  //
        for( int i = 0; i <mail.length(); i++ ){
            char ch = mail.charAt(i);
            if(ch ==' ') continue;

            System.out.println(ch);
        }



    }


}
  //canner sc = new Scanner(System.in);
  //   System.out.println("AGAm meyıl hesabını giresen :");
  //           ​
  //           String meyıl = sc.nextLine();// egik Gabık @ cimey ıl. k om
  //           ​
  //           for (int i = 0; i < meyıl.length(); i++) {
  //   ​
  //   char ch = meyıl.charAt(i);
  //   ​
  //   if (ch==' '){
  //   continue;
  //   }
  //   ​
  //   System.out.print(ch);
  //   }
  //   ​
  //   ​