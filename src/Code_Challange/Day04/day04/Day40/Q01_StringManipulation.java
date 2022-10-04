package Code_Challange.Day04.day04.Day40;

import java.util.Scanner;

public class Q01_StringManipulation {
    public static void main(String[] args) {



    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

    Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name and surname :");
    String name=sc.nextLine(),lastname= sc.nextLine();
    String fulname=name.concat(" "+lastname).toUpperCase();
        System.out.println("fulname = " + fulname);


    }}
