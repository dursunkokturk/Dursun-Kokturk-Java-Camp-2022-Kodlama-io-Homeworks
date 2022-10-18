package java2022_day3_homework_03;

import java.util.List;

import java2022_day3_homework_03.business.CategoriesManager;
import java2022_day3_homework_03.business.CoursesManager;
import java2022_day3_homework_03.business.InstructorsManager;
import java2022_day3_homework_03.business.MenusManager;
import java2022_day3_homework_03.business.StudentsManager;
import java2022_day3_homework_03.core.logging.DatabaseLogger;
import java2022_day3_homework_03.core.logging.FileLogger;
import java2022_day3_homework_03.core.logging.Logger;
import java2022_day3_homework_03.core.logging.MailLogger;
import java2022_day3_homework_03.dataAccess.HibernateCoursesDao;
import java2022_day3_homework_03.dataAccess.JdbcCoursesDao;
import java2022_day3_homework_03.entities.Categories;
import java2022_day3_homework_03.entities.Courses;
import java2022_day3_homework_03.entities.Instructors;
import java2022_day3_homework_03.entities.Menus;
import java2022_day3_homework_03.entities.Students;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Courses courses = new Courses(1,"Java Software Development Camp","2 Months Course",10);
		
		Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		
		CoursesManager coursesManager = new CoursesManager(new HibernateCoursesDao(),loggers);
		coursesManager.addCourses(courses);
		coursesManager.deleteCourses(courses);
		coursesManager.updateCourses(courses);
		
		Categories categories = new Categories(1,"Back-End Programming");
		
		CategoriesManager categoriesManager = new CategoriesManager(new HibernateCoursesDao(), loggers);
		categoriesManager.addCategory(categories);
		categoriesManager.deleteCategory(categories);
		categoriesManager.updateCategory(categories);
		
		Menus menus = new Menus();
		menus.setId(1);
		menus.setMenuName("My Courses");
		
		MenusManager menusManager = new MenusManager(null);
		menusManager.addMenu(null);
		menusManager.deleteMenu(null);
		menusManager.updateMenu(null);
		
		Instructors instructor = new Instructors();
		instructor.setId(1);
		instructor.setInstructorFirstName("Engin");
		instructor.setInstructorLastName("Demirog");
		
		InstructorsManager instructorManager = new InstructorsManager(new HibernateCoursesDao(),loggers);
		instructorManager.addInstructor(instructor);
		instructorManager.deleteInstructor(instructor);
		instructorManager.updateInstructor(instructor);
		
		Students student = new Students(1,"Dursun","Kokturk","DursunKokturk","dk@gmail.com","123");
		
		StudentsManager studentManager = new StudentsManager(null);
		studentManager.addStudent(null);
		studentManager.deleteStudent(null);
		studentManager.updateStudent(null);
	}
}