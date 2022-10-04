package Code_Challange.Day04;

public class C07_StringManipulation {
    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

            String s = "xyaz";
            boolean xyzIceriyorMu = false;
            if(s.contains("xyz")){
                xyzIceriyorMu = true;
                System.out.println(xyzIceriyorMu);
            }else {
                xyzIceriyorMu=false;
                System.out.println(xyzIceriyorMu);
            }






        }



}
