package BENIM_DOSYALAR.J11_MethodCreation.tasks;

import java.util.Scanner;

public class Task15_MetodUcusProject {

        /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
     */


    static Scanner sc = new Scanner(System.in);
    static double perPrice = 0.10;
    static int berlin = 500;
    static int copenhagen = 700;
    static int dublin = 900;

    public static void main(String[] args) {

        System.out.println("Welcome to Amsterdam Airlines");
        System.out.println("Where will you going?");

        String choice = sc.nextLine().toUpperCase();

        tripChoice(choice);


    }// main

    private static void tripChoice(String ch) {

        switch (ch) {
            case "BERLİN":
                berlinRecipe();
                break;
            case "COPENHAGEN":
                copenhagenRecipe();
                break;
            case "DUBLİN":
                dublinRecipe();
                break;
            default:
                System.out.println("We do not have Test01 flight to the place you want");
                break;
        }
    }

    private static void dublinRecipe() {
        System.out.print("How many passengers? Please enter \nUnder 12 years old : ");
        int underTwelve = sc.nextInt();
        System.out.print("Between 12 and 24? :");
        int between12and24 = sc.nextInt();
        System.out.print("Over 65 years old? :");
        int overSixtyfive = sc.nextInt();
        System.out.println("Normal person? :");
        int normalPerson = sc.nextInt();
        System.out.print("If you want round-trip? \n1.Yes \n2.No");
        int rounTrip = sc.nextInt();

        if (rounTrip == 2)
            System.out.println("Total price : " + (discountPrice(underTwelve, between12and24, overSixtyfive, normalPerson) * dublin));
        else if (rounTrip == 1)
            System.out.println("Total price : " + (discountPrice(underTwelve, between12and24, overSixtyfive, normalPerson) * dublin) * 2 * 0.8);
        else dublinRecipe();

    }

    private static void copenhagenRecipe() {
        System.out.print("How many passengers? Please enter \nUnder 12 years old : ");
        int underTwelve = sc.nextInt();
        System.out.print("Between 12 and 24? :");
        int between12and24 = sc.nextInt();
        System.out.print("Over 65 years old? :");
        int overSixtyfive = sc.nextInt();
        System.out.println("Normal person? :");
        int normalPerson = sc.nextInt();
        System.out.print("If you want round-trip? \n1.Yes \n2.No");
        int rounTrip = sc.nextInt();
        if (rounTrip == 2)
            System.out.println("Total price : " + (discountPrice(underTwelve, between12and24, overSixtyfive, normalPerson) * copenhagen));
        else if (rounTrip == 1)
            System.out.println("Total price : " + (discountPrice(underTwelve, between12and24, overSixtyfive, normalPerson) * copenhagen) * 2 * 0.8);
        else copenhagenRecipe();
    }

    private static void berlinRecipe() {
        System.out.print("How many passengers? Please enter \nUnder 12 years old : ");
        int underTwelve = sc.nextInt();
        System.out.print("Between 12 and 24? :");
        int between12and24 = sc.nextInt();
        System.out.print("Over 65 years old? :");
        int overSixtyfive = sc.nextInt();
        System.out.println("Normal person? :");
        int normalPerson = sc.nextInt();
        System.out.print("If you want round-trip? \n1.Yes \n2.No");
        int rounTrip = sc.nextInt();
        if (rounTrip == 2)
            System.out.println("Total price : " + (discountPrice(underTwelve, between12and24, overSixtyfive, normalPerson) * berlin));
        else if (rounTrip == 1)
            System.out.println("Total price : " + (discountPrice(underTwelve, between12and24, overSixtyfive, normalPerson) * berlin) * 2 * 0.8);
        else berlinRecipe();
    }

    private static double discountPrice(double a, double b, double c, double d) {

        double underTwelve = a * 0.5 * perPrice;
        double between12and24 = b * 0.9 * perPrice;
        double overSixtyfive = c * 0.7 * perPrice;
        double normalPerson = d * perPrice;

        return (underTwelve + between12and24 + overSixtyfive + normalPerson);

    }
}