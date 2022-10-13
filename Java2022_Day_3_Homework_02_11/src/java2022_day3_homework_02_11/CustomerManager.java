package java2022_day3_homework_02_11;

public class CustomerManager {

	private CustomerDal customerDal;
	
	public CustomerManager(CustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	// Is Katmani
	// Musteri Adi Girilme Durumu 
	// Dogru Girilme Kontrolu
	public void add() {
		customerDal.add();
	}
}