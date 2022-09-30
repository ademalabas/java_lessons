package BENIM_DOSYALAR.j01_Variables.j08_IfStatement_Ternary_Operators;

import java.util.Scanner;

public class C07_NestedTernary {
    public static void main(String[] args) {

/*
BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK :
 Girilrn bir pozitif tamsayı pozitif tamsayı 4 basamaklı ise  "4 Basamaklı" print eden
 4 basamaklı degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı" yazdırın.
 Çift sayı degilse "4 basamaklı olmayan tek sayı yazdırın."
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("agam bi tamsayı gir bakam : ");
        int agaSayisi   = scan.nextInt();

        System.out.println((agaSayisi >999 && agaSayisi< 10000) ?  "4 basamakli": agaSayisi%2==0 ? "4 basamakli 0lmayan cift sayi ": "4 basamaklı olmayan tek sayi");


    }
}
