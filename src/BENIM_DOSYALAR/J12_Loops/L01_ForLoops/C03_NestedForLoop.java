package BENIM_DOSYALAR.J12_Loops.L01_ForLoops;

public class C03_NestedForLoop {
/*
Eger bir dongununicinde baska bir dongu varsa nested loop denir
Icteki dongu dis dongunun her adiminda tekrar calisir
ic ice dongulerde icteki en once calisir
 */

    public static void main(String[] args) {
      for (int apt = 0; apt < 10; apt++) {
          System.out.println("Apt dongu"+ apt);
          for (int daire = 0; daire < 6; daire++) {
              System.out.println("Apt " +apt+ " icin daire dongu" + daire);
          }

      }




    }
}
