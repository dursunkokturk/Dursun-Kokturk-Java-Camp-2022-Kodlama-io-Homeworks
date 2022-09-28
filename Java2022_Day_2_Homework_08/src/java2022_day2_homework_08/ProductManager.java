package java2022_day2_homework_08;

public class ProductManager {
	
	// Add Fonksiyonuna Product Turunde product Parametresi Gonderiyoruz
	// Eklenen Urunun Adini Yazdiriyoruz
	public void add(Product product) {
		System.out.println("Product Added : " + product.name);
	}
	public void delete(Product product) {
		System.out.println("Product Deleted : " + product.name);
	}
	public void update(Product product) {
		System.out.println("Product Updated : " + product.name);
	}
}