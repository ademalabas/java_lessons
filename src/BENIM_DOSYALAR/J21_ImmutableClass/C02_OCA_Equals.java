package BENIM_DOSYALAR.J21_ImmutableClass;

public class C02_OCA_Equals {

    public static void main(String[] args) {
        String a = "";
        a += 2;//Test01="2"
        a += 'c';//Test01="2c"
        a += false;//Test01="2cfalse"
        System.out.println(a);
        String b = "2cfalse";
        System.out.println(b);
        if (a == "2cfalse") {//sart saglamaz if çalışmaz->  Test01 refensı  "2cfalse"  atama olmdg için ref yok
            System.out.println("==");
        }
        if (a.equals("2cfalse")) {
            System.out.println("equals");
        }
        String x="ali";
        String y="ali";

        if (x == y) {//sart saglamaz if çalışmaz->  Test01 refensı  "2cfalse"  atama olmdg için ref yok
            System.out.println("ahan da referansları aynı havuzda x ve y eşit ==");
        }
        //tanımlana atanan değeri Test01  ile aynı havuzda ve ref olan b variable
        if (a == b) {//sart saglamaz if çalışmaz->  Test01 refensı  "2cfalse"  atama olmdg için ref yok
            System.out.println("ahan da referansları aynı havuzda Test01 ve b eşit ==");
        }
    }
}
