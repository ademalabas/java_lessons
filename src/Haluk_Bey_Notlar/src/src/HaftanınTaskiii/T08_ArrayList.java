package Haluk_Bey_Notlar.src.src.HaftanınTaskiii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class T08_ArrayList {
    public static void main(String[] args) {
        /*
        Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
         Örnek: (12, 31, 15, 32, 54) ==> Çıktı 31 ve 32'tür
         */
        int[] a={12, 31, 15, 32, 51};
        int minFark=Integer.MAX_VALUE;
        int index1=0;
        int index2=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(Math.abs(a[i]-a[j])<minFark){
                    minFark=Math.abs(a[i]-a[j]);
                    index1=i;
                    index2=j;
                }
            }
        }
        System.out.println(a[index1]);
        System.out.println(a[index2]);



        int[] b={15, 31, 8, 13, 12};
        for (int i = 0; i < b.length; i++) {
            if(!(b[i]==8||b[i]==12)){
                b[i]+=2;
            }
        }
        System.out.println(Arrays.toString(b));
        // 2. yol
        ArrayList<Integer> sayiList=new ArrayList<>(Arrays.asList(12, 31, 15, 32, 54));
        int fark=Collections.max(sayiList);
        Collections.sort(sayiList);
        System.out.println(sayiList);
        for (int i=0; i<sayiList.size()-1; i++){
            if (sayiList.get(i+1)-sayiList.get(i)<fark) {
                System.out.println(fark);
                fark=sayiList.get(i);
            }
        }
        System.out.println(sayiList.get(sayiList.indexOf(fark)-1)+" "+sayiList.get(sayiList.indexOf(fark)));
    }
}
