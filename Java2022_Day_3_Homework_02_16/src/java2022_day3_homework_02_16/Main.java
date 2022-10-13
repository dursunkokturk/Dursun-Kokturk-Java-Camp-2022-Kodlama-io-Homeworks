package java2022_day3_homework_02_16;

public class Main {

	public static void main(String[] args) {
		
		// ProductValidator Class Icinde
		// Static Anahtar Kelimesini Kullanarak ProductManager Class Icinde
		// ProductValidator Objesi Olusturmaya Gerek Kalmadan
		// Girilen Bilgilerin Dogrulugunu Sorgulayabiliriz
		
		
		
		// ProductManager Objesi Uzerinden ProductManager Class i Icinde Girilen Bilgilerin 
		// Kurallara Uygun Olma Durumunu Kontrol Ediyoruz
		ProductManager productManager = new ProductManager();
		
		
		// Product Objesi Uzerinden Urun Bilgilerini Giriyoruz
		Product product = new Product();
		product.name = "Mouse";
		product.price = 10;
		
		// Bilgileri Girilen Urunu Yazdiriyoruz
		productManager.add(product);
		
		// Tek Bir Class Icinden Iki Farkli Islem Grubunu Yonetme
		// Bu Sekilde Yonetme Durumu Oldugunda 
		// Bir Grup Icindeki Islemleri Yaparken 
		// Diger Grupla Alakasi Olmadigi Halde 
		// O Grup Ile De Calismak Zorunda Kaliniyor
		DatabaseHelper.Crud.add();
		DatabaseHelper.Crud.delete();
		DatabaseHelper.Crud.update();
		
		DatabaseHelper.Connection.createConnection();
	}
}