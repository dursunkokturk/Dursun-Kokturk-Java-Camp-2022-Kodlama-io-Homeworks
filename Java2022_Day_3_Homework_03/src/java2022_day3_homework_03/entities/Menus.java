package java2022_day3_homework_03.entities;

public class Menus {
	private int id;
	private String menuName;
	
	public Menus() {
		
	}

	public Menus(int id, String menuName) {
		this.id = id;
		this.menuName = menuName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
}