package java2022_day1_homework_05;

public class Main {

	public static void main(String[] args) {
		
		// En Buyuk Sayiyi Bulma
		int number1 = 24;
		int number2 = 25;
		int number3 = 2;
		int largestNumber = number1;
		
		if(largestNumber < number2) {
			largestNumber = number2;
		}
		
		if(largestNumber < number3) {
			largestNumber = number3;
		}
		
		System.out.println("Largest Number : "+largestNumber);
	}
}