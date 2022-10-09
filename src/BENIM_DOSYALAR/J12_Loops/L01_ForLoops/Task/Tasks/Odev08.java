package BENIM_DOSYALAR.J12_Loops.L01_ForLoops.Task.Tasks;

public class Odev08 {

    public static void main(String[] args) {

        /*100'den 0'a kadar bütün tek sayıları yazdırınız.
        99-97-95....      100 ve 0 dahil değildir.*/
for (int i=99 ; i>0 ;i--){
    System.out.print(i%2==1 ? i+" ":" ");}

    }
}
