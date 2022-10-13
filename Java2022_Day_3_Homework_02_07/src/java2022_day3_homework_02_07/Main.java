package java2022_day3_homework_02_07;

public class Main {

	public static void main(String[] args) {
		
		// Overriding Alt Yapisi Ile Calismak
		
		// BaseCreditManager Objesi Array Tipinde Olusturuyoruz
		// Kredi Turlerini new Anahtar Kelimesi Ile Birlikte Parametre Olarak Veriyoruz 
		BaseCreditManager[] creditManagers = new BaseCreditManager[] {
				new AgricultureCreditManager(),
				new TeacherCreditManager(),
				new StudentCreditManager()
				};
		
		// For Dongusu Icinde BaseCreditManager Array Icindeki Degerleri Tarama Yapiyoruz
		// Tarama Islem Sonucunun Atandigi Degisken Uzerinden Inheritance Araciligi Ile
		// BaseCreditManager Class Icindeki Fonksiyona UIasiyoruz
		// Ulasilan Fonksiyona Parametre Gonderiyoruz
		for (BaseCreditManager creditManager : creditManagers) {
			System.out.println(creditManager.Calculate(1000));
		}
	}
}