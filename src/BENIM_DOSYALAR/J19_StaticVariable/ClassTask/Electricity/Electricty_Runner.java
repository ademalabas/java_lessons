package BENIM_DOSYALAR.J19_StaticVariable.ClassTask.Electricity;

public class Electricty_Runner {
    public static void main(String[] args) {

    ElectrictyCalculation bill1 = new ElectrictyCalculation();
    ElectrictyCalculation bill2 = new ElectrictyCalculation();
    Electricty_Customer customer1 = new Electricty_Customer("Adem",bill1);
    Electricty_Customer customer2 = new Electricty_Customer("Alabas",bill2);
    bill1.consumption(400);
    bill1.consumption(500);
    bill2.consumption(600);
    bill2.consumption(700);
        System.out.println(customer1.name + "Total consumption: " + bill1.totalConsumptions);
        System.out.println(customer1.name + "Bill amaunt : " + bill1.recordedBill());

        System.out.println(customer2.name + "Total consumption: " + bill2.totalConsumptions);
        System.out.println(customer2.name + "Bill amaunt : " + bill2.recordedBill());


    }
}
