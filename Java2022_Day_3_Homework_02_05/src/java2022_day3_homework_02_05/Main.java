package java2022_day3_homework_02_05;

public class Main {

	public static void main(String[] args) {
		
		// Inheritance Yapisini Anlamak 2
		
		// CrediUI Class Icindeki Fonksiyona Inheritance Araciligi Ile 
		// Temel Kredi Manager i Parametre Olarak Veriyoruz 
		// CreditUI Objesi Olusturuyoruz
		// Olusturulan Objeyi Degiskene Atmaa Yapiyoruz
		CreditUI creditUI = new CreditUI();
		
		// Degisken Uzerinden CreditUI Class Icindeki Fonksiyona Ulasiyoruz
		// Ulasilan Fonksiyona new Anahtar Kelimesini Kullanarak Hesaplama Isleminin Yapilacagi
		// Class Adini Parametre Olarak Veriyoruz
		creditUI.CreditCalculation(new AgricultureCreditManager());
		creditUI.CreditCalculation(new TeacherCreditManager());		
	}
}