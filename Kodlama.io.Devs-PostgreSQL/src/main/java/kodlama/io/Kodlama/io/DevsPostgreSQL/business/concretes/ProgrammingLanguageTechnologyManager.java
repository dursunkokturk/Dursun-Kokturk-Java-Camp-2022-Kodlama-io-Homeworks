package kodlama.io.Kodlama.io.DevsPostgreSQL.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlama.io.Kodlama.io.DevsPostgreSQL.business.abstracts.ProgrammingLanguageTechnologyService;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.requests.programminglanguagetechnologyrequests.CreateProgrammingLanguageTechnologyRequest;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.requests.programminglanguagetechnologyrequests.UpdateProgrammingLanguageTechnologyRequest;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguagetechnologyresponses.ProgrammingLanguageTechnologyDeleteResponse;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguagetechnologyresponses.ProgrammingLanguageTechnologyListResponse;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguagetechnologyresponses.ProgrammingLanguageTechnologyResponse;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguagetechnologyresponses.UpdateProgrammingLanguageTechnologyResponse;
import kodlama.io.Kodlama.io.DevsPostgreSQL.dataAccess.abstracts.ProgrammingLanguageTechnologyRepository;
import kodlama.io.Kodlama.io.DevsPostgreSQL.entities.concretes.ProgrammingLanguageTechnology;

//Business Katmani Altinda Yer Alan Abstract Katmani Altindaki 
//ProgrammingLanguageTechnologyService Interface ini implements Komutunu Kullanarak
//Ekleme Silme Guncelleme Islemlerini Ve Database Icindeki Data lari Listeleme Islemlerini
//Yapacak Fonksiyonlari Dahil Ediyoruz
public class ProgrammingLanguageTechnologyManager implements ProgrammingLanguageTechnologyService{

	// Data Access Katmani Altinda Yer Alan Abstract Katmani Altindaki
	// Ekleme Silme Guncelleme Islemlerinin Oldugu JpaRepository yi Ve
	// Dependency Injection Yaparak Sisteme Dahil Ediyoruz
	private ProgrammingLanguageTechnologyRepository programmingLanguageTechnologyRepository;
	
	// Dependency Injection Ile Sisteme Dahil Edilen
	// ProgrammingLanguageTechnologyRepository yi
	// Parametreli Constructor Kullanarak Sistemde Kullanilir Hale Getiriyoruz
	@Autowired
	public ProgrammingLanguageTechnologyManager(ProgrammingLanguageTechnologyRepository programmingLanguageTechnologyRepository) {
		this.programmingLanguageTechnologyRepository = programmingLanguageTechnologyRepository;
	}

