package BENIM_DOSYALAR.J15_Arrays.Tasks;

public class Tasks17_EnBuyukDegeer {
    public static void main(String[] args) {
// elemanlardan en buyuk daire yi ver
int arr[][] = {{1,2,3},{19,-8},{24,10,-41}};//24

        int max=arr[0][2];//3
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>max)
                    max=arr[i][j];            }
        }
        System.out.println("max = " + max);



    }
}
