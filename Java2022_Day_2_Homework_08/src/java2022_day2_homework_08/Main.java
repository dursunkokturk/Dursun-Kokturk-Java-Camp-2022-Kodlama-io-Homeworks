package java2022_day2_homework_08;

public class Main {

	public static void main(String[] args) {
		
		// Field Ve Attribute Ile Calismak
		
		// Product Turunde Olusturulan Ve 
		// Product Degiskenine Atanan Product Objesi Olusturuyoruz
		// Product Degiskeni Uzerinden 
		// Product Class Icindeki Ozelliklere UIasiyoruz Ve 
		// Deger Atamasi Yapiyoruz
		Product product = new Product();
		product.name = "Laptop";
		product.description = "Asus Laptop";
		product.price = 5000;
		product.stockAmount = 3;
		
		// ProductManager Turunde Olusturulan Ve 
		// ProductManager Degiskenine Atanan ProductManager Objesi Olusturuyoruz
		// ProductManager Degiskeni Uzerinden 
		// ProductManager Class Icindeki Fonksiyonlara UIasiyoruz Ve 
		// Parametre Gondermesi Yapiyoruz
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		productManager.delete(product);
		productManager.update(product);
	}
}