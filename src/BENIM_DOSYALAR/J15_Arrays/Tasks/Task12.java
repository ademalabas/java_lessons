package BENIM_DOSYALAR.J15_Arrays.Tasks;

import java.util.Arrays;

public class Task12 {

    public static void main(String[] args) {
		/* TASK :
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini print eden code create ediniz.)
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */

        int Arr[]={2,6,4,5,8,9};
        System.out.println("Before :"+ Arrays.toString(Arr));

        for (int i = 0 ; i<=Arr.length-1 ; i++){
            Arr[i]*=Arr[i];
        }
        System.out.println("After  :"+Arrays.toString(Arr));



    }

}
