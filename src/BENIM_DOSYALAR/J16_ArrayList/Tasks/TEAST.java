package BENIM_DOSYALAR.J16_ArrayList.Tasks;

import javax.management.MBeanAttributeInfo;

public class TEAST {
    public static void main(String[] args) {


        convert("Saat", 5);

    }


    public static void convert(String birim, int miktar) {

        switch (birim) {

            case "saat":

                System.out.println(miktar * 60 * 60);

                break;

            case "mil":

                System.out.println(miktar * 1.6);

                break;

            case "kilogram":

                System.out.println(miktar * 1000);

                break;

            default:

                System.out.println("saat, mil ve kilogram dışında bir birim girmeyiniz");

        }
    }

}






