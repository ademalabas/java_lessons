package BENIM_DOSYALAR.J20_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_PassByValue {



    public static void main(String[] args) {
        // pass by referans istinai durumdur  //java Pass By value olarak calisir
        // Java obje uzerinden  calistigindan referans onemlidir
/*Java non-primitive data turlerinde objenin kendisi degil de datalari degisirse
obje referans ve kendisi degismedigi datalari degisikligini kalici yapar

*/
// Task--> List elemanlari 24,20,87 iki farkli metod ile list elemanlarini
// Update edip print eden code create ediniz
// 1. metod for each   2. metod set()


        List<Integer> list = new ArrayList<>(Arrays.asList(24,20,87));
        System.out.println("metod oncesi list = " + list);//[24, 20, 87]
        listUpdate(list);// Pass by value
        listUpdate2(list);// Pass by referans
        System.out.println("metod sonrasi list = " + list);//[48, 40, 174] Pass by referaans
    }// main sonu

    public static void listUpdate(List <Integer> list){

    for (Integer vesika: list){
        vesika *=2;
       // System.out.println("  " + vesika +" ");
    }
        System.out.println(list);


    }
        public static void listUpdate2(List <Integer> list){

        for (int i=0; i<list.size(); i++){
            list.set(i,list.get(i)*2);
           // System.out.println("list  =  " + list);
        } System.out.println("list  =  " + list);


        }



}
