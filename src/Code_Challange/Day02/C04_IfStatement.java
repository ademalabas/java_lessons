package Code_Challange.Day02;

import java.util.Scanner;

public class C04_IfStatement {
    public static void main(String[] args) {

        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Y or N character:");
        char c = scan.next().charAt(0);

        if (c == 'Y' ||  c =='y') {
            System.out.println("YES");

        }else if (c == 'N' || c == 'n') {
            System.out.println("NO");
        }else {
            System.out.println("Invalid Input ... Please Enter valid character");
        }







    }




}
