package BENIM_DOSYALAR.J19_StaticVariable.ClassTask;

public class Task02_Customer {
/*
    Task 02 ->
    ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method

    Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz

     */

   String name;
   Object ElectricityCalculation;

   Task02_Customer (String name, Object ElectricityCalculation){
       this.name = name;
       this.ElectricityCalculation = ElectricityCalculation ;
   }


}
