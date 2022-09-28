package java2022_day2_homework_02;

public class Main {

	public static void main(String[] args) {
		// Parametreli Fonksiyonlari Anlamak
		
		// Main Class Disinda Parametreli Fonksiyon Tanimlama
		// Tanimlanan Fonksiyonda Yapilacak Islemi Belirtme
		// Main Class Icinde Fonksiyonu Cagirma
		// Cagirilan Fonksiyona Parametre Gonderme
		System.out.println("Today is so Beautiful");
		
		String message = "Today is so Beautiful";
		String newMessage = message.substring(0, 3);
		System.out.println(newMessage);
		
		// Total Fonksiyonu Icinde Bellirtilen Parametrelere Gore
		// Kullanicinin Girdigi Degerleri Degiskenlere Atama Yapiyoruz Ve 
		// Yapilan Islemin Sonucunu Total Degiskenine Atama Yapiyoruz
		int total = total(5,7);
		System.out.println(total);
		
		// String Tipinde Donen Fonksiyon Icindeki Degeri Yazdirmak Icin
		// Fonksiyonu Degiskene Atama Ve Atandigi Degisken Uzerinden
		// Fonksiyon Icindeki DEgeri Yazdiriyoruz
		String city = cityGive();
		System.out.println(city);
	}
	
	// Void Tipinde Donen Fonksiyon Hic Bir Degiskene Atanamaz
	public static void add() {
		System.out.println("Added");
	}
	
	// Void Tipinde Donen Fonksiyon Hic Bir Degiskene Atanamaz
	public static void delete() {
		System.out.println("Deleted");
	}
	
	// Void Tipinde Donen Fonksiyon Hic Bir Degiskene Atanamaz
	public static void update() {
		System.out.println("Updated");
	}
	
	public static int total(int number1,int number2) {
		return number1 + number2;
	}
	
	public static String cityGive() {
		return "Ankara";
	}
}