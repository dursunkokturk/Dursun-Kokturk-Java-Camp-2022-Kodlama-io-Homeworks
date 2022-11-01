package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();
	
	ProgrammingLanguage getById(int id);

	void saveLanguage(ProgrammingLanguage programmingLanguage);
    void deleteLanguage(ProgrammingLanguage programmingLanguage);
    void updateLanguage(ProgrammingLanguage programmingLanguage, String updatedName);
}