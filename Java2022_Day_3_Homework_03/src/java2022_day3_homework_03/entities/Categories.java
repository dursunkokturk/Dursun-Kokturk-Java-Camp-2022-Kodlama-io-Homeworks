package java2022_day3_homework_03.entities;

public class Categories {
	private int id;
	private String categoryName;
	
	public Categories() {
		
	}

	public Categories(int id, String categoryName) {
		this.id = id;
		this.categoryName = categoryName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}