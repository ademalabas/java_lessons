package BENIM_DOSYALAR.J15_Arrays.Tasks;

import java.util.Scanner;

public class Task05_TerstenYazdirma {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter large number");
        int large = sc.nextInt();
        String largeArr[] = Integer.toString(large).split("");
        for (int i =largeArr.length - 1;i >= 0;i--){
            System.out.print(largeArr[i]);

        }

    }
  
}
