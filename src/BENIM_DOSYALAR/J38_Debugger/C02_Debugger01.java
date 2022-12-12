package BENIM_DOSYALAR.J38_Debugger;

public class C02_Debugger01 {
    /*
Debug yapiyorsan, kodu anlamadin demektir.
Debug yaparken kodu anlamiyorsan, nasil debug yapilir, onu anlamadin demektir.
Debug yaparken kodu anladigini dusunuyorsan, aslinda debuga ihtiyacin olmadigini anladin demektir.
Debug etmek kodun mental bir modelinin eksikligine isarettir..


İki durumda debugger gerekli olabilir:
 *  Mevcut kod devralındığında.
 *  Yeni kod yazıldığında.
her iki durumda da debugger çalıştırmamaya dikkat edilmeli.
Amac sıfır debug aktivitesi ile uygulamayı istenilen seviyeye getirebilmek.
 */
    public static void main(String[] args) {


       method01();



    }// main sonu

    private static void method01() {
        System.out.println(" **** Method 01 calisiyor ****");
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+"  ");
        }
        System.out.println();// dummy
        System.out.println(" **** Method 02 call ediliyor ****");
        method02();

        System.out.println(" **** Method 03 call ediliyor ****");
        method03();
        System.out.println(" **** Method 01 bitti ****");


    }

    private static void method03() {
        System.out.println(" **** Method 03 calisiyor ****");
        for (int y = 1; y <= 7; y++) {
            System.out.print(y + "  ");

        }
        System.out.println();
        System.out.println(" **** Method 03 bitti ****");
    }

        private static void method02 () {
            System.out.println(" **** Method 02 calisiyor ****");
            for (int x = 1; x <= 7; x++) {
                System.out.print(x + "  ");
            }
            System.out.println();
            System.out.println(" **** Method 02 bitti ****");


        }
    }