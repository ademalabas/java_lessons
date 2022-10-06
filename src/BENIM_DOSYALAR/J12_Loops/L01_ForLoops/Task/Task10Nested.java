package BENIM_DOSYALAR.J12_Loops.L01_ForLoops.Task;

import java.util.Scanner;

public class Task10Nested {
    public static void main(String[] args) {

/*
girilen bir ifadenin istenen harf sayısını print eden code create ediniz

input : selam javaCAN'lar
output : a sayısı :3
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Statement");
        String cumle = sc.nextLine();

        System.out.println("sayilacak harfi giriniz");
        char harf = sc.nextLine().charAt(0);
        int harfsayisi =0;// ilk deger sifir oldu ki saymada etki etmesin
        for(int i=0; i<=cumle.length()-1;i++){
            if(cumle.charAt(i)==harf){
                harfsayisi++;

            }
        }
        System.out.println("Girdiginiz cumle =" +cumle+ "  de istediginiz harf  " +harfsayisi+ " tane  "+harf+ "  var");


    }//main





}
