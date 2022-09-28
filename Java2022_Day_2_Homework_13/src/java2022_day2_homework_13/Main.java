package java2022_day2_homework_13;

public class Main {

	public static void main(String[] args) {
		
		// Inheritance Yapisini Anlamak
		
		// Musteri Bilgilerini Yazdirmak Icin
		// Customer Objesi Olusturuyoruz Ve Degiskene Atama Yapiyoruz
		Customer customer = new Customer();
		
		// Calisan Bilgilerini Yazdirmak Icin
		// Employee Objesi Olusturuyoruz Ve Degiskene Atama Yapiyoruz
		Employee employee = new Employee();
		
		// Musteri Ekleme Silme Guncelleme Gibi Islemleri Yapmak Icin
		// CustomerManager Objesi Olusturuyoruz
		CustomerManager customerManager = new CustomerManager();
		
		// Calisan Ekleme Silme Guncelleme Gibi Islemleri Yapmak Icin
		// EmployeeManager Objesi Olusturuyoruz
		EmployeeManager employeeManager = new EmployeeManager();
		
		// Customer Objesinin Atandigi Degisken Uzerinden
		// Musteri Bilgilerini Giriyoruz
		customer.firstName = "Dursun";
		customer.lastName = "Köktürk";
		customer.customerAge = 36;
		customer.customerEmail = "dursunserefkokturk@gmail.com";
		
		// Employee Objesinin Atandigi Degisken Uzerinden
		// Calisan Bilgilerini Giriyoruz
		employee.firstName = "Dursun";
		employee.lastName = "Köktürk";
		employee.customerAge = 36;
		employee.employeeSalary = 5000;
		
		// CustomerManager Objesinin Atandigi Degisken Uzerinden 
		// Musteri Bilgileri Ile Ilgili Yapilacak Islem Icin 
		// Gereken Fonksiyonu Cagiriyoruz
		customerManager.add();
		customerManager.delete();
		customerManager.update();
		
		// EmployeeManager Objesinin Atandigi Degisken Uzerinden 
		// Calisan Bilgileri Ile Ilgili Yapilacak Islem Icin 
		// Gereken Fonksiyonu Cagiriyoruz
		employeeManager.add();
		employeeManager.delete();
		employeeManager.update();
		employeeManager.bestEmployee();
	}
}