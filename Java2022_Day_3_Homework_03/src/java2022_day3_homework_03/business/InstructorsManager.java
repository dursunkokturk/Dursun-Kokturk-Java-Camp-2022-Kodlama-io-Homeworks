package java2022_day3_homework_03.business;

import java.util.ArrayList;
import java.util.List;

import java2022_day3_homework_03.core.logging.Logger;
import java2022_day3_homework_03.dataAccess.InstructorsDao;
import java2022_day3_homework_03.entities.Instructors;

public class InstructorsManager {
	
	// Instructors Class i Icindeki Ozellikleri
	// InstructorsDao Interface ini Depedencty Injection Yontemini Kullanarak
	// Sistemde Kullaniyoruz Ve Ayni Zamanda
	// Sistemi Gevsek Bagimli Hale Getiriyoruz
	private InstructorsDao instructorDao;
	
	// Yapilan Islemleri Logger Class i Uzerinden Array Icinde Topluyoruz Ve
	// Database File Mail Olarak Kaydediyoruz 
	private Logger[] loggers;
	
	// Category Isimlerini Categories Class i Uzerinden ArrayList Icinde Topluyoruz
	List<String> instructorNames = new ArrayList<>();
	
	public InstructorsManager(InstructorsDao instructorDao,Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void addInstructor(Instructors instructor) throws Exception {
		
		// ArrayList Icindeki Instructor Isimlerini Dongu Icinde Tarama Yapiyoruz 
		for (String instructorCheck : instructorNames) {
			
			// Girilen Category Ismi Ile Var Olan Category Ismini Karsilastiriyoruz
			if (instructorCheck == instructor.getInstructorFirstName()+instructor.getInstructorLastName()) {
				
				// Karsilastirilan Degerler Ayni Ise Hata Veriyor
				throw new Exception("This Instructor Name Already Existing");
			}
		}
		
		// Girilen Instructor Ismi Ile Var Olan Insturctor Ismi Ayni Degil Ise
		// Instructor Ekleme Islemini Yapiyoruz
		instructorNames.add(instructor.getInstructorFirstName()+instructor.getInstructorLastName());
		
		instructorDao.addInstrutor();
	
		for (Logger logger : loggers) {
			logger.log(instructor.getInstructorFirstName()+instructor.getInstructorLastName());
		}
		
		System.out.println("Added Instructor");
	}
	
	public void deleteInstructor(Instructors instructor) {
		System.out.println("Deleted Instructor");
	}
	
	public void updateInstructor(Instructors instructor) {
		System.out.println("Updated Instructor");
	}
}