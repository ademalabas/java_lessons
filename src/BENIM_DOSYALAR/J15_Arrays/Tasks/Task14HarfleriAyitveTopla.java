package BENIM_DOSYALAR.J15_Arrays.Tasks;

import java.util.Arrays;

public class Task14HarfleriAyitveTopla {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
        String str = "s9o56hl6ahyer68";
        str=str.replaceAll("\\D","");
        String strArr[] = str.split("");
        System.out.println("Rakamlar : "+ Arrays.toString(strArr));

        int toplam=0;

        for (int i = 0; i < strArr.length; i++) {
            toplam+=Integer.parseInt(strArr[i]);
        } System.out.println("RAkamların toplamı : "+toplam);


    }


}

