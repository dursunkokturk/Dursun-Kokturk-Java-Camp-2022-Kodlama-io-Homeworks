package java2022_day3_homework_02_06;

public class Main {

	public static void main(String[] args) {
		
		// Gercek Hayatta Polymorphism Ile Calismak
		
		// BaseLogger Class Icindeki Fonksiyona Verilen Parametreye
		// Burada Olusturulan Objenin Atandigi Degisken Uzerinden
		// Yazdirilan Mesajý Gonderiyoruz
		DatabaseLogger databaseLogger = new DatabaseLogger();
		databaseLogger.log("Log Message");
		
		FileLogger fileLogger = new FileLogger();
		fileLogger.log("Log Message");
		
		EmailLogger emailLogger = new EmailLogger();
		emailLogger.log("Log Message");
		
		System.out.println("");
		
		
		
		
		
		BaseLogger[] loggers = new BaseLogger[]{
				new DatabaseLogger(), 
				new FileLogger(), 
				new EmailLogger(), 
				new ConsoleLogger()
				};
		for (BaseLogger logger : loggers) {
			System.out.println(logger);
		}
		
		System.out.println("");
		
		
		
		
		
		// Yapilan Islemleri Loglama Yapmak Icin
		// new Anahtar Kelimesinin Kullanildigi Obje Icinde 
		// Hangi Class Icinde Loinde Loglama Yapilacak Ise 
		// O Class in Adini Yaziyoruz
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}
}