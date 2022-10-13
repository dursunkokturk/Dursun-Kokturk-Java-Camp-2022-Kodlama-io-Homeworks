package java2022_day3_homework_02_14;

public class ProductValidator {
	
	public ProductValidator() {
		System.out.println("Contructor Worked");
	}
	
	
	// Static Anahtar Kelimesini Kullanarak ProductManager Class Icinde
	// ProductValidator Objesi Olusturmaya Gerek Kalmadan
	// Girilen Bilgilerin Dogrulugunu Sorgulayabiliriz
	
	// Static Anahtar Kelimesi Kullanilan Fonksiyonlara 
	// Class Adi Uzerinden Ulasilabilir
	public static boolean isValid(Product product) {
		if (product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void someThing() {
		
	}
}