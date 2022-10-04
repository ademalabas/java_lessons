package Code_Challange.Day02;

public class C01_Modulus {
    public static void main(String[] args) {


// verilen 12345 sayisinin rakamlarini yukaridan asagiya dogru yazdiriniz
// Hint: use / and %
//    input: 12345
//    output: 1
//            2
//            3
//            4
//            5

       int x = 12345;
      //  int biler = x%10;//5
      //  int onlar =(x/10) %10;
      //  int yuzler =(x/100) %10;
      //  int binler = (x/1000) %10;
      //  int onBinler= (x/10000) %10;
//
        int birler = x%10; //5
        int onlar = (x/10) %10; //4;
        int yuzler =(x/100) %10 ; //3
        int binler = (x/1000) %10; //2
        int onBinler = (x/10000); //1
        System.out.println(onBinler + "\n" + binler + "\n" +yuzler + "\n" + onlar + "\n" + birler );







    }







}
