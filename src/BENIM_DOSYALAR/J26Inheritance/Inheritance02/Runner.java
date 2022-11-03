package BENIM_DOSYALAR.J26Inheritance.Inheritance02;

import BENIM_DOSYALAR.J26Inheritance.Inheritance01.Koyun;
import BENIM_DOSYALAR.J26Inheritance.Inheritance01.Paluk;

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
       Kedi k1 = new Kedi();
        System.out.println("k1.a = " + k1.a);
        System.out.println("k1.c = " + k1.c);
        System.out.println("k1.d = " + k1.d);
        System.out.println("k1.m = " + k1.m);

        k1.mA();
        k1.mC();
        k1.mM();


        Mammal k2 =new Kedi();
        k2.mA();
        k2.mC();
        k2.mM();
        Mammal k3 =new Kedi();
        Hayvancik  k4 =new Kedi();
        Mammal  m1 =new Mammal();






    }



}
