package java2022_day1_homework_15;

public class Main {

	public static void main(String[] args) {
		
		// Girilen Sayi Asal Mi
		int number = -1;
		
		if (number<0) {
			System.out.println("0 Dan Büyük Pozitif Sayý Giriniz");
		}else if (number<2) {
			System.out.println("2 Den Küçük Sayý Giremezsiniz");
		}else {
			boolean isPrime = true;
			
			for (int i = 2 ; i < number ; i++) {
				if (number % i == 0) {
					isPrime = false;
				}
			}
		
			if (isPrime) {
				System.out.println("Sayý Asaldýr");
			}else {
				System.out.println("Sayý Asal Deðildýr");
			}
		}

	}
}