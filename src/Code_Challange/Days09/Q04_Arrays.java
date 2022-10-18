package Code_Challange.Days09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q04_Arrays {
    public static void main(String[] args) {

/*
Verilen Stringi array e cevirerek unlu harflerin sayisini bulan prgram yazin
String s= Apex,nesne yonelimli bir programlama dilidir"     aeiou  */

        String str = "Apex,nesne yonelimli bir programlama dilidir";
        ArrayList<String> list=new ArrayList<>(List.of(str.toLowerCase().split("")));
        int sesli=0;
        for (int i = 0; i < list.size(); i++) {
            sesli+=list.get(i).equals("a")||list.get(i).equals("e")||list.get(i).equals("ı")||
                    list.get(i).equals("i")||list.get(i).equals("o")||list.get(i).equals("ö")
                    ||list.get(i).equals("u")||list.get(i).equals("ü")?1:0;

        }
        System.out.println(sesli);

        // 2. yol
        //a, e, ı, i, o, ö, u ve ü
        String s2=" Apex,nesne yonelimli bir programlama dilidir" ;
        String [] s1=s2.split("");
        int toplam=0;
        for (int i = 0; i <s1.length ; i++) {
            if (s1[i].equalsIgnoreCase("a")||s1[i].equalsIgnoreCase("e")||
                    s1[i].equalsIgnoreCase("ı")||s1[i].equalsIgnoreCase("i")||
                    s1[i].equalsIgnoreCase("o")||s1[i].equalsIgnoreCase("ö")||
                    s1[i].equalsIgnoreCase("u")||s1[i].equalsIgnoreCase("ü"))
                toplam++;
        }
        System.out.println("Seli harfler toplami= "+toplam);
      // 3. yol
        String s= "Apex,nesne yonelimli bir programlama dilidir";
        s = s.replace(",","").replace(" ", "");
        System.out.println(s); //Apexnesneyonelimlibirprogramlamadilidir
        String []arr = s.split("");
        System.out.println(Arrays.toString(arr));//[A, p, e, x, n, e, s, n, e, y, o, n, e, l, i, m, l, i, b, i, r, p, r, o, g, r, a, m, l, a, m, a, d, i, l, i, d, i, r]
        String [] sesliHarfler = {"a","e","i","o","u"};
        System.out.println(Arrays.toString(sesliHarfler)); //[a, e, i, o, u]
        int count =0;
        for (int i = 0; i < arr.length; i++) { //outer loop
            for (int j = 0; j < sesliHarfler.length; j++) {//inner loop
                if(arr[i].equalsIgnoreCase(sesliHarfler[j])){
                    //arr deki herhangi bir karakter, sesli harflerdeki bir karaktere buyuk kucuk harf farketmezksizin esitese
                    count++; //sesli harf saysisini 1 artir
                }
            }
        }
        System.out.println("count = " + count);




    }
}
