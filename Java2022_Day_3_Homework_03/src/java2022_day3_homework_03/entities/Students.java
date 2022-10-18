package java2022_day3_homework_03.entities;

public class Students {

	private int id;
	private String studentFirstName;
	private String studentLastName;
	private String studentUserName;
	private String studentEmail;
	private String studentPassword;
	
	public Students() {
		
	}

	public Students(int id, String studentFirstName, String studentLastName, String studentUserName, String studentEmail,
			String studentPassword) {
		this.id = id;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentUserName = studentUserName;
		this.studentEmail = studentEmail;
		this.studentPassword = studentPassword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getStudentUserName() {
		return studentUserName;
	}

	public void setStudentUserName(String studentUserName) {
		this.studentUserName = studentUserName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
}