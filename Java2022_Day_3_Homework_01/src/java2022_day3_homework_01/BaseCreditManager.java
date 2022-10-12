package java2022_day3_homework_01;

// abstract Olarak Tanimlanan Class larda Ici Tamamlanmamis ve 
// Ici Tamamlanmis Fonksiyonlar Yazilabilir

// Ortak Fonksiyonlarin Icerigini Yonetiyoruz 
public abstract class BaseCreditManager implements CreditService{
	
	// Kullanildigi Her Yerde Icerigi Degisen Ortak Fonksiyonu Bu Sekilde Yapiyoruz
	public abstract void calculate();
	
	// Kullanildigi Her Yerde Icerigi Ayni Olan Ortak Fonksiyonu Bu Sekilde Yapiyoruz
	public void save() {
		System.out.println("Saved");
	}
	
	/*
	// Kullanildigi Her Yerde Icerigi Ayni Olan Ortak Fonksiyonu 
	// virtual Anahtar Kelimesini Kullanarak
	// Daha Sonradan Degistirilebilir Hale Getiriyoruz
	public virtual void save() {
		System.out.println("Saved");
	}
	*/
}