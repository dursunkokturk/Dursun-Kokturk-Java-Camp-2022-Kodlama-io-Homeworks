package java2022_day2_homework_14;

public class CreditUI {
	
	// Arayuzu Kullanarak Ve Inheritance Aracigili Ile 
	// Temel Kredi Manager Class ini Parametre Olarak Veriyoruz
	// Verilen Parametre Uzerinden Inheritance Araciligi Ile Temel Kredi Manager Class Icindeki
	// Fonksiyona Ulasiyoruz
	public void CreditCalculation(BaseCreditManager baseCreditManager) {
		baseCreditManager.Calculate();
	}
}