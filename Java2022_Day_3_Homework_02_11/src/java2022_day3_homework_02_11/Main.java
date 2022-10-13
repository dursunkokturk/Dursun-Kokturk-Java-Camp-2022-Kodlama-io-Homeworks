package java2022_day3_homework_02_11;

public class Main {

	public static void main(String[] args) {
		
		// Interface Ile Polymorphism Kullanimi
		
		// OOP Programlama Temelinde Yer Alan Turler
		
		// Class lar
		// Class larda Inheritance Yaparken Miras Alinan Fonksiyonda 
		// Yapilacak Islemin Tanimlanmis Olmasi Gerekiyor
		
		// Abstract Class lar
		// Abstract Class larda Inheritance Yaparken Miras Alinan Fonksiyonda 
		// Yapilacak Islemin Tanimlanmis Olmasi Gerek Yoktur
		// Miras Alinan Class Icinde Fonksiyonda Yapilacak Islem Belirtilir
		
		
		// Interface ler
		// Abstract Class lar Gibi Inheritance Yaparken Miras Alinan Fonksiyonda 
		// Yapilacak Islemin Tanimlanmis Olmasi Gerek Yoktur
		// Miras Alinan Class Icinde Fonksiyonda Yapilacak Islem Belirtilir
		
		
		
		// Interface ler Normalde Yapilacak Islemin Belirtilmedigi Ancak
		// Onun Inheritance Yoluyla Alinip
		// Alindigi Class Icindeki Duruma Gore Islem Yapilmasi Icin Tercih Edilir
		
		
		
		// Class lar Birden Fazla Interface i Implements Komutu Ile Miras Alma Islemi Yapilabilir
		
		
		
		// Interface ler Ve Abstract lar
		// new Anahtar Kelimesi Kullanilarak Obje Olusturulamaz
		
		
		
		// Interface ler Kendisini Miras Alan Class in Referasini Tutabilir
		
		// CustomerManager Objesinin Atandigi Degisken Adi Uzerinden 
		// CustomerManager Class Icindeki Bagimlilik Onleyici customerDal Uzerinden 
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		
		// OracleCustomerDal Icindeki Fonksiyonu Cagiriyoruz 
		// New Anahtar Kelimesi Kullanilan Kisimda Hangi Server Adi Yazilirsa
		// O Server Icindeki Fonksiyon Cagirilir 
		// customerManager.customerDal = new OracleCustomerDal();
		customerManager.add();
	}
}