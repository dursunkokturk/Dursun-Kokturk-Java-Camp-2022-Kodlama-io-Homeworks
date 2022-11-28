package kodlama.io.Kodlama.io.DevsPostgreSQL.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.DevsPostgreSQL.entities.concretes.ProgrammingLanguage;

@Repository

// Ekleme Silme Guncelleme Listeleme Gibi Bir Cok Fonksiyon (Method) JpaRepository Icinde Yer Almaktadir
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Integer>{
	
	// Belirtilen Ismin Var Olma Durumunu 
	// Parametre Kullanarak Kontrol Ediyoruz
	boolean existsByNameContainingIgnoreCase(String name);
	
	// Belirtilen Id nin Var Olma Durumunu 
	// Parametre Kullanarak Kontrol Ediyoruz
	boolean existsById(int id);
}