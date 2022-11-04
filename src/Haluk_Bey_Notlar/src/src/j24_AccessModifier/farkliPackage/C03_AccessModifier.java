package Haluk_Bey_Notlar.src.src.j24_AccessModifier.farkliPackage;

import Haluk_Bey_Notlar.src.src.j24_AccessModifier.C01_AccessModifier;

public class C03_AccessModifier {



    private String privateTeamLead="Hakan Aydın";
    String defaultName="cebrail bey";
    protected  String protectedName="Dilek hanım";
    public  String  publicName="Gamze Hanım";

    public static void main(String[] args) {

        C01_AccessModifier obj9= new C01_AccessModifier(23,63);//public cons.
        //agama public cons. selam :)
        System.out.println("obj9.publicYas = " + obj9.publicYas);//48->public variable
       // obj9.defaultYas// default variable package dısı erişlimez
       // obj9.protectedMethod()//protected methoc package dışı call edilemez


    }



}
