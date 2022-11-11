package BENIM_DOSYALAR.J32_Abstract;

public class C01_Abstract {

 /*
    1- Bazı durumlarda child class'lar parent class'daki method'ların genellikle body2lerine değiştirerek override ederler.
    Bu gibi durumlarda parent class2daki method'a body tanımlamak ram ve memoey acısından gereksizdir.
    Çözüm olarak java Parent Class'a body'siz -> abstract(soyut)  methodlar tanımlamıştır

    2- Parent class'daki abstract methodlar app güvenliği açısından child class'da override edilmek zorundadır.
    eğer parent class'daki child class'ın mutlaka kullanması gereken method varsa abstract tanımlanmalı
    motor() her aracda olmalı.

    3- abstract method tanımlamak  için
      a) {} body olmaz
      b) access modief sonrası abstract keyword kullanılmalı
      abstrack class tanımlamak için class ifadesinden önce abstract keyword kullanılmalı.
    4- Abs method sadece abs Class'da tanımlanabilir kesinlikle concrete class'da abs method tanımlanamaz.
            ama abs class'da concerete emthod tanımlanabilir
     */





}
