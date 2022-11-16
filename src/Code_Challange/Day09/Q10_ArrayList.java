package Code_Challange.Day09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10_ArrayList {
     /*
		A list has elements “H”, “G” and “E”
		Ask user to enter Test01 letter
		If the letter exists in list convert it to "Got it"
		otherwise add it to the list.
		Example : [H, G, E]
                  Enter Test01 letter :  h
                  [Got It, G, E]
                  Enter Test01 letter :  Test01
                  [H, G, E, A]
        */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("H");
        list.add("G");
        list.add("E");
        System.out.println("list = " + list);
        Scanner input = new Scanner(System.in);
        System.out.println("bir harf girinz :");
        String letter = input.next().trim().substring(0,1).toUpperCase();
        if(list.contains(letter)){
            list.set(list.indexOf(letter), "Got it" );
        }else
            list.add(letter);
        System.out.println("list = " + list);
    }




}
