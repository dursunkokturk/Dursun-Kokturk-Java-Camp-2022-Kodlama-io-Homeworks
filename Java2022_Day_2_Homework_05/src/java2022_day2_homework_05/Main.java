package java2022_day2_homework_05;

public class Main {

	public static void main(String[] args) {
		
		// Bir Class Nasil Calisir 
		
		// Musteri Bilgi Yonetiminin Yapildigi Class Adini Kullanarak
		// Obje Olusturuyoruz
		// Olusturulan Objenin Atandigi Degisken Adi Uzerinden
		// Class Icindeki Ozelliklere Ulasip Cagiriyoruz
		CustomerManager customerManager = new CustomerManager();
		customerManager.add();
		customerManager.delete();
		customerManager.update();
	}
}