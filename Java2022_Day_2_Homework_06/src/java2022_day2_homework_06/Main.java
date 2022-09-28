package java2022_day2_homework_06;

public class Main {

	public static void main(String[] args) {
		
		// Deger Ve Referans Tipleri Anlamak
		
		// Iki Farkli Degiskene Iki Farkli Deger Atamasi Yapiyoruz 
		int number1 = 10;
		int number2 = 20;
		
		// number1 Degiskenine Atanan Degeri number2 Degiskenine Atama Yapiyoruz
		// number1 Degiskenine Baska Bir Deger Atamasi Yapiyoruz
		number2 = number1;
		number1 = 30;
		
		// Bu Islemler Sonucunda Number2 Degiskenine Atanan Degerin Son Hali Ne Olur
		System.out.println("Number 2 : " + number2);
		
		// number3 Degiskenine Array Icinde Yer Alan Deger Atama Yapiyoruz
		// number4 Degiskenine Array Icinde Yer Alan Deger Atama Yapiyoruz
		int[] number3 = {1,2,3};
		int[] number4 = {4,5,6};
		
		// number3 Degiskenine Atanan Degeri number4 Degiskenine Atama Yapiyoruz
		// number3 Degiskenine Atanan Array Icindeki 
		// 0 nolu index te Yer Alan Degerin Yerine Yeni Deger Atama Yapiyoruz
		number4 = number3;
		number3[0] = 10;
		System.out.println("Number 4 : " + number4[0]);
	}
}