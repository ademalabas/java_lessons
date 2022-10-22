package BENIM_DOSYALAR.J16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Task02_ÖğrtNot {
    public static void main(String[] args) {
          /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz. u

         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Hocam kaç öğrencinin notunu gireceksiniz? ");
        int studentNo= scan.nextInt();
        ArrayList<Integer> scores = new ArrayList<>(studentNo);

        int not;
        double sum = 0;
        int counter=0;

        for (int i=0; i<studentNo; i++){//Notları aldık
            System.out.print((i+1)+". öğrencinin notunu giriniz: ");
            not=scan.nextInt();
            scores.add(not);
            sum+=not;
        }
        double average = sum/studentNo;//öğrencilerin not ortalamasını bulduk.
        System.out.println("öğrenci not ortalaması= "+average);

        for(int i=0; i<scores.size(); i++){//ortalamayı geçen öğrencilerin sayısını buluyoruz.
            if(scores.get(i)>average) counter++;
        }
        System.out.println("ortalamayı geçen öğrenci sayısı = " + counter);







    }
}
