package Code_Challange.Day06;

public class Q02_ForLoop {

    public static void main(String[] args) {
//Interview Question
        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

        System.out.println("**** For *****");
        for (int i = 0; i <=255; i++) {
            char ch = (char) i;
            System.out.println(i+ " => "+ ch);
        }
        System.out.println("**** While *****");
        int a = 0;
        while (a <= 255) {
            char ch = (char) a;
            System.out.println(a+ " => "+ ch);
            a++;
        }
        System.out.println("****Do While *****");

        int d=0;
        do {
            char ch = (char) d;
            System.out.println(d + " => " + ch);
            d++;
        } while (d <= 255);



    }// main end
}
