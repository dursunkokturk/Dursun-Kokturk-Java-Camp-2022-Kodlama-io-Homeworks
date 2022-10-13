package java2022_day3_homework_02_05;

public class CreditUI {
	
	// Arayuzu Kullnarak Ve Inheritance Aracigili Ile 
	// TEmel Kredi Manager Class ini Parametre Olarak Veriyoruz
	// Verilen Parametre Uzerinden Inheritance Araciligi Ile Temel Kredi Manager Class Icindeki
	// Fonksiyona Ulasiyoruz
	public void CreditCalculation(BaseCreditManager baseCreditManager) {
		baseCreditManager.Calculate();
	}
}