	// Business Katmani Altinda Yer Alan Responses Katmani Altinda
	// ProgrammingLanguageTechnologyResponses Katmani Altindaki
	// ProgrammingLanguageTechnologyResponse Uzerinden
	// SaveProgrammingLanguaqgeTechnology Fonksiyonu Icinde
	// Belirtilen Sartlara Uygun Olarak Girilen Data lari Database Icinde Ekliyoruz
	@Override
	public ProgrammingLanguageTechnologyResponse saveProgrammingLanguaqgeTechnology(
			CreateProgrammingLanguageTechnologyRequest createProgrammingLanguageTechnologyRequest) {
	
		// ProgrammingLanguageTechnology Objesi Olusturuyoruz
		ProgrammingLanguageTechnology programmingLangugeTechnology = new ProgrammingLanguageTechnology();
		
		// ProgrammingLanguageTechnologyResponse Objesi Olusturuyoruz
		ProgrammingLanguageTechnologyResponse programmingLanguageTechnologyResponse = new ProgrammingLanguageTechnologyResponse();
		
		// ProgrammingLanguageTechnologyResponse Objesinin Atandigi Degisken Uzerinden
		// SetProgrammingLanguageTechnologyId Fonksiyonu Ile Id Bilgisini Olusturuyoruz
		programmingLangugeTechnology.setProgrammingLanguageTechnologyId(0);
		
		// ProgrammingLanguageTechnologyResponse Objesinin Atandigi Degisken Uzerinden
		// SetProgrammingLanguageTechnologyName Fonksiyonu Ile 
		// CreateProgrammingLanguageTechnologyRequest Parametresi Uzerinden 
		// GetProgrammingLanguageTechnologyCreateRequestName Fonksiyonu Ile Eklenmek Istenilen Data yi Aliyoruz
		programmingLangugeTechnology.setProgrammingLanguageTechnologyName(createProgrammingLanguageTechnologyRequest.getProgrammingLanguageTechnologyCreateRequestName());

		// ProgrammingLanguageTechnologyResponse Degiskeni Uzerinden
		// SetProgrammingLanguageTechnologyResponseName Fonksiyonu Ile
		// ProgrammingLangugeTechnology Degiskeni Uzerinden
		// GetProgrammingLanguageTechnologyName Fonksiyonu Ile 
		// Programlama Dilleri Teknolojisine Eklenmek Istenilen Data lara Ulasiyoruz 
		programmingLanguageTechnologyResponse.setProgrammingLanguageTechnologyResponseName(programmingLangugeTechnology.getProgrammingLanguageTechnologyName());
	    
		// This Anahtar Kelimesini Kullanarak ProgrammingLanguageTechnologyRepository Interface Uzerinden
		// CRUD Fonksiyonlarindan Save Fonksiyonuna Ulasiyoruz
		// Save Fonksiyonu Icinde ProgrammingLangugeTechnology Degiskenini Parametre Olarak Veriyoruz
		this.programmingLanguageTechnologyRepository.save(programmingLangugeTechnology);
		
		// ProgrammingLanguageTechnologyResponse Degiskenini Return Ile Dondurerek
		// Eklenmek Istenilen Proglama Dili Teknolojisini Ekliyoruz
	    return programmingLanguageTechnologyResponse;
	}
	
	// Programlama Dili Teknolojileri Ekleme Silme Guncelleme Islemlerinden Sonra
	// Database Icindeki Data lari Listeleme Yapiyoruz
	@Override
	public List<ProgrammingLanguageTechnologyListResponse> getAll() {
		
		// This Anahtar Kelimesini Kullanarak ProgrammingLanguageTechnologyRepository Interface Uzerinden
		// JPA Repository Icindeki FindAll Fonksiyonu Ile Programlama Dili Teknolojilerine Ulasiyoruz
		// Ulasilan Data lari Liste Haline Getiriyoruz
		List<ProgrammingLanguageTechnology> programmingLanguageTechnologyList = this.programmingLanguageTechnologyRepository.findAll();
	    
		// Ekleme Silme Guncelleme Islemlerinden Sonra Database Icindeki Data lari Listelemek Icin
		// List Tipinde ProgrammingLanguageTechnologyListResponse Bos Array List Olusturuyoruz
		List<ProgrammingLanguageTechnologyListResponse> programmingLanguageTechnologyListResponses = new ArrayList<>();

		// Programlama Dili Teknolojilerinin Yer Aldigi List Icerinde Tarama Islemi Yapiyoruz
	    for (ProgrammingLanguageTechnology programmingLanguageTechnologyLists : programmingLanguageTechnologyList) {
	    	
	    	// Tarama Islem Sonunlarinin Atanacagi
	    	// ProgrammingLanguageTechnologyListResponse Objesi Olusturuyoruz
	    	ProgrammingLanguageTechnologyListResponse programmingLanguageTechnologyListResponse = new ProgrammingLanguageTechnologyListResponse();
	    	
	    	// List Tipinde Olusturulan <ProgrammingLanguageTechnologyListResponse Objesinin Atandigi Degisken Adi Uzerinden
	    	// SetId Fonksiyonu Icinde ProgrammingLanguageTechnologyLists Degiskeni Uzerinden
	    	// GetProgrammingLanguageTechnologyId Fonksiyonu Ile 
	    	// Eklenmek Istenilen Programlama Dili Teknolojisinin Id Bilgisine Ulasiyoruz
	    	programmingLanguageTechnologyListResponse.setId(programmingLanguageTechnologyLists.getProgrammingLanguageTechnologyId());
	    	
	    	// Tarama Islem Sonuclarinin Atandigi ProgrammingLanguageTechnologyListResponse Degiskeni Uzerinden
	    	// SetProgrammingLanguageTechnologyListResponseName Fonksiyonu Icinde 
	    	// ProgrammingLanguageTechnologyLists Degiskeni Uzerinden 
	    	// GetProgrammingLanguageTechnologyName Fonksiyonu Ile 
	    	// Eklenmek Istenilen Programlama Dili Teknolojisinin Adina Ulasiyoruz
	    	programmingLanguageTechnologyListResponse.setProgrammingLanguageTechnologyListResponseName(programmingLanguageTechnologyLists.getProgrammingLanguageTechnologyName());
	    	
	    	// Bos Array in Atandigi Degisken Adi Uzerinden 
	    	// List Icine CRUD Fonksiyonlarindan Add Fonksiyonu Icinde
	    	// ProgrammingLanguageTechnologyListResponse Degiskenini Parametre Olarak Veriyoruz
	    	programmingLanguageTechnologyListResponses.add(programmingLanguageTechnologyListResponse);
	    }
	    
	    // ProgrammingLanguageTechnologyListResponses Degiskenini Return Ile Dondurerek
	    // Listeleme Islemini Yapiyoruz
	    return programmingLanguageTechnologyListResponses;
	}

