package java2022_day3_homework_03.dataAccess;

// JdbcCoursesDao Class ini Kullanarak Ekleme Silme Ve Guncelleme Islemlerinin Yapilacagi
// Class larin Interface lerini implements Komutunu Kullanarak Ekliyoruz
public class HibernateCoursesDao implements CoursesDao,CategoriesDao,InstructorsDao{

	@Override
	public void addCourse() {
		System.out.println("Added In Database With Hibernate");
	}

	@Override
	public void deleteCourse() {
		
	}

	@Override
	public void updateCourse() {
		
	}

	@Override
	public void addInstrutor() {
		System.out.println("Added In Database With Hibernate");
	}

	@Override
	public void deleteInstrutor() {
		
	}

	@Override
	public void updateInstrutor() {
		
	}

	@Override
	public void addCategory() {
		System.out.println("Added In Database With Hibernate");
	}

	@Override
	public void deleteCategory() {
		
	}

	@Override
	public void updateCategory() {
		
	}
}