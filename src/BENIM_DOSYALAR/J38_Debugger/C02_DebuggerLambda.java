package BENIM_DOSYALAR.J38_Debugger;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C02_DebuggerLambda {

    public static void main(String[] args) {
        ebikGabik();

    }// main sonu


    private static void ebikGabik() {
        List<Integer> sayi= Stream.of(1,2,3,4,5,6,7,8,9,10).
                filter(t->t%2==0).map(t->t*2).
                collect(Collectors.toList());

        System.out.println("sayi = " + sayi);
    }
}
