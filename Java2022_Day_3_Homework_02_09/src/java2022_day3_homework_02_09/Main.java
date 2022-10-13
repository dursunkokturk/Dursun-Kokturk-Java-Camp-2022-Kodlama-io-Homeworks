package java2022_day3_homework_02_09;

public class Main {

	public static void main(String[] args) {
		
		// Abstract Class lar Ile Calismak
		
		// Birden Fazla Database Baglantisini 
		// Ayni Anda Kullanilabilir Hale Getirmek
		// Oracle Database
		// Sql Database 
		// Gibi Birbiri Ile Alakasi Olmayan Tum Database ler Icin 
		// Ortak Database Baglantisi Olusturmak Ve Kullanimini 
		// Pratik Hale Getirmek Gerekiyor
		
		// CustomerManager Objesi Olusturuyoruz
		// Olusturulan Objenin Atandigi Degisken Uzerinden
		CustomerManager customerManager = new CustomerManager();
		
		// CustomerManager Classs Icindeki 
		// Ortak Server Baglantisi Uzerinden Istenilen Server a Baglanmak Icin
		// Obje Olusturuyoruz
		// new Anahtar Kelimesinden Sonra Yazilan Obje Adi 
		// Baglanilacak Server i Belirtir
		customerManager.databaseManager = new SqlServerDatabaseManager();
		
		// Cagirilan Fonksiyonlar Ve Yapilan Islemler Baglanilmak Istenilen
		// Server Baglantisina Gore Calisacaktir
		customerManager.getCustomers();
	}
}