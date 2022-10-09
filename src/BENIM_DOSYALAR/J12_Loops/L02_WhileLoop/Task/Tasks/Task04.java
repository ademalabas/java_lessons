package BENIM_DOSYALAR.J12_Loops.L02_WhileLoop.Task.Tasks;

public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.
		 */
		int i=999; int pieces=0;
		while (i>=100){
			if (i%4==0&&i%6==0){
				pieces++;
				System.out.print(i+" ");}
			i--;
		}System.out.println("\n"+pieces+" pieces of nuber can be divided by 4 and 6 without remainders.");
		
		

		
		
			
	}

}
