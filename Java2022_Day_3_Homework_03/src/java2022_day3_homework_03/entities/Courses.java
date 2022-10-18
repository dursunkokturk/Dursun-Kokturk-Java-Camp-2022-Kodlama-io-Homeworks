package java2022_day3_homework_03.entities;

public class Courses {
	private int id;
	private String courseName;
	private String courseDetail;
	private double unitPrice;
	
	public Courses() {
		
	}
	public Courses(int id, String courseName, String courseDetail,double unitPrice) {
		this.id = id;
		this.courseName = courseName;
		this.courseDetail = courseDetail;
		this.unitPrice = unitPrice;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDetail() {
		return courseDetail;
	}
	public void setCourseDetail(String courseDetail) {
		this.courseDetail = courseDetail;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
}