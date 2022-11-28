package kodlama.io.Kodlama.io.DevsPostgreSQL.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.DevsPostgreSQL.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.abstracts.ProgrammingLanguageTechnologyService;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.requests.programminglanguagerequests.CreateProgrammingLanguageRequest;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.requests.programminglanguagerequests.UpdateProgrammingLanguageRequest;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguageresponses.ProgrammingLanguageDeleteResponse;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguageresponses.ProgrammingLanguageListResponse;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguageresponses.ProgrammingLanguageResponse;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguageresponses.UpdateProgrammingLanguageResponse;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguagetechnologyresponses.ProgrammingLanguageTechnologyListResponse;
import kodlama.io.Kodlama.io.DevsPostgreSQL.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.DevsPostgreSQL.entities.concretes.ProgrammingLanguage;
import kodlama.io.Kodlama.io.DevsPostgreSQL.entities.concretes.ProgrammingLanguageTechnology;

@Service

// Business Katmani Altinda Yer Alan Abstract Katmani Altindaki 
// ProgrammingLanguageService Interface ini Kullanarak 
// Ekleme Silme Guncelleme Islemlerini Ve Database Icindeki Data lari Listeleme Islemlerini
// Yapacak Fonksiyonlari Dahil Ediyoruz
public class ProgrammingLanguageManager implements ProgrammingLanguageService{

	// Data Access Katmani Altinda Yer Alan Abstract Katmani Altindaki
	// ProgrammingLanguageRepository Inteface Icinde Yer Alan JpaRepository Ile Birlikte
	// Programlama Dili Icin Gecerli Olan
	// Ekleme Silme Guncelleme Islemlerinin Oldugu Fonksiyonlari Ve
	// Belirtilen Ismin Ve Id nin var Olma Durumunu Kontrol Eden Fonksiyonlari 
	// Dependency Injection Yontemi Ile Aliyoruz
	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	// Business Katmani Altindaki Abstract Katmani Altinda Yer Alan
	// ProgrammingLanguageTechnologyService Interface ini
	// Programlama Dili Teknolojileri Icin Gecerli Olan
	// Ekleme Silme Guncelleme Islemlerinin Oldugu Ve 
	// Dile Gore Teknolojileri Listeleme Ve
	// Database Icindeki Data lari Id Bilgisine Gore Listeleme Islemlerini
	// Dependency Injection Yontemi Ile Dahil Ediyoruz
	private ProgrammingLanguageTechnologyService programmingLanguageTechnologyService;
	
