package kodlama.io.Kodlama.io.DevsPostgreSQL.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.DevsPostgreSQL.business.requests.programminglanguagetechnologyrequests.CreateProgrammingLanguageTechnologyRequest;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.requests.programminglanguagetechnologyrequests.UpdateProgrammingLanguageTechnologyRequest;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguagetechnologyresponses.ProgrammingLanguageTechnologyDeleteResponse;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguagetechnologyresponses.ProgrammingLanguageTechnologyListResponse;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguagetechnologyresponses.ProgrammingLanguageTechnologyResponse;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguagetechnologyresponses.UpdateProgrammingLanguageTechnologyResponse;
import kodlama.io.Kodlama.io.DevsPostgreSQL.entities.concretes.ProgrammingLanguageTechnology;

public interface ProgrammingLanguageTechnologyService {
	
	// ProgrammingLanguageTechnologyResponse Class Icinde Dil Teknolojisinin Ismini 
	// CreateProgrammingLanguageTechnologyRequest Class i Uzerinden Alarak 
	// Kaydetme Islemini Yapiyoruz
	ProgrammingLanguageTechnologyResponse saveProgrammingLanguaqgeTechnology(CreateProgrammingLanguageTechnologyRequest createProgrammingLanguageTechnologyRequest);
	
	// ProgrammingLanguageTechnology Save Isleminden Sonra List Icindeki Data lari Listeleme Yapiyoruz
	List<ProgrammingLanguageTechnologyListResponse> getAll();
	
	// ProgrammingLanguageTechnologyDeleteResponse Class Icinde Dil Teknolojisinin Ismini 
	// Id Parametresi Uzerinden Alarak 
	// Silme Islemini Yapiyoruz
	ProgrammingLanguageTechnologyDeleteResponse deleteProgrammingLanguaqgeTechnology(int id);
	
	// ProgrammingLanguageTechnologyResponse Class Icinde Dil Ismini 
	// UpdateProgrammingLanguageTechnologyRequest Parametresi Uzerinden Alarak
	// Guncelleme Islemini Yapiyoruz
	UpdateProgrammingLanguageTechnologyResponse updateProgrammingLanguaqgeTechnology(int id, UpdateProgrammingLanguageTechnologyRequest updateProgrammingLanguageTechnologyRequest);
	
	// Save Update Ve Delete Islemlerinden Sonra
	// Database Icindeki Tum Data lari Aliyoruz
	ProgrammingLanguageTechnologyResponse getById(int id);
	
	ProgrammingLanguageTechnology getProgrammingLanguageTechnologyById(int id);
}