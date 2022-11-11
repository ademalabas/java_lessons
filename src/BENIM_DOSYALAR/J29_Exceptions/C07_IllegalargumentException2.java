package BENIM_DOSYALAR.J29_Exceptions;

public class C07_IllegalargumentException2 {
    public static void main(String[] args) {

        /*
ahan da TRİCK kosesinde bugun :)

"throw" - throws" farkları
1- "throws" -> main method kapanıs parantezi ile method body acılıs parantezi arasına yazılır.
   "throw" -> method body içinde tanımlanır.
2- "throws" -> keywordden sonra birden fazla exception tanımlanabilir
   "throw" -> keywordden sonra sadece bir tane exception tanımlanır
3- "throws" -> keywordden sonra sadece exception class name yazılır
    "throw" ->  keywordden sonra exception obj tanımlanır
4- "throws" -> keyword method ilk satırda sadece bir kez tanımlanır
    "throw" -> keyword istenildiği kadar method body de tanımlanabilir.
 */



        try {

            System.out.println("agam try block basından  selam :) ");
            hata();
            System.out.println("agam try block sonundan selam :) ");

        } catch (IllegalArgumentException e) {

            System.out.println("agam catch block basından  selam :) ");
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("agam catch block sonundan  selam :) ");
        }
        System.out.println("agam sorun handle edildi DEWAMKEEE :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur

    }//main sonu

    public static void hata() {
        throw new IllegalArgumentException("Agam nidding yine mi hata :( ");
    }


}
