package java2022_day3_homework_01;

//Interface Dosyasinda Yer Alan Fonksiyonu Implements Komutu Ile
//Class Icinde Kullanilir Hale Getiriyoruz

//Bir Class Sadece Bir Tane Class i Veya 
//Bir Tane Abstract Class i Inheritance Yapabilir
public class MilitaryCreditManager extends BaseCreditManager implements CreditService{

	@Override
	public void calculate() {
		System.out.println("Calculated Military Credit");
	}
}