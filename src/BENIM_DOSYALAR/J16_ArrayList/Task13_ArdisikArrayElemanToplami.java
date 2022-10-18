package BENIM_DOSYALAR.J16_ArrayList;

import java.util.ArrayList;

public class Task13_ArdisikArrayElemanToplami {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {
        int[] num={3,5,1,2,7,9,2,3,5,7};
        ArrayList<Integer> numList=new ArrayList<Integer>();
        int sum, j, counter=0;
        for (int i=0; i<num.length;) {
            sum=0;

            for (j=i; j<=i+counter && j<num.length; j++) {
                sum+=num[j];
            } System.out.println("sum = " +sum);
            numList.add(sum);
            counter++;
            i=j;
        }
        System.out.println(numList);


    }
}

