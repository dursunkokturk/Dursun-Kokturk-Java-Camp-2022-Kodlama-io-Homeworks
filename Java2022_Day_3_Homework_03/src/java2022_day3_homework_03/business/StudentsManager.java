package java2022_day3_homework_03.business;

import java2022_day3_homework_03.dataAccess.StudentsDao;

public class StudentsManager {
	private StudentsDao studentDao;
	
	public StudentsManager(StudentsDao studentDao) {
		this.studentDao = studentDao;
	}
	
	public void addStudent(StudentsDao studentDao){
		System.out.println("Added Student");
	}
	
	public void deleteStudent(StudentsDao studentDao){
		System.out.println("Delete Student");
	}
	
	public void updateStudent(StudentsDao studentDao){
		System.out.println("Update Student");
	}
}