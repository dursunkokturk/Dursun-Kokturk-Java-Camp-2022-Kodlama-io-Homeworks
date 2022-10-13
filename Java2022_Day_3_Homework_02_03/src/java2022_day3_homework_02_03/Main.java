package java2022_day3_homework_02_03;

public class Main {

	public static void main(String[] args) {
		
		// Fonksiyon (Method) Overloading Ile Calismak
		// Adi Ayni Olan Fonksiyonlarin Gecerli Olmasý Icin 
		// Parametre Sayilarinin Farkli Olmasi Gerekiyor 
		FourOperations fourOperations = new FourOperations();
		System.out.println("2 Parameters Total Operarion : " + fourOperations.total(2,3));
		System.out.println("3 Parameters Total Operarion : " + fourOperations.total(2,3,7));		
	}
}