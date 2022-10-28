package BENIM_DOSYALAR.J18_Constructor.Haftanin_Taski;

import java.util.Scanner;

public class task02RomaRakam1 {



    public static void main(String[] args) {
      /*  TASK :
		 	Create a method to convert Roman numerals to numbers
		 	Romen rakamlarını sayılara dönüştürmek için bir method create ediniz
		 	Input:
		 		System.out.println(romanNumbers(805));
		   		System.out.println(fromRomans("DCCCV"));
		   	Output: DCCCV   805

		   		M + [C M] + [X L] + V   ---->   1945
		   		The chars in the brackets are in ascending order.
		   		 Parantez içindeki karakterler artan sıradadır (C-100, M-1000) ---> [C M]=900
		*/

//TaskRomanToInteger
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz. Lütfen int olsun :) => ");
        int sayi = scan.nextInt();
        SayiToRomaRakamlari(sayi);
        System.out.print("\nLütfen Roma rakamları ile bir sayı giriniz, boşlukları ben kaldıracam abi haberin olsun :D  => ");
        String romaRak = scan.next().toUpperCase().replace(" ", "");
        RomaRakamlariToSayi(romaRak);
    }
    //Sayıyı Roma Rakamlarına Çeviren Method
    public static void SayiToRomaRakamlari(int a) {
        int index = 0;
        int arr[] = { 1000, 500, 100, 50, 10, 5, 1 };
        while(index<=arr.length-1) {
            for(int i = 1 ; i<=(a/arr[index]);i++) {
                switch(arr[index]) {
                    case 1000: System.out.print("M"); break;
                    case 500: System.out.print("D"); break;
                    case 100: System.out.print("C"); break;
                    case 50: System.out.print("L"); break;
                    case 10: System.out.print("X"); break;
                    case 5: System.out.print("V"); break;
                    case 1: System.out.print("I"); break;
                }
            }
            a-=arr[index]*(a/arr[index]);
            index++;
        }
    }
    //Roma Rakamlarını Sayıya Çeviren Method
    public static void RomaRakamlariToSayi(String str) {
        int yil=0;
        for(int i = 0 ; i<=str.length()-1;i++) {
            switch(str.charAt(i)+"") {
                case "M": yil+=1000; break;
                case "D": yil+=500; break;
                case "C": yil+=100; break;
                case "L": yil+=50; break;
                case "X": yil+=10; break;
                case "V": yil+=5; break;
                case "I": yil+=1;break;
            }
        }
        System.out.println("Girdiğiniz Roma rakamlarına göre sayı = " + yil);


    }




}
