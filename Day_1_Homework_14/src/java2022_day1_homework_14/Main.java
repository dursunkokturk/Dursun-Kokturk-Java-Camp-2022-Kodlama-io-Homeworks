package java2022_day1_homework_14;

public class Main {

	public static void main(String[] args) {
		
		// String ler Ile Calismak
		String message = "   Bugün Hava Çok Güzel";
		System.out.println(message);
		System.out.println("");
				
		// Cumle Icindeki Bir Karakterin Yerine 
		// Baska Bir Karakter Koyma
		// Yazinin Bu Sekilde Duzenlenmis Halini Degiskene Atama Yaparsak 
		// Ayni Kodlari Tekrar Yazmaya Gerek Kalmaz
		System.out.println("Cümle Ýçine - Karakteri Koyulmuþ Hali:");
		System.out.println(message.replace(" ", "-"));
		System.out.println("");
		
		// Cumle Icindeki Karakterin Belirtilen index Numarasindan Itibaren 
		// Karakterleri Almak Icin Kullaniyoruz.
		System.out.println("Cümle Ýçine Belirtilen Karakterden Sonrasýnýn Alýnmýþ Hali: ");
		System.out.println(message.substring(4));
		System.out.println("");
		
		// Cumle Icindeki Belirtilen Iki index Numarasi Arasinda Kalan Karakteri
		// Almak Ýçin Kullaniyoruz.
		System.out.println("Ýki Ýndex Numarasý Arasýnda Kalan Karakterin Alýnmýþ Hali: ");
		System.out.println(message.substring(4,8));
		System.out.println("");
		
		// Cumle Icindeki Kelimeleri Belirtilen Belirtilen Duruma Gore
		// Ayirarak Array Tipinde Yazdiriyoruz
		System.out.println("Belirtilen Bir Duruman Göre Karakterin Array Tipinde Yazýlmýþ Hali: ");
		for (String word : message.split(" ")) {
			System.out.println(word);
		}
		System.out.println("");
		
		// Cümle Ýçindeki Karakterin Hepsinin Küçük Harf Ýle Yazdýrýyoruz
		System.out.println("Cümle Ýçindeki Karakterin Hepsinin Küçük Harf Ýle Yazýlmýþ Hali: ");
		System.out.println(message);
		System.out.println(message.toLowerCase());
		System.out.println("");
		
		System.out.println("");
		
		// Cumle Icindeki Karakterin Hepsinin Büyük Harf Ile Yazdiriyoruz
		System.out.println("Cümle Ýçindeki Karakterin Hepsinin Büyük Harf Ýle Yazýlmýþ Hali: ");
		System.out.println(message);
		System.out.println(message.toUpperCase());
		System.out.println("");
		
		System.out.println("");
		
		//Cumlenin Basindaki Ve Sonundaki Bosluk Karakterlerinin Hepsinin Silinmesi
		System.out.println("Cümlenin Baþýndaki Ve Sonundaki Boþluk Karakterlerinin Hepsinin Silinmiþ Hali: ");
		System.out.println(message);
		System.out.println(message.trim());
		System.out.println("");
	}
}