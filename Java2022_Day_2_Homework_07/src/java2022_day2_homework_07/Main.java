package java2022_day2_homework_07;

public class Main {

	public static void main(String[] args) {
		
		// Class lar Ile Calismak
		FourOperations fourOperations = new FourOperations();
		int result1 = fourOperations.total(4, 7);
		System.out.println("Total : " + result1);
		
		int result2 = fourOperations.minus(7, 4);
		System.out.println("Minus : " + result2);
		
		int result3 = fourOperations.multiplication(4, 7);
		System.out.println("Multiplication : " + result3);
		
		int result4 = fourOperations.division(10, 2);
		System.out.println("Division : " + result4);
	}
}