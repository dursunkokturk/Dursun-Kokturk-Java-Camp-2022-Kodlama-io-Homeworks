package java2022_day3_homework_02_01;

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
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getProductCode());
	}
}