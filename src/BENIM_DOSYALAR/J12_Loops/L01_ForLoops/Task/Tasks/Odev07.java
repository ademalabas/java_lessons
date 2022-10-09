package BENIM_DOSYALAR.J12_Loops.L01_ForLoops.Task.Tasks;

public class Odev07 {

    public static void main(String[] args) {



//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15
int row =5;
for (int i =1 ; i<=5 ; i++) {
    int number = i;
    int column = row-1;
    for (int j = 1; j <= i; j++) {
        System.out.print(number + " ");
        number += column;
        column--;
    }
    System.out.println();// dummy
}




    }
}