	// Business Katmani Altinda Yer Alan Responses Katmani Altindaki
	// ProgrammingLanguageTechnologyDeleteResponse Uzerinden
	// DeleteProgrammingLanguaqgeTechnology Fonksiyonu Icinde
	// Id Parametresi Ile Silme Islemini Yapiyoruz
	@Override
	public ProgrammingLanguageTechnologyDeleteResponse deleteProgrammingLanguaqgeTechnology(int id) {
		
		// This Anahtar Kelimesini Kullanarak 
		// ProgrammingLanguageTechnologyRepository Interface Uzerinden
		// JPA Repository Icindeki FindById Fonksiyonu Ile 
		// Silinecek Data nin id Bilgisini Aliyoruz
		ProgrammingLanguageTechnology programmingLanguageTechnology = this.programmingLanguageTechnologyRepository.findById(id).get();
		
		// ProgrammingLanguageTechnologyDeleteResponse Objesi Olusturuyoruz
		ProgrammingLanguageTechnologyDeleteResponse technologyDeleteResponse = new ProgrammingLanguageTechnologyDeleteResponse();
		
		// Olusturulan ProgrammingLanguageTechnologyDeleteResponse Objesinin Atandigi Degisken Adi Uzerinden
		// SetProgrammingLanguageTechnologyDeleteResponseName Fonksiyonu Icinde
		// ProgrammingLanguageTechnology Degiskeni Uzerinden
		// GetProgrammingLanguageTechnologyName Fonksiyonu Ile 
		// Silinecek Data nin Id Bilgisinden Sonra Name Bilgisine Ulasiyoruz
		technologyDeleteResponse.setProgrammingLanguageTechnologyDeleteResponseName(programmingLanguageTechnology.getProgrammingLanguageTechnologyName());
		
		// This Anahtar Kelimesini Kullanarak 
		// ProgrammingLanguageTechnologyRepository Degiskeni Uzerinden
		// DeleteById Fonksiyonu Ile Silme Islemini Baslatiyoruz
		this.programmingLanguageTechnologyRepository.deleteById(id);
		
		// TechnologyDeleteResponse Degiskenini Return Ile Dondurerek
		// Silme Islemini Bitiriyoruz
		return technologyDeleteResponse;
	}

