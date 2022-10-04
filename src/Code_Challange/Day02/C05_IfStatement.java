package Code_Challange.Day02;

import java.util.Scanner;

public class C05_IfStatement {
    public static void main(String[] args) {


/*
   Print "Lutfen is unvaninizi girin
   jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
   Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
   Eger jobTitle  qa ise print is unvaniniz Quality Analyst
   test data: qa ise print Quality Analyst
   dev ise print Developer
   ba ise print Business Analyst
   pm ise print Project Manager
  */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen is unvaninizi girin");

        String qa = "Quality Analyst";
        String dev ="Developer";
        String ba = "Business Analyst";
        String pm = "Project Manager";
        String jobTitle = scan.next().toLowerCase();

        if (jobTitle.equals(qa)) {
            System.out.println("Quality Analyst");

        }else if (jobTitle ==dev) {
            System.out.println("Developer");
        }else if (jobTitle ==ba) {
            System.out.println("Business Analyst");
        }else if (jobTitle ==pm) {
            System.out.println("Project Manager");
        }else {
            System.out.println("Invalid Input ... Please Enter valid character");
        }






    }




}
