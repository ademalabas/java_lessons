package Haluk_Bey_Notlar.src.src.j32_Abstract.Ornek2;

public class Dikdortgen extends Sekil{

    private double uzunKenar;
    private double kisaKenar;

    public Dikdortgen(double uzunKenar, double kisaKenar) {//fuul p'li cons
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    @Override
    public double alanHesapla() {
        return this.uzunKenar*this.kisaKenar;
    }

    @Override
    public double cevreHesapla() {
        return (this.uzunKenar+this.kisaKenar)*2;
    }
}