	// ProgrammingLanguageRepository Ve 
	// ProgrammingLanguageTechnologyService Interface lerini
	// Dependency Injection Ile Dahil Etme Islemninden Sonra
	// Parametreli Constructor Kullanarak Sistemde Kullanilir Hale Getiriyoruz
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository,ProgrammingLanguageTechnologyService programmingLanguageTechnologyService) {
		this.programmingLanguageRepository = programmingLanguageRepository;
		this.programmingLanguageTechnologyService = programmingLanguageTechnologyService;
	}
	
	// Business Katmani ALtinda Yer Alan Responses Katmani Altindaki
	// ProgrammingLanguageResponses Katmani Altinda Yer Alan
	// ProgrammingLanguageResponse Class i Ile Birlikte
	// ProgrammingLanguageService Interface i Uzerinden Gelen Ve 
	// Sonradan Eklenen Fonksiyonlar Ile Sartlara Uygun Olan Data lari
	// Database Icine Ekleme Islemi Yapiyoruz
	@Override
	public ProgrammingLanguageResponse saveProgrammingLanguaqge(
			CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
		
		// Database Icinde Veri Ekleme Islemi Icin Oncelikle Eklenmek Istenilen Verinin 
		// CheckIfNameDuplicated Fonksiyonu Icinde Yer Alan CreateProgrammingLanguageRequest Uzerinden 
		// GetProgrammingLanguageCreateRequestName Ile Database Icinde Var Olma Durumunu Kontrol Ediyoruz
		checkIfNameDuplicated(createProgrammingLanguageRequest.getProgrammingLanguageCreateRequestName());
		
		// Database Icinde Veri Ekleme Islemi Icin Verinin Girilme Durumunu Kontrol Ediyoruz
		// CheckIfNameIsEmptyOrNull Fonksiyonu Icinde Yer Alan CreateProgrammingLanguageRequest Uzerinden 
		// GetProgrammingLanguageCreateRequestName Ile Veri Ekleme Isleminin Yapima Durunumu Kontrol Ediyoruz
		checkIfNameIsEmptyOrNull(createProgrammingLanguageRequest.getProgrammingLanguageCreateRequestName());
		
		// EKlenmek Istenilen Data Database Icinde Yok Ise Ve 
		// Eklenmesi Icin Data Girilmis Ise
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		
		// Olusturulan ProgrammingLanguage Objesinin Atandigi Degisken Adi Uzerinden 
		// SetProgrammingLanguageId Fonksiyonu Kullanilarak
		// Yeni Id Bilgisi Otomatik Olarak Veriliyor
		programmingLanguage.setProgrammingLanguageId(0);
		
		// Olusturulan ProgrammingLanguage Objesinin Atandigi Degisken Adi Uzerinden
		// SetProgrammingLanguageName Fonksiyonu Icinde CreateProgrammingLanguageRequest Parametres Uzerinden 
		// GetProgrammingLanguageCreateRequestName FOnksiyonu Ile Eklenmek Istenilen Data yi Aliyoruz 
		programmingLanguage.setProgrammingLanguageName(createProgrammingLanguageRequest.getProgrammingLanguageCreateRequestName());
		
		// Programlama Dili Teknolojileri Listesine Yeni Bir Teknoloji Eklemek Icin
		// ProgrammingLanguageTechnology Tipinde Bos Array List Olusturuyoruz
		// Girilen Data lari Olusturulan Bos Array Icine Atiyoruz 
		List<ProgrammingLanguageTechnology> programmingLanguageTechnologies = new ArrayList<>();
		
		
		// CreateProgrammingLanguageRequest Parametresi Uzerinden Tarama Islemi Yapiyoruz
		// GetProgrammingLanguageTechnologyIds Fonksiyonu Ile Data larin Id Bilgilerine Ulasiyoruz
		for (Integer programmingLanguageTechnologyId : createProgrammingLanguageRequest.getProgrammingLanguageTechnologyIds()) {
		
			// This Anahtar Kelimesini Kullanarak
			// ProgrammingLanguageTechnologyService Degiskeni Uzerinden 
			// GetProgrammingLanguageTechnologyById Fonksiyonu Ile 
			// ProgrammingLanguageTechnology id Bilgilerine Ulasiyoruz
			ProgrammingLanguageTechnology programmingLanguagetechnology = this.programmingLanguageTechnologyService.getProgrammingLanguageTechnologyById(programmingLanguageTechnologyId);
			
			// Eklenmek Istenilen Data lari Bos Array List in Atandigi Degisken Adi Uzerinden
			// Add Fonksiyonu Icinde Id Bilgilerinin Oldugu Degisken Adini Parametre Olarak Veriyoruz
			programmingLanguageTechnologies.add(programmingLanguagetechnology);
		}
		
		// Ekleme Yapilan Programlama Dili Teknolojisini Programlama Dili Listesine Eklemek Icin 
		// ProgrammingLanguage Degiskeni Uzerinden SetProgrammingLanguageTechnlology Fonksiyonu Icinde
		// ProgrammingLanguageTechnologies Degiskenini Parametre Olarak Veriyoruz
		programmingLanguage.setProgrammingLanguageTechnlology(programmingLanguageTechnologies);

		// ProgrammingLanguageResponse Objesi Olusturuyoruz
		ProgrammingLanguageResponse programmingLanguageResponse = new ProgrammingLanguageResponse();

		// ProgrammingLanguageResponse Objesinin Atandigi Degisken Adi Uzerinden
		// SetProgrammingLanguageResponseName Fonksiyonu Icinde
		// ProgrammingLanguage Degiskeni Uzerinden
		// GetProgrammingLanguageName Fonksiyonu Ile Programlama Dilinin Adina Ulasiyoruz
		programmingLanguageResponse.setProgrammingLanguageResponseName(programmingLanguage.getProgrammingLanguageName());

		// This Anahtar Kelimesini Kullanarak ProgrammingLanguageRepository Inteface Uzerinden
		// CRUD Islemlerinden Save Fonksiyonu Icinde ProgrammingLanguage Degiskenini Parametre Olarak Veriyoruz
		this.programmingLanguageRepository.save(programmingLanguage);
		
		// ProgrammingLanguageResponse Degiskenini Return Ile Dondurerek
		// Kaydetme Islemini Tamamliyoruz
		return programmingLanguageResponse;
	}
	
	// Eklenmek Istenilen Dilin Database Icinde Var Olma Durumunu Kontrol Ediyoruz
	private void checkIfNameDuplicated(String name){
		
		// ProgrammingLanguageRepository Uzerinden 
		// ExistsByNameContainingIgnoreCase Fomksiyonuna
		// Parametre Verilerek Kontrol Islemini Yapiyoruz
		if(this.programmingLanguageRepository.existsByNameContainingIgnoreCase(name)) {
			
			// Eklenmek Istenilen Dil Database Icinde Var Ise 
			// Kullaniciya Uyari Mesaji Veriyoruz
			throw new RuntimeException("Name already exists");
		}
	}

	// Ekleme Islemi Yapilirken 
	// Dil Ismi Yazilmis Mi
	// Dil Ismi Bos Birakilmis Mi Kontrollerini Yapiyoruz
	private void checkIfNameIsEmptyOrNull(String name){
		if(name.isBlank() || name.isEmpty() || Objects.isNull(name)) {
			
			// Dil Isminin Girildigi Alan Bos Ise
			// Kullaniciya Uyari Mesaji Veriyoruz
			throw new RuntimeException("Name cannot be null or empty");
		}
	}
	
	// Database Icindeki Programmlama Dillerini Listeleme Yapiyoruz
	@Override
	public List<ProgrammingLanguageListResponse> getAll() {
		
		// Programlama Dillerini Listelemek Icin 
		// Programlama Dillerini ProgrammingLanguageRepository Interface Icinden 
		// This Anahtar Kelimesini Kullanarak Aliyoruz
		List<ProgrammingLanguage> programmingLanguages = this.programmingLanguageRepository.findAll();
		
		// ProgrammingLanguageRepository Interface Icinden Alinan Data lari 
		// ProgrammingLanguageListResponse Adi Ile Olusturulan Bos Array Icine Atiyoruz
		List<ProgrammingLanguageListResponse> programmingLanguageListResponses = new ArrayList<>();
		
		// Bos Array Icine Atilan Data lari Tarama Islemi Yapiyoruz
		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			
			// ProgrammingLanguageListResponse Objesi Olusturuyoruz
			ProgrammingLanguageListResponse programmingLanguageListResponse = new ProgrammingLanguageListResponse();
			
			// Olusturulan ProgrammingLanguageListResponse Objesinin Atandigi Degisken Uzerinden
			// Array Icinde Atilan ProgrammingLanguage Data larinin Id Degerine Ulasiyoruz
			programmingLanguageListResponse.setId(programmingLanguage.getProgrammingLanguageId());
			
			// Olusturulan ProgrammingLanguageListResponse Objesinin Atandigi Degisken Uzerinden
			// Array Icinde Atilan ProgrammingLanguage Data larinin Name Degerlerine Ulasiyoruz
			programmingLanguageListResponse.setProgrammingLanguageListResponseName(programmingLanguage.getProgrammingLanguageName());
			
			// ProgrammingLanguageTechnologyListResponse Bos Array List Olusturuyoruz
			List<ProgrammingLanguageTechnologyListResponse> programmingLanguageTechnologyListResponses = new ArrayList<>();
			
			// ProgrammingLanguage Degiskeni Uzerinden ProgrammingLanguageTechnology Data larina Ulasiyoruz Ve Tarama Islemi Yapiyoruz 
			for (ProgrammingLanguageTechnology programmingLanguageTechnology : programmingLanguage.getProgrammingLanguageTechnlology()) {
				
				// ProgrammingLanguageTechnologyListResponse Objesi Olusturuyoruz
				ProgrammingLanguageTechnologyListResponse programmingLanguageTechnologyListResponse = new ProgrammingLanguageTechnologyListResponse();
				
				// Objenin Olusturuldugu Degisken Adi Uzerinden ProgrammingLanguageTechnology Id Bilgisine Ulasiyoruz
				programmingLanguageTechnologyListResponse.setId(programmingLanguageTechnology.getProgrammingLanguageTechnologyId());
				
				// Objenin Olusturuldugu Degisken Adi Uzerinden ProgrammingLanguageTechnology Name Bilgisine Ulasiyoruz
				programmingLanguageTechnologyListResponse.setProgrammingLanguageTechnologyListResponseName(programmingLanguageTechnology.getProgrammingLanguageTechnologyName());
				
				// Objenin Olusturuldugu Degisken Adi Uzerinden Add Fonksiyonu Ile 
				// ProgrammingLanguageTechnologyListResponse Objesine Datalari Ekleme Yapiyoruz
				programmingLanguageTechnologyListResponse.add(programmingLanguageTechnologyListResponse);
			}
			
			// Objenin Olusturuldugu Degisken Adi Uzerinden ProgrammingLanguageTechnologyListResponse Listesi Icindeki Data lari
			programmingLanguageListResponse.setProgrammingTechnologyListResponse(programmingLanguageTechnologyListResponses);
			
			// ProgrammingLanguageListResponse Listesine Ekliyoruz
			programmingLanguageListResponse.add(programmingLanguageListResponse);
		}
		
		// Dil Ve Dil Teknolojilerini Eslestirme Islemini Bitiriyoruz
		return programmingLanguageListResponses;
	}

	// Silme Islemini Yapiyoruz
	@Override
	public ProgrammingLanguageDeleteResponse deleteProgrammingLanguaqge(int id) {
		
		// Silme Islemi Icin CheckIfIdExists Fonksiyonu Ile 
		// Silinecek Data nin Id Bilgine Ulasma Durumunu Kontrol Ediyoruz
		checkIfIdExists(id);
		
		// Silinecek Data nin Id Bilgine Ulasiliyor Ise
		// This Anahtar Kelimesini Kullanarak ProgrammingLanguageRepository Interface Uzerinden
		// FindById Fonksiyonu Ile Id ye Ait Datalari Aliyoruz
		ProgrammingLanguage programmingLanguage = this.programmingLanguageRepository.findById(id).get();
		
		// ProgrammingLanguageDeleteResponse Objesi Olusturuyoruz
		ProgrammingLanguageDeleteResponse languageDeleteResponse = new ProgrammingLanguageDeleteResponse();
		
		// ProgrammingLanguageDeleteResponse Objesinin Atandigi Degisken Adi Uzerinden
		// SetProgrammingLanguageDeleteResponseName Fonksiyonu Icinde ProgrammingLanguage Degiskeni Uzerinden
		// GetProgrammingLanguageName Fonksiyonu Ile Id Bilgisine Ait Data yi Aliyoruz
		languageDeleteResponse.setProgrammingLanguageDeleteResponseName(programmingLanguage.getProgrammingLanguageName());
		
		// LanguageDeleteResponse Degiskeni Icinde Id Bilgisine Gore Yer Alan Data yi
		// This Anahtar Kelimesini Kullanarak ProgrammingLanguageRepository Interface Uzerinden
		// CRUD Fonksiyonu Olan DeleteById Fonksiyonuna 
		// Silinecek Data nin Id Bilgisini Parametre Olarak Veriyoruz
		this.programmingLanguageRepository.deleteById(id);
		
		// Silme Isleminin Gerceklesmesi Icin 
		// Id Bilgisine Gore Data yi Cagirdigimiz Degisken Adini 
		// Return Ile Donduruyoruz
		return languageDeleteResponse;
	}
	
	// Silme Isleminin Yapilmasi Islemini Id Bilgisi Uzerinden Yapiyoruz
	private void checkIfIdExists(int id) {
		
		// Silme Isleminin Yapilmasi Icin Id Bilgisi Kontrolu Yapiyoruz
		// Silinmek Istenilen Data Icin ProgrammingLanguageRepository Interface Uzerinden 
		// Id Bilgisinin Var Olma Durumunu Kontrol Ediyoruz
		if(!this.programmingLanguageRepository.existsById(id)) {
			
			// Silinmek Istenilen Data Ve Id Bilgisi Yok Ise Kullaniciya Uyari Mesajı Veriyoruz
			throw new RuntimeException("Id Does Not Exist");
		}
	}
	
	@Override
	public UpdateProgrammingLanguageResponse updateProgrammingLanguaqge(int id,
			UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {
		
		// Guncelleme Islemi Id ye Gore Yapilacagi Icin
		// Id Bilgisinin Olup Olmadiginin Kontrolunu 
		// CheckIfIdExists Fonksiyonu Ile Yapiyoruz 
		// Kontolun Yapimasi Icin Id Bilgisini Parametre Olarak Veriyoruz
		checkIfIdExists(id);
		
		// Guncelleme Isleminin Yapilmasi Icin 
		// Id  Bilgisi Olan Data nin Database Icinde Var Olma Durumunu Kontrol Ediyoruz
		checkIfNameDuplicated(updateProgrammingLanguageRequest.getProgrammingLanguageUpdateRequestName());
		
		// Id Bilgisine Gore Database Icindeki Data nin Guncel Halinin Girilme Durumunu Kontrol Ediyoruz
		checkIfNameIsEmptyOrNull(updateProgrammingLanguageRequest.getProgrammingLanguageUpdateRequestName());
		
		// Database Icindeki Data nin Guncellenmesi Islemi Yapimis Ise
		// Olusturulan UpdateProgrammingLanguageResponse Objesi Icine Atiyoruz
		UpdateProgrammingLanguageResponse updateLanguageResponse = new UpdateProgrammingLanguageResponse();
		
		// This Anahtar Kelimesini Kullanarak ProgrammingLanguageRepository Interface Uzerinden
		// JPA Repository Icindeki FindById Fonksiyonu Ile Id Bilgisi Parametre Olarak Veriyoruz
		ProgrammingLanguage programmingLanguage = this.programmingLanguageRepository.findById(id).get();
		
		// Database Icindeki Data nin Guncellenmesi Isleminin Atandigi Degisken Adi Uzerinden
		// SetUpdateProgrammingLanguageResponseNewName Fonksiyonu Ile Data nin Guncel Halini 
		// UpdateProgrammingLanguageRequest Parametresi Uzerinden 
		// GetProgrammingLanguageUpdateRequestName Fonksiyonu Ile Programlama Dilinin Guncel Halini Aliyoruz
		updateLanguageResponse.setUpdateProgrammingLanguageResponseNewName(updateProgrammingLanguageRequest.getProgrammingLanguageUpdateRequestName());
		
		// Database Icindeki Data nin Guncellenmesi Isleminin Atandigi Degisken Adi Uzerinden
		// SetUpdateProgrammingLanguageResponseOldName Fonksiyonu Ile 
		// Data nin Guncellenme Islemi Yapilmadan Oncekis Halini 
		// ProgrammingLanguage Parametresi Degiskeni Uzerinden 
		// GetProgrammingLanguageName Fonksiyonu Ile Aliyoruz
		updateLanguageResponse.setUpdateProgrammingLanguageResponseOldName(programmingLanguage.getProgrammingLanguageName());
		
		// Id Bilgisine Gore Yapilan Guncelleme Isleminin Atandigi Degisken Uzerinden
		// SetProgrammingLanguageName Fonksiyonu Ile UpdateProgrammingLanguageRequest Parametresi Uzerinden
		// Programlama Dilinin Guncellenmis Halini 
		// GetProgrammingLanguageUpdateRequestName Fonksiyonu Ile Aliyoruz
		programmingLanguage.setProgrammingLanguageName(updateProgrammingLanguageRequest.getProgrammingLanguageUpdateRequestName());
		
		// This Anahtar Kelimesini Kullnarak ProgrammingLanguageRepository Interface Uzerinden
		// CRUD Fonksiyonlarindan Save Fonksiyonuna 
		// Programlama Dilinin Guncel Halini Parametre Olarak Veriyoruz
		this.programmingLanguageRepository.save(programmingLanguage);
		
		// UpdateLanguageResponse Degiskeninini 
		// Return Ile Dondurerek Guncelleme Islemini Bitiriyoruz
		return updateLanguageResponse;
	}

	// Programlama Dillerinin Eklenmei Silinmesi Ve Guncellenmesi Islemlerinden Sonra
	// Id Bilgisine Gore Database Icindeki Datalari Listeleme Yapiyoruz
	@Override
	public ProgrammingLanguageResponse getById(int id) {
		
		// Listeleme Isleminin Yapilmasi Icin 
		// Data larin Id Bilgisi Olup Olmadigini Kontrol Ediyoruz
		checkIfIdExists(id);
		
		// This Anahtar Kelimesini Kullanarak ProgrammingLanguageRepository Interface Uzerinden
		// JPA Repository Icindeki FindById Fonksiyonuna Id Parametresini Vererek 
		// Get Fonksiyonu Data lari Aliyoruz
		ProgrammingLanguage programmingLanguage = this.programmingLanguageRepository.findById(id).get();
		
		// ProgrammingLanguageResponse Objesi Olusturuyoruz
		ProgrammingLanguageResponse programmingLanguageResponse = new ProgrammingLanguageResponse();
		
		// ProgrammingLanguageResponse Uzerinden SetProgrammingLanguageResponseName Fonksiyonuna 
		// ProgrammingLanguage Degiskeni Uzerinden 
		// GetProgrammingLanguageName Fonksiyonu Ile 
		// Database Icindeki Data lara Ulasiyoruz
		programmingLanguageResponse.setProgrammingLanguageResponseName(programmingLanguage.getProgrammingLanguageName());
		
		// Olusturulan ProgrammingLanguageResponse Degiskenini Return Ile Dondurerek
		// Listeleme Islemini Yapiyoruz
		return programmingLanguageResponse;
	}
}