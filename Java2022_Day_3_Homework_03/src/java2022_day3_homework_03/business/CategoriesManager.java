package java2022_day3_homework_03.business;

import java.util.ArrayList;
import java.util.List;

import java2022_day3_homework_03.core.logging.Logger;
import java2022_day3_homework_03.dataAccess.CategoriesDao;
import java2022_day3_homework_03.entities.Categories;

public class CategoriesManager {
	
	// Categories Class i Icindeki Ozellikleri
	// CategoriesDao Interface ini Depedencty Injection Yontemini Kullanarak
	// Sistemde Kullaniyoruz Ve Ayni Zamanda
	// Sistemi Gevsek Bagimli Hale Getiriyoruz
	private CategoriesDao categoriesDao;
	
	// Yapilan Islemleri Logger Class i Uzerinden Array Icinde Topluyoruz Ve
	// Database File Mail Olarak Kaydediyoruz 
	private Logger[] loggers;
	
	// Category Isimlerini Categories Class i Uzerinden ArrayList Icinde Topluyoruz
	List<String> categoryNames = new ArrayList<>();
	
	public CategoriesManager(CategoriesDao categoriesDao,Logger[] loggers) {
		this.categoriesDao = categoriesDao;
		this.loggers = loggers;
	}
	
	public void addCategory(Categories categories) throws Exception {
		
		// ArrayList Icindeki Kategori Isimlerini Dongu Icinde Tarama Yapiyoruz 
		for (String categoryCheck : categoryNames) {
			
			// Girilen Category Ismi Ile Var Olan Category Ismini Karsilastiriyoruz
			if (categoryCheck == categories.getCategoryName()) {
				
				// Karsilastirilan Degerler Ayni Ise Hata Veriyor
				throw new Exception("This Category Name Already Existing");
			}
		}
		
		// Girilen Category Ismi Ile Var Olan Category Ismi Ayni Degil Ise
		// Category Ekleme Islemini Yapiyoruz
		categoryNames.add(categories.getCategoryName());
		
		categoriesDao.addCategory();
	
		for (Logger logger : loggers) {
			logger.log(categories.getCategoryName());
		}
		
		System.out.println("Added Categery");
	}
	public void deleteCategory(Categories categories) {
		System.out.println("Deleted Categery");
	}
	public void updateCategory(Categories categories) {
		System.out.println("Updated Categery");
	}
}