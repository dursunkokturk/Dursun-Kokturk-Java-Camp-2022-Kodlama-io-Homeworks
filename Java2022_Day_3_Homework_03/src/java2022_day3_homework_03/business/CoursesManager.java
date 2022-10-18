package java2022_day3_homework_03.business;

import java.util.ArrayList;
import java.util.List;

import java2022_day3_homework_03.core.logging.Logger;
import java2022_day3_homework_03.dataAccess.CoursesDao;
import java2022_day3_homework_03.entities.Courses;

public class CoursesManager {
	
	// Courses Class i Icindeki Ozellikleri
	// CoursesDao Interface ini Depedencty Injection Yontemini Kullanarak
	// Sistemde Kullaniyoruz Ve Ayni Zamanda
	// Sistemi Gevsek Bagimli Hale Getiriyoruz
	private CoursesDao coursesDao;
	
	// Yapilan Islemleri Logger Class i Uzerinden Array Icinde Topluyoruz Ve
	// Database File Mail Olarak Kaydediyoruz 
	private Logger[] loggers;
	
	// Category Isimlerini Categories Class i Uzerinden ArrayList Icinde Topluyoruz
	List<String> courseNames = new ArrayList<String>();
	
	public CoursesManager(CoursesDao coursesDao,Logger[] loggers) {
		this.coursesDao = coursesDao;
		this.loggers = loggers;
	}
	
	public void addCourses(Courses courses) throws Exception {
		
		// ArrayList Icindeki Course Isimlerini Dongu Icinde Tarama Yapiyoruz 
		for (String courseCheckName : courseNames) {
			
			// Girilen Category Ismi Ile Var Olan Category Ismini Karsilastiriyoruz
			if (courseCheckName == courses.getCourseName()) {
				
				// Karsilastirilan Degerler Ayni Ise Hata Veriyor
				throw new Exception("This Course Name Already Existing");
			}
		}
		
		if (courses.getUnitPrice() < 0) {
			throw new Exception("The Course Free Cannot Be Less than 0");
		}
		
		// Girilen Course Ismi Ile Var Olan Course Ismi Ayni Degil Ise
		// Course Ekleme Islemini Yapiyoruz
		courseNames.add(courses.getCourseName());
		
		coursesDao.addCourse();
	
		for (Logger logger : loggers) {
			logger.log(courses.getCourseName() + courses.getCourseDetail() + courses.getUnitPrice());
		}
	}
	
	public void deleteCourses(Courses courses) {
		System.out.println("Deleted Course");
	}
	
	public void updateCourses(Courses courses) {
		System.out.println("Updated Course");
	}
}