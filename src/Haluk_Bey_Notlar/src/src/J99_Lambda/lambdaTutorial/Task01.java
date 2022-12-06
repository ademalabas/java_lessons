package Haluk_Bey_Notlar.src.src.J99_Lambda.lambdaTutorial;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task01 {
    public static void main(String[] args) {
        String str = "javaCAN & JAVATAR";

        method13UnicodeRLO(str);
    }

    private static void method13UnicodeRLO(String str) {
        System.out.println("Unicode Right-to-Left Override ile "+"\u202E"+ str);
    }

    private static void method12Lambda(String str) {
        System.out.println("Lambda ile "+ Stream.of(str).map(t -> t.split("")).flatMap(Arrays::stream).reduce("", (s, c) -> c + s));
        System.out.println("Lambda ile "+str.chars().mapToObj(ch -> Character.toString(ch)).reduce("", (s, c) -> c + s));
        System.out.println("Lambda ile "+str.chars().mapToObj(Character::toString).reduce("", (s, c) -> c + s));
        System.out.println("Lambda ile "+Stream.of(str).map(t -> new StringBuilder(t).reverse()).collect(Collectors.joining()));
    }
}
