package BENIM_DOSYALAR.j04_AritmeticOperators.tasks;

public class Task01 {
	public static void main(String[] args) {
		int x = 4; //4
        x++;    //5
        x += x; // 5+5 =10
        --x;    //10-1=9
        x = 7 + x;//16
        x *= x;//16*16 =256
        x -= 3; //256-3 =253

        System.out.println(" x = " + x );
        
        int a = 3;
        double d = 4.5;

        d+=a; //4.5+ 3 = 7.5
        a+=d; // 3 + 7.5 =10.5 =integer 10 olur
        d-=a; // 7.5-10 = -2.5
        a-=d; //10 -(- 2.5) =12.5 =integer 12 olur

        System.out.println(" d = " + ++d ); // d= -1.5 yazar
        System.out.println(" a = " + a-- ); // 12 yazar fakat sonrasi icin a'ya 11 degerini atar
        
        

	}

}
