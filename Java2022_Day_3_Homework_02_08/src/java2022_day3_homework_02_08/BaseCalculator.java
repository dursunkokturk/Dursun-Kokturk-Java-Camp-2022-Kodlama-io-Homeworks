package java2022_day3_homework_02_08;

//Bir Class ta Abstract Olarak Islem Yapilabilmesi Icin
//Class in Abstract Olarak Tanimlanmasi Gerekiyor
public abstract class BaseCalculator {

	// Default Degeri Olmayan Ama Kullanildigi Class Icinde 
	// Her Class a Gore Farkli Islemlerin Uygulanmasini Onaylamak Icin 
	// Class i Abstract Olarak Tanimliyoruz 
	public abstract void calculator();
	
	// Final Anahtar Kelimesi Kullanilarak Tanimlanan 
	// Fonksiyon Ve Icindeki Islem Kullanildigi Her Yerde Gecerli Olur
	// Ama Fonksiyon Icindeki Islem Sabittir Degistirilemez
	public final void gameOver() {
		System.out.println("Game Over");
	}
}