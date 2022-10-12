package java2022_day3_homework_01;

// Class Icinde Yapilacak Operasyonlar Kullanilacak
// Ozellikleri Yaziyoruz
public class Customer {
	
	public int id;
	public String firstName;
	public String lastName;
	public String city;
	
	// Class in Icindeki Ozelliklerin Yada 
	// Fonksiyonlarin Calisma Durumunu Kontrol Etmek Icin 
	// Parametresiz Constructor Kullanilabilir
	public Customer() {
		System.out.println("Started Customer Object");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}