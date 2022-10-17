package BENIM_DOSYALAR.J15_Arrays.odev;

public class _04_Create_Array_String {

    public static void main(String[] args) {

        /*
        elemanları: "new jersey" , "new york", "boston","California" olan  String array  oluşturun ve
        Array'daki eleman sayısını yazdırınız.
        Cevap 4 olmalı.
         */
String city[] ={ "new jersey", "new york", "boston", "california"};
  int count =0;
for(int i=0; i<city.length ;i++) {
      count++;
  }
        System.out.println("count = " + count);

    }
}
