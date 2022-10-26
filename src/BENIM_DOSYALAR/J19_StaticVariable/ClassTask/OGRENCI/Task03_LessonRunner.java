package BENIM_DOSYALAR.J19_StaticVariable.ClassTask.OGRENCI;

import java.util.Scanner;

public class Task03_LessonRunner {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("öğrenci ismini gir:");
       Task03_Student ögr1=new Task03_Student(sc.next());

    }

}
