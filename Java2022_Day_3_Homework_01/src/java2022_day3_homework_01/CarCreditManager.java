package java2022_day3_homework_01;

//Bir Class Sadece Bir Tane Class i Veya 
//Bir Tane Abstract Class i Inheritance Yapabilir
public class CarCreditManager extends BaseCreditManager implements CreditService{

	@Override
	public void calculate() {
		System.out.println("Calculated Car Credit");
	}
}