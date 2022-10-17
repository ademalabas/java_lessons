package BENIM_DOSYALAR.J15_Arrays.odev;

public class _11_Average_of_Array {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */
        int numArr[] = {12, 14, 21, 23, 10, 4};
        int total = 0;
        int avarage =0;
        for (int i = 0; i < numArr.length; i++) {
            total += numArr[i];
            avarage = total / numArr.length;
        }
        System.out.println("avarage = " + avarage);
    }
}