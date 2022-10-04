package Code_Challange.Day04;

public class C10_StringManipulation {
    public static void main(String[] args) {

        // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

            String s = "   Java ogrenmek123 Cok guzel@      ";
            s = s.replaceAll("\\d", "") //"   Java ogrenmek Cok guzel@      "
                    .replace("@", "")  //"   Java ogrenmek Cok guzel      "
                    .replace("C", "c") //"   Java ogrenmek cok guzel      "
                    .trim();                          //"Java ogrenmek cok guzel"
            System.out.println(s);




    }



}
