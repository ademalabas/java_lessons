package Code_Challange.Day08;

public class Q04_Arrays {
    public static void main(String[] args) {
        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz
         * int[] arr= {5,7,-6,4,2,15,3,8,1}; int
         * istenenToplam=9;
         */

        int arr1 [] = {5,7,-6,4,2,15,3,8,1};
        int IstenenToplam =0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print((arr1[i]+arr1[j]) ==9? arr1[i] +"+"+ arr1[j]+"=9" :"");
            }
            System.out.println();
        }
// 2.yol
        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;
        toplamDokuz(arr,istenenToplam);
    }
    private static void toplamDokuz(int[] arr, int istenenToplam) {
        for (int i = 0; i < arr.length; i++) { //outer loop - 1.toplanan
            for (int j = i + 1; j < arr.length; j++) { //inner loop -2.toplanan
                if (arr[i] + arr[j] == istenenToplam) {
                    System.out.println(arr[i] + " ve " + arr[j] + " toplami :" + istenenToplam);
                }
            }
        }

//inner for loop j = i+1 ve j =i olursa cikti




    }


}
