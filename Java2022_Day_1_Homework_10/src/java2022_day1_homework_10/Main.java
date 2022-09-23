package java2022_day1_homework_10;

public class Main {

	public static void main(String[] args) {
		
		// Diziler Ile Calismak
		String[] students = new String[4];
		students[0] = "Dursun";
		students[1] = "Hakan";
		students[2] = "Sefa";
		students[3] = "Mehmet";
		
		for (int i = 0 ; i<students.length ; i++) {
			System.out.println(i);
		}
		
		System.out.println("");
		
		for (String student : students) {
			System.out.println(student);
		}
	}
}