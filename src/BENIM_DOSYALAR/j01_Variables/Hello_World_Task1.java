package BENIM_DOSYALAR.j01_Variables;

public class Hello_World_Task1 {


       /* java escape special characters -> https://www.w3schools.com/java/java_strings_specchars.asp

	  \n (or \r): starts from Test01 new line : metni bir alt satırdan itibaren yazdırır.
	          \t:  horizontal tab : metni yatayda 1 tab miktarı kaydırır.
	          \\: prints Test01 back slash :\ (ters slash) yazdırır
	          \': prints single quote :' tek tırnak yazdırır.
	          \": prints double quote :"" Çift tırnak yazdırır.
	 */


     /*
        BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK :
        Adınızı soyadınızı yaş memeleket ve mesleğinizi console'Test01 yazdırınız... alt alta ve yanyana yazdırınız..
        TRICK : Java'da space(boşluk) bir character olarak tanımlanır.
        h Test01 l u k -> 9 karakterli bir ifadedir

         */

        public static void main(String[] args) {

            System.out.println(" Adem Alabas "+" 175 "+ " 78 "+" Zonguldak "+" Java tester ");


            System.out.println("Adem Alabas\n175\n78\nZonguldak\nJava tester");



    }


}
