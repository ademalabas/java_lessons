package BENIM_DOSYALAR.J12_Loops.L01_ForLoops;

public class C01_ForLoops {
    public static void main(String[] args) {
      // for(int i = 0; i<41; i++) {
      //
      //     System.out.println(i+".Masallah");
      // }
      //

         //  Task-> Iki basamakli sayilari teksayilari yan yana print eden code create ediniz
        for(int i = 11; i<99; i+=2) {

            System.out.print(i+" ");
        }
            System.out.println("  ***    ");

          for(int i = 10; i<100; i++) {
               if(i%2 == 1) {
              System.out.print(i+" ");  }
          }
           for(int i = 0; i>10; i++) {   // calismAZ
               System.out.println("selam javaCANlar");
           }
        System.out.println("agam bu metni okuduysan kod cakismadi");


           for (int i = 0; i>=0 ; i++)     {   // durmayan loop
               System.out.println(i);
           }


            // 41 kere maaşallah prin ediniz...
            //  System.out.println("maaşallah");
            //  System.out.println("maaşallah");
            //  System.out.println("maaşallah");
            //  System.out.println("maaşallah");
            //  System.out.println("maaşallah");
            //  System.out.println("maaşallah");
            //  System.out.println("maaşallah");
            //  System.out.println("maaşallah");
            //  System.out.println("maaşallah");
            //  System.out.println("maaşallah");

        /*
        loop->döngü tekrarlana aksiyonlar için kullanılan code blok'larıdır
         */
            //   baş.       bitiş   değişim
            // for (int i =1; i <=41 ;   i++  ) {//döngü boyunca tekrarlanacak action
//
            //     System.out.println(i+". maaşallah");//1. maaşallah  ... 41. maaşallah
//
            // }
            // System.out.println(" selam javacanlar bolcana offer");//döngü dışı 1 kez run olur

            // Task 2 basamaklı tek sayıları yan yana print eden code create ediniz -> 11,13,15...99

            // for (int i = 11; i <=99 ; i+=2) {
            //     System.out.print(i+" ");
            // }
            // System.out.println("   ***   ");
            // for (int i = 10; i <100 ; i++) {
            //     if (i%2==1){
            //         System.out.print(i+" ");
            //     }
            // }
            // çalışmayan loop
            for (int i = 0; i >10 ; i++) {//şartı sağlamayan->False olan for body run almaz
                // kod kırılarak sıradaki satırdan(46) devam eder
                System.out.println("selam javacan");

            }
            System.out.println("agam bumetni okuduysan yukarıdaki for çalışmadı");
            // durmayan sonsuz loop
            for (int i = 0; i >=0 ; i++) {//bu for çuğarayı cüpiterden yakana kadar çalışır:)
                // durduran aşk olsun
                System.out.println(i);
            }
        }

            
    }// mai



