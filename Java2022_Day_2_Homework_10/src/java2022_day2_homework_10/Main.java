package java2022_day2_homework_10;

public class Main {

	public static void main(String[] args) {
		
		// Getter Ve Setter Ile Calismak
		
		// Kisitmala Yada Yetkilendirme Durumlarinda 
		// Kimlere Izin Verilmis Ise Veriyi Sadece Onlar Okuyabilir Ve Yazabilir 
		Product product = new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		
		// Product Objesi Icinde Girilen Verileri 
		// ProductManager Objesi Icindeki Fonksiyonlari Kullanarak
		// Ekleme Silme Guncelleme Islemleri Yapilabilir
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		productManager.delete(product);
		productManager.update(product);
		System.out.println(product.getProductCode());
	}
}