package BENIM_DOSYALAR.J16_ArrayList.Tasks;

public class _12_array1_duplicate {

    /*
    dupicate() isminde bir method oluşturun.
    Parametresi int Array olmalı
    Return tipi boolean
    Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
    Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.
    
    Örnek1:
    Input: [1,2,3,1]
    Output: true

    Örnek 2:
    Input: [1,2,3,4]
    Output: false
         */

    public static void main(String[] args) {

     int[] arr = {4,2,3,3,5,6,8,8};
        System.out.println("duplicate(arr) = " + duplicate(arr));
    }
    private static boolean duplicate(int[] arr) {
boolean flag =false;
int counter;
for ( int i :arr) {
    counter=0;
    for (int j:arr) {
        if(j==i) {counter++;}

    }if (counter>1){flag=true; break;}
}return flag;








    }


    }
