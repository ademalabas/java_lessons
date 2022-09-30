package BENIM_DOSYALAR.j01_Variables.j10_StringManipulations.task.tasks;

import java.util.Scanner;

public class Homework_StringManpltn_24_sept {
    public static void main(String[] args) {
        //***************  Task1  ****************//
        Scanner scan = new Scanner (System.in);
        System.out.print("Please write any statement : ");
        String str = scan.nextLine();
        if (str.contains(" ")) {
            System.out.println("There is(are) space character(S) in statement.");
        }else {
            System.out.println("There is(are) no space character(S) in statement.");
        }
        //***************  Task7  ****************//
        System.out.print("Enter  any Name  just 3 letters  : ");
        String name = scan.nextLine();
        if (name.length() >= 4) {
            System.out.println("The name you entered more than 3 characters");
        }else{
            String kontrol = (name.charAt(0) == name.charAt(1) || name.charAt(0) == name.charAt(2) || name.charAt(1) == name.charAt(2)  ) ? "contains same letters" : "does not contain same characters";
            System.out.println(kontrol);}
        //***************  Task9  ****************//
        System.out.print("Please Enter any name : ");
        String a = scan.nextLine();
        String b = a.substring(0,((a.length()/2)));
        System.out.println(b);



    }




}
