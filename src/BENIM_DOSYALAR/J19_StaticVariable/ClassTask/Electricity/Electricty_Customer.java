package BENIM_DOSYALAR.J19_StaticVariable.ClassTask.Electricity;

public class Electricty_Customer {
/*
    Task 02 ->
    ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method

    Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz

     */

   String name;
   ElectrictyCalculation electricityCalculation;

   Electricty_Customer(String name,  ElectrictyCalculation electricityCalculation){
       this.name = name;
       this.electricityCalculation = electricityCalculation ;
   }


}
