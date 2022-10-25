package BENIM_DOSYALAR.J21_ImmutableClass;

public class C01_ImmutableClass {
    public static void main(String[] args) {
        String str1 ="murat"; //ilk degeri murat olan str1 variable
        String str2 ="murat";// str1 ve str2 ayni ilk degerlere sahip oldugu icin string havuzunda ortak referans atar


        String str3 = new String("murat");//degerleri ayni ref farkli object
        String str4 = new String("murat");//degerleri ayni ref farkli object

        String str5 =str1+"";

        System.out.println("str1== str2 = " + str1 == str2);//t
        System.out.println("str1== str3 = " + str1 == str3);//f
        System.out.println("str1.equals(str2) = " + str1.equals(str2));//t
        System.out.println("str3== str4 = " + str3 == str4);//f
        System.out.println("str1== str4 = " + str1 == str5);//f
        System.out.println("str1.equals(str5) = " + str1.equals(str5));//t

    }

}
