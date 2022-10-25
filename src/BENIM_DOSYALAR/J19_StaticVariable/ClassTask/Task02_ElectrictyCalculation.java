package BENIM_DOSYALAR.J19_StaticVariable.ClassTask;

public class Task02_ElectrictyCalculation {
/*
    Task 02 ->
    ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method

    Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz

     */

    int totalConsumptions;
    final static double ratio =0.7;
    double bill;
   public  int consumption (int consumption) {
       return totalConsumptions +=consumption ;
   }
    public double recordedBill (){
    bill +=totalConsumptions*ratio;
    return bill;
}
    


        

}
