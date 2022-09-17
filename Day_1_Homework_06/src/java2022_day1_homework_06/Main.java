package java2022_day1_homework_06;

public class Main {

	public static void main(String[] args) {
		
		// Switch Bloklari Ile Calismak
		String grade = "A";
		
		switch(grade) {
		case "A":
			System.out.println("Perfect : Passed");
			break;
		case "B":
			System.out.println("Very Good : Passed");
			break;
		case "C":
			System.out.println("Good : Passed");
			break;
		case "D":
			System.out.println("Not bad : Passed");
			break;
		case "F":
			System.out.println("Failed : Not Pass");
			break;
		default:
			System.out.println("You Entered Invalid Grade");
		}
	}
}