package java2022_day3_homework_03.entities;

public class Instructors {
	private int id;
	private String instructorFirstName;
	private String instructorLastName;
	
	public Instructors() {
		
	}

	public Instructors(int id, String instructorFirstName, String instructorLastName) {
		this.id = id;
		this.instructorFirstName = instructorFirstName;
		this.instructorLastName = instructorLastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInstructorFirstName() {
		return instructorFirstName;
	}

	public void setInstructorFirstName(String instructorFirstName) {
		this.instructorFirstName = instructorFirstName;
	}

	public String getInstructorLastName() {
		return instructorLastName;
	}

	public void setInstructorLastName(String instructorLastName) {
		this.instructorLastName = instructorLastName;
	}
}