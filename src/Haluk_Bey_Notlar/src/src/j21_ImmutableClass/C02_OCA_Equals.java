package Haluk_Bey_Notlar.src.src.j21_ImmutableClass;

public class C02_OCA_Equals {

    public static void main(String[] args) {
        String a = "";
        a += 2;//a="2"
        a += 'c';//a="2c"
        a += false;//a="2cfalse"
        String b = "2cfalse";
        if (a == "2cfalse") {//sart saglamaz if çalışmaz->  a refensı  "2cfalse"  atama olmdg için ref yok
            System.out.println("==");
        }
        if (a.equals("2cfalse")) {
            System.out.println("equals");
        }
       //tanımlana atanan değeri a  ile aynı havuzda ve ref olan b variable
        if (a == b) {//sart saglamaz if çalışmaz->  a refensı  "2cfalse"  atama olmdg için ref yok
            System.out.println("ahanda referansları aynı havuzda a ve b eşit ==");
        }


    }
}
