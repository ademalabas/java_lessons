package Code_Challange.StudentPractice.W05Ebubekir.HesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {

    double x;
    double y;
    char secim;

    public HesapMakinesi(double x, double y, char secim) {
        this.x = x;
        this.y = y;
        this.secim = secim;
    }

    public HesapMakinesi() {
    }
    public double toplama(double x, double y){
        return (x+y);
    }
    public double cikarma(double x, double y){
        return (x-y);
    }
    public double carpma(double x, double y){
        return (x*y);
    }
    public double bolme(double x, double y){
        return (x/y);
    }
    public void giris(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Hangi işlemi yapmak istiyorsunuz (+),(-),(*),(/)");
        secim=sc.next().charAt(0);
        System.out.print("Birinci sayıyı Giriniz.. : ");
        x=sc.nextInt();
        System.out.print("İkinci sayıyı Giriniz.. : ");
        y=sc.nextInt();
        hesapla();
    }
    public void hesapla(){
        switch (secim){
            case '+':
                System.out.println("Toplama Sonucu = "+toplama(x,y));
                break;
            case '-':
                System.out.println("Çıkarma Sonucu = "+cikarma(x,y));
                break;
            case '*':
                System.out.println("Çarpma Sonucu = "+carpma(x,y));
                break;
            case '/':
                System.out.println("Bölme Sonucu = "+bolme(x,y));
                break;
            default:
                System.out.println("Yanlış işlem seçtiniz");
                break;
        }
    }



}
