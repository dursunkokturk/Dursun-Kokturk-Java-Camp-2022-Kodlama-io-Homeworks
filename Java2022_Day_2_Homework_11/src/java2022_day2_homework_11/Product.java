package java2022_day2_homework_11;

public class Product {
	
	// Parametreli Constructor Kullanimi
	public Product (int id,String name,String description,double price,int stockAmount,String color,String productCode) {
		System.out.println("Constructor Block Worked");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.color = color;
		this.productCode = productCode;
	}
	
	// Parametresiz Constructor Kullanimi
	/*public Product () {
		System.out.println("Constructor Block Worked");
		int id;
		String name;
		String description;
		double price;
		int stockAmount;
		String color;
		String productCode;
	}*/
	
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String color;
	private String productCode;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getStockAmount() {
		return stockAmount;
	}
	
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
		
	public String getProductCode() {
		return this.name.substring(0,1) + id;
	}
}