	// Business Katmani Altinda Yer Alan Responses Katmani Altindaki
	// UpdateProgrammingLanguageTechnologyResponse Uzerinden
	// UpdateProgrammingLanguaqgeTechnology Fonksiyonu Icinde
	// Id Ve UpdateProgrammingLanguageTechnologyRequest Parametreleri Ile Silme Islemini Yapiyoruz
	@Override
	public UpdateProgrammingLanguageTechnologyResponse updateProgrammingLanguaqgeTechnology(int id,
			UpdateProgrammingLanguageTechnologyRequest updateProgrammingLanguageTechnologyRequest) {
		
		// UpdateProgrammingLanguageTechnologyResponse Objesi Olusturuyoruz
		UpdateProgrammingLanguageTechnologyResponse updateTechnologyResponse = new UpdateProgrammingLanguageTechnologyResponse();
		
		// This Anahtar Kelimesini Kullanarak 
		// ProgrammingLanguageTechnologyRepository Degiskeni Uzerinden 
		// JPA Repository Icindeki FindById Fonksiyonu Ile 
		// Guncelleme Isleminin Yapilacagi Data yi Id Bilgisi Uzerinden Aliyoruz
		ProgrammingLanguageTechnology programmingLanguageTechnology = this.programmingLanguageTechnologyRepository.findById(id).get();
		
		// Olusturulan UpdateProgrammingLanguageTechnologyResponse Objesinin Atandigi Degisken Adi Uzaerinden
		// SetUpdateProgrammingLanguageTechnologyResponseNewName Fonksiyonu Icinde 
		// UpdateProgrammingLanguageTechnologyRequest Degiskeni Uzerinden
		// GetProgrammingLanguageTechnologyUpdateRequestName Fonksiyonu Ile 
		// Id Bilgisine Gore Guncelleme Isleminin Yapilacagi Data nin Yeni Adini Aliyoruz
		updateTechnologyResponse.setUpdateProgrammingLanguageTechnologyResponseNewName(updateProgrammingLanguageTechnologyRequest.getProgrammingLanguageTechnologyUpdateRequestName());
		
		// Olusturulan UpdateProgrammingLanguageTechnologyResponse Objesinin Atandigi Degisken Adi Uzaerinden
		
		// SetUpdateProgrammingLanguageTechnologyResponseOldName Fonksiyonu Icinde 
		// programmingLanguageTechnology Degiskeni Uzerinden
		// GetProgrammingLanguageTechnologyName Fonksiyonu Ile 
		// Id Bilgisine Gore Guncelleme Isleminin Yapilacagi Data nin Eski Adini Aliyoruz
		updateTechnologyResponse.setUpdateProgrammingLanguageTechnologyResponseOldName(programmingLanguageTechnology.getProgrammingLanguageTechnologyName());
		
		// ProgrammingLanguageTechnology Degiskeni Uzerinden
		// SetProgrammingLanguageTechnologyName Fonksiyonu Icinde 
		// UpdateProgrammingLanguageTechnologyRequest Degiskeni Uzerinden 
		// GetProgrammingLanguageTechnologyUpdateRequestName Fonksiyonu Ile 
		// Data nin Guncel Halini Aliyoruz
		programmingLanguageTechnology.setProgrammingLanguageTechnologyName(updateProgrammingLanguageTechnologyRequest.getProgrammingLanguageTechnologyUpdateRequestName());
		
		// This Anahtar Kelimesini Kullanarak 
		// ProgrammingLanguageTechnologyRepository Degiskeni Uzerinden 
		// CRUD Fonksiyonlarindan Save Fonksiyonu Icinde 
		// ProgrammingLanguageTechnology Degiskenini 
		// Parametre Olarak Veriyoruz
		this.programmingLanguageTechnologyRepository.save(programmingLanguageTechnology);
		
		// Data nin Guncel Halinin Oldugu 
		// UpdateTechnologyResponse Degiskenini Return Ile Dondurerek
		// Guncelleme Islemini Bitiriyoruz
		return updateTechnologyResponse;
	}
	
	@Override
	public ProgrammingLanguageTechnologyResponse getById(int id) {
		return null;
	}

	@Override
	public ProgrammingLanguageTechnology getProgrammingLanguageTechnologyById(int id) {
		ProgrammingLanguageTechnology technology = this.programmingLanguageTechnologyRepository.findById(id).get();
		return technology;
	}

}