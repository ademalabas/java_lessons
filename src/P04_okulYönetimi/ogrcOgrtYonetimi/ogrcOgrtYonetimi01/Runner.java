package P04_okulYönetimi.ogrcOgrtYonetimi.ogrcOgrtYonetimi01;


import Code_Challange.SalaryCalculationDRAKE.AutomationMac.Options;
import Code_Challange.SalaryCalculationDRAKE.AutomationMac.Urun;



public class Runner {
    public static void main(String[] args) {
        double accountBalance = 5;
        Urun urun = new Urun();
        // System.out.println(urun.toString());
        Options options = new Options();
        //options.select(urun);
        urun.setPrice(options.select(urun));
        accountBalance = options.balance(urun.getPrice(), accountBalance,urun);
        //System.out.println(accountBalance);
        options.purchase(urun.getPrice(),accountBalance,urun);
    }
}



