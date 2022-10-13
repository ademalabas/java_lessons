package BENIM_DOSYALAR.J15_Arrays;

import java.util.Arrays;

public class Pr01 {
    public static void main(String[] args) {

        int[] ageArray = {9, 4, 18, 11,14, 6,24,};

for ( int i= 0 ;i<ageArray.length;i++){
            System.out.print(ageArray[i]+ " ");
        }
        System.out.println();
        Arrays.sort(ageArray);

        int age=35;
        System.out.println(Arrays.binarySearch(ageArray, 35));
        System.out.println(Arrays.toString(ageArray));
for (int i= ageArray.length-1; i>=0 ;i--){
    System.out.print(ageArray[i]+ " ");
        }
        System.out.println();

Arrays.fill(ageArray,7);

System.out.println(Arrays.toString(ageArray));






    }
}
