package BENIM_DOSYALAR.J26Inheritance.task01;

public class Runner {

    public static void main(String[] args) {
        A a=new A();
        System.out.println("a.mesaj = " + a.mesaj);//a obj ile call edildi bad practice
        System.out.println("A.mesaj = " + A.mesaj);// A class ile. Static ler class ismiyle çağrılır
        B b=new B();
        System.out.println("b.mesaj = " + b.mesaj);
    }



}
