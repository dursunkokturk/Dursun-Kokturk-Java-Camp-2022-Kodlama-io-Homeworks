package java2022_day3_homework_02_13;

public class ProductManager {

	public void add(Product product) {
		
		// ProducttValidator Class Icinde Girilen Bilgilerin 
		// Kurallara Uygun Sekilde Girilme Kontrolunu Yaptiktan Sonra
		// ProductValidator Objesi Uzerinden Data Geliyor Ise
		// Ekleme Islemi Yapilacak 
		// Data Gelmiyor Ise Ekleme Islemi Yapilmayacak
		ProductValidator validator = new ProductValidator();
		
		// ProductValidator Objesi Uzerinden Girilen Bilgiler 
		// Dogru Ise Ekleme Islemini 
		// Yanlis Ise Uyari Islemini Yapiyoruz
		if (validator.isValid(product)) {
			System.out.println("Added");
		}else {
			// Girilen Bilgiler Eksik Yada Yanlis Ise Uyari Islemini Yapiyoruz
			System.out.println("Infos Invalid");
		}
	}
}