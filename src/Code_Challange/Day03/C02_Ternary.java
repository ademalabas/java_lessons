package Code_Challange.Day03;

public class C02_Ternary {
    public static void main(String[] args) {
        /*
         * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
         * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
         * olsun
         */
        
        double fiyat =15;
        
        String result =fiyat<10 ? "ucuz": fiyat<20 ? "normal":"pahali";
        System.out.println("result = " + result);

        System.out.println(fiyat<10 ? "ucuz":fiyat<20 ? "normal" :"pahali");

    }

}
