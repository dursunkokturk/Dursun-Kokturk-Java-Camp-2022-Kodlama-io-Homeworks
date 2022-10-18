package java2022_day3_homework_03.business;

import java.util.ArrayList;
import java.util.List;

import java2022_day3_homework_03.dataAccess.MenusDao;

public class MenusManager {
	
	private MenusDao menusDao;
	
	List<String> menusNames = new ArrayList<>();
	
	public MenusManager(MenusDao menusDao) {
		this.menusDao = menusDao;
	}
	
	public void addMenu(MenusDao menusDao) {
		System.out.println("Added Menu");
	}
	public void deleteMenu(MenusDao menusDao) {
		System.out.println("Deleted Menu");
	}
	public void updateMenu(MenusDao menusDao) {
		System.out.println("Updated Menu");
	}
}