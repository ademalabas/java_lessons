package BENIM_DOSYALAR.j01_Variables.J11_MethodCreation.tasks;

public class Task06 {

	public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini 
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */

			int sayi = 1234, tersi = 0;
			int yedek=sayi;

			while(sayi != 0) {
				int basamak = sayi % 10;
				tersi = tersi * 10 + basamak;
				sayi /= 10;
			}
			System.out.println("Sayının      : " + yedek);
			System.out.println("Sayının Tersi: " + tersi);




	}

}
