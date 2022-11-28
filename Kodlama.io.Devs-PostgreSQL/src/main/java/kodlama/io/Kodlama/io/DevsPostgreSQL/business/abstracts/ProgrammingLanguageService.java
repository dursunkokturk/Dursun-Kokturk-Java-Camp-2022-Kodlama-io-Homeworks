package kodlama.io.Kodlama.io.DevsPostgreSQL.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.DevsPostgreSQL.business.requests.programminglanguagerequests.CreateProgrammingLanguageRequest;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.requests.programminglanguagerequests.UpdateProgrammingLanguageRequest;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguageresponses.ProgrammingLanguageDeleteResponse;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguageresponses.ProgrammingLanguageListResponse;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguageresponses.ProgrammingLanguageResponse;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguageresponses.UpdateProgrammingLanguageResponse;

public interface ProgrammingLanguageService {

	// ProgrammingLanguageResponse Class Icinde Dil Ismini 
	// CreateProgrammingLanguageRequest Class i Uzerinden Alarak 
	// Kaydetme Islemini Yapiyoruz
	ProgrammingLanguageResponse saveProgrammingLanguaqge(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);
	
	// Programming Language Save Isleminden Sonra List Icindeki Data lari Listeleme Yapiyoruz
	List<ProgrammingLanguageListResponse> getAll();
	
	// ProgrammingLanguageDeleteResponse Class Icinde Dil Ismini 
	// Id Parametresi Uzerinden Alarak 
	// Silme Islemini Yapiyoruz
	ProgrammingLanguageDeleteResponse deleteProgrammingLanguaqge(int id);
	
	// ProgrammingLanguageResponse Class Icinde Dil Ismini 
	// UpdateProgrammingLanguageRequest Parametresi Uzerinden Alarak
	// Guncelleme Islemini Yapiyoruz
	UpdateProgrammingLanguageResponse updateProgrammingLanguaqge(int id, UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest);
	
	// Save Update Ve Delete Islemlerinden Sonra
	// Database Icindeki Tum Data lari Aliyoruz
	ProgrammingLanguageResponse getById(int id);
}