package java2022_day2_homework_09;

import java2022_day2_homework_10.Product;
import java2022_day2_homework_10.ProductManager;

public class Main {

	public static void main(String[] args) {
		
		// Encapsulation Ihtiyacini Anlamak
		
		// Kullanici Yetkilendirmesi Icin Kullanilabilir
		// Private Olarak Tanimlanan  Class Icindeki Ozelliklere 
		// Sadece Izin Verilen Kisiler Ulasabilir
		
		// Yada Bir Urune Ozel Bir Kod Uretmek Icin Kullanilabilir
		Product product = new Product();
		product.name = "Laptop";
		product.description = "Asus Laptop";
		product.price = 5000;
		product.stockAmount = 3;
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		productManager.delete(product);
		productManager.update(product);
	}
}