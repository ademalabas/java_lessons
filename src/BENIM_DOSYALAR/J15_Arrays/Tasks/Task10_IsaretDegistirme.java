package BENIM_DOSYALAR.J15_Arrays.Tasks;

import java.util.Arrays;

public class Task10_IsaretDegistirme {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */

        int Arr[]={1,-6,9,-18,65,-41,-16};
        System.out.println("Before :"+ Arrays.toString(Arr));

        for (int i = 0 ; i<=Arr.length-1 ; i++){
            Arr[i]*=-1;
        }
        System.out.println("After  :"+Arrays.toString(Arr));
// 2. yoll for each ile

        for (int i:Arr) {
            i=i*(-1);
        }
        System.out.println(Arrays.toString(Arr));


    }


}
