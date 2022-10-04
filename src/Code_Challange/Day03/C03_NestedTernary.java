package Code_Challange.Day03;

public class C03_NestedTernary {
    public static void main(String[] args) {

/*
Final notu tanimlayin, Nested Ternary ile cozunuz
'A'  ->  "Gayet Basarili"
'B'  ->  "Basarili"
'C'  ->   "Ha gayret"
bu notlar disindakilere de Digerleri.. yazdiriniz
 */

    char finalNotu = 'B';

    String result = finalNotu=='A' ? "gayet basarili":
                    finalNotu=='B' ? "Basarili":
                    finalNotu=='C' ? "Ha gayet basarili":
                    "Digerleri" ;

        System.out.println("result = " + result);

    }

}
