package java2022_day2_homework_09;

public class ProductManager {
	
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