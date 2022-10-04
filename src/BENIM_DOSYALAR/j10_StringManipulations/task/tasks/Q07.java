package BENIM_DOSYALAR.j10_StringManipulations.task.tasks;

        import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter  any Name  just 3 letters  : ");
        String name = scan.nextLine();
        if (name.length() >= 4) {
            System.out.println("The name you entered more than 3 characters");
        }else{
            String kontrol = (name.charAt(0) == name.charAt(1) || name.charAt(0) == name.charAt(2) || name.charAt(1) == name.charAt(2)  ) ? "contains same letters" : "does not contain same characters";
            System.out.println(kontrol);}



    }
}