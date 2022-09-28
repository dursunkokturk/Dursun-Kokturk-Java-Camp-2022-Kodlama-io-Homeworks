package java2022_day2_homework_03;

public class Main {

	public static void main(String[] args) {
		
		// Variable Arguments Ile Calismak
		
		// Main Class Icinde Array Degerlerini Girme 
		// Main Class Icinde Girilen Array Degerlerini 
		// Main Class Disindaki Fonksiyonda Parametrede Kullanma 
		// Main Class Disinda int Tipinde Array Parametreli Fonksiyon Tanimlama
		// Tanimlanan Fonksiyonda Array Icinde For Dongusu Ile Tarama Islemi Yapma
		// For Dongusu Icinde Tarama Islem Sonucunda Elde Edilen Toplam Degeri Dondurme
		// Dondurulen Islem Sonucunu
		// Main Class Icindeki Degiskene Gonderme
		
		// int Tipinde Degerlerden Olusan Array Icine Degerleri Yaziyoruz
		int numbersTotal = numbersTotal(1,2,3,4,5,6,7,8,9);
		System.out.println("Total : " + numbersTotal);
	}
	
	// numbersTotal Fonksiyonu Icinde int Tipinde Array Parametresi Olusturuyoruz 
	public static int numbersTotal(int... numbers) {
		int total = 0;
				
		// Olusturulan Array Degerlerinin Atandigi Degisken Adi Uzerinden
		// Array Icinde Tarama Islemi Yapiyoruz
		// Tarama Islem Sonucunu Baska Bir Degiskene Aktarma Yapiyoruz
		// Array Icindeki Degerleri Toplama Islemi Yaptiktan Sonra
		// Islem Sonucunu Return Komutu Ile Dondurdukten Sonra
		// Total Degiskeni Uzerinden numbersTotal Fonksiyonuna Gonderiyoruz
		// numbersTotal Fonksiyonu Üzerinden numbersTotal Degiskenine Gonderiyoruz
		// Islem Sonucunu Yazdiriyoruz
		for (int number : numbers) {
			total += number;
		}
		return total;
	}
}