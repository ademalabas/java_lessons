package BENIM_DOSYALAR.J32_Abstract.Ornek6;

public class BOA extends Bank {

    public BOA(String name, String phoneNUmber, String adress, int numEmployee) {
        super(name, phoneNUmber, adress, numEmployee);
    }

    @Override
    public void openAccount() {
        System.out.println("Adınız ve adres bilgilerininz alındı.");
        System.out.println(this.getClass().getSimpleName() + " HesapMakinesi açılışınız yapıldı.");
    }

    @Override
    public void closeAccount() {
        System.out.println("HesapMakinesi kapatma için talebiniz alındı");
        System.out.println(this.getClass().getSimpleName() + " Hesabınız kapatıldı..");
    }
}
