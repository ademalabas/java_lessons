package BENIM_DOSYALAR.J11_MethodCreation;

import java.util.Scanner;

public class C05_RecursiveMethod {
    /*
Recursive  call edildiğinde run time'da programa ekstradan yük getiren bir yapıdadır
çünkü bir fonksiyon kendi kendini çağırdığında her çağırmada yığında (stack) bir işlem gerçekleşir ve bir bellek konumu oluşur.
Bu yüzden özyineleme ile yapılan hesaplamalar daha yavaş ve verimsizdir.
Peki özyinelemeyi neden kullanıyoruz?
Bazı karmaşık çözülmesi güç problemlerde döngülere göre daha kısa ve anlaşılır olduğu için.
 */
    public static void main(String[] args) {
/*
faktoriyel girilen sayidan 1 e kadar olan tamsayilarin carpimina denir.
1!=1 0!=1  2!=2*1  ....6!= 6*5*4*3*2*1
Task girilen sayının faktöriyelini hsaplayan method create ediniz.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int a = scan.nextInt();
        System.out.println(faktöriyel(a));

    }// main ends

public static int faktöriyel(int a) {
        if(a>=1) {
            return a*faktöriyel(a-1);
        }else
            return 1;
}



}
