package java2022_day3_homework_01;

public class Main {

	public static void main(String[] args) {
		
		/*
		// Class Icindeki Ozellikleri Yada Fonksiyonlari Kullanmak Gerektiginde 
		// Her Seferinde Ozellik Yada Fonksiyonu Yazmak Yerine 
		// Ozellik Yada Fonksiyonun Bulundugu Class Adini Kullanarak Obje Olusturduktan Sonra 
		// Objenin Atandigi Degisken Adi Uzerinden 
		// Class Icindeki Ozellik Yada Fonksiyona Ulasiriz
		// Class Icindeki Ozelliklerde Ekleme Yada Degistirme Oldugunda 
		// Bu Islem Sonucunda Class Icindeki Ozellik Yada Fonksiyonlarin 
		// Kullanildigi Yerlerde Degisiklik Yapmaya Gerek Kalmaz
		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.calculate();
		creditManager.saveCredit();
		
		
		
		
		
		// Class Icindeki Ozellikleri Yada Fonksiyonlari Kullanmak Gerektiginde 
		// Her Seferinde Ozellik Yada Fonksiyonu Yazmak Yerine 
		// Ozellik Yada Fonksiyonun Bulundugu Class Adini Kullanarak Obje Olusturduktan Sonra 
		// Objenin Atandigi Degisken Adi Uzerinden 
		// Class Icindeki Ozellik Yada Fonksiyona Ulasiriz
		// Class Icindeki Ozelliklerde Ekleme Yada Degistirme Oldugunda 
		// Bu Islem Sonucunda Class Icindeki Ozellik Yada Fonksiyonlarin 
		// Kullanildigi Yerlerde Degisiklik Yapmaya Gerek Kalmaz
		Customer customer = new Customer();
		customer.id = 1;
		customer.city = "Ankara";
		
		
		
		
		
		// Class Icindeki Ozellikleri Yada Fonksiyonlari Kullanmak Gerektiginde 
		// Her Seferinde Ozellik Yada Fonksiyonu Yazmak Yerine 
		// Ozellik Yada Fonksiyonun Bulundugu Class Adini Kullanarak Obje Olusturduktan Sonra 
		// Objenin Atandigi Degisken Adi Uzerinden 
		// Class Icindeki Ozellik Yada Fonksiyona Ulasiriz
		// Class Icindeki Ozelliklerde Ekleme Yada Degistirme Oldugunda 
		// Bu Islem Sonucunda Class Icindeki Ozellik Yada Fonksiyonlarin 
		// Kullanildigi Yerlerde Degisiklik Yapmaya Gerek Kalmaz
		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.saveCustomer();
		
		
		
		
		
		// Class Icindeki Ozellikleri Yada Fonksiyonlari Kullanmak Gerektiginde 
		// Her Seferinde Ozellik Yada Fonksiyonu Yazmak Yerine 
		// Ozellik Yada Fonksiyonun Bulundugu Class Adini Kullanarak Obje Olusturduktan Sonra 
		// Objenin Atandigi Degisken Adi Uzerinden 
		// Class Icindeki Ozellik Yada Fonksiyona Ulasiriz
		// Class Icindeki Ozelliklerde Ekleme Yada Degistirme Oldugunda 
		// Bu Islem Sonucunda Class Icindeki Ozellik Yada Fonksiyonlarin 
		// Kullanildigi Yerlerde Degisiklik Yapmaya Gerek Kalmaz
		Company company = new Company();
		company.id = 100;
		company.companyName = "Kodlama.io";
		company.taxNumber = "1234567890";
		
		// Company Objesine Gonderilen Degerleri
		// Company Objesinin Atandigi Degisken Uzerinden Parametre Olarak Veriyoruz
		CustomerManager addCompany = new CustomerManager(company);
		
		
		
		
		
		// Class Icindeki Ozellikleri Yada Fonksiyonlari Kullanmak Gerektiginde 
		// Her Seferinde Ozellik Yada Fonksiyonu Yazmak Yerine 
		// Ozellik Yada Fonksiyonun Bulundugu Class Adini Kullanarak Obje Olusturduktan Sonra 
		// Objenin Atandigi Degisken Adi Uzerinden 
		// Class Icindeki Ozellik Yada Fonksiyona Ulasiriz
		// Class Icindeki Ozelliklerde Ekleme Yada Degistirme Oldugunda 
		// Bu Islem Sonucunda Class Icindeki Ozellik Yada Fonksiyonlarin 
		// Kullanildigi Yerlerde Degisiklik Yapmaya Gerek Kalmaz
		Person person = new Person();
		person.firstName = "Engin";
		person.lastName = "Demirog";
		person.nationalityIdentity = "12345678901";
		
		// Company Objesine Gonderilen Degerleri
		// Company Objesinin Atandigi Degisken Uzerinden Parametre Olarak Veriyoruz
		CustomerManager addPerson = new CustomerManager(person);
		*/
		
		
		
		
		// CustomerManager Objesine Verilen Ilk Parametre
		// Pek Onemi Olmayan Bir Parametredir
		// CustomerManager Objesine Verilen Ikinci Parametre
		// Kredi Hesaplama Isleminin Hangi Musteri Turune Gore 
		// Yapilacagini Gosteriyor
		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.giveCredit();
	}
}