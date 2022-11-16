package BENIM_DOSYALAR.J19_StaticVariable.ClassTask.OGRENCI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task03_Student {
 /*
    Task 03 ->
    Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
    Student Class : fields : name, maxCredit, dersleri(Lesson class obj) saklayacak list
                   derslerin toplam kredi miktarını return eden  toplamKredisi method
    Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
                       alamayacagı dersleri print eden code create ediniz

     */
 String StudentName;
    int maxCredi;
    List<Task03_Lesson> dersler=new ArrayList<>();

    public Task03_Student(String next){
        Scanner sc=new Scanner(System.in);
        StudentName= sc.next();
        while (maxCredi<=10){
            System.out.println("ders adı gir:");
            Task03_Lesson ders=new Task03_Lesson(sc.next());
            System.out.println(ders.dersİsmi+ "dersin kredisini giriniz:");
            ders.credi=sc.nextInt();
            if(maxCredi+ders.credi<=10){
                maxCredi+=ders.credi;
                dersler.add(ders);
                continue;
            }else System.out.println("Maksimum 30 kredi mikarını aşığınız için " + ders.dersİsmi + " dersini alamadınız");
            break;

        }

        System.out.println("Adınız :"+StudentName+"\nAldığınız dersler :");
        for (Task03_Lesson lesson:dersler) {
            System.out.println(lesson.dersİsmi+" : "+lesson.credit);
        }
        System.out.println("Toplam kredi :"+toplamKredisi());
    }

    public int toplamKredisi() {//Task'Test01 baglı kalmak için yazıp son printte kullandım
        return maxCredi;
    }





}
