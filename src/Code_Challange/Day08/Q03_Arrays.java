package Code_Challange.Day08;

import java.util.Arrays;

public class Q03_Arrays {
    public static void main(String[] args) {
        /*  you have Test01 string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */
        //1. yol
        String  arr [] = {"HeySiri"};
        System.out.println(Arrays.toString(arr).replace("Hey", "Bye"));
//2. yol
        String str ="Heysiri";
str = str.replace("Hey", "Bye");
        System.out.println(str);
        String strArr[] = new String[1];
        strArr[0] =str;
        System.out.println(Arrays.toString(strArr));
//3. yol

        String str1 = "HeySiri";
        String yeniStr [] = str1.split("y");
        System.out.println(Arrays.toString(yeniStr)); //[He, Siri]
        yeniStr[0] = "Bye" ;
        System.out.println(Arrays.toString(yeniStr)); //[Bye, Siri]
        str1 =yeniStr[0] +  yeniStr[1];
        System.out.println("str1 = " + str1);
        String arr2[] = new String[1];
        arr2[0] = str1;
        System.out.println(Arrays.toString(arr2));



    }


}
