package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{
	
	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		
		// Programlama Dillerini(C#,Java,Python) 
		// Ekleyebilecek, 
		// Silebilecek, 
		// Guncelleyebilecek, 
		// listeleyebilecek, 
		// id ile getirebilecek kodları yazınız.
		
		return programmingLanguageRepository.getAll();
	}

	// Listi Parametre Olarak Kullaniyoruz
	@Override
	public void saveLanguage(ProgrammingLanguage programmingLanguage) {
		
		// List Icinde Data Kaydi Yapmadan Once 
		// Programlama Dilinin Girilme Durumunu Kontrol Ediyoruz
		// List Icinde Kaydedilmek Istenilen Programlama Dilinin 
		// Normalde List Icinde Var Olma Durumunu Kontrol Ediyoruz
		// 2 Sart da Gecerli Ise Girilen Programlama Dilini List Icine Kaydediyoruyz
		if(programmingLanguageNameValidator(programmingLanguage) && programmingLanguageExistValidator(programmingLanguage)) {
			programmingLanguageRepository.saveLanguage(programmingLanguage);
		}
	}

	// Listi Parametre Olarak Kullaniyoruz
	@Override
	public void deleteLanguage(ProgrammingLanguage programmingLanguage) {

		// List Icinde Yer Alan Data yi Silmek Icin
		// Dependency Injection Yontemi Ile ProgrammingLanguageRepository Dosyasinda Yer Alan
		// DeleteLanguage Fonksiyonuna List Icinde Array Adini Parametre Olarak Veriyoruz
		// id Bilgisi Ile Gelen Datayi Silme Islemini Yapiyoruz
		programmingLanguageRepository.deleteLanguage(programmingLanguage);
	}

	// Listi Parametre Olarak Kullaniyoruz
	// Update Islemini Yapmak Icin Bilginin Guncel Halini UpdateName Degiskeninde Tutuyoruz
	@Override
	public void updateLanguage(ProgrammingLanguage programmingLanguage, String updatedName) {
		
		// List Icinde Yer Alan Data yi Guncellemek Icin
		// isEmpty Fonksiyonu Ile Guncel Bilginin Girilme Durumunu Kontrol Ediyoruz
		// ProgrammingLanguageExistValidator Fonksiyonu Ile 
		// Girilen Guncel Bilginin Normalde Database Icinde Olup Olmadigina Bakiyoruz 
		if (updatedName.isEmpty() && programmingLanguageExistValidator(programmingLanguage)) {
			
			// Dependency Injection Yontemi Ile ProgrammingLanguageRepository Dosyasinda Yer Alan
			// UpdateLanguage Fonksiyonuna List Icinde Array Adini Parametre Olarak Veriyoruz
			// Ayni Zamanda Guncel Veriyi UpdatedName Degiskeni Uzerinden Aliyoruz 
			// id Bilgisi Ile Gelen Datayi Guncelleme Islemini Yapiyoruz
			programmingLanguageRepository.updateLanguage(programmingLanguage, updatedName);
		}
	}
	
	// id Bilgisi Uzerinden Gelen Kaydetme Silme Guncelleme Islemlerini Yapmak Icin 
	// List Icine id Bilgisi Uzerinden Ulasiyoruz
	@Override
	public ProgrammingLanguage getById(int id) {
		
		// Dependency Injection Yontemi Ile
		// ProgrammingLanguageRepository Dosyasi Icindeki 
		// GetById Uzerinden List Icindeki Tum Data lara Ulasiyoruz 
		programmingLanguageRepository.getById(id);
		return null;
	}
	
	// List Icine Yeni Bir Programlama Dili Kaydedilme Asamasinda
	// List Array Adini Parametre Olarak Veriyoruz
	public boolean programmingLanguageNameValidator(ProgrammingLanguage programmingLanguage){
		System.out.println("This Programming language name is empty or blank.");
	
		// Programlama Dili Girilmemis Ise Programlama Dilinin Girilmesini Zorunlu Hale Getiriyoruz
		return !programmingLanguage.getProgrammingLanguage().isEmpty();
	}
	
	// List Icinde Kaydedilmek Istenilen Programlama Dilinin List Icinde Olma Durumunu Kontrol Etmek Icin
	// Fonksiyona List Icindeki Array Adini Parametre Olarak Veriyoruz 
	public boolean programmingLanguageExistValidator(ProgrammingLanguage programmingLanguage) {
		
		// Dependency Injection Yontemi Ile List Icinde Yer Alan Tum Data lari Listeliyoruz
		// Listelenen Data lari Tarama Islemi Yapiyoruz
		for (ProgrammingLanguage tempProgrammingLanguage : programmingLanguageRepository.getAll()) {
		
			// Equals Fonksiyonu Ile Girilen Data yi Ve Database Icindeki Data yi Karsilastiriyoruz
			// Girilen Data Database Icinde Var Ise Bu Durumu Uyari Mesaji Ile Bildiriyoruz
			if (tempProgrammingLanguage.getProgrammingLanguage().equals(programmingLanguage.getProgrammingLanguage())) {
				System.out.println("This coding language is already exists.");
				return false;
			}
		}
		return true;
	}
}