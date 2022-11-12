package BENIM_DOSYALAR.J26Inheritance.Inheritance01;

public class Runner {
/*
 1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
 2)Parent Class'a "super class"   Child Class'a "sub class"  denir.
 3)Ortak ozellikler parent class'a, specific ozellikler child class'a tanımlanır.
 4)Parent Child Relationship "reusability", "maintenance",  "less code", "well organization" avantajları içim kullanılır.
 5)Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.
 6)Java "Multiple Inheritance"'i desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
 7)Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e "Hierarchical Inheritance"
   denir.
 8)Child-Parent-Grandparent... seklinde olusturulan cok katli  parent child relationshipe'e multi-level inheritance denir.
 9)"Object Class" -> Hz.Adem Class :) butun classlarin parent class'idir. Java'da parent class'i olmayan tek class "Object Class"dir

*/

    public static void main(String[] args) {
        Hayvancik hyvn =new Hayvancik();
        hyvn.haraket();
        hyvn.icme();
        hyvn.yeme();
        System.out.println("    *******    ");

        Mammal m1 = new Mammal();
        m1.sutBeslenme();// child mammal call edildi
        m1.dogum();// child mammal call edildi
        m1.icme();// parent Hayvancik call edildi
        m1.yeme();// parent Hayvancik call edildi
        m1.haraket();// parent Hayvancik call edildi
        System.out.println("    *******    ");

Paluk hamsi = new Paluk();//
        hamsi.ozgaraTava();//
        hamsi.icme();//parent Hayvancik call edildi
        hamsi.yeme();//parent Hayvancik call edildi
        hamsi.haraket();//parent Hayvancik call edildi



        System.out.println("    *******    ");
        Kedi kd = new Kedi();// parent Hayvancik call edildi
        kd.cirmalar();// kendisi
        kd.haraket();// parent Hayvancik call edildi
        kd.sutBeslenme();// parent Hayvancik call edildi
        kd.yeme();//parent Hayvancik call edildi
        kd.icme();// parent Hayvancik call edildi
        kd.dogum();//parent Hayvancik call edildi


        System.out.println("    *******    ");

        Koyun ky = new Koyun();// parent Hayvancik call edildi
        ky.semir();//kendisi
        ky.haraket();// parent Hayvancik call edildi
        ky.yeme();//parent Hayvancik call edildi
        ky.icme();//parent Hayvancik call edildi
        ky.dogum();//parent Mammal call edildi



    }



}
