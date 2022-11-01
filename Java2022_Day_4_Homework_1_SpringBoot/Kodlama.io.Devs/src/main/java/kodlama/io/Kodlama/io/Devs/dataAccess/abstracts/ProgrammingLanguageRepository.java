package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	
	List<ProgrammingLanguage> getAll();
	
	// Kaydetme Silme Guncelleme Gibi Islemler Yapildiktan Sonra
	// Sonuclar id Bilgisine Gore Listelenecek
	ProgrammingLanguage getById(int id);
	
	// Kaydetme Islemi Icin List Icindeki Array Adini Parametre Olarak Veriyoruz
	// Islem Sonucunu 
	void saveLanguage(ProgrammingLanguage programmingLanguage);
	
	// Silme Islemi Icin List Icindeki Array Adini Parametre Olarak Veriyoruz
	void deleteLanguage(ProgrammingLanguage programmingLanguage);
	
	// Guncelleme Islemini Yaparken Data nin Guncel Halini name Degiskeninde Tutuyoruz
	void updateLanguage(ProgrammingLanguage programmingLanguage,String name);
}