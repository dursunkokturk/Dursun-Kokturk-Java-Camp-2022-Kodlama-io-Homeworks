package java2022_day2_homework_01;

public class Main {

	public static void main(String[] args) {
		
		// Fonksiyonlari (Metodlari) Anlamak

		// Main Class Disinda Fonksiyon Tanimlama 
		// Fonksiyonda Array Icinde 
		// For Dongusu Ile Sayi Arama
		// For Dongusundeki True Veya False Sonucuna Gore 
		//If Dongusunde Sayinin Bulunma Durumuna Göre Uyari Mesajý Yazdirma
		numberFind();
		numberFind();
	}
	public static void numberFind() {
		
		// Array Icinde Aranan Sayi Var Mi Yok Mu
		int[] numbers = new int[] {1,2,5,7,9,0};
		
		// Array Icinde Aranacak Sayi
		int searchNumber = 5;
		
		// Ilk Olarak Aranan Degerin Bulunamadigini Kabul Ediyoruz
		boolean isThere = false;
		
		// numbers Degiskeni Uzerinden Array Icinde Tarama Islemi Yapiyoruz
		// Tarama Islem Sonucunu search Degiskenine Aktarma Yapiyoruz
		// Tarama Asamasinda Bulunan Deger Ile Aranan Degerin Atandigi Degiskenlerin Eþitlik Durumuna Bakiyoruz
		// Iki Farkli Degiskende Yer Alan Degerler Birbirine Esit Ise
		// Aranan Deger Bulundu Demektir
		// Islem Sonucu True Yani 1 Olur
		for (int search : numbers) {
			if (search == searchNumber) {
				isThere = true;
				break;
			}
		}
		
		// Aranan Deger Bulundu Ise
		// Ekranda Sayi Var Yazilacak
		// Aranan Deger Bulunamadi Ise
		// Ekranda Sayi Yok Yazilacak
		if (isThere){
			// if Kisminda Ekrana Yazdirilacak Mesaji Ve 
			// Aranan Sayiyi Fonksiyon Icinde Belirtiyoruz
			messagePositive("Number is There : " + searchNumber);
		}else {
			// else Kisminda Ekrana Yazdirilacak Mesaji Ve 
			// Aranan Sayiyi Fonksiyon Icinde Belirtiyoruz
			messageNegative("Number is Not There : " + searchNumber);
		}
	}
			
	// if else Dongusunde
	// if ve else Kisimlarinda Ekrana Yazdirilacak Mesajlari Ve Aranan Sayinin Bilgisini
	// if ve else Dongusu Icindeki Fonksiyonda Belirtme Isleminden Sonra 
	// Parametre Uzerinden Fonksiyon MessagePositive Fonksiyonuna Aliyoruz
	// Fonksiyon Icindeki Message Degiskeni Uzerinden Ekrana Yazdiriyoruz
	public static void messagePositive(String message) {
		// Parametre Uzerinden Fonksiyon MessagePositive Fonksiyonuna Aliyoruz
		// Fonksiyon Icindeki Message Degiskeni Uzerinden Ekrana Yazdiriyoruz
		System.out.println(message);
	}
	public static void messageNegative(String message) {
		// Parametre Uzerinden Fonksiyon MessageNegative Fonksiyonuna Aliyoruz
		// Fonksiyon Icindeki Message Degiskeni Uzerinden Ekrana Yazdiriyoruz
		System.out.println(message);
	}
}