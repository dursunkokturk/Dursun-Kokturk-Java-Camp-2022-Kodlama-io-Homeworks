package java2022_day3_homework_01;

//Class Icinde Yapilacak Operasyonlarda 
//Kullanilacak Fonksiyonlari Yaziyoruz
public class CustomerManager {
	
	// Yapilacak Islemleri Hangi Musteri Icin Yapacagimizi
	// CreditServise Interface Icinde Yer Alan Fonksiyonlari 
	// Dependency Injection Yontemini Kullanarak 
	// Fonksiyonlarin Yer Aldigi Interface Icindeki Fonksiyonlari
	// Bu Class Icindeki Tum Fonksiyonlar Icin Kullanilabilir Hale Getiriyoruz
	private CreditService creditService;
	
	// Yapilacak Islemleri Hangi Musteri Icin Yapacagimizi
	// Customer Class inda Yer Alan Ozellikleri 
	// Dependency Injection Yontemini Kullanarak 
	// Ozelliklerin Yer Aldigi Class Icindeki Ozellikleri 
	// Bu Class Icindeki Tum Fonksiyonlar Icin Kullanilabilir Hale Getiriyoruz
	private Customer customer;
	
	// Class Adini Kullanarak Olusturulan Parametreli Constructor Icine 
	// Customer Class ini Icindeki Ozellikleri
	// CreditService Interface i Icindeli Icindeki Fonksiyonlari
	// Parametre Olarak Veriyoruz
	public CustomerManager(Customer customer, CreditService creditService) {
		this.customer = customer;
		this.creditService = creditService;
	}
	
	public void saveCustomer() {
		System.out.println("Added Customer");
	}
	
	public void deleteCustomer() {
		System.out.println("Deleted Customer");
	}
	
	public void giveCredit() {
		creditService.calculate();
		System.out.println("Gave Credit");
	}
}