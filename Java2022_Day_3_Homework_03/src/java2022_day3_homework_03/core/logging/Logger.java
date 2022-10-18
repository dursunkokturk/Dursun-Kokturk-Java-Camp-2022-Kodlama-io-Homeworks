package java2022_day3_homework_03.core.logging;

// Yapilacak Islemin Istenildigi Yerlerde Kullanilmasi Icin
// Interface Olarak Belirtiyoruz
public interface Logger {
	
	// Inteface Icindeki Islemin 
	// Gerektigi Yerlerde Kullanilmasi Icin 
	// Tanimlanmamis Fonksiyon Olarak Belirtiyoruz
	void log(String data);
}