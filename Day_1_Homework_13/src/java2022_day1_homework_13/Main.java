package java2022_day1_homework_13;

public class Main {

	public static void main(String[] args) {
		
		// String ler Ile Calismak
		String message = "Bugün Hava Çok Güzel";
		System.out.println(message);
		System.out.println("");
		
		System.out.println("Total Character Numbers: " + message.length());
		System.out.println("");
		
		System.out.println("5 th Character: " + message.charAt(4));
		System.out.println("");
		
		// concat Fonksiyonunu Tekrar Kullanirken Ayni Kodlari Tekrarlamayi Onlemek Icin 
		// Degiskene Atamak Gerekiyor
		System.out.println("Yazýya Ekleme Yapýlmýþ Hali : " + message.concat(" Yaþasýn!"));
		System.out.println("");
		
		// startsWith Fonksiyonunu Degisken Icindeki Yazinin 
		// Ilk Kelimesinin Ilk Karakterinin Belirtilen Karakter 
		// Olma Durumunu Sorgulamak Icin Kullanilir
		System.out.println("Yazýdaki Ýlk Karakter : " + message.startsWith("B"));
		System.out.println("");
				
		// endsWith Fonksiyonunu Degisken Icindeki Yazinin 
		// Son Karakterinin Belirtilen Karakter 
		// Olma Durumunu Sorgulamak Icin Kullanilir
		System.out.println("Yazýdaki Son Karakter : " + message.endsWith("."));
		System.out.println("");
		
		// Bir Cumle Icindeki Karakterin Istenildigi Kadar ki Kismini 
		// index Numaralari Uzerinden
		// Istenilen Karakterden Baslayarak 
		// Bir Degiskene Atama Yapiyoruz.
		char[] characters = new char[5];
		message.getChars(0, 4, characters, 0);
		System.out.println("Yazýdan Aktarýlan Karakterler: " + characters);
		System.out.println("");
		
		// Bir Cumle Icinde Bastan Aramaya Baslayarak 
		// Bir Karakterin index Numarasini Ögrenme 
		// Ayni Karakterden Kac Tane Olduguna Bakmaz
		// Sadece Ilk Buldugu Karakterin index Numarasini Verir
		System.out.println("Yazýdaki Aranan A Karakterinin index Numarasý: " + message.indexOf("a"));
		System.out.println("");
		
		// Bir Cumle Icinde Bastan Aramaya Baslayarak 
		// Bir Karakterin index Numarasini Ogrenme 
		// Ayni Karakterden Kac Tane Olduguna Bakmaz
		// Sadece Ilk Buldugu Karakterin index Numarasini Verir
		System.out.println("Yazýdaki Aranan E Karakterinin index Numarasý: " + message.lastIndexOf("e"));
	}
}