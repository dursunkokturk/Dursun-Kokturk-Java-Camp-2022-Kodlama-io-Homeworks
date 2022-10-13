package java2022_day3_homework_02_10;

public class Main {

	public static void main(String[] args) {
				
		// Interfaceler ile Çalýþmak
		
		// Bir Veya Birden Fazla Interface Kullanilarak Tanimlanmamis Fonksiyonlarin 
		// Implements Komutu Ile Server larda Kullanilmasi Ve 
		// Uygun Sekilde Yapilacak Islemlerin Belirtilmesi

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
		CustomerDal customerDal = new OracleCustomerDal();
		customerDal.add();
	}
}