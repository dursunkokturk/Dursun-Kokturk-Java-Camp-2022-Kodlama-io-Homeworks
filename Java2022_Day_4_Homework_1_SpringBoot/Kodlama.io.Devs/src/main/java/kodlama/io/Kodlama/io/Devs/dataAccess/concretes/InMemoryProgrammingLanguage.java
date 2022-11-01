package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository

public class InMemoryProgrammingLanguage implements ProgrammingLanguageRepository{

	List<ProgrammingLanguage> programmingLanguages;
	
	public InMemoryProgrammingLanguage() {
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1,"Java"));
		programmingLanguages.add(new ProgrammingLanguage(2,"C#"));
		programmingLanguages.add(new ProgrammingLanguage(1,"Python"));
	}
	
	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguages;
	}
	
	// List Tipindeki Array in Adini Fonksiyona Parametre Olarak Veriyoruz
	@Override
	public void saveLanguage(ProgrammingLanguage programmingLanguage) {
	
		// Dependency Injection Yontemi Ile Girilen Data yi Database e
		// Kaydediyoruz
		programmingLanguages.add(programmingLanguage);
	}

	// List Tipindeki Array in Adini Fonksiyona Parametre Olarak Veriyoruz
	@Override
	public void deleteLanguage(ProgrammingLanguage programmingLanguage) {
	
		// Dependency Injection Yontemi Ile Database de Kayitli Olan Data yi 
		// id Bilgisine Gore Siliyoruz
		programmingLanguages.remove(programmingLanguage.getId()-1);
		
		// Silinen Data yi Database den Cikardikten Sonra Kalan Data lari Listeliyoruz
		System.out.println(programmingLanguages.remove(programmingLanguage));
	}

	// List Tipindeki Array in Adini Fonksiyona Parametre Olarak Veriyoruz
	@Override
	public void updateLanguage(ProgrammingLanguage programmingLanguage, String updateName) {
	
		// Dependency Injection Yontemi Ile Database de Kayitli Olan Data yi 
		// id Bilgisine Gore Guncelliyoruz
		// Data nin Guncel Halini updateName Degiskeni Uzerinden Yazdiriyoruz
		programmingLanguages.get(programmingLanguage.getId()-1).setProgrammingLanguage(updateName);
	}
	
	// Islem Yapilacak Olan Data yi id Bilgisine Gore Aliyoruz
	@Override
	public ProgrammingLanguage getById(int id) {
		
		// Dependency Injection Yontemi Ile Database Icindeki Kayitli Olan Data yi
		// Tarama Islemi Yapiyoruz
		// Tarama Islem Sonucunu Degisken Uzerinden id Bilgisi Ile Gosteriyoruz
		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			if (programmingLanguage.getId() == id) {
				return programmingLanguage;
			}
		}
		System.out.println("This id is not exist.");
		return null;
	}
}