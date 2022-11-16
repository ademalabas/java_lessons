package BENIM_DOSYALAR.J18_Constructor.Haftanin_Taski;

import java.util.Scanner;

public class task021 {



    public static void main(String[] args) {
      /*  TASK :
		 	Create Test01 method to convert Roman numerals to numbers
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
        //TaskRomanToInteger

            String romanSayi="MCMXLV";
            int result = romanToInteger(romanSayi);

            System.out.println("Roman Numeral is: "+romanSayi);
            System.out.println("Integer Value is: "+result);

            System.out.println();

            romanSayi="DCCXCIX";
            result = romanToInteger(romanSayi);

            System.out.println("Roman Numeral is: "+romanSayi);
            System.out.println("Integer Value is: "+result);

            System.out.println();

            romanSayi="MCMXCIV";
            result = romanToInteger(romanSayi);

            System.out.println("Roman Numeral is: "+romanSayi);
            System.out.println("Integer Value is: "+result);
        }
        public static int romanToInteger(String romanSayi) {

            int sum = 0;
            for (int i = 0; i < romanSayi.length(); i++) {
                if (i>0 && charToInt(romanSayi.charAt(i))>charToInt(romanSayi.charAt(i-1))){
                    sum += charToInt(romanSayi.charAt(i)) - 2*charToInt(romanSayi.charAt(i-1));
                }else sum += charToInt(romanSayi.charAt(i));
            }
            return sum;
        }
        public static int charToInt(char c) {
            int value = 0;
            switch (c) {
                case 'I' : value = 1; break;
                case 'V' : value = 5; break;
                case 'X' : value = 10; break;
                case 'L' : value = 50; break;
                case 'C' : value = 100; break;
                case 'D' : value = 500; break;
                case 'M' : value = 1000; break;
                default: value = value; break;
            }
            return value;
        }



}
