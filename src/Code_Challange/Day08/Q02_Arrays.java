package Code_Challange.Day08;

public class Q02_Arrays {
    public static void main(String[] args) {
        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan buyuk olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

        int input[] = {1, 2, 3, 4, 5, 6, 7};
        int total = 0;


        for (int i = 0; i < input.length; i++) {
            total += input[i];

        }
        System.out.println("total = " + total);

        double average = total/input.length;
        System.out.println("average = " + average);

        System.out.println("Bigger than Avarage");
        for (int i = 0; i < input.length; i++) {
            if (input[i] > average) {
                System.out.print(input[i] + " ");
            }
        }


    }
}
