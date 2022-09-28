package java2022_day2_homework_10;

public class ProductManager {
	
	public void add(Product product) {
		System.out.println("Product Added : " + product.getName());
	}
	public void delete(Product product) {
		System.out.println("Product Deleted : " + product.getName());
	}
	public void update(Product product) {
		System.out.println("Product Updated : " + product.getName());
	}
}