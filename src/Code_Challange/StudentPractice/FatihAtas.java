package Code_Challange.StudentPractice;

public class FatihAtas {
    public static void main(String[] args) {
//Verilen String değerinin içerdeği karakter sayılarını yazdıran code create ediniz.
        String str = "hfdsusıpg342g43y+$$%&&&##huıh 1235660+-*/ ";
        //logic
        //1. aşama verilen bütün karakterleri gezeceğim için for loopa ihtiyacım.
        //2. karakter sayısını almak için bizlere değeri 0 olan bir int değer girmem lazım.
        //3. str ifadesindeki her karakterden sadece 1 adet içeren bir String gerekiyor. (benzersizStr)
        String benzersizStr = "";
        for (int i = 0; i<=str.length()-1;i++) {
            benzersizStr+=(!benzersizStr.contains(""+str.charAt(i))? ""+str.charAt(i) : "");
        }
        System.out.println("(benzersizStr) = " + (benzersizStr));

        for(int i = 0 ; i<=benzersizStr.length()-1;i++) {
            int sayac=0;
            for(int j = 0 ; j<=str.length()-1;j++) {
                if(benzersizStr.charAt(i) == str.charAt(j)) {
                    sayac++;
                }
            }System.out.println("Karakter -> " + benzersizStr.charAt(i) + " = " + sayac);
        }//hfdsuıpg342y+$%&# 1560-*/

        //hfdsusıpg342g43y+$$%&&&##huıh 1235660+-*/



    }
}
