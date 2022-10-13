package java2022_day3_homework_02_07;

public class StudentCreditManager extends BaseCreditManager{
	
	// BaseCreditManamger Class Icindeki Fonksiyonu 
	// Burakili Class Icinde Kullanilmasý Islemine 
	// Override denir
	public double Calculate(double amount) {
		return amount * 1.10;
	}
}