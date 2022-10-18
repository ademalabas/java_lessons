package BENIM_DOSYALAR.J17_ForEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {

// Task Array elemanlarinin carpimini print eden code creaye ediniz --> with for each

        int arr [][] ={{2,3},{4},{5,6,7}};
        int times =1;
        for (int[] innerArr : arr) {
            for (int value1:innerArr) {
                times*=value1;
            }
        }
        System.out.println("times = " + times);

    }
}
