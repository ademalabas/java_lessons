package Code_Challange.StudentPractice;

public class C04_Koray {
    public static void main(String[] args) {

        System.out.println("uniq(\"AAABBBCCCDEF\") = " + uniq("AAABBBCCCDEF"));
    }
    public static String uniq(String str1){
        String uniqbos="";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.indexOf(str1.charAt(i))==str1.lastIndexOf(str1.charAt(i))){
                uniqbos=String.valueOf(str1.charAt(i));break;
            }
        }
        return uniqbos.length()==0?"Stringinizde uniq karakter bulunmamaktadir":uniqbos;

    }
}




