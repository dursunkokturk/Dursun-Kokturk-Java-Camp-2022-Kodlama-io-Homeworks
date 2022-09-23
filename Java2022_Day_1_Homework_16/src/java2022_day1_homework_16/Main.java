package java2022_day1_homework_16;

public class Main {

	public static void main(String[] args) {
		
		// Girilen Harf Kalin Sesli Mi Ince Sesli Mi
		char word = 'A';
		
		switch(word) {
		case'A':
		case'I':
		case'O':
		case'U':
			System.out.println("Kalýn Sesli Harf");
			break;
		default:
			System.out.println("Ýnce Sesli Harf");
		}
	}